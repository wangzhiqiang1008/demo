package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.*;

@SpringBootApplication
public class DemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
    @BeforeMethod
    public void barrettes(){
        System.out.println("测试前方法");

    }
    @AfterMethod
    public void aftermath(){
        System.out.println("测试后调用方法");
    }

	@Test(enabled = false)
	public void test01(){

        System.out.println("这次测试数据一");
    }

    @Test
    public void test02(){

        System.out.println("这次测试数据二");

    }
    @BeforeClass
    public void beforehand(){
        System.out.println("测试类之前发");

    }

    @AfterClass
    public void aftertastes(){
        System.out.println("测试类之前发");


    }
    @BeforeSuite
    public  void suitbefore(){
        System.out.println("套件前");

    }

    @AfterSuite
    public  void suiteafter(){
        System.out.println("套件后");

    }



}
