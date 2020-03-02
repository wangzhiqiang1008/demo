package com.example.demo.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void test001(){
        System.out.println("suite套件before运行了");
    }

    @AfterSuite
    public void test002(){
        System.out.println("suite套件after运行啦");
    }
}
