package com.jack.web.controller;

import com.jack.web.model.Rate;
import com.jack.web.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/rates")
public class RateController {

    @Autowired
    private RateService rateService;

    @RequestMapping("/queryRates")
    public ModelAndView queryCoins(HttpServletRequest httpServletRequest) throws Exception {
        Date now = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");

        String date = df.format(now);

        List<Rate> rates = rateService.findRateList(df.parse(date));

        while (null == rates || rates.size() <= 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(now);
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            now = calendar.getTime();
            date = df.format(now);
            rates = rateService.findRateList(df.parse(date));
        }

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("rateList", rates);

        modelAndView.setViewName("rateList");

        return modelAndView;
    }
}
