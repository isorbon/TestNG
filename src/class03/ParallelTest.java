package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class ParallelTest extends CommonMethods {
    // open browser from utils

    // @Test -- perform login
    @Test(groups = "regression", enabled = true)
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

    // close browser from utils

}
