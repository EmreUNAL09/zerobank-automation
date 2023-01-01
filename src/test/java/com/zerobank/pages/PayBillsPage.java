package com.zerobank.pages;
import com.github.javafaker.Faker;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage extends BasePage{

    @FindBy(xpath = "//select[@id='sp_payee']")
    public WebElement payeeSelectMenu;

    @FindBy(css = "#sp_amount")
    public WebElement amountInput_loc;

    @FindBy(xpath = "//input[@id='sp_date']")
    public WebElement dateInput_loc;

    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    public WebElement date_loc;

    @FindBy(css = "#sp_description")
    public WebElement descriptionInput_loc;

    @FindBy(css = "#pay_saved_payees")
    public WebElement paySubmitBtn_loc;

    @FindBy(xpath = "//span[text()='The payment was successfully submitted.']")
    public WebElement paymetVerification_loc;



    public void payeeMenuSelect_mtd(String optionName){

        //WebElement payeeSelectMenu= Driver.get().findElement(By.xpath("//select[@id='sp_payee']"));
        Select select=new Select(payeeSelectMenu);
        select.selectByVisibleText(optionName);
        BrowserUtils.waitFor(1);

    }

    public void accountMenuSelect_mtd(String accountOption){
        WebElement accountSelectMenu=Driver.get().findElement(By.cssSelector("#sp_account"));
        Select select=new Select(accountSelectMenu);
        select.selectByVisibleText(accountOption);
        BrowserUtils.waitFor(1);
    }

    public void sendAmount_mtd(){
        Faker faker=new Faker();
        amountInput_loc.sendKeys(faker.letterify("1500"));
        BrowserUtils.waitFor(2);
    }
    public void sendInvalidAmount_mtd(String characters){
        BrowserUtils.waitFor(1);
        amountInput_loc.sendKeys(characters);
        BrowserUtils.waitFor(1);
    }

    public void enterDate_mtd(){
        dateInput_loc.click();
        date_loc.click();
        BrowserUtils.waitFor(2);
    }

    public void enterInvalidDate_mtd(String alphabeticalCharacters){
        dateInput_loc.sendKeys(alphabeticalCharacters);
        BrowserUtils.waitFor(2);
    }
    public void sendExpression_mtd(String expresion){
        descriptionInput_loc.sendKeys(expresion);

    }

    public void paymetVerification_mtd(String expectedMessage){

        String actualMessage=paymetVerification_loc.getText();

        Assert.assertEquals("The messages are NOT equals",expectedMessage,actualMessage);
    }
}