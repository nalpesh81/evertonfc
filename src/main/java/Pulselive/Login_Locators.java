package Pulselive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Locators extends Driver {

    //*[@id="js-cookie-notice"]/div/div/div/div/button[1]/span

    public static WebElement _enterSite ()
    { WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Enter Site')]"));
        return element;
    }

    public static WebElement _loginLink()
    { WebElement element=driver.findElement(By.xpath("//div[@class='main-navigation__social-login-wrapper']//span[contains(text(),'Login')]"));
        return element;
    }

    public static WebElement _emailAddressr ()
    { WebElement element=driver.findElement(By.xpath("//input[@id='username']"));
        return element;
    }

    public static WebElement _password ()
    { WebElement element=driver.findElement(By.xpath("//input[@id='password']"));
        return element;
    }

    public static WebElement manageCookies(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"js-cookie-notice\"]/div/div/div/div/button[1]/span"));
        return element;
    }

    public static WebElement acceptCookies(){
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Accept cookies')]"));
        return element;
    }

    public static WebElement _loginButton ()
    {
        WebElement element=driver.findElement(By.xpath("//button[@id='submitAction']"));
//        WebElement element= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[2]/form[1]/div[4]/button[1]"));
        return element;
    }

    public static WebElement _MyAccount () //to verify successfully login
    { WebElement element=driver.findElement(By.xpath("(//span[text()='My Account'])[1]"));
        return element;
    }

    public static WebElement _Logout () //to assert
    { WebElement element=driver.findElement(By.xpath("//div[@class='main-navigation__social-login-wrapper']//a[@id='sso-logout']"));
        return element;
    }

    public static WebElement _errorMessage(){
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Your username or password was incorrect.')]"));
        return element;
    }





}
