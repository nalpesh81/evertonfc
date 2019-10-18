package Pulselive;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class LoginStepDefs extends Driver {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("I navigate to evertonfc home page")
    public void i_navigate_to_evertonfc_home_page() {
        Set <Cookie> cookies = driver.manage().getCookies();
        Login_Locators._enterSite().click();

    }

    @Given("I click on login link")
    public void i_click_on_login_link() {
        Login_Locators._loginLink().click();

    }

    @When("the page has loaded")
    public void the_page_has_loaded() {
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

    }

    @And("^i enter valid email address in email address field$")
    public void iEnterValidEmailAddressInEmailAddressField() {
            Utils.enterText(Login_Locators._emailAddressr(), "nalpesh81@gmail.com");
//    Login_Locators._emailAddressr().U("nalpesh81@gmail.com");

    }

    @And("^i enter valid password in password filed$")
    public void iEnterValidPasswordInPasswordFiled() {
        Utils.enterText(Login_Locators._password(), "Alpesh81");
        js.executeScript("window.scrollBy(0,1000)");

    }

    @When("i click on login button")
    public void i_click_on_login_button() throws InterruptedException {
        Utils.clickOnElement(Login_Locators._loginButton());
//        try {
//            Utils.clickOnElement(Login_Locators._loginButton());
//        } catch (Exception e) {
//
//        }

    }

    @Then("^i should be able to login successfully and see logout link$")
    public void iShouldBeAbleToLoginSuccessfullyAndSeeLogoutLink() {
        Assert.assertTrue(Login_Locators._Logout().isDisplayed());
    }

//    @Then("i should be able to see Logout link")
//    public void i_should_be_able_to_see_Logout_link() {
//        Assert.assertTrue(Login_Locators._Logout().isDisplayed());
//
//    }


//    @And("^i enter \"([^\"]*)\" in email address field$")
//    public void iEnterInEmailAddressField(String arg0) throws Throwable {
//
//    }
//
//
//    @And("^i enter \"([^\"]*)\" in password filed$")
//    public void iEnterInPasswordFiled(String arg0) throws Throwable {
//       ;
//    }
//
//
//    @Then("^i should not able to login successfully$")
//    public void iShouldNotAbleToLoginSuccessfully() {
//    }
//
//
//    @And("^i should see an error$")
//    public void iShouldSeeAnError() {
//    }
//
//
//
//    @And("^I click on reset your password link$")
//    public void iClickOnResetYourPasswordLink() {
//        Utils.clickOnElement(ForgottenPass_Locators._resetYourPassword());
//
//    }
//
//    @And("^I enter valid email address$")
//    public void iEnterValidEmailAddress() {
//        Utils.enterText(ForgottenPass_Locators._enterEmail(), "nalpesh81@gmail.com");
//        driver.switchTo().alert().accept();
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



}
