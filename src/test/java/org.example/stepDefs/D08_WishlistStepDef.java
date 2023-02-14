package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage wishStep = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();

    @Given("User at the homepage")
    public void userOnHome() {
        wishStep.homePageLink.click();
    }

    @When("User click on add to wishlist button of htc phone")
    public void clickWishListHtcPhone() {
        wishStep.htcPhoneAddToWishlistBtn.click();
    }

    @And("User click on Wishlist link")
    public void clickWishList() {
        wait.until(ExpectedConditions.invisibilityOf(wishStep.successNotification));
        wishStep.wishListLink.click();
    }

    @Then("success message appears which confirm adding of the product")
    public void verifySuccessMessage() {
        softAssert.assertTrue(wishStep.successNotification.isDisplayed());
        softAssert.assertEquals(wishStep.successNotification.getCssValue("background-color"), "rgba(75, 176, 122, 1)"); // Green
        softAssert.assertAll();
    }

    @Then("User will navigate to wishlist page which contain htc phone product with its quantity")
    public void navigateToWishListPage() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("wishlist"));
        int productQuantity = Integer.parseInt(wishStep.productQuantity.getAttribute("value"));
        softAssert.assertTrue(productQuantity > 0);
        softAssert.assertAll();
    }

}


