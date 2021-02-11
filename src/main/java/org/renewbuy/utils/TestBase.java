package org.renewbuy.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/***
 * @author verma.piyush
 */
public class TestBase {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    private static final Logger logger = LogManager.getLogger(TestBase.class);
    public static WebDriverWait wait;

    public TestBase() {
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\configurations\\config.properties");
            prop.load(fileInputStream);
        } catch (FileNotFoundException e1) {
            logger.error(e1);
        } catch (IOException e2) {
            logger.error(e2);
        }
    }

    //define cluster to initialize the browser which return webdriver
    public WebDriver initializeBrowser() {
        String browserName = prop.getProperty("browser");
        logger.info("initializing browser set up for Test execution:");
        if (browserName.equalsIgnoreCase("chrome")) {
            logger.info("Opening Chrome Browser:");
            System.setProperty("webdriver.chrome.driver" , "src/main/resources/drivers/chromedriver.exe");
            logger.info("Chrome Property set:");
            driver = new ChromeDriver();
            logger.info("maximizing the browser window:");
            driver.manage().window().maximize();
        } else if(browserName.equalsIgnoreCase("firefox")) {
            logger.info("Opening Firefox Browser:");
            System.setProperty("webdriver.gecko.driver" , "src/main/resources/drivers/chromedriver.exe");
            logger.info("Chrome Property set:");
            driver = new FirefoxDriver();
            logger.info("maximizing the browser window:");
            driver.manage().window().maximize();
        } else {
            logger.info("Provided browser name is invalid : Test execution failed:");
        }

        driver.manage().timeouts().implicitlyWait(UtilsTime.implicitTime, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(UtilsTime.pageloadTime, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, UtilsTime.explicitTime);
        logger.info("defined implicitly and explicitly wait:");

        return driver;
    }

    /*
     * To pause execution if website is unstable
     * not recommended to use this method
     * use only when explicit wait is fail to handle situation
     * @param seconds duration to pause execution
     */
    public void pauseExecutionForSeconds(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            logger.error(e);
        }
    }

    //To provide Explicit wait for input WebElement
    public WebElement wait(WebElement element) {

        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
