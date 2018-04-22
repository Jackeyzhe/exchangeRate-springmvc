package com.jack.web.service;

import com.jack.web.model.Rate;

import java.util.Date;
import java.util.List;

public interface RateService {
    public List<Rate> findRateList(Date date) throws Exception;
}
