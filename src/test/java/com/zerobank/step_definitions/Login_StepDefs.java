package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters with {string} and {string} credentials")
    public void the_user_enters_with_and_credentials(String username, String password) {
        loginPage.login_mtd(username,password);
    }
    
//    @Then("Verify with {string}")
//    public void verify_with(String expectedText) {
//        String actualMessage = loginPage.accountSummary_loc.getText();
//        //String actualMessage = loginPage.menuName_mtd();
//        Assert.assertEquals("Account Summary is NOT visible",expectedText,actualMessage);
//    }

    @Then("Verify with {string}")
    public void verify_with(String headerText) {
//        Driver.get().findElement(By.xpath("//a[text()='"+headerText+"']")).click();
        BrowserUtils.waitFor(1);
        String actualMessage = loginPage.accountSummary_loc.getText();
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Header is NOT visible",headerText,actualMessage);
    }

    @When("The user enters {string} and {string} credential")
    public void the_user_enters_and_credential(String invalidUserName, String invalidPassword) {
        loginPage.invalidLogin_mtd(invalidUserName,invalidPassword);
    }

    @Then("verify invalid credential {string}")
    public void verify_invalid_credential(String expectedMessage) {
        String actualMessage = loginPage.wrongAlert_loc.getText();

        Assert.assertEquals("Wrong alert is NOT visible",expectedMessage,actualMessage);
    }








}
