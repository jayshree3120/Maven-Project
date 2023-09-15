package priority;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = -100)
    public void verifyPravin(){
        System.out.println("Pravin");
    }

    @Test(priority = 'C')
    public void verifySopan(){
        System.out.println("Sopan");
    }

    @Test(priority = 'c')
    public void verifyPreeti(){
        System.out.println("Preeti");
    }

    @Test(priority = 5)
    public void verifyShikha(){
        System.out.println("Shikha");
    }

    @Test(priority = 4)
    public void verifyRonak(){
        System.out.println("Ronak");
    }

    @Test(priority = 1)
    public void verifyShamli(){
        System.out.println("Shamli");
    }

    @Test(priority = 2)
    public void verifyVed(){
        System.out.println("Ved");
    }

}
