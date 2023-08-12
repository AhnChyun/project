package com.example.demo.test.impl;

import com.example.demo.test.testMapper;
import com.example.demo.test.testService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Service
public class testServiceImpl implements testService {

    @Autowired
    private testMapper testMapper;

    public ModelAndView test() throws Exception{
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("test", testMapper.test());
        log.info("data={}", testMapper.test());
        return mv;
    }
}
