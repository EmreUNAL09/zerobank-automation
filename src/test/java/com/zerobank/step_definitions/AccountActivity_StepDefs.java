package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity_StepDefs {

    AccountActivity accountActivity = new AccountActivity();

    @And("The user selects the {string} menu")
    public void theUserSelectsTheMenu(String accountName) {
        accountActivity.menuSelectName_mtd(accountName);
    }


    @Then("The default option in the Account menu should be {string}")
    public void the_default_option_in_the_account_menu_should_be(String sortType) {
        accountActivity.sortBtn_mtd(sortType);
    }

    @And("The account menu should also contain the following {string}")
    public void theAccountMenuShouldAlsoContainTheFollowing(String options) {
        accountActivity.sortBtn_mtd(options);
    }

//    @And("The account menu should also contain the following options")
//    public void theAccountMenuShouldAlsoContainTheFollowingOptions(List<String> expectedList) {
//        accountActivity.sortBtnList_mtd(expectedList);
//    }



    @Then("The user should be able to see {string} with {int}")
    public void the_user_should_be_able_to_see_with(String expectedTransactionTable, int locNumber) {
        String actualTransactionTableName = accountActivity.transactionTable_mtd(locNumber);
        System.out.println("actualName = " + actualTransactionTableName);
        Assert.assertEquals("Transaction table name is NOT match",expectedTransactionTable,actualTransactionTableName);
    }


}
