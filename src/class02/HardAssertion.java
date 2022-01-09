package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertion {

    WebDriver driver;

    @BeforeMethod
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void validationOfTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaaaaaagement System";

        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement username = driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(username.isDisplayed());
        System.out.println("I am test code");

      /*  if (actualTitle.equals(actualTitle)){
            System.out.println("Test is pass");
        }else {
            System.out.println("Not work");
        }*/
    }

    // post condition @AfterMethod -- close browser
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

