package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_hoverCategoriesStepDef {
    P03_homePage hover = new P03_homePage();
    P02_login login = new P02_login();
    Actions actions = new Actions(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();
    String subCategory;
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));

    @Given("User at home page")
    public void userAtHomePage() {
        login.loginIcon.click();
        login.email.sendKeys("brittni.smith@example.com");
        login.password.sendKeys("P@ssw0rd");
        login.loginBtn.click();
    }
    @When("User hover to a category and click on one of its sub-categories")
    public void userHoverAndClickOnSubcategory() {
        actions.moveToElement(hover.computersLink).
                moveToElement(hover.notebooksLink).build().perform();
        wait.until(ExpectedConditions.visibilityOf(hover.notebooksLink));
        subCategory = hover.notebooksLink.getText().toLowerCase().trim();
        System.out.println(subCategory);
        actions.moveToElement(hover.computersLink).
                moveToElement(hover.notebooksLink).click().build().perform();
    }

    @Then("User will navigate to a page contains products about that sub-category")
    public void UserNavigateToProductPage() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("notebooks"));
        softAssert.assertTrue(hover.notebooksBreadCrumb.isDisplayed());
        softAssert.assertEquals(hover.pageTitleHeader.getText(), "Notebooks");
        softAssert.assertTrue(hover.pageTitleHeader.getText().toLowerCase().equals(subCategory));
        softAssert.assertAll();

    }


}
