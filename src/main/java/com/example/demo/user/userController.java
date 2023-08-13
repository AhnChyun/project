package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {

    @Autowired
    private userService userService;

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
