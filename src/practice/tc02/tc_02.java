package practice.tc02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class tc_02 extends CommonMethods {
  /*  TC 2: HRMS Application Login:
    Open Chrome browser
    Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login
    Enter valid username and password
    Click on login button
    Then verify Syntax Logo is displayed
    Close the browser */

    @Test (groups = "practice")
    public void verifyLogo() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement logo = driver.findElement(By.cssSelector("img[src $='syntax.png']"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(logo));

        if (logo.isDisplayed()) {
            System.out.println("The Syntax logo is displayed");
        } else {
            System.out.println("The Syntax logo is NOT displayed");
        }

        CommonMethods.takeScreenShot("practice", "screen-2");
    }

}
