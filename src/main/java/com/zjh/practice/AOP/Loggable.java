package com.zjh.practice.AOP;

import java.lang.annotation.*;

/**
 * @Description 定义注解：Loggable
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Loggable {

}
