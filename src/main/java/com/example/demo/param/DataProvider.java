package com.example.demo.param;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvider {
    @Test(dataProvider = "data")
    public void dataprovider(String name, int age) {
        System.out.println("name: " + name + "age: " + age);
    }


    @org.testng.annotations.DataProvider(name = "data")
    public Object[][] data1() {
        Object[][] objects = new Object[][]{{"张三", 1}, {"lisi", 2}, {"王武", 34},

        };
        return objects;
    }


    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1" + "name: " + name + "age: " + age);

    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2" + "name: " + name + "age: " + age);

    }

    @org.testng.annotations.DataProvider(name = "methodData")
    public Object[][] methodData(Method method) {

        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{{"张三", 23}};
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{{"张三", 23}};

        }
        return result;
    }

}
