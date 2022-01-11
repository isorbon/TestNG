package practice.tc01;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class tc_01 extends CommonMethods {
   /* TC 1: HRMS Add Employee:
    Open Chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login”
    Login into the application
    Click on Add Employee
    Verify labels: Full Name, Employee ID, Photograph are displayed
    Provide Employee First and Last Name
    Add a picture to the profile
    Verify Employee has been added successfully
    Close the browser*/

    @DataProvider
    public Object[][] data(){
        Object[][] employee = new Object[1][4];
        employee[0][0] = "Sorbon";
        employee[0][1] = "Imomnazarov";
        employee[0][2] = "practice";
        employee[0][3] = "screen-1";

        return employee;
    }

    @Test (groups = "practice", dataProvider = "data")
    public void addEmployee(String firstName, String lastName, String folderName, String fileName){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("a#menu_pim_addEmployee")).click();

        driver.findElement(By.cssSelector("input#firstName")).sendKeys(firstName);
        driver.findElement(By.cssSelector("input#lastName")).sendKeys(lastName);
        driver.findElement(By.cssSelector("input#photofile")).sendKeys("C:\\Users\\DarAmal\\Desktop\\Prices\\profpic.jpg");
        driver.findElement(By.cssSelector("input#btnSave")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img#empPic")));

        CommonMethods.takeScreenShot(folderName, fileName);
    }



}
