package dependsonattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnAttributeExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyDebitCard(){
        System.out.println("Verify DebitCard");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyFundTransfer(){
        System.out.println("Fund Transfer");
    }

    @Test
    public void verifyCashBackOfficer(){
        System.out.println("Verify CashBackofficer");
}
}
