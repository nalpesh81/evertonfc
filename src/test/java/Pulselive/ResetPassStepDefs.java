package Pulselive;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ResetPassStepDefs extends Driver {

    // Forgotten Password Flow
    @And("^I click on reset your password link$")
    public void iClickOnResetYourPasswordLink() {
        Utils.clickOnElement(ForgottenPass_Locators._resetYourPassword());

    }

    @And("^I enter valid email address$")
    public void iEnterValidEmailAddress() {
        Utils.enterText(ForgottenPass_Locators._enterEmail(), "nalpesh81@gmail.com");
        Login_Locators.acceptCookies().click();

    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() {
        Utils.clickOnElement(ForgottenPass_Locators._clickOnSubmit());
    }

    @Then("^I should be able to see confirmation message$")
    public void iShouldBeAbleToSeeConfirmationMessage() {
        Assert.assertTrue(ForgottenPass_Locators._verifyMessage().isDisplayed());
        Utils.takeScreenshot("Register");
    }

}
