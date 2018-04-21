package com.jack.web.model;

import java.util.Date;

public class Rate {
    private Integer id;

    private String coin;

    private String rate;

    private Date time;

    public Rate(Integer id, String coin, String rate, Date time) {
        this.id = id;
        this.coin = coin;
        this.rate = rate;
        this.time = time;
    }

    public Rate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}