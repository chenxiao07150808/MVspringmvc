package com.chenxiao.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class indexController{
    @GetMapping("/getData")
    public ModelAndView index()
    {
        ModelAndView mv = new ModelAndView("index");
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","chenxiao");
        map.put("age",12);
        map.put("school","中山大学南方学院");
        mv.addObject("map",map);
        return mv;
    }
}