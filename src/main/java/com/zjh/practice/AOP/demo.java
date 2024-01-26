package com.zjh.practice.AOP;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/a")
public class demo {

    @Resource
    private MyService myService;

    @ResponseBody
    @RequestMapping(value = "/b", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    public void getPolicyFile(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        myService.msgShow(name,age);
    }
}
