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

        Utils.captureScreenshot(driver, "LoginSuccessfull");
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
        Utils.captureScreenshot(driver, "LoginUnsuccessfull");
    }


    @And("^i should see an error$")
    public void iShouldSeeAnError() {
        Assert.assertTrue(Login_Locators._errorMessage().isDisplayed());
    }
}