package dependsonattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTestExample {

          @Test(groups = "Smoke")
        public void verifyLogin(){
            Assert.assertTrue(false);
            System.out.println("Login");
        }

        @Test(groups = "smoke")
        public void verifyDebitCard(){
            System.out.println("Verify DebitCard");
        }

        @Test(dependsOnGroups = {"smoke"},alwaysRun = true)
        public void verifyFundTransfer(){
            System.out.println("Fund Transfer");
        }

        @Test(enabled =true)
        public void verifyCashBackOfficer(){
            System.out.println("Verify CashBackofficer");
        }
    }



