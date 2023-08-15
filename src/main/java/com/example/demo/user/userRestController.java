package com.example.demo.user;

import com.example.demo.user.Model.userVo;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class userRestController {
    @Autowired
    private userService userService;

    // 로그인
    @PostMapping("/login")
    public ResponseEntity login(userVo vo) {
        return userService.login(vo);
    }
}
