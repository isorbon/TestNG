package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    // universal method to open two browsers
    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunchApplication() {
        ConfigReader.readProperties("src/config/config.properties");
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    //  take a screenshot
    public static void takeScreenShot(String folderName, String fileName) {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File sourceFile = screen.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/" + folderName + "/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // post condition @AfterMethod -- close browser
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

}
