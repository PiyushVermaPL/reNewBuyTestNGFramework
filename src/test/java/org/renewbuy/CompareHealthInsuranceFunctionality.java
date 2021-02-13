package org.renewbuy;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.renewbuy.pages.BasePage;
import org.renewbuy.pages.CompareHealthInsurancePage;
import org.renewbuy.pages.HomePage;
import org.renewbuy.utils.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/***
 * @author verma.piyush
 */
public class CompareHealthInsuranceFunctionality {

    TestBase testBase = new TestBase();
    BasePage basePage;
    HomePage homePage;
    CompareHealthInsurancePage compareHealthInsurancePage;
    WebDriver driver;

    public void _init() {

        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        compareHealthInsurancePage = new CompareHealthInsurancePage(driver);
    }

    @BeforeTest
    public void userInitializingBrowser() {

        driver = testBase.initializeBrowser();
        _init();
    }

    @Parameters("website")
    @Test(priority = 1)
    public void userOpenWebsite(String tWebsite) {

        basePage.launchURL(tWebsite);
    }

    @Parameters("headingHP")
    @Test(priority = 2)
    public void userVerifyHeadingHP(String tHeadingHP) {

        Assert.assertTrue(homePage.headingHP(tHeadingHP));
    }

    @Test(priority = 3)
    public void userVerifyLogoHP() {

        Assert.assertTrue(homePage.logoHP());
    }

    @Test(priority = 4)
    public void userClickOnCompareHealthInsurance() {

        homePage.compareHealthInsurance();
    }

    @Parameters("headingCHIP")
    @Test(priority = 5)
    public void userVerifyHeadingCHIP(String tHeadingCHIP) {

        Assert.assertTrue(compareHealthInsurancePage.verifyHeadingCHIP(tHeadingCHIP));
    }

    @Test(priority = 6)
    public void userVerifyLogoCHIP() {

        Assert.assertTrue(compareHealthInsurancePage.reNewBuyLogo());
    }

    @AfterTest
    public void tearDown() {

        basePage.tearDown();
    }
}
