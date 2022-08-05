package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Suite 开始运行.........");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Suite 运行结束.........");

    }

    @BeforeTest
    public void afterTest(){
        System.out.println("afterTest 运行");
    }
    @AfterTest
    public void beforeTest(){
        System.out.println("beforeTest 运行");
    }

}
