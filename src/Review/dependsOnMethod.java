package Review;

import org.testng.annotations.Test;

public class dependsOnMethod {
    @Test(enabled = false)
    public void login() {
        System.out.println("i am login");

    }

    @Test(dependsOnMethods = "login")
    public void deleteEmployee() {
        System.out.println("i am delete emplpoyee");

    }
}
