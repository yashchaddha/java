package com.stackroute.unittest.quickstart;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

   @Test
    public void testConcatAndConvertString() throws Exception {
       //Arranga
       String expectedValue="HELLOWORLD";
       App app=new App();
       //Act
       String actualValue=app.concatAndConvertString("Hello", "World");
       //Assert
       assertEquals(expectedValue, actualValue);
    }
}



