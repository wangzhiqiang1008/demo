package com.example.demo.param;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Test
    @Parameters({"name","age"})
    public void palmiest(String name, int age){
        System.out.println( "name = " +name+" age = "+age);

    }

    @BeforeMethod
    public void before(){
        System.out.println("/n");
    }
}
