package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertion {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(groups = "regression")
    public void verifyAndValidateSoftAssertions() {

        SoftAssert soft = new SoftAssert();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaaaaaaaaaagement System";
        soft.assertEquals(actualTitle, expectedTitle);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement welcomeText = driver.findElement(By.xpath("//*[text()='Welcome Admin']"));
        soft.assertTrue(welcomeText.isDisplayed());
        System.out.println("I'm still executing even after failing the test above");

        soft.assertAll(); // should be the last line of test case

    }

    // post condition @AfterMethod -- close browser
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

}
