package Pulselive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends Driver{

    public static void enterText(WebElement element, String text){
       element.sendKeys(text);
    }

    public static void clickOnElement(WebElement element){
        element.click();
    }

    public static String get_Text(WebElement element){
        return element.getText();
    }

    public static void selectElementByValue(WebElement element, String text){
        Select select = new Select(element);
        select.deselectByValue(text);
    }

    public static void selectElementByIndex(WebElement element, int integer){
        Select select = new Select(element);
        select.selectByIndex(integer);
    }

    public static void selectelementByVisibletext(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static String randomDate(){
        DateFormat format = new SimpleDateFormat("ddMMMyyHHmmss");
        return format.format(new Date());
    }

    public static void mouseHover(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public static void moveDriver(WebElement element, int x, int y){
        Actions action = new Actions(driver);
        action.moveToElement(element).moveByOffset(x,y).doubleClick().build().perform();
    }

    public static void clickAlert(){
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e){
            // exception handling
        }
    }

    public static float cartSubTotal(WebElement element){
        String totalOfItem = Utils.get_Text(element);

        String result = totalOfItem.replaceAll("[$ ,]", ""); // This will remove charechers from String and convert it to float which can be used for arithmatic

        float t = Float.parseFloat(result);
        return t;
    }

}
