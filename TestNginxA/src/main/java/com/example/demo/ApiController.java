package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Mr.Yangxiufeng on 2017/8/10.
 * Time:15:57
 * ProjectName:TestNginxA
 */
@Controller
public class ApiController {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("Hello");
        return modelAndView;
    }
    @RequestMapping("/api")
    public @ResponseBody String test(Integer method,Integer para){
        System.out.println("method="+method+",para="+para);
        return "i am here";
    }
}
