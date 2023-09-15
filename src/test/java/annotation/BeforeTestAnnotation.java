package annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAnnotation {

    @BeforeTest
    public void beforeClassMethod(){

        System.out.println("Before Class Method BeforeTestAnnotation");
    }

    @Test(groups="smoke")
    public void testCse6(){

        System.out.println("Test Case 6");
    }

    @AfterTest
    public void afterTestMethod(){

        System.out.println("After Test Method");
    }
    }
