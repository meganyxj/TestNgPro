package com.course.testng;

import org.testng.annotations.*;

public class BasicDemo {

    @BeforeClass
    public void beforeClass(){
        System.out.println("我叫BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("我叫AfterClass");
    }

    @BeforeMethod
    public void before(){
        System.out.println("我叫BeforeMethod");
    }
    @AfterMethod
    public void after(){
        System.out.println("我叫AfterMethod");
    }
    @Test
    public  void testCase1(){
        System.out.println("我叫testCase1");
    }
    @Test
    public  void testCase2(){
        System.out.println("我叫testCase2");
    }
}
