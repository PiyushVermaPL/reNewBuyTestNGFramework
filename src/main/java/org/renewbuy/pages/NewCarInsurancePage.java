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
public class NewCarInsurancePage extends BasePage {

    private static Logger logger = LogManager.getLogger(NewCarInsurancePage.class);

    public NewCarInsurancePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    @FindBy(xpath = "//div[@class='D2C_update']")
    WebElement heading;

    //Verify RenewBuy Logo
    @FindBy(xpath = "//a[@class='site-logo']")
    WebElement logo;

    //Verify Banner Image
    @FindBy(xpath = "//img[@class='banner_image align-left']")
    WebElement bannerImage;

    //Motor Insurance(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Motor Insurance')])[1]")
    WebElement motorInsurance;

    //Car Insurance(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance')])[1]")
    WebElement carInsurance;

    //Compare Car Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Compare Car Insurance')]")
    WebElement compareCarInsurance;

    //Renew Car Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Renew Car Insurance')]")
    WebElement renewCarInsurance;

    //New Car Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'New Car Insurance')]")
    WebElement newCarInsurance;

    //Car Insurance Claim(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance Claim')]")
    WebElement carInsuranceClaim;

    //Car Insurance Calculator(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance Calculator')]")
    WebElement carInsuranceCalculator;

    //Car Insurance FAQs(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Car Insurance FAQs')]")
    WebElement carInsuranceFAQs;

    //Two Wheeler Insurance(Hover)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Two wheeler Insurance')]")
    WebElement twoWheelerInsurance;

    //Compare Two Wheeler Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Compare Two Wheeler Insurance')]")
    WebElement compareTwoWheelerInsurance;

    //Renew Two Wheeler Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Renew Two Wheeler Insurance')]")
    WebElement renewTwoWheelerInsurance;

    //New Two Wheeler Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'New Two Wheeler Insurance')]")
    WebElement newTwoWheelerInsurance;

    //Two Wheeler Insurance FAQs(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Two Wheeler Insurance FAQs')]")
    WebElement twoWheelerInsuranceFAQs;

    //Motor Insurance Reminder(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Motor Insurance Reminder')]")
    WebElement motorInsuranceReminder;

    //Health Insurance(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Health Insurance')])[1]")
    WebElement healthInsurance;

    //Compare Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Compare Health Insurance')]")
    WebElement compareHealthInsurance;

    //Individual Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Individual Health Insurance')]")
    WebElement individualHealthInsurance;

    //Family Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Family Health Insurance')]")
    WebElement familyHealthInsurance;

    //Cashless Mediclaim Policy(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Cashless Mediclaim Policy')]")
    WebElement cashlessMediClaimPolicy;

    //Mediclaim Policy(link)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Mediclaim Policy')])[2]")
    WebElement mediclaimPolicy;

    //Top Up Health Insurance(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Top Up Health Insurance')]")
    WebElement topUpHealthInsurance;

    //Become POS Advisor(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Become POS Advisor')]")
    WebElement becomePOSAdviser;

    //One Click Renewal(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'One Click Renewal')]")
    WebElement oneClickRenewal;

    //Articles(Hover)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Articles')]")
    WebElement articles;

    //Motor Insurance in Articles Menu Item(Hover)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Motor Insurance')])[3]")
    WebElement motorInsuranceArticles;

    //Four Wheeler Insurance in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Four Wheeler Insurance')]")
    WebElement fourWheelerInsuranceArticles;

    //Two Wheeler Insurance in Articles Menu Item(link)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Two Wheeler Insurance')])[5]")
    WebElement twoWheelerInsuranceArticles;

    //Health Insurance in Articles Menu Item(link)
    @FindBy(xpath = "(//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Health Insurance')])[6]")
    WebElement healthInsuranceArticles;

    //Life Insurance in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Life Insurance')]")
    WebElement lifeInsuranceArticles;

    //RTO in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'RTO')]")
    WebElement rtoArticles;

    //Driving Licence in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Driving Licence')]")
    WebElement drivingLicenceArticles;

