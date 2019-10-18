package Pulselive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgottenPass_Locators extends Driver{

    public static WebElement _resetYourPassword ()
    { WebElement element=driver.findElement(By.xpath("//a[contains(text(),'reset your password')]"));
        return element;
    }

    public static WebElement _enterEmail ()
    { WebElement element=driver.findElement(By.xpath("//input[@id='username']"));
        return element;
    }

    public static WebElement _clickOnSubmit ()
    { WebElement element=driver.findElement(By.xpath("//button[@id='requestLink']"));
        return element;
    }

    public static WebElement _verifyMessage ()
    { WebElement element=driver.findElement(By.xpath("//span[@xpath='1']"));
        return element;
    }



}
