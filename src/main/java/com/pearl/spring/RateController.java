package com.pearl.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {


    @Value("${rates}")
    String rate;


    @Value("${lanecount}")
    String laneCount;

    @Value("${tollstart}")
    String tollStart;


    @RequestMapping("/rate")
    public String getRate(Model model){

        model.addAttribute("rate",rate);
        model.addAttribute("lanecount",laneCount);
        model.addAttribute("tollstart",tollStart);

        return "rateview";
    }

}
