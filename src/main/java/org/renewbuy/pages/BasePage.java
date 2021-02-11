package org.renewbuy.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.renewbuy.utils.TestBase;

/***
 * @author verma.piyush
 */
public class BasePage extends TestBase {

    public WebDriver driver;
    private static Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*
     * To launch given url
     * if URL value is null then it will take url value from config file
     */
    public void launchURL(String url) {

        if(url.isEmpty()) {

            logger.info("launching url {} is taking from config. file:",prop.getProperty("URL"));
            String url1 = prop.getProperty("URL");
            driver.get(url1);
        }
        else {

            logger.info("launching url {} is taking from feature file:", url);
            driver.get(url);
        }
    }

    /***
     * To close the browser incident
     */
    public void tearDown() {

        logger.info("stop execution and closing the browser: ");
        driver.quit();
    }
}
