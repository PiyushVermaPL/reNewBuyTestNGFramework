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
public class HomePage extends BasePage{

    private static Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //verify Heading text
    @FindBy(xpath = "//div[@class='text-center banner']")
    WebElement headingHP;

    //verify RenewBuy logo
    @FindBy(xpath = "//a[@class='navbar-brand logo']")
    WebElement logoHP;

    //Motor Insurance(Hover)
    @FindBy(xpath = "(//a[@id='navbarDropdownMenuLink'])[1]")
    WebElement motorInsurance;

    //Car Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink1' and contains(.,'Car Insurance')]")
    WebElement carInsurance;

    //Renew Car Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Renew Car Insurance')]")
    WebElement renewCarInsurance;

    //Compare Car Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Compare Car Insurance')]")
    WebElement compareCarInsurance;

    //New Car Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'New Car Insurance')]")
    WebElement newCarInsurance;

    //Car Insurance Calculator(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Car Insurance Calculator')]")
    WebElement carInsuranceCalculator;

    //Car Insurance Claim(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Car Insurance Claim')]")
    WebElement carInsuranceClaim;

    //Car Insurance FAQs(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Car Insurance FAQs')]")
    WebElement carInsuranceFAQs;

    //Two Wheeler Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink2' and contains(.,'Two Wheeler Insurance')]")
    WebElement twoWheelerInsurance;

    //Compare Two Wheeler Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Compare Two Wheeler Insurance')]")
    WebElement compareTwoWheelerInsurance;

    //Renew Two Wheeler Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Renew Two Wheeler Insurance')]")
    WebElement renewTwoWheelerInsurance;

    //New Two Wheeler Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'New Two Wheeler Insurance')]")
    WebElement newTwoWheelerInsurance;

    //Two Wheeler Insurance FAQs(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Two Wheeler Insurance FAQs')]")
    WebElement twoWheelerInsuranceFAQs;

    //Motor Insurance Reminder(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Motor Insurance Reminder')]")
    WebElement motorInsuranceReminder;

    //Health Insurance(Hover)
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink' and contains(.,'Health Insurance')]")
    WebElement healthInsurance;

    //Compare Health Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Compare Health Insurance')]")
    WebElement compareHealthInsurance;

    //Individual Health Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Individual Health Insurance')]")
    WebElement individualHealthInsurance;

    //Family Health Insurance(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Family Health Insurance')]")
    WebElement familyHealthInsurance;

    //Corporate Insurance(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Corporate Insurance')]")
    WebElement corporateInsurance;

    //Life Insurance(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Life Insurance')]")
    WebElement lifeInsurance;

    //Articles(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Articles')]")
    WebElement articles;

    //Become POSP Advisor(click)
    @FindBy(xpath = "//a[@class='nav-link deskattr' and contains(.,'Become POSP Advisor')]")
    WebElement becomePOSPAdvisor;

    //Login(Hover)
    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle deskattr' and contains(.,'Login')]")
    WebElement login;

    //Customer Login(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Customer login')]")
    WebElement customerLogin;

    //Partner Login(click)
    @FindBy(xpath = "//a[@class='dropdown-item deskattr' and contains(.,'Partner Login')]")
    WebElement partnerLogin;

    //Verify Image(click)
    @FindBy(xpath = "//img[@class='coverphone']")
    WebElement image;

    //View Insurance Plan Button(click)
    @FindBy(xpath = "//button[@class='btn btn-primary button view_insurance']")
    WebElement viewInsurancePlan;

    //Get Expert Advice Button(click)
    @FindBy(xpath = "//button[@class='btn btn-primary button get_insurance gradientButton']")
    WebElement getExpertAdvice;




    //verify Heading text
    public boolean headingHP(String heading) {

        String headings = prop.getProperty("c_heading");
        boolean flag = false;
        if(heading.isEmpty()) {
            logger.info("heading {} is taking from config. file", headings);
            flag = headingHP.getText().trim().equalsIgnoreCase(headings);
            logger.info("Heading {} is present on Home Page:", headings);
        } else {
            logger.info("heading {} is taking from feature file", heading);
            flag = headingHP.getText().trim().equalsIgnoreCase(heading);
            logger.info("Heading {} is present on Home Page:", heading);
        }
        return flag;
    }

    //verify RenewBuy logo
    public boolean logoHP() {

        logger.info("Verifying Logo on Home Page:");
        return logoHP.isDisplayed();
    }

    //Renew Car Insurance
    public RenewCarInsurancePage renewCarInsurance(){

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
        Actions actions = new Actions(driver);
        actions.moveToElement(healthInsurance).moveToElement(individualHealthInsurance).click().build().perform();
        return new IndividualHealthInsurancePage(driver);
    }

    //Family Health Insurance
    public FamilyHealthInsurancePage familyHealthInsurance() {

        logger.info("Verifying that 'Family Health Insurance' link is available:");
        boolean flag = false;
        flag = familyHealthInsurance.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(healthInsurance).moveToElement(familyHealthInsurance).click().build().perform();
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

    //Life Insurance
    public LifeInsurancePage lifeInsurance() {

        logger.info("Verifying that 'Login Insurance' link is available:");
        boolean flag = false;
        flag = lifeInsurance.isDisplayed();
        lifeInsurance.click();
        return new LifeInsurancePage(driver);
    }

    //Articles
    public ArticlesPage articles() {

        logger.info("Verifying that 'Articles' link is available:");
        boolean flag = false;
        flag = articles.isDisplayed();
        articles.click();
        return new ArticlesPage(driver);
    }

    //Become POSP Advisor
    public BecomePOSPAdvisorPage becomePOSPAdvisor() {

        logger.info("Verifying that 'Become POSP Advisor' link is available:");
        boolean flag = false;
        flag = becomePOSPAdvisor.isDisplayed();
        becomePOSPAdvisor.click();
        return new BecomePOSPAdvisorPage(driver);
    }

    //Customer Login
    public CustomerLoginPage customerLogin() {

        logger.info("Verifying that 'Customer Login' link is available:");
        boolean flag = false;
        flag = customerLogin.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(login).moveToElement(customerLogin).click().build().perform();
        return new CustomerLoginPage(driver);
    }

    //Partner Login
    public PartnerLoginPage partnerLogin() {

        logger.info("Verifying that 'Partner Login' link is available:");
        boolean flag = false;
        flag = partnerLogin.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(login).moveToElement(partnerLogin).click().build().perform();
        return new PartnerLoginPage(driver);
    }

    //Verify Image
    public boolean imageOnHP() {

        logger.info("Verifying that Image On Home Page is Present:");
        boolean flag = false;
        flag = image.isDisplayed();
        return flag;
    }

    //View Insurance Plan
    public ViewInsurancePlanPage viewInsurancePlan() {

        logger.info("Verifying that 'View Insurance Plan' Button is available:");
        boolean flag = false;
        flag = viewInsurancePlan.isDisplayed();
        viewInsurancePlan.click();
        return new ViewInsurancePlanPage(driver);
    }

    //Get Expert Advice
    public GetExpertAdvicePage getExpertAdvice() {

        logger.info("");
        boolean flag = false;
        flag = getExpertAdvice.isDisplayed();
        getExpertAdvice.click();
        return new GetExpertAdvicePage(driver);
    }
}