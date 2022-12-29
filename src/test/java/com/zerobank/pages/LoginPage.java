package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinButtonHome_loc;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginButton_loc;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordButton_loc;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signinButtonLogin_loc;

    @FindBy(xpath = "//*[@id='login_form']/div[1]")
    public WebElement wrongAlert_loc;


    public void login_mtd(String username, String password){

        signinButtonHome_loc.click();
        loginButton_loc.sendKeys(username);
        passwordButton_loc.sendKeys(password);
        signinButtonLogin_loc.click();
        Driver.get().get(ConfigurationReader.get("url1"));
        BrowserUtils.waitFor(1);

    }
    public void invalidLogin_mtd(String username, String password){

        signinButtonHome_loc.click();
        loginButton_loc.sendKeys(username);
        BrowserUtils.waitFor(1);
        passwordButton_loc.sendKeys(password);
        BrowserUtils.waitFor(1);
        signinButtonLogin_loc.click();
        BrowserUtils.waitFor(1);
    }

}
