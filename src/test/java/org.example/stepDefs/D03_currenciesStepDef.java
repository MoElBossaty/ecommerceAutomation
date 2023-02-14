package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;


public class D03_currenciesStepDef {
    P03_homePage currency = new P03_homePage();
    P02_login login = new P02_login();
    Select selectCurrency;


    @Given("the use login on the home page of the website")
    public void userOnHomePage(){
        login.loginIcon.click();
        login.email.sendKeys("brittni.smith@example.com");
        login.password.sendKeys("P@ssw0rd");
        login.loginBtn.click();
    }

    @When("the user selects Euro currency from the dropdown list on the top left of the home page")
    public void userSelectCurrency() {
        selectCurrency = new Select(currency.currencyList);
        selectCurrency.selectByVisibleText("Euro");
    }

    @Then("verify that the Euro Symbol \\(€) is shown on the four products displayed in the home page")
    public void verifyEuroOnProducts() {
        List<WebElement> prices= currency.productPrices;
        for (WebElement price : prices) {
            Assert.assertTrue(price.getText().contains("€"));
        }

    }
}
