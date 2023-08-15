package com.example.demo.user.impl;

import com.example.demo.user.Model.userVo;
import com.example.demo.user.userMapper;
import com.example.demo.user.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper userMapper;

    /**
     * 로그인
     * @param vo
     * @return
     */
    @Override
    public ResponseEntity login(userVo vo){
        Map<String, Object> resultMap = new HashMap<>();
        // 로그인 체크
        int code = (userMapper.login(vo) > 0) ?  1 : 0;
        resultMap.put("code", code);
        return new ResponseEntity(resultMap, HttpStatus.OK);
    }

    public String memberJoin(userVo vo, RedirectAttributes rs){
        vo.setRole("USER");
        userMapper.join(vo);
        rs.addFlashAttribute("msg", "가입이 완료되었습니다.");
        return "redirect:/login";
    }
}
