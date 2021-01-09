package com.config;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpringAspecct {
    @Pointcut(value = "execution(* com.config.Work.work())")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void beforeGo(){
        System.out.println("执行之前....");
    }

    @After(value = "pointCut()")
    public void afterGo(){
        System.out.println("执行之后....");
    }

    @AfterThrowing(value = "pointCut()")
    public void thorwGo(){
        System.out.println("throw ....");
    }
}
