package com.course.testng.suite;

import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void login(){
        System.out.println("登录成功");
    }

    @Test(enabled = false)
    public void loginout(){
        System.out.println("退出成功");
    }
}
