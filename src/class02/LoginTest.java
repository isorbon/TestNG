package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    // pre condition @BeforeMethod -- launch browser and navigate url
    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    // @Test -- perform login
    @Test(groups = "regression", enabled = false)
    public void adminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("HRM@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(groups = "regression")
    public void validationOfTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed");
        }
    }

    // post condition @AfterMethod -- close browser
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

}
