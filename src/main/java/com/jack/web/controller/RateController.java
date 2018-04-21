package com.jack.web.controller;

import com.jack.web.model.Rate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RateController {

    @RequestMapping("/queryRates")
    public ModelAndView queryCoins(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        List<Rate> rateList = new ArrayList<Rate>();

        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }
}
