package com.example.demo.user;

import com.example.demo.user.Model.userVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {
    // 아이디 비밀번호 일치 여부 확인
    int login(userVo vo);
    // 회원가입
    void join(userVo vo);
}
