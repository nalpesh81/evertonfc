package Pulselive;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegisterStepDefs extends Driver {

    // Register a New User
    @And("^I click on register link$")
    public void iClickOnRegisterLink() {
        Registration_Locators._clickRegister().click();
    }

    @When("^I scroll down$")
    public void iScrollDown(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("^I enter valid email in email field$")
    public void iEnterValidEmailInEmailField() {
        Registration_Locators._enterEmail().sendKeys("alpesh" + Utils.randomDate() + "@gmail.com");
    }

    @And("^I enter valid password in password field$")
    public void iEnterValidPasswordInPasswordField() {
        Registration_Locators._enterPassword().sendKeys("Alpesh81");
    }

    @And("^I enter valid password in confirm password field$")
    public void iEnterValidPasswordInConfirmPasswordField() {
        Registration_Locators._enterConfirmPassword().sendKeys("Alpesh81");
    }

    @And("^I click on your details link$")
    public void iClickOnYourDetailsLink() {
        Registration_Locators._manageCookies().click();
        Registration_Locators._clickYourDetails().click();
    }

    @And("^I enter valid first name in first name field$")
    public void iEnterValidFirstNameInFirstNameField() {
        Registration_Locators._enterFirstName().sendKeys("Alpesh");
    }

    @And("^I enter valid last name in last name field$")
    public void iEnterValidLastNameInLastNameField() {
        Registration_Locators._enterLastName().sendKeys("Savani");
    }

    @And("^I enter valid date of birth in day field$")
    public void iEnterValidDateOfBirthInDayField() {
        Registration_Locators._enterdobDay().sendKeys("01");
    }

    @And("^I enter valid month of birth in month field$")
    public void iEnterValidMonthOfBirthInMonthField() {
        Registration_Locators._enterdobMonth().sendKeys("06");
    }

    @And("^I enter valid year of birth in year field$")
    public void iEnterValidYearOfBirthInYearField() {
        Registration_Locators._enterdobYear().sendKeys("1981");
    }

    @And("^I enter valid mobile number in mobile number field$")
    public void iEnterValidMobileNumberInMobileNumberField() {
        Registration_Locators._enterMobileNumber().sendKeys("07502206061");
    }

    @And("^I click on your address link$")
    public void iClickOnYourAddressLink() {
        Registration_Locators._clickYourAddress().click();
    }

    @And("^I enter valid postcode in postcode lookup field$")
    public void iEnterValidPostcodeInPostcodeLookupField() {
        Registration_Locators._enterPostcode().sendKeys("BN112QJ");
    }

    @And("^I click on find address button$")
    public void iClickOnFindAddressButton() {
        Registration_Locators._clickFindAddress().click();
    }

    @And("^I select valid address$")
    public void iSelectValidAddress() {
        Registration_Locators._selectAddress().click();
    }

    @And("^I click on your communication prefereances link$")
    public void iClickOnYourCommunicationPrefereancesLink() {
        Registration_Locators._clickYourCommPref().click();
    }

    @And("^I agree terms & condition checkbox$")
    public void iAgreeTermsConditionCheckbox() {
        Registration_Locators._acceptPrivacyPolicy().click();
    }

    @Then("^I click on creat account button$")
    public void iClickOnCreatAccountButton() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Registration_Locators._clickCreateAccount().click();
    }

    @And("^I should able to see verify your email message$")
    public void iShouldAbleToSeeVerifyYourEmailMessage() {
        Assert.assertTrue(Registration_Locators._verifyMessage().isDisplayed());
        Utils.captureScreenshot(driver, "Registration Successfull");
    }
}
