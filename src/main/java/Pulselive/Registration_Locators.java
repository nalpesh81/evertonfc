package Pulselive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration_Locators extends Driver {

    public static WebElement _clickRegister(){
        WebElement element = driver.findElement(By.xpath("(//a[@id='sso-register'])[1]"));
        return element;
    }

    public static WebElement _enterEmail(){
        WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
        return element;
    }

    public static WebElement _enterPassword(){
        WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
        return element;
    }
    public static WebElement _enterConfirmPassword(){
        WebElement element = driver.findElement(By.xpath("//input[@id='password-confirm']"));
        return element;
    }
    public static WebElement _clickYourDetails(){
        WebElement element = driver.findElement(By.xpath("//div[@id='efc-form__fieldset--details']"));
        return element;
    }
    public static WebElement _enterFirstName(){
        WebElement element = driver.findElement(By.xpath("//input[@id='firstName']"));
        return element;
    }
    public static WebElement _enterLastName(){
        WebElement element = driver.findElement(By.xpath("//input[@id='lastName']"));
        return element;
    }
    public static WebElement _enterdobDay(){
        WebElement element = driver.findElement(By.xpath("//input[@id='dobDay']"));
        return element;
    }
    public static WebElement _enterdobMonth(){
        WebElement element = driver.findElement(By.xpath("//input[@id='dobMonth']"));
        return element;
    }
    public static WebElement _enterdobYear(){
        WebElement element = driver.findElement(By.xpath("//input[@id='dobYear']"));
        return element;
    }
    public static WebElement _enterMobileNumber(){
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        return element;
    }public static WebElement _clickYourAddress(){
        WebElement element = driver.findElement(By.xpath("//div[@id='efc-form__fieldset--address']"));
        return element;
    }
    public static WebElement _enterPostcode(){
        WebElement element = driver.findElement(By.xpath("//input[@id='user.attributes.postcodeLookup']"));
        return element;
    }
    public static WebElement _clickFindAddress(){
        WebElement element = driver.findElement(By.xpath("//span[text()='Find Address']"));
        return element;
    }public static WebElement _clickAddList(){
        WebElement element = driver.findElement(By.xpath("//select[@id='address-options-ui']"));
        return element;
    }
    public static WebElement _selectAddress(){
        WebElement element = driver.findElement(By.xpath("//option[contains(text(),'242A, Ham Road')]"));
        return element;
    }
    public static WebElement _clickYourCommPref(){
        WebElement element = driver.findElement(By.xpath("//div[@id='efc-form__fieldset--optins']"));
        return element;
    }
    public static WebElement _acceptPrivacyPolicy(){
        WebElement element = driver.findElement(By.xpath("//label[@for='termsPrivacy']//span[1]"));
        return element;
    }
    public static WebElement _clickCreateAccount(){
        WebElement element = driver.findElement(By.xpath("//button[text()='Create Account']"));
        return element;
    }
    public static WebElement _verifyMessage(){
        WebElement element = driver.findElement(By.xpath("//h1[@class='everton-header__title']"));
        return element;
    }
    public static WebElement _manageCookies(){
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Accept cookies')]"));
        return element;
    }
}
