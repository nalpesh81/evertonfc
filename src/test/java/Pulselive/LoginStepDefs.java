package Pulselive;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import javax.print.DocFlavor;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class LoginStepDefs extends Driver {

    JavascriptExecutor js = (JavascriptExecutor) driver;


    // Login with Valid Credentials
    @Given("I navigate to evertonfc home page")
    public void i_navigate_to_evertonfc_home_page() {
        Login_Locators._enterSite().click();
    }

    @Given("I click on login link")
    public void i_click_on_login_link() {
        Login_Locators.manageCookies().click();
        Login_Locators._loginLink().click();
    }

    @When("the page has loaded")
    public void the_page_has_loaded() {
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
    }

    @And("^i enter valid email address in email address field$")
    public void iEnterValidEmailAddressInEmailAddressField() throws InterruptedException {
        Utils.enterText(Login_Locators._emailAddressr(), "nalpesh81@gmail.com");
    }

    @And("^i enter valid password in password filed$")
    public void iEnterValidPasswordInPasswordFiled() {
        Utils.enterText(Login_Locators._password(), "Alpesh81");
        js.executeScript("window.scrollBy(0,1000)");
    }

    @When("i click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        Login_Locators.acceptCookies().click();
        Login_Locators._loginButton().click();
    }

    @Then("^i should be able to login successfully and see logout link$")
    public void iShouldBeAbleToLoginSuccessfullyAndSeeLogoutLink() {
        String actText = Login_Locators._MyAccount().getText();
        Assert.assertEquals(actText, "MY ACCOUNT");
        System.out.println("Actual Texts are : " + actText);
        Assert.assertTrue(Login_Locators._Logout().isDisplayed());

        Utils.captureScreenshot(driver,"LoginSuccessfull");
    }

    @Then("i should be able to see Logout link")
    public void i_should_be_able_to_see_Logout_link() {
        Assert.assertTrue(Login_Locators._Logout().isDisplayed());
    }


    // Login with Invalid Credentials
    @And("^i enter \"([^\"]*)\" in email address field$")
    public void iEnterInEmailAddressField(String email) throws Throwable {
        Login_Locators._emailAddressr().sendKeys(email);

    }


    @And("^i enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password) {
        Login_Locators._password().sendKeys(password);
    }


    @Then("^i should not able to login successfully$")
    public void iShouldNotAbleToLoginSuccessfully() {
        Assert.assertTrue(Login_Locators._errorMessage().isDisplayed());
        Utils.captureScreenshot(driver, "LoginUnsuccessfull");
    }


    @And("^i should see an error$")
    public void iShouldSeeAnError() {
    }


//    // Forgotten Password Flow
//    @And("^I click on reset your password link$")
//    public void iClickOnResetYourPasswordLink() {
//        Utils.clickOnElement(ForgottenPass_Locators._resetYourPassword());
//
//    }
//
//    @And("^I enter valid email address$")
//    public void iEnterValidEmailAddress() {
//        Utils.enterText(ForgottenPass_Locators._enterEmail(), "nalpesh81@gmail.com");
//        Login_Locators.acceptCookies().click();
//
//    }
//
//    @And("^I click on submit button$")
//    public void iClickOnSubmitButton() {
//        Utils.clickOnElement(ForgottenPass_Locators._clickOnSubmit());
//    }
//
//    @Then("^I should be able to see confirmation message$")
//    public void iShouldBeAbleToSeeConfirmationMessage() {
//        Assert.assertTrue(ForgottenPass_Locators._verifyMessage().isDisplayed());
//    }



//    // Register a New User
//    @And("^I click on register link$")
//    public void iClickOnRegisterLink() {
//        Registration_Locators._clickRegister().click();
//    }
//
//    @When("^I scroll down$")
//    public void iScrollDown(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }
//
//    @And("^I enter valid email in email field$")
//    public void iEnterValidEmailInEmailField() {
//        Registration_Locators._enterEmail().sendKeys("alpesh" + Utils.randomDate() + "@gmail.com");
//    }
//
//    @And("^I enter valid password in password field$")
//    public void iEnterValidPasswordInPasswordField() {
//        Registration_Locators._enterPassword().sendKeys("Alpesh81");
//    }
//
//    @And("^I enter valid password in confirm password field$")
//    public void iEnterValidPasswordInConfirmPasswordField() {
//        Registration_Locators._enterConfirmPassword().sendKeys("Alpesh81");
//    }
//
//    @And("^I click on your details link$")
//    public void iClickOnYourDetailsLink() {
//        Registration_Locators._manageCookies().click();
//        Registration_Locators._clickYourDetails().click();
//    }
//
//    @And("^I enter valid first name in first name field$")
//    public void iEnterValidFirstNameInFirstNameField() {
//        Registration_Locators._enterFirstName().sendKeys("Alpesh");
//    }
//
//    @And("^I enter valid last name in last name field$")
//    public void iEnterValidLastNameInLastNameField() {
//        Registration_Locators._enterLastName().sendKeys("Savani");
//    }
//
//    @And("^I enter valid date of birth in day field$")
//    public void iEnterValidDateOfBirthInDayField() {
//        Registration_Locators._enterdobDay().sendKeys("01");
//    }
//
//    @And("^I enter valid month of birth in month field$")
//    public void iEnterValidMonthOfBirthInMonthField() {
//        Registration_Locators._enterdobMonth().sendKeys("06");
//    }
//
//    @And("^I enter valid year of birth in year field$")
//    public void iEnterValidYearOfBirthInYearField() {
//        Registration_Locators._enterdobYear().sendKeys("1981");
//    }
//
//    @And("^I enter valid mobile number in mobile number field$")
//    public void iEnterValidMobileNumberInMobileNumberField() {
//        Registration_Locators._enterMobileNumber().sendKeys("07502206061");
//    }
//
//    @And("^I click on your address link$")
//    public void iClickOnYourAddressLink() {
//        Registration_Locators._clickYourAddress().click();
//    }
//
//    @And("^I enter valid postcode in postcode lookup field$")
//    public void iEnterValidPostcodeInPostcodeLookupField() {
//        Registration_Locators._enterPostcode().sendKeys("BN112QJ");
//    }
//
//    @And("^I click on find address button$")
//    public void iClickOnFindAddressButton() {
//        Registration_Locators._clickFindAddress().click();
//    }
//
//    @And("^I select valid address$")
//    public void iSelectValidAddress() {
//        Registration_Locators._selectAddress().click();
//    }
//
//    @And("^I click on your communication prefereances link$")
//    public void iClickOnYourCommunicationPrefereancesLink() {
//        Registration_Locators._clickYourCommPref().click();
//    }
//
//    @And("^I agree terms & condition checkbox$")
//    public void iAgreeTermsConditionCheckbox() {
//        Registration_Locators._acceptPrivacyPolicy().click();
//    }
//
//    @Then("^I click on creat account button$")
//    public void iClickOnCreatAccountButton() {
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        Registration_Locators._clickCreateAccount().click();
//    }
//
//    @And("^I should able to see verify your email message$")
//    public void iShouldAbleToSeeVerifyYourEmailMessage() {
//        Assert.assertTrue(Registration_Locators._verifyMessage().isDisplayed());
//    }

}
