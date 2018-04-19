package com.jack.web.controller;

import com.jack.web.po.Coin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RateController {

    @RequestMapping("/queryCoins")
    public ModelAndView queryCoins(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        List<Coin> coinList = new ArrayList<Coin>();

        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }
}
