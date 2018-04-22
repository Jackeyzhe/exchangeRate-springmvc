package com.jack.web.service.impl;

import com.jack.web.dao.RateMapper;
import com.jack.web.model.Rate;
import com.jack.web.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class RateServiceImpl implements RateService {

    @Autowired
    private RateMapper rateMapper;

    @Override
    public List<Rate> findRateList(Date date) throws Exception {
        return rateMapper.findRateList(date);
    }
}
