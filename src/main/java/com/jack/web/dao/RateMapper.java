package com.jack.web.dao;

import com.jack.web.model.Rate;

public interface RateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rate record);

    int insertSelective(Rate record);

    Rate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);
}