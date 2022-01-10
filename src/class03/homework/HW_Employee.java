package class03.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class HW_Employee extends CommonMethods {
   /* TC 1: HRMS Add Employee:
    Open chrome browser
    Go to HRMS
    Login into the application
    Add 5 different Employees and create login credentials by providing:
    First Name
    Last Name
    Username
    Password
    Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
    Close the browser
    Specify group for this test case, add it into specific suite and execute from xml file.*/

    @DataProvider
    public Object[][] data(){
        Object[][] newEmployee = new Object[5][7];
        newEmployee[0][0] = "Alexey";
        newEmployee[0][1] = "Sitalo";
        newEmployee[0][2] = "alexeysitalo";
        newEmployee[0][3] = "AlexSitalo@1239";
        newEmployee[0][4] = "AlexSitalo@1239";
        newEmployee[0][5] = "NewEmployee";
        newEmployee[0][6] = "1-employee";

        newEmployee[1][0] = "Oyshakhon";
        newEmployee[1][1] = "Eshonova";
        newEmployee[1][2] = "oyshakhoneshonova";
        newEmployee[1][3] = "Aysha@9878";
        newEmployee[1][4] = "Aysha@9878";
        newEmployee[1][5] = "NewEmployee";
        newEmployee[1][6] = "2-employee";

        newEmployee[2][0] = "Hasim";
        newEmployee[2][1] = "Kirkpinar";
        newEmployee[2][2] = "hasimkirkpinar";
        newEmployee[2][3] = "Hasim@7890Kirkpinar";
        newEmployee[2][4] = "Hasim@7890Kirkpinar";
        newEmployee[2][5] = "NewEmployee";
        newEmployee[2][6] = "3-employee";

        newEmployee[3][0] = "Ziyamedin";
        newEmployee[3][1] = "Akhmedov";
        newEmployee[3][2] = "zemaakhmedov";
        newEmployee[3][3] = "Zema@2022Akhmedov";
        newEmployee[3][4] = "Zema@2022Akhmedov";
        newEmployee[3][5] = "NewEmployee";
        newEmployee[3][6] = "4-employee";

        newEmployee[4][0] = "Silva";
        newEmployee[4][1] = "Umarova";
        newEmployee[4][2] = "silviyaumarova";
        newEmployee[4][3] = "Silviya@umarova20";
        newEmployee[4][4] = "Silviya@umarova20";
        newEmployee[4][5] = "NewEmployee";
        newEmployee[4][6] = "5-employee";

        return newEmployee;
    }

    // Login into the application
    @Test (priority = 1, groups = "addingNewEmployee", dataProvider = "data")
    public void adminLogin(String firstName, String lastName, String userName, String password, String confirm,
                           String folderName, String fileName){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();

    // adding a new employee
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("chkLogin")).click();
        driver.findElement(By.id("user_name")).sendKeys(userName);
        driver.findElement(By.cssSelector("input#user_password")).sendKeys(password);
        driver.findElement(By.cssSelector("input#re_password")).sendKeys(confirm);
        driver.findElement(By.id("btnSave")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img#empPic")));

    // taking a screenshot
        CommonMethods.takeScreenShot(folderName, fileName);
    }

}
