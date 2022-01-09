package class02;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println("I am login test");
    }

    @Test(dependsOnMethods = "login")
    public void varificationOfDashboard(){
        System.out.println("I am depend scenario");
    }

}
