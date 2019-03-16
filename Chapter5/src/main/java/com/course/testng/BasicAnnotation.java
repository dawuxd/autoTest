package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("testCase1 Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.printf("testCase2 Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 这是在类运行之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在类运行之前运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 在类运行之前运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 在类运行之后运行");
    }
}
