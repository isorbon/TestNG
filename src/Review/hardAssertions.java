package Review;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertions {
    @Test
    public void hardAssert() {

        String actualname = "mark";
        String expectedname = "mark";

        Assert.assertEquals(actualname, expectedname);

        System.out.println("i am on second assertion");
        boolean test = true;
        Assert.assertTrue(test);

    }
}
