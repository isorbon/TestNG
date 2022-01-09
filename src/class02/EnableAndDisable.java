package class02;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test(groups = "smoke")
    public void firstTest() {
        System.out.println("I am first test");
    }

    @Test(enabled = false)
    public void secondTest() {
        System.out.println("I am second test");
    }

    @Test(enabled = true, priority = 1)
    public void thirdTest() {
        System.out.println("I am third test");
    }
}
