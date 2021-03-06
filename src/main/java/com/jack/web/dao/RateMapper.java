package com.jack.web.dao;

import com.jack.web.model.Rate;

import java.util.Date;
import java.util.List;

public interface RateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rate record);

    int insertSelective(Rate record);

    Rate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);

    List<Rate> findRateList(Date date);
}