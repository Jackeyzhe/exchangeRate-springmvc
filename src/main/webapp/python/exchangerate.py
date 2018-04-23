# coding=UTF-8
import requests

import MySQLdb

from bs4 import BeautifulSoup


def get_data(url):

    res = requests.get(url)
    res.encoding = 'UTF-8'
    soup = BeautifulSoup(res.text, 'html.parser')
    tables = soup.find_all('table')
    trs = tables[1].find_all('tr')
    coindict = {}
    for tr in trs:
        tds = tr.find_all('td')
        if len(tds) > 0:
            coin = tds[0].contents[0]
            rate = tds[5].contents[0]
            date = tds[6].contents[0]
            time = tds[7].contents[0]
            # print coin
            # print rate
            coindict[coin] = rate + "," + date + " " + time
    return coindict


def savedata(datas):
    db = MySQLdb.connect("localhost", "root", "123456", "EXCHANGE_RATE", charset="utf8")
    cursor = db.cursor()
    cursor.execute("SET NAMES utf8")
    db.commit()
    try:
        for key in datas:
            valuearr = datas[key].split(",")
            rate = valuearr[0].encode("UTF-8")
            date = valuearr[1].encode("UTF-8")
            cursor.execute("INSERT INTO RATE(COIN,RATE,TIME) VALUES ('%s','%s','%s')" % (key, rate, date))
            db.commit()
    except Exception as e:
        print e
    finally:
        cursor.close()
        db.close()


if __name__ == '__main__':

    uri = 'http://www.boc.cn/sourcedb/whpj/index.html'

    datas = get_data(uri)

    savedata(datas)