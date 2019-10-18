package Pulselive;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Driver {


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
        driver.manage().deleteAllCookies();
    }



    @After
    public void tearDown()
    {
//        driver.close();
    }


}
