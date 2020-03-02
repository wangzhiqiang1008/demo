package com.example.demo.group;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("group--server---001");
    }
    @Test(groups = "server")
    public void test3(){
        System.out.println("group--server---003");
    }

    @Test(groups = "user")
    public  void test2(){
        System.out.println("group--user--002");
    }

    @BeforeGroups("user")
    public  void test4(){
        System.out.println("BeforeGroups--user--002");
    }


}
