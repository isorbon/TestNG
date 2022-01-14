package Review;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void BeforeNow() {
        System.out.println("i am a before suite annotation");

    }

    @BeforeTest
    public void beforetestAnnotation() {

        System.out.println("i am a before test annotation");
    }

    @BeforeClass
    public void beforeclassAnnotation() {

        System.out.println("i am a before class annotation");
    }

    @AfterClass
    public void afterclassAnnotation() {

        System.out.println("i am a after  class annotation");
    }

    @BeforeMethod
    public void before() {
        System.out.println("i am a before method");
    }

    @AfterMethod
    public void after() {
        System.out.println("i am a after method");
    }

    @Test(groups = "regression")
    public void test() {
        System.out.println("i am a test case no 1");
    }

    @Test
    public void stest() {
        System.out.println("i am a test case no 2");
    }

}
