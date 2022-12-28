package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummary extends BasePage{

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> underAccountSummary_loc;

    @FindBy(xpath = "//div[@class='board'][3]/div/table/thead/tr/th")
    public List<WebElement> underCreditAccounts;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement usernameBtn_loc;

    @FindBy(id = "logout_link")
    public WebElement logoutBtn_loc;

    @FindBy(xpath = "//a[@class='brand']")
    public WebElement zeroBank_loc;

    @FindBy(xpath = "//a[text()='Account Summary']")
    public WebElement accountSummary_loc;

    public String getAccountName_mtd(String accountType){

        return Driver.get().findElement(By.xpath("//h2[text()='"+accountType+"']")).getText();

    }
    public String getCreditAccountTable_mtd(int columnNum){

        return Driver.get().findElement(By.xpath("(//thead)[3]/tr/th["+columnNum+"]")).getText();
    }

}
