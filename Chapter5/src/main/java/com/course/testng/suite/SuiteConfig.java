package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

        @BeforeSuite
        public void beforeSuite(){
            System.out.println("before suite 运行了");
        }
        @AfterSuite
        public void afterSuite(){
            System.out.println("after suite 运行了");
        }
        @BeforeTest
        public void beforeTest(){
            System.out.println("beforeTest 这是在测试方法之前运行的");
        }

        @AfterTest
        public void afterTest(){
            System.out.println("afterTest 这是在测试方法之后运行的");
        }
}
