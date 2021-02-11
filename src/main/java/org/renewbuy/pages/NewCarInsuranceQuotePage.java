package org.renewbuy.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * @author verma.piyush
 */
public class NewCarInsuranceQuotePage extends BasePage {

    private static Logger logger = LogManager.getLogger(NewCarInsuranceQuotePage.class);

    public NewCarInsuranceQuotePage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    @FindBy(xpath = "//div[@class='broking']")
    WebElement headingNCIQP;

    //Verify RenewBuy Logo
    @FindBy(xpath = "//a[@class='navbar-brand']/img")
    WebElement logo;

    //Motor Insurance(Hover)
    @FindBy(xpath = "//li[@class='nav-submenu hasmenu']/a[contains(text(),'Motor Insurance')]")
    WebElement motorInsurance;

    //Car Insurance(Hover)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance')])[1]")
    WebElement carInsurance;

    //Renew Car Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Renew Car Insurance')])[1]")
    WebElement renewCarInsurance;

    //Compare Car Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Compare Car Insurance')])[1]")
    WebElement compareCarInsurance;

    //New Car Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'New Car Insurance')])[1]")
    WebElement newCarInsurance;

    //Car Insurance Calculator(link)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance Calculator')])[1]")
    WebElement carInsuranceCalculator;

    //Car Insurance Claim(link)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance Claim')])[1]")
    WebElement carInsuranceClaim;

    //Car Insurance FAQs(link)
    @FindBy(xpath = "(//a[contains(.,'Car Insurance FAQs')])[1]")
    WebElement carInsuranceFAQs;

    //Two Wheeler Insurance(Hover)
    @FindBy(xpath = "(//a[contains(.,'Two Wheeler Insurance')])[1]")
    WebElement twoWheelerInsurance;

    //Renew Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Renew Two Wheeler Insurance')])[1]")
    WebElement renewTwoWheelerInsurance;

    //Compare Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Compare Two Wheeler Insurance')])[1]")
    WebElement compareTwoWheelerInsurance;

    //New Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'New Two Wheeler Insurance')])[1]")
    WebElement newTwoWheelerInsurance;

    //Multi Year Two Wheeler Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Multi Year Two Wheeler Insurance')])[1]")
    WebElement multiYearTwoWheelerInsurance;

    //Two Wheeler Insurance Calculator(link)
    @FindBy(xpath = "(//a[contains(.,'Two Wheeler Insurance Calculator')])[1]")
    WebElement twoWheelerInsuranceCalculator;

    //Two Wheeler Insurance FAQs(link)
    @FindBy(xpath = "(//a[contains(.,'Two Wheeler Insurance FAQs')])[1]")
    WebElement twoWheelerInsuranceFAQs;

    //Motor Insurance Reminder(link)
    @FindBy(xpath = "(//a[contains(.,'Motor Insurance Reminder ')])[1]")
    WebElement motorInsuranceReminder;

    //Health Insurance(Hover)
    @FindBy(xpath = "(//a[contains(.,'Health Insurance')])[1]")
    WebElement healthInsurance;

    //Compare Health Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Compare Health Insurance')])[1]")
    WebElement compareHealthInsurance;

    //Individual Health Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Individual Health Insurance')])[1]")
    WebElement individualHealthInsurance;

    //Family Health Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Family Health Insurance')])[1]")
    WebElement familyHealthInsurance;

    //Corporate Insurance(link)
    @FindBy(xpath = "(//a[contains(.,'Corporate Insurance')])[1]")
    WebElement corporateInsurance;

    //Become POS Advisor(link)
    @FindBy(xpath = "(//a[contains(.,'Become POS Advisor')])[1]")
    WebElement becomePOSAdviser;

    //One Click Renewal(link)
    @FindBy(xpath = "(//a[contains(.,'One-Click Renewal')])[1]")
    WebElement oneClickRenewal;

    //Articles(link)
    @FindBy(xpath = "(//a[contains(.,'Articles')])[1]")
    WebElement articles;

    //Login(Hover)
    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement login;

    //Customer Login(click)
    @FindBy(xpath = "(//a[contains(.,'Customer Login')])[1]")
    WebElement customerLogin;

    //Partner Login(click)
    @FindBy(xpath = "(//a[contains(.,'Partner Login')])[1]")
    WebElement partnerLogin;

    //Edit Vehicle Modal(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[1]")
    WebElement editVehicleModal;

    //Cancel of Edit Vehicle Modal(click)
    @FindBy(xpath = "(//div[@class='data_update modal_pop close_input'])[1]")
    WebElement cancelEditVehicleModal;

    //Enter Vehicle Modal(enter)
    @FindBy(xpath = "//div[@id='vehicle_model_edit']//input[@class='ui-autocomplete-input']")
    WebElement enterVehicleModal;

