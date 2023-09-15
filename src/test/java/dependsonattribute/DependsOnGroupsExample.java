package dependsonattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = "Smoke")
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Login");
    }

    @Test(groups = "smoke")
    public void verifyDebitCard(){
        System.out.println("Verify DebitCard");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransfer(){
        System.out.println("Fund Transfer");
    }

    @Test
    public void verifyCashBackOfficer(){
        System.out.println("Verify CashBackofficer");
    }
}

