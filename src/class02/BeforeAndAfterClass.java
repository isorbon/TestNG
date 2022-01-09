package class02;

import org.testng.annotations.*;

public class BeforeAndAfterClass {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println(" after method");
    }

    @Test
    public void thirdTest() {
        System.out.println("  I am third test");
    }

    @Test
    public void secondTest() {
        System.out.println("  I am second test");
    }

    @Test
    public void firstTest() {
        System.out.println("  I am first test");
    }

}