    //Click on TOYOTA FORTUNER 2.7 4x2 MT (2694cc)(P)(click)
    @FindBy(xpath = "//li[contains(.,'TOYOTA FORTUNER 2.7 4x2 MT (2694 cc)(P)')]")
    WebElement toyotaFortuner;

    //Edit Registered Rto(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[2]")
    WebElement editRegisteredRTO;

    //Cancel of Edit Registered Rto(click)
    @FindBy(xpath = "(//div[@class='data_update modal_pop close_input'])[2]")
    WebElement cancelEditRegisteredRTO;

    //Enter Registered RTO(enter)
    @FindBy(xpath = "//input[@id='selectcity']")
    WebElement enterRegisteredRTO;

    //Click on up13 Bulandshahr(click)
    @FindBy(xpath = "//li[contains(.,'UP13-Bulandshahr')]")
    WebElement up13bulandshahr;

    //Edit Purchasing Date(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[3]")
    WebElement editPurchasingDate;

    //Cancel of Edit Purchasing Date(click)
    @FindBy(xpath = "(//div[@class='data_update has_update modal_pop close_input'])[1]")
    WebElement cancelPurchasingDate;

    //Enter Purchasing Date(click)
    @FindBy(xpath = "(//span[@class='filter-option pull-left'])[1]")
    WebElement clickPurchasingDate;
    @FindBy(xpath = "(//span[@class='text' and contains(.,'25')])[1]")
    WebElement selectDate;
    @FindBy(xpath = "(//span[@class='filter-option pull-left'])[2]")
    WebElement clickPurchasingMonth;
    @FindBy(xpath = "(//span[@class='text' and contains(.,'Feb')])[1]")
    WebElement selectMonth;
    @FindBy(xpath = "(//span[@class='filter-option pull-left'])[3]")
    WebElement clickPurchasingYear;
    @FindBy(xpath = "(//span[@class='text' and contains(.,'2020')])[1]")
    WebElement selectYear;

    //Click on Update Purchasing Date(click)
    @FindBy(xpath = "//div[@class='data_update has_update update']")
    WebElement updatePurchasingDate;

    //Edit Previous Insurer(click)
    @FindBy(xpath = "(//div[@class='edit_data modal_pop no_mob'])[4]")
    WebElement editPreviousInsurer;

    //Select Previous Insurer(click)
    @FindBy(xpath = "(//span[@class='filter-option pull-left' and contains(.,'Select Insurer')])[1]")
    WebElement selectPreviousInsurer;

    //Cancel Previous Insurer(click)
    @FindBy(xpath = "(//div[@class='data_update has_update modal_pop close_input' and contains(.,'Cancel')])[2]")
    WebElement cancelPreviousInsurer;

    //Clear Previous Insurer(click)
    @FindBy(xpath = "//div[@class='data_update clear_input' and contains(.,'Clear')]")
    WebElement clearPreviousInsurer;




    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    public boolean verifyHeadingString1(String heading) {

        logger.info("Verifying heading on New Car Insurance Quote Page:");
        String headings = prop.getProperty("c_headingNCIQP");
        boolean flag = false;
        if (heading.isEmpty()) {
            logger.info("Heading {} is taking from config. file", headings);
            flag = headingNCIQP.getText().trim().equalsIgnoreCase(headings);
            if (flag == true) {
                logger.info("Heading {} is present On New Car Insurance Quote Page", headings);
            } else {
                logger.info("Heading {} is not present On New Car Insurance Quote Page", headings);
            }
        }
        else {
            logger.info("Heading {} is taking from Test", heading);
            flag = headingNCIQP.getText().trim().equalsIgnoreCase(heading);
            if (flag == true) {
                logger.info("Heading {} is present On New Car Insurance Quote Page", heading);
            } else {
                logger.info("Heading {} is not present On New Car Insurance Quote Page", heading);
            }
        }
        return flag;
    }

    //Verify RenewBuy Logo
    public boolean reNewBuyLogo() {

        logger.info("Verifying RenewBuy Logo On New Car Insurance Quote Page:");
        return logo.isDisplayed();
    }

    //Renew Car Insurance
    public RenewCarInsurancePage renewCarInsurance() {

        logger.info("Verifying that 'Renew Car Insurance' link is available:");
        boolean flag = false;
        flag = renewCarInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(renewCarInsurance).click().build().perform();
        return new RenewCarInsurancePage(driver);
    }

    //Compare Car Insurance
    public CompareCarInsurancePage compareCarInsurance() {

        logger.info("Verifying that 'Compare Car Insurance' link is available:");
        boolean flag = false;
        flag = compareCarInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(compareCarInsurance).click().build().perform();
        return new CompareCarInsurancePage(driver);
    }

