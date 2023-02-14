package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage searchObject = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
    @When("User enter a product name {string} in search text field")
    public void userEnterNameInSearch(String name) {
        searchObject.searchField.sendKeys(name);
    }
    @And("User click on search button")
    public void userClickOnSearchButton() {
        searchObject.searchBtn.click();
    }

    @Then("Search result appears with products {string}")
    public void searchResultAppears(String name) {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("search"));
        List<WebElement> products = searchObject.products;
        for (WebElement product : products) {
            softAssert.assertTrue(product.getText().toLowerCase().contains(name));
        }
        softAssert.assertAll();
    }

    @When("User enter a product sku {string} in search text field")
    public void userSearchWithProductSku(String sku) {
        searchObject.searchField.sendKeys(sku);
    }
    @Then("Search result appears with products sku {string}")
    public void searchResultAppearsSku(String sku) {
        searchObject.products.get(0).click();
        Assert.assertTrue(searchObject.productSku.getText().contains(sku));
    }

}
