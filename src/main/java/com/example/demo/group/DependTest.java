package com.example.demo.group;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test(){
        System.out.println("test1 run");
        throw new RuntimeException();

    }

    @Test(dependsOnMethods = {"test"})
    public void test2(){
        System.out.println("test2 run ");
    }
}
