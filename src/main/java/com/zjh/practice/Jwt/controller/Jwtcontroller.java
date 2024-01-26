package com.zjh.practice.Jwt.controller;

import com.zjh.practice.Jwt.module.User;
import com.zjh.practice.common.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/jwt")
public class Jwtcontroller {

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")

    public String login(@RequestParam Map<String, Object> queryMap) {
        User user = new User();
        if(queryMap.get("userName").equals(user.getUserName()) && queryMap.get("passWord").equals(user.getPassWord())){
            log.error("登录成功,生成token!");
            String token = JwtUtil.createToken(user);
            user.setToken(token);
            return token;
        }
        return "success";
    }

    public static void main(String[] args) {
        System.out.println("1");
    }
}
