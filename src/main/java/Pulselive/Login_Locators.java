package Pulselive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Locators extends Driver {

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

    public static WebElement _loginButton ()
    { WebElement element=driver.findElement(By.xpath("//button[text()='Login']"));
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





}
