package com.example.demo.user.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class userVo {
    public String id;               // 아이디
    public String password;         // 비밀번호
    public String name;             // 이름
    public String role;             // 권한
    public String regDt;            // 등록일자
}