    //General in Articles Menu Item(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'General')]")
    WebElement generalArticles;

    //Responsible Driving in Articles(link)
    @FindBy(xpath = "//li[contains(@id,'main-menu-link-content')]/a[contains(.,'Responsible Driving')]")
    WebElement responsibleDrivingArticles;

    //Verify String2(GET LOWEST PREMIUM INSTANT POLICY ON)
    @FindBy(xpath = "//p[@class='home_insurance_form']")
    WebElement string2;

    //Verify String3(MOTOR INSURANCE PLANS)
    @FindBy(xpath = "//h3[@class='home_insurance_form2']")
    WebElement string3;

    //Verify String4(Multiple Choices)
    @FindBy(xpath = "//li[@class='home_insurance_form4']")
    WebElement string4;

    //Verify String5(Get policy in 2 minutes)
    @FindBy(xpath = "//li[@class='home_insurance_form4 home_insurance_form5']")
    WebElement string5;

    //Verify String6(Assistance from trusted partners)
    @FindBy(xpath = "//li[@class='home_insurance_form4 home_insurance_form6']")
    WebElement string6;

    //Close PopUp Window
    @FindBy(id = "bio_ep_close")
    WebElement popUpWindow;

    //Select Hyundai Santro Modal(click)
    @FindBy(xpath = "//li[contains(.,'HYUNDAI SANTRO 1.1 LP (1086 cc)(P)')]")
    WebElement hyundaiSantro;

    //"Type Your Vehicle Modal" Text Field
    @FindBy(xpath = "//input[@id='variant']")
    WebElement vehicleModal;

    //"Purchasing Year" Text Field
    @FindBy(xpath = "//select[@id='regYear']")
    WebElement purchaseYear;

    //"Instant Quote" Button
    @FindBy(xpath = "//button[@class='instantQuote btn']")
    WebElement instantQuoteButton;



    //Verify Heading String1(D2C INSURANCE BROKING PVT. LTD.)
    public boolean verifyHeadingString1(String headings) {

        boolean flag = false;
        String headingHP = prop.getProperty("c_headingNCI");
        if(headings.isEmpty()) {
            logger.info("Verifying Heading {} is taking from config. file", headingHP);
            flag = heading.getText().trim().equalsIgnoreCase(headingHP);
            logger.info("Heading {} is present on New Car Insurance Home Page:", headingHP);
        } else {
            logger.info("Heading {} is taking from feature file", headings);
            flag = heading.getText().trim().equalsIgnoreCase(headings);
            logger.info("Heading {} is present on New Car Insurance Home Page:", headings);
        }
        return flag;
    }

    //Verify RenewBuy Logo
    public boolean reNewBuyLogo() {

        logger.info("Verifying RenewBuy Logo On New Car Insurance Home Page");
        return logo.isDisplayed();
    }

