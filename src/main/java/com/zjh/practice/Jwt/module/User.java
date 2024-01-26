package com.zjh.practice.Jwt.module;

import cn.hutool.core.util.IdUtil;
import lombok.Data;

/**
 *  用户
 */
@Data
public class User {

    private String id = IdUtil.randomUUID();;
    private String userName =  "admin";
    private String nickName;
    private String passWord = "123";
    private String token;

    public static void main(String[] args) {
        User user = new User();
        User c = a(user, "我");
        System.out.println(c.getNickName());
    }

    public static User a(User u,String str){
        String nickName = u.getNickName();
        nickName = str;
//        u.setNickName(str);
        return u;
    }
}
