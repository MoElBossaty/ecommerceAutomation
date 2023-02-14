package org.example.stepDefs;

import io.cucumber.java.en.*;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    String emailAddress = "brittni.smith@example.com";
    P02_login login = new P02_login();
    SoftAssert soft = new SoftAssert();

    @Given("the user is on the login page")
    public void goToLoginPage(){
        login.loginIcon.click();
    }

    @When("the user enters their valid username and password {string}")
    public void enterUsernameAndPassword(String password) {
        login.email.sendKeys(emailAddress);
        login.password.sendKeys(password);
    }

    @And("the user presses the login button")
    public void pressLoginButton() {
        login.loginBtn.click();
    }

    @Then("the user should be able to log in to the system successfully")
    public void verifyLoginSuccessfully() {
        soft = new SoftAssert();

        String currentUrl = Hooks.driver.getCurrentUrl();
        soft.assertEquals(currentUrl,"https://demo.nopcommerce.com");
        soft.assertTrue(login.accountIcon.isDisplayed());
        soft.assertAll();
    }

    @When("the user enters their invalid username {string} and password {string}")
    public void enterInvalidUsernameAndPassword(String arg0, String arg1) {
        login.email.sendKeys(arg0);
        login.password.sendKeys(arg1);
    }

    @Then("the user should not be able to log in to the system.")
    public void verifyFailedLoginMessage() {
        soft = new SoftAssert();
        soft.assertTrue(login.errorMessage.getText().toLowerCase().contains("login was unsuccessful"));
        String actualColor = login.errorMessage.getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(), "#e4434b");
        soft.assertAll();

    }
}