    //New Car Insurance
    public NewCarInsurancePage newCarInsurance() {

        logger.info("Verifying that 'New Car Insurance' link is available:");
        boolean flag = false;
        flag = newCarInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(newCarInsurance).click().build().perform();
        return new NewCarInsurancePage(driver);
    }

    //Car Insurance Calculator
    public CarInsuranceCalculatorPage carInsuranceCalculator() {

        logger.info("Verifying that 'Car Insurance Calculator' link is available:");
        boolean flag = false;
        flag = carInsuranceCalculator.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceCalculator).click().build().perform();
        return new CarInsuranceCalculatorPage(driver);
    }

    //Car Insurance Claim
    public CarInsuranceClaimPage carInsuranceClaim() {

        logger.info("Verifying that 'Car Insurance Claim' link is available:");
        boolean flag = false;
        flag = carInsuranceClaim.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceClaim).click().build().perform();
        return new CarInsuranceClaimPage(driver);
    }

    //Car Insurance FAQs
    public CarInsuranceFAQsPage carInsuranceFAQs() {

        logger.info("Verifying that 'Car Insurance FAQs' link is available:");
        boolean flag = false;
        flag = carInsuranceFAQs.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceFAQs).click().build().perform();
        return new CarInsuranceFAQsPage(driver);
    }

    //Renew Two Wheeler Insurance
    public RenewTwoWheelerInsurancePage renewTwoWheelerInsurance() {

        logger.info("Verifying that 'Renew Two Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = renewTwoWheelerInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(renewTwoWheelerInsurance).click().build().perform();
        return new RenewTwoWheelerInsurancePage(driver);
    }

    //Compare Two Wheeler Insurance
    public CompareTwoWheelerInsurancePage compareTwoWheelerInsurance() {

        logger.info("Verifying that 'Compare Two Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = compareTwoWheelerInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(compareTwoWheelerInsurance).click().build().perform();
        return new CompareTwoWheelerInsurancePage(driver);
    }

    //New Two Wheeler Insurance
    public NewTwoWheelerInsurancePage newTwoWheelerInsurance() {

        logger.info("Verifying that 'New Two Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = newTwoWheelerInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(newTwoWheelerInsurance).click().build().perform();
        return new NewTwoWheelerInsurancePage(driver);
    }

    //Multi Year Two Wheeler Insurance
    public MultiYearTwoWheelerInsurancePage multiYearTwoWheelerInsurance() {

        logger.info("Verifying that 'Multi Year Two Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = multiYearTwoWheelerInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(multiYearTwoWheelerInsurance).click().build().perform();
        return new MultiYearTwoWheelerInsurancePage(driver);
    }

    //Two Wheeler Insurance Calculator
    public TwoWheelerInsuranceCalculatorPage twoWheelerInsuranceCalculator() {

        logger.info("Verifying that 'Two Wheeler Insurance Calculator' link is available:");
        boolean flag = false;
        flag = twoWheelerInsuranceCalculator.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(twoWheelerInsuranceCalculator).click().build().perform();
        return new TwoWheelerInsuranceCalculatorPage(driver);
    }

    //Two Wheeler Insurance FAQs
    public TwoWheelerInsuranceFAQsPage twoWheelerInsuranceFAQs() {

        logger.info("Verifying that 'Two Wheeler Insurance FAQs' link is available:");
        boolean flag = false;
        flag = twoWheelerInsuranceFAQs.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(twoWheelerInsuranceFAQs).click().build().perform();
        return new TwoWheelerInsuranceFAQsPage(driver);
    }

    //Motor Insurance Reminder
    public MotorInsuranceReminderPage motorInsuranceReminder() {

        logger.info("Verifying that 'Motor Insurance Reminder' link is available:");
        boolean flag = false;
        flag = motorInsuranceReminder.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(motorInsuranceReminder).click().build().perform();
        return new MotorInsuranceReminderPage(driver);
    }

    //Compare Health Insurance
    public CompareHealthInsurancePage compareHealthInsurance() {

        logger.info("Verifying that 'Compare Health Insurance' link is available:");
        boolean flag = false;
        flag = compareHealthInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(compareHealthInsurance).click().build().perform();
        return new CompareHealthInsurancePage(driver);
    }

    //Individual Health Insurance
    public IndividualHealthInsurancePage individualHealthInsurance() {

        logger.info("Verifying that 'Individual Health Insurance' link is available:");
        boolean flag = false;
        flag = individualHealthInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(individualHealthInsurance).click().build().perform();
        return new IndividualHealthInsurancePage(driver);
    }

    //Family Health Insurance
    public FamilyHealthInsurancePage familyHealthInsurance() {

        logger.info("Verifying that 'Family Health Insurance' link is available:");
        boolean flag = false;
        flag = familyHealthInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(familyHealthInsurance).click().build().perform();
        return new FamilyHealthInsurancePage(driver);
    }

    //Corporate Insurance
    public CorporateInsurancePage corporateInsurance() {

        logger.info("Verifying that 'Corporate Insurance' link is available:");
        boolean flag = false;
        flag = corporateInsurance.isDisplayed();
        corporateInsurance.click();
        return new CorporateInsurancePage(driver);
    }

    //Become POS Advisor
    public BecomePOSPAdvisorPage becomePOSPAdvisor() {

        logger.info("Verifying that 'Become POS Advisor' link is available:");
        boolean flag = false;
        flag = becomePOSAdviser.isDisplayed();
        becomePOSAdviser.click();
        return new BecomePOSPAdvisorPage(driver);
    }

    //One Click Renewal
    public OneClickRenewalPage oneClickRenewal() {

        logger.info("Verifying that 'One Click Renewal' link is available:");
        boolean flag = false;
        flag = oneClickRenewal.isDisplayed();
        oneClickRenewal.click();
        return new OneClickRenewalPage(driver);
    }

    //Articles
    public ArticlesPage articles() {

        logger.info("Verifying that 'Articles' link is available:");
        boolean flag = false;
        flag = articles.isDisplayed();
        articles.click();
        return new ArticlesPage(driver);
    }

    //Customer Login
    public CustomerLoginPage customerLogin() {

        logger.info("Verifying that 'Customer Login' link is available:");
        boolean flag = false;
        flag = customerLogin.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(login).moveToElement(customerLogin).click().build().perform();
        return new CustomerLoginPage(driver);
    }

    //Partner Login
    public PartnerLoginPage partnerLogin() {

        logger.info("Verifying that 'Partner Login' link is available:");
        boolean flag = false;
        flag = partnerLogin.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(login).moveToElement(partnerLogin).click().build().perform();
        return new PartnerLoginPage(driver);
    }

    //Change Vehicle Modal on New Car Insurance Quote Page
    public void changeVehicleModal(String tVehicleName) {

        String changeVehicleModal = prop.getProperty("c_ChangeVehicleModal");
        if (tVehicleName.isEmpty()) {
            logger.info("Vehicle Name {} is taking from config. file", changeVehicleModal);
            editVehicleModal.click();
            enterVehicleModal.clear();
            enterVehicleModal.sendKeys(changeVehicleModal);
            toyotaFortuner.click();
        }
        else {
            logger.info("Vehicle Name {} is taking from Test", tVehicleName);
            editVehicleModal.click();
            enterVehicleModal.clear();
            enterVehicleModal.sendKeys(tVehicleName);
            toyotaFortuner.click();
        }
    }

    //Change Registered RTO
    public void changeRegisteredRTO(String tRegisteredRTO) {

        String changeRTO = prop.getProperty("c_RegisteredRTO");
        if (tRegisteredRTO.isEmpty()) {
            logger.info("Registered RTO {} is taking from config. file", changeRTO);
            editRegisteredRTO.click();
            enterRegisteredRTO.clear();
            enterRegisteredRTO.sendKeys(changeRTO);
            up13bulandshahr.click();
        }
        else {
            logger.info("Registered RTO {} is taking from Test", tRegisteredRTO);
            editRegisteredRTO.click();
            enterRegisteredRTO.clear();
            enterRegisteredRTO.sendKeys(tRegisteredRTO);
            up13bulandshahr.click();
        }
    }

    //Set Update Purchasing Year
    public void setUpdatePurchasingDate(String tPurchasingDate, String tPurchasingMonth, String tPurchasingYear) {

        String changeDate = prop.getProperty("c_PurchasingDate");
        String changeMonth = prop.getProperty("c_PurchasingMonth");
        String changeYear = prop.getProperty("c_PurchasingYear");
        if (tPurchasingDate.isEmpty() & tPurchasingMonth.isEmpty() & tPurchasingYear.isEmpty()) {
            logger.info("updating Date {}/{}/{} is taking from config. file", changeDate, changeMonth, changeYear);
            editPurchasingDate.click();
            clickPurchasingDate.click();
            selectDate.click();
            clickPurchasingMonth.click();
            selectMonth.click();
            clickPurchasingYear.click();
            selectYear.click();
            updatePurchasingDate.click();
        }
        else {
            logger.info("updating Date {}/{}/{} is taking from Test", tPurchasingDate, tPurchasingMonth, tPurchasingYear);
            editPurchasingDate.click();
            clickPurchasingDate.click();
            selectDate.click();
            clickPurchasingMonth.click();
            selectMonth.click();
            clickPurchasingYear.click();
            selectYear.click();
            updatePurchasingDate.click();
        }
    }
}
