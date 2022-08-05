package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void testParam(String name,int age){
        System.out.println("我叫："+name+",我几年"+age+"岁了。");
    }
}
