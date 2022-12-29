package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "account_summary_tab")
    public WebElement accountSummary_loc;
//
//    @FindBy(id = "account_activity_tab")
//    public WebElement accountActivity_loc;
//
//    @FindBy(id = "pay_bills_tab")
//    public WebElement payBills_loc;

    public void menuSelectName_mtd(String menuName){
        Driver.get().findElement(By.xpath("//a[text()='"+menuName+"']")).click();
    }
    //        return Driver.get().findElement(By.xpath("//a[text()='"+menuName+"']")).getText();

}
