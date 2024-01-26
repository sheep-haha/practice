package com.zjh.practice.Jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 需要登陆后携带token才能访问
 */
public class SecureController {

    /**
     * 查询 用户信息，登录后携带JWT才能访问
     */
    @RequestMapping("/secure/getUserInfo")
    public String login(HttpServletRequest request) {
        Integer id = (Integer) request.getAttribute("id");
        String userName = request.getAttribute("userName").toString();
        String password= request.getAttribute("passWord").toString();
        return "当前用户信息id=" + id + ",userName=" + userName+ ",password=" + password;
    }


}
