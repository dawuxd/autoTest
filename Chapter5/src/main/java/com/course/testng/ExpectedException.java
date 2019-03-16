package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候用到异常测试？
     * 在我的期望的结果为某一个异常的时候
     * 例如，传入的参数不合法，运行结果应该是一个异常
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void testException(){
        System.out.println("运行成功的异常测试");
        throw  new RuntimeException();
    }
}
