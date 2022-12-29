package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity extends BasePage{

    @FindBy(css = ".input-xlarge")
    public WebElement sortBtn_loc;


    public void sortBtn_mtd(String sortType){
        Select select = new Select(sortBtn_loc);
        select.selectByVisibleText(sortType);
        System.out.println("sortType = " + sortType);

    }

//    public void options_mtd(String options){
//        Select select = new Select(sortBtn_loc);
//        select.selectByVisibleText(options);
//        System.out.println("options = " + options);
//    }

//    public void sortBtnList_mtd(List<String> sortTypeList){
//        Driver.get().findElement(By.id("aa_accountId")).click();
//        WebElement actualSortTypeList = Driver.get().findElement(By.xpath("//select[@class='input-xlarge']/option[" + sortTypeList + "]"));
//        Select select = new Select(actualSortTypeList);
//        select.selectByVisibleText(String.valueOf(sortTypeList));
//    }

    public String transactionTable_mtd(int locNumber){
        return Driver.get().findElement(By.xpath("//thead/tr/th["+locNumber+"]")).getText();
    }



}