    //Verify Banner Image
    public boolean bannerImage() {

        logger.info("Verifying Banner Image On New Car Insurance Home Page");
        return bannerImage.isDisplayed();
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

    //Renew Car Insurance
    public RenewCarInsurancePage renewCarInsurance() {

        logger.info("Verifying that 'Renew Car Insurance' link is available:");
        boolean flag = false;
        flag = renewCarInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(renewCarInsurance).click().build().perform();
        return new RenewCarInsurancePage(driver);
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

    //Car Insurance Claim
    public CarInsuranceClaimPage carInsuranceClaim() {

        logger.info("Verifying that 'Car Insurance Claim' link is available:");
        boolean flag = false;
        flag = carInsuranceClaim.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceClaim).click().build().perform();
        return new CarInsuranceClaimPage(driver);
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

    //Car Insurance FAQs
    public CarInsuranceFAQsPage carInsuranceFAQs() {

        logger.info("Verifying that 'Car Insurance FAQs' link is available:");
        boolean flag = false;
        flag = carInsuranceFAQs.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(carInsurance).moveToElement(carInsuranceFAQs).click().build().perform();
        return new CarInsuranceFAQsPage(driver);
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

    //Renew Two Wheeler Insurance
    public RenewTwoWheelerInsurancePage renewTwoWheelerInsurance() {

        logger.info("Verifying that 'Renew Two Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = renewTwoWheelerInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(motorInsurance).moveToElement(twoWheelerInsurance).moveToElement(renewTwoWheelerInsurance).click().build().perform();
        return new RenewTwoWheelerInsurancePage(driver);
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

    //Cashless Mediclaim Policy
    public CashlessMediclaimPolicyPage cashlessMediclaimPolicy() {

        logger.info("Verifying that 'Cashless Mediclaim Policy' link is available:");
        boolean flag = false;
        flag = cashlessMediClaimPolicy.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(cashlessMediClaimPolicy).click().build().perform();
        return new CashlessMediclaimPolicyPage(driver);
    }

    //Mediclaim Policy
    public MediclaimPolicyPage mediclaimPolicy() {

        logger.info("Verifying that 'Mediclaim Policy' link is available:");
        boolean flag = false;
        flag = mediclaimPolicy.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(mediclaimPolicy).click().build().perform();
        return new MediclaimPolicyPage(driver);
    }

    //Top Up Health Insurance
    public TopUpHealthInsurancePage topUpHealthInsurance() {

        logger.info("Verifying that 'Top Up Health Insurance' link is available:");
        boolean flag = false;
        flag = topUpHealthInsurance.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(healthInsurance).moveToElement(topUpHealthInsurance).click().build().perform();
        return new TopUpHealthInsurancePage(driver);
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

    //Four Wheeler Insurance in Articles Menu Item
    public FourWheelerInsuranceArticlesPage fourWheelerInsuranceArticles() {

        logger.info("Verifying that 'Four Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = fourWheelerInsuranceArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(motorInsuranceArticles).moveToElement(fourWheelerInsuranceArticles).click().build().perform();
        return new FourWheelerInsuranceArticlesPage(driver);
    }

    //Two Wheeler Insurance in Articles Menu Item
    public TwoWheelerInsuranceArticlesPage twoWheelerInsuranceArticles() {

        logger.info("Verifying that 'Two Wheeler Insurance' link is available:");
        boolean flag = false;
        flag = twoWheelerInsuranceArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(motorInsuranceArticles).moveToElement(twoWheelerInsuranceArticles).click().build().perform();
        return new TwoWheelerInsuranceArticlesPage(driver);
    }

    //Health Insurance in Articles Menu Item
    public HealthInsuranceArticlesPage healthInsuranceArticles() {

        logger.info("Verifying that 'Health Insurance' link is available:");
        boolean flag = false;
        flag = healthInsuranceArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(healthInsuranceArticles).click().build().perform();
        return new  HealthInsuranceArticlesPage(driver);
    }

    //Life Insurance in Articles Menu Item
    public LifeInsuranceArticlesPage lifeInsuranceArticles() {

        logger.info("Verifying that 'Life Insurance' link is available:");
        boolean flag = false;
        flag = lifeInsuranceArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(lifeInsuranceArticles).click().build().perform();
        return new LifeInsuranceArticlesPage(driver);
    }

    //RTO in Articles Menu Item
    public RTOPage rto() {

        logger.info("Verifying that 'RTO' link is available:");
        boolean flag = false;
        flag = rtoArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(rtoArticles).click().build().perform();
        return new RTOPage(driver);
    }

    //Driving Licence in Articles Menu Item
    public DrivingLicenceArticlesPage drivingLicenceArticles() {

        logger.info("Verifying that 'Driving Licence' link is available:");
        boolean flag = false;
        flag = drivingLicenceArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(drivingLicenceArticles).click().build().perform();
        return new DrivingLicenceArticlesPage(driver);
    }

    //General in Articles Menu Item
    public GeneralArticlesPage generalArticles() {

        logger.info("Verifying that 'General' link is available:");
        boolean flag = false;
        flag = generalArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(generalArticles).click().build().perform();
        return new GeneralArticlesPage(driver);
    }

    //Responsible Driving in Articles
    public ResponsibleDrivingArticlesPage responsibleDrivingArticles() {

        logger.info("Verifying that 'Responsible Driving' link is available:");
        boolean flag = false;
        flag = responsibleDrivingArticles.isDisplayed();
        Actions action = new Actions(driver);
        action.moveToElement(articles).moveToElement(responsibleDrivingArticles).click().build().perform();
        return new ResponsibleDrivingArticlesPage(driver);
    }

    //Verify String2(GET LOWEST PREMIUM INSTANT POLICY ON)
    public boolean string2(String str2) {

        logger.info("Verifying String 'GET LOWEST PREMIUM INSTANT POLICY ON' is present on New Car Insurance Page:");
        return string2.getText().trim().equalsIgnoreCase(str2);
    }

    //Verify String3(MOTOR INSURANCE PLANS)
    public boolean string3(String str3) {

        logger.info("Verifying String 'MOTOR INSURANCE PLANS' is present On New Car Insurance Home Page");
        return string3.getText().trim().equalsIgnoreCase(str3);
    }

    //Verify String4(Multiple Choices)
    public boolean string4(String str4) {

        logger.info("Verifying String 'Multiple Choices' is present on New Car Insurance Page");
        return string4.getText().trim().equalsIgnoreCase(str4);
    }

    //Verify String5(Get policy in 2 minutes)
    public boolean string5(String str5) {

        logger.info("Verifying String {} is present on New Car Insurance Page", str5);
        return string5.getText().trim().equalsIgnoreCase(str5);
    }

    //Verify String6(Assistance from trusted partners)
    public boolean string6(String str6) {

        logger.info("Verifying String 'Assistance from trusted partners' is present on New Insurance Page");
        return string6.getText().trim().equalsIgnoreCase(str6);
    }

    //Close PopUp Window
    public void closePopUpWindow() {

        logger.info("Closing Pop Up Window");
        if(popUpWindow.isDisplayed()) {
            popUpWindow.click();
        }
    }

    //"Type Your Vehicle Modal" Text Field
    public void enterVehicleModal(String fVehicleName) {

        boolean flag = false;
        flag = vehicleModal.isDisplayed();
        if(fVehicleName.isEmpty()) {
            logger.info("Vehicle Modal Name is taking from config. file");
            driver.switchTo().frame(0);
            vehicleModal.clear();
            vehicleModal.sendKeys(prop.getProperty("c_VehicleModalName"));
            hyundaiSantro.click();
            driver.switchTo().defaultContent();
        }
        else {
            logger.info("Vehicle Modal Name is taking from feature file");
            driver.switchTo().frame(0);
            vehicleModal.clear();
            vehicleModal.sendKeys(fVehicleName);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hyundaiSantro.click();
            driver.switchTo().defaultContent();
        }
    }

    //"Purchasing Year" Text Field
    public void enterPurchasingYear(String fPurchasingYear) {

        boolean flag = false;
        flag = purchaseYear.isDisplayed();
        if(fPurchasingYear.isEmpty()) {
            logger.info("Vehicle Purchasing Year is taking from config. file");
            driver.switchTo().frame(0);
            purchaseYear.sendKeys(prop.getProperty("c_PurchasingYear"));
            driver.switchTo().defaultContent();
        }
        else {
            logger.info("Vehicle Purchasing Year is taking from feature file");
            driver.switchTo().frame(0);
            purchaseYear.sendKeys(fPurchasingYear);
            driver.switchTo().defaultContent();
        }
    }

    //"Instant Quote" Button
    public NewCarInsuranceQuotePage clickOnNewCarInsuranceQuoteButton() {

        logger.info("Verifying that 'Instant Quote' Button link is available:");
        boolean flag = false;
        flag = instantQuoteButton.isDisplayed();
        driver.switchTo().frame(0);
        instantQuoteButton.click();
        return new NewCarInsuranceQuotePage(driver);
    }
}