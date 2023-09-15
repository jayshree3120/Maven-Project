package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample extends BeforeTestAnnotation {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");

    }

    @Test
    public void testCase1(){
        System.out.println("test Case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("test Case 2");
    }
    @Test
    public void testCase3(){
        System.out.println("test Case 3");
    }
    @Test
    public void testCase4(){
        System.out.println("test Case 4");
    }
    @Test
    public void testCase5(){
        System.out.println("test Case 5");
    }
    @AfterMethod
    public void afterMathod(){
        System.out.println("After Method");
    }
}
