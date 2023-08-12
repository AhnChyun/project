package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

    @Autowired
    private testService testService;

    @GetMapping("")
    public ModelAndView test() throws Exception{
        return testService.test();
    }
}
