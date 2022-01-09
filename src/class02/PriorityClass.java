package class02;

import org.testng.annotations.Test;

public class PriorityClass {

    @Test(priority = 2)
    public void thirdTest() {
        System.out.println("I am third test");
    }

    @Test(priority = 1)
    public void secondTest() {
        System.out.println("I am second test");
    }

    @Test(priority = 3)
    public void firstTest() {
        System.out.println("I am first test");
    }

}
