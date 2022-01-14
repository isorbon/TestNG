package Review;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 2, groups = "regression")
    public void firstTest() {
        System.out.println("I am first");
    }

    @Test(priority = 1, groups = "smoke")
    public void secondTest() {
        System.out.println("I am second");
    }

    @Test(priority = 9, enabled = true, groups = "smoke")
    public void thirdTest() {
        System.out.println("I am third");
    }

    @Test(priority = 0, groups = "regression")
    public void fourthTest() {
        System.out.println("I am fourth");
    }
}
