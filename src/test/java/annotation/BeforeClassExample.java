package annotation;

import org.testng.annotations.*;

public class BeforeClassExample extends BeforeTestAnnotation {

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Before Class Method");
    }

        @BeforeMethod
        public void beforeMethod () {
            System.out.println("Before Method");

        }

        @Test
        public void testCase1 () {
            System.out.println("test Case 1");
        }
        @Test
        public void testCase2 () {
            System.out.println("test Case 2");
        }
        @Test
        public void testCase3 () {
            System.out.println("test Case 3");
        }
        @Test
        public void testCase4 () {
            System.out.println("test Case 4");
        }
        @Test
        public void testCase5 () {
            System.out.println("test Case 5");
        }
        @AfterMethod
        public void afterMethod () {
            System.out.println("After Method");
        }
        @AfterClass
        public void afterClassMethod () {
            System.out.println("After Class Method");
        }
    }




