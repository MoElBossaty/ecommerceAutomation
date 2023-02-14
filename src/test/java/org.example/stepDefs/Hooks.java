package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Hooks {

    // declare to the WebDriver object on the level of the class
    public static WebDriver driver;
    public static String nokiaProductDetailsPageUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
    public static String iphoneProductDetailsPageUrl = " https://demo.nopcommerce.com/iphone-6";

    @Before
    public static void openBrowser()
    {
        /*DesiredCapabilities desiredCap = new DesiredCapabilities();
        desiredCap.acceptInsecureCerts();
        desiredCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        desiredCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.merge(desiredCap);*/

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
