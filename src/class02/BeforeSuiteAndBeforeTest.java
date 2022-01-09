package class02;

import org.testng.annotations.*;

public class BeforeSuiteAndBeforeTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am after Test");
    }

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

    @Test(groups = "regression")
    public void regressionTest(){
        System.out.println("I am Regression Test");
    }
    @Test(groups = "smoke")
    public void smokeTest(){
        System.out.println("I am Smoke Test");
    }
}
