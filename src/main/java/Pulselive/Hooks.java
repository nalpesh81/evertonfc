package Pulselive;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Hooks extends Driver{

    Utils utils = new Utils();

    //create object of BrowserSelector
    BrowserSelector browserSelector = new BrowserSelector ();

    @Before
    public void setUp()
    {
        browserSelector.browserSelection(); // call method for selected browser
        String baseURL = "https://www.evertonfc.com";

        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(.,'Accept Cookies')]")).click();
//        assertEquals(driver.findElement(By.xpath("//section[@id='js-cookie-notice']/div/div/div/div/button/span")).getText(), "Accept Cookies");
        driver.manage().deleteAllCookies();
    }



    @After
    public void tearDown(){
        driver.close();
    }
//    public void tearDown(ITestResult result){
//        if(ITestResult.FAILURE==result.getStatus()){
//            utils.takeScreenshot(result.getName());
//        }
//        driver.close();
//    }


}
