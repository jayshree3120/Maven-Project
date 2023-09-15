package annotation;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10)
    public void verifyLogin(){
        System.out.println("Login");
    }

    @Test(groups = "smoke")
    public void verifySignin(){
        System.out.println("Signin");
    }

    @Test
    public void verifyFundTransfer(){
        System.out.println("Fund Transfer");
    }
}
