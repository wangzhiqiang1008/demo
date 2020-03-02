package com.example.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class report {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(2,2);
    }


    @Test
    public void test3() throws RuntimeException {
        Reporter.log("这是日志");
        throw new RuntimeException("error");

    }


}
