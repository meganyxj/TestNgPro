package com.course.testng.suite;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PayTest {
    @Test
    @Parameters({"name"})
    public void pay(String name){
        System.out.println("支付成功"+name);
    }
}
