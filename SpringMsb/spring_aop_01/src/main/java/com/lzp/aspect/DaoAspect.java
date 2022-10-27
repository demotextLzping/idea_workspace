package com.lzp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DaoAspect {
    @Pointcut("execution(* com.lzp.dao.*.add*(..))")
    public void addPoint(){
    }

    //    前置通知
    @Before("addPoint()")
    public void methodBefore() {
        System.out.println("methodBefore invoked ... ...");
    }

    //    后置通知
    //    出现异常也执行
    @After("addPoint()")
    public void methodAfter() {
        System.out.println("methodAfter invoked ... ...");
    }

    //返回通知，在切点方法返回结构之后增强的功能
    //    如果出现异常不执行
    @AfterReturning(value = "addPoint()", returning = "res")
    public void methodAfterReturning(JoinPoint joinPoint, Object res) {
        System.out.println("methodAfterReturning invoked ... ...");
//        System.out.println(res);
    }

    //    异常通知 切点方法出翔异常就执行，不出现异常就不执行
    @AfterThrowing(value = "addPoint()", throwing = "ex")
    public void methodAfterThrowing(Exception ex) {
        System.out.println("methodAfterThrowing invoked ... ...");
//        System.out.println(ex.getMessage());
    }

    //环绕通知 切点方法之前和之后都进行国内的增强
    //参数列表需要带上一个特殊的形参 ProceedingJoinPoint
    //通过ProceedingJoinPoint 手动控制切点方法执行的位置
    //环绕通知的返回值必须时Object，强制
    //在环绕通知中必须要将切点方法继续向上返回
    @Around("addPoint()")
    public Object methodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("methodAroundA invoked ... ... ");
        Object res = proceedingJoinPoint.proceed();  //控制切点方法在这里执行
        System.out.println("methodAroundB invoked ... ... ");
        return res;

    }

}
