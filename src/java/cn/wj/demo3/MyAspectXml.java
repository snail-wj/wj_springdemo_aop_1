package cn.wj.demo3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.Test;

/**
 * 切面类:切入点 + 通知
 * Created by WJ on 2017/10/19.
 */
public class MyAspectXml {

    public void log(){
        System.out.println("记录日志");
    }

    /**
     * 最终通知，方法执行成功或者出现异常都会出现通知
     */
    public void after(){
        System.out.println("最终通知");
    }

    /**
     * 方法执行之后，执行后置通知，程序出现了bug,程序是不会执行的
     */
    public void afterReturn(){
        System.out.println("后置通知");
    }

    /**
     * 环绕通知:方法执行之前和方法执行之后进行通知，默认的情况下，目标对象的方法不能执行，需要手动让目标对象的方法执行
     */
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知1...");

        try {
            //手动的让目标对象的方法执行
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知2...");
    }
}
