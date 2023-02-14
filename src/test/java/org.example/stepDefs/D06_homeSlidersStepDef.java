package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage homeSlider = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));

    @Given("User at home page")
    public void UserGoToHomePage() {
        homeSlider.homePageLink.click();
    }

    @When("User click on first slider nokia image")
    public void UserClickOnNokia() {
        homeSlider.nokiaImgLink.click();
    }

    @Then("User navigate to nokia product details page")
    public void UserNavigateToNokiaPage() {
        wait.until(ExpectedConditions.urlToBe(Hooks.nokiaProductDetailsPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), Hooks.nokiaProductDetailsPageUrl);
    }

    @When("User click on second slider iphone image")
    public void UserClickOnIphone() throws InterruptedException {
        homeSlider.iphoneSelector.click();
        Thread.sleep(2000);
        homeSlider.iphoneImgLink.click();
    }

    @Then("User navigate to iphone product details page")
    public void UserNavigateToIphonePage() {
        wait.until(ExpectedConditions.urlToBe(Hooks.iphoneProductDetailsPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), Hooks.iphoneProductDetailsPageUrl);
    }
}


