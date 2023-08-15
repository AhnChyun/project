package com.example.demo.user;

import com.example.demo.user.Model.userVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface userService {
    /* 로그인 */
    ResponseEntity login(userVo vo);

    String memberJoin(userVo vo, RedirectAttributes rs);
}
