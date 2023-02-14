package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class D07_followUsStepDef {
    P03_homePage followUs = new P03_homePage();

    @Given("User at the home page")
    public void usrOnHomePage() {
        followUs.homePageLink.click();
    }

    @When("User click on facebook icon")
    public void userClickOnFacebook() {
        followUs.facebookIcon.click();
    }

    @When("User click on twitter icon")
    public void userClickOnTwitter() {
        followUs.twitterIcon.click();
    }

    @When("User click on rss icon")
    public void userClickOnRss() {
        followUs.rssIcon.click();
    }

    @When("User click on youtube icon")
    public void userClickOnYoutube() {
        followUs.youtubeIcon.click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String url) {
        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            Hooks.driver.switchTo().window(tabs.get(1));
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("The url : " + Hooks.driver.getCurrentUrl());
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), url);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}
