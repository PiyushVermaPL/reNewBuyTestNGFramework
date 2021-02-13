package org.renewbuy.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/***
 * @author verma.piyush
 */
public class CompareHealthInsurancePage extends BasePage {

    private static Logger logger = LogManager.getLogger(CompareHealthInsurancePage.class);

    public CompareHealthInsurancePage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Verify Heading On CHIP(D2C INSURANCE BROKING PVT. LTD.)
    @FindBy(xpath = "//div[@class='D2C_update']")
    WebElement headingCHIP;

    //Verify reNewBuy Logo On CHIP
    @FindBy(xpath = "//a[@class='site-logo']/img")
    WebElement logoCHIP;



    //Verify Heading On CHIP(D2C INSURANCE BROKING PVT. LTD.)
    public boolean verifyHeadingCHIP(String heading) {

        logger.info("Verifying Heading on Compare Health Insurance Page:");
        String headings = prop.getProperty("c_headingCHIP");
        boolean flag = false;
        if (heading.isEmpty()) {

            logger.info("Heading {} is taking from config. file:", headings);
            flag = headingCHIP.getText().trim().equalsIgnoreCase(headings);
            if(flag == true) {
                logger.info("Heading {} is present on Compare Health Insurance Page:", headings);
            } else {
                logger.info("Heading {} is not present on Compare Health Insurance Page:", headings);
            }
        } else {

            logger.info("Heading {} is taking from Test:", heading);
            flag = headingCHIP.getText().trim().equalsIgnoreCase(heading);
            if (flag == true) {
                logger.info("Heading {} is present on Compare Health Insurance Page:", heading);
            } else {
                logger.info("Heading {} is not present on Compare Health Insurance Page:",heading);
            }
        }
        return flag;
    }

    //Verify reNewBuy Logo On CHIP
    public boolean reNewBuyLogo() {

        logger.info("Verifying RenewBuy Logo On Compare Health Insurance Home Page:");
        return logoCHIP.isDisplayed();
    }
}
