package com.zjh.practice.AOP;


import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.lang.Signature;
import org.mp4parser.aj.lang.annotation.Aspect;
import org.mp4parser.aj.lang.annotation.Before;
import org.mp4parser.aj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 定义一个切面，括号内写入第1步中自定义注解的路径
    @Pointcut("@annotation(com.zjh.practice.AOP.Loggable)")
    private void logPrint() {
    }


    @Before("logPrint()")
    public void logShow(JoinPoint joinPoint){

        // 这里只是一个示例，你可以写任何处理逻辑
        System.out.println("---------Before触发了----------");

        // 获取签名
        Signature signature = joinPoint.getSignature();
        // 获取切入的包名
        String declaringTypeName = signature.getDeclaringTypeName();
        // 获取即将执行的方法名
        String funcName = signature.getName();
        System.out.println(String.format("即将执行方法为: %s ，属于%s包", funcName, declaringTypeName));

        Object[] args = joinPoint.getArgs();
        String itemName = (String) args[0];
        int quantity = (int) args[1];
        System.out.println(String.format("获取的参数是%s,%d",itemName,quantity));

    }
}
