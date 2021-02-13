package org.renewbuy;

import org.openqa.selenium.WebDriver;
import org.renewbuy.pages.BasePage;
import org.renewbuy.pages.HomePage;
import org.renewbuy.pages.NewCarInsurancePage;
import org.renewbuy.pages.NewCarInsuranceQuotePage;
import org.renewbuy.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/***
 * @author verma.piyush
 */
public class newCarInsuranceFunctionality {

    TestBase testBase = new TestBase();
    BasePage basePage;
    HomePage homePage;
    NewCarInsurancePage newCarInsurancePage;
    NewCarInsuranceQuotePage newCarInsuranceQuotePage;
    WebDriver driver;

    public void _init() {

        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        newCarInsurancePage = new NewCarInsurancePage(driver);
        newCarInsuranceQuotePage = new NewCarInsuranceQuotePage(driver);
    }

    @BeforeTest
    public void initializeBrowser() {

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
    public void userClickOnNewCarInsuranceLink() {

        homePage.newCarInsurance();
    }

    @Parameters("headingNCIP")
    @Test(priority = 5)
    public void userVerifyHeadingNCIP(String tHeadingNCIP) {

        Assert.assertTrue(newCarInsurancePage.verifyHeadingNCIP(tHeadingNCIP));
    }

    @Parameters("vehicleModalName")
    @Test(priority = 6)
    public void userEnterVehicleModalName(String tVehicleModal) {

        newCarInsurancePage.enterVehicleModal(tVehicleModal);
    }

    @Parameters("purchasingYear")
    @Test(priority = 7)
    public void userEnterPurchasingYear(String tPurchasingYear) {

        newCarInsurancePage.enterPurchasingYear(tPurchasingYear);
    }

    @Test(priority = 8)
    public void userClickOnInstantButton() {

        newCarInsurancePage.clickOnNewCarInsuranceQuoteButton();
    }

    @Parameters("headingNCIQP")
    @Test(priority = 9)
    public void userVerifyHeadingNCIQP(String tHeadingNCIQP) {

        newCarInsuranceQuotePage.verifyHeadingNCIQP(tHeadingNCIQP);
    }

    @Parameters("pauseExecution1")
    @Test(priority = 10)
    public void userWaitToLoadPage1(int sec) {

        testBase.pauseExecutionForSeconds(sec);
    }

    @Parameters("changeVehicleModalName")
    @Test(priority = 11)
    public void userEnterChangeVehicleModalName(String tChangeVehicleModal) {

        newCarInsuranceQuotePage.changeVehicleModal(tChangeVehicleModal);
    }

    @Parameters("pauseExecution2")
    @Test(priority = 12)
    public void userWaitToLoadPage2(int sec) {

        testBase.pauseExecutionForSeconds(sec);
    }

    @Parameters("changeRegisteredRTO")
    @Test(priority = 13)
    public void userEnterChangeRegisteredRTO(String tChangeRTO) {

        newCarInsuranceQuotePage.changeRegisteredRTO(tChangeRTO);
    }

    @Parameters("pauseExecution3")
    @Test(priority = 14)
    public void userWaitToLoadPage3(int sec) {

        testBase.pauseExecutionForSeconds(sec);
    }

    @Parameters({"updatedPurchasingDate","updatedPurchasingMonth","updatedPurchasingYear"})
    @Test(priority = 15)
    public void userUpdatePurchasingDate(String tPurchasingDate, String tPurchasingMonth, String tPurchasingYear) {

        newCarInsuranceQuotePage.setUpdatePurchasingDate(tPurchasingDate, tPurchasingMonth, tPurchasingYear);
    }

    @AfterTest
    public void tearDown() {

        basePage.tearDown();
    }
}