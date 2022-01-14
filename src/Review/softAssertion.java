package Review;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
    @Test
    public void softAssert() {

        SoftAssert soft = new SoftAssert();

        String actualname = "mark";
        String expectedname = "mar";
        soft.assertEquals(actualname, expectedname);

        System.out.println("i am on second assertion");
        boolean test = true;
        soft.assertTrue(test);

        soft.assertAll();
    }
}
