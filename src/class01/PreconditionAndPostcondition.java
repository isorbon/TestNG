package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreconditionAndPostcondition {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am Pre Condition");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am Post Condition");
    }

    @Test
    public void test() {
        System.out.println("I am actual test");
    }

    @Test
    public void anotherTest() {
        System.out.println("I am another test");
    }

}
