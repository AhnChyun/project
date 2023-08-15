package com.example.demo.user;

import com.example.demo.user.Model.userVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class userController {

    @Autowired
    private userService userService;


    /**
     * 로그인 페이지
     * @return
     */
    @GetMapping("/login")
    public ModelAndView loginpage() {
        return new ModelAndView("login");
    }


    /**
     * 회원가입 페이지
     * @return
     */
    @GetMapping("/join")
    public ModelAndView join() {
        return new ModelAndView("join");
    }

    @PostMapping("/join")
    public String memberJoin(userVo vo, RedirectAttributes rs){
        return userService.memberJoin(vo, rs);
    }
}
