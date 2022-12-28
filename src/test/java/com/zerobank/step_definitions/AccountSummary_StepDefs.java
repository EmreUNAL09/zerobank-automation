package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {

    AccountSummary accountSummary = new AccountSummary();

    @Then("The user should be able to see as a page header {string}")
    public void the_user_should_be_able_to_see_as_a_page_header(String expectedHeader) {
        BrowserUtils.waitFor(1);
        String actualHeader= Driver.get().getTitle();
        System.out.println("actualHeader = " + actualHeader);
        Assert.assertEquals("Headers are NOT match", expectedHeader,actualHeader);

    }

    @Then("The user should be able to see account types, under the Account Summary")
    public void theUserShouldBeAbleToSeeAccountTypesUnderTheAccountSummary(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);

        List<String> actualList = BrowserUtils.getElementsText(accountSummary.underAccountSummary_loc);
        System.out.println("actualList.size() = " + actualList.size());
        System.out.println("actualList = " + actualList);

        Assert.assertEquals("Account types following menu is NOT visible",expectedList,actualList);
    }

    @Then("The user should be able to see with {int} this {string}")
    public void the_user_should_be_able_to_see_with_this(int columnNum, String expectedCreditAccountName) {

        String actualName= accountSummary.getCreditAccountTable_mtd(columnNum);
        System.out.println("actualName = " + actualName);
        Assert.assertEquals("Credit Account name is NOT match",expectedCreditAccountName, actualName);
    }

//    @And("The user should be able to see titles, under the Credit Accounts")
//    public void theUserShouldBeAbleToSeeTitlesUnderTheCreditAccounts(List<String> expectedList) {
//        System.out.println("expectedList.size() = " + expectedList.size());
//        System.out.println("expectedList = " + expectedList);
//
//        List<String> actualList = BrowserUtils.getElementsText(accountSummary.underCreditAccounts);
//
//        Assert.assertEquals("Credit Accounts titles is NOT visible",expectedList,actualList);
//    }
}
