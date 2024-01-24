package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;
import org.testng.Assert;

import java.util.List;
import java.util.Map;


public class TrackExpensesStepDef {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @When("user clicks on Track Expenses")
    public void userClicksOnTrackExpenses() {
        new HomePage().clickTrackExpenses();
    }

    @And("user click on add Transaction")
    public void userClickOnAddTransaction() {
        new TrackExpensesPage().clickAddTransaction();
    }

    @And("user enters amount {string}")
    public void userEntersAmount(String amount) {
        new TrackExpensesPage().enterHowMuch(amount);
    }

    @And("user click on Spending")
    public void userClickOnSpending() {
        new TrackExpensesPage().clickSpending();
    }


    @And("user selects category {string} --> {string}")
    public void userSelectsCategory(String mainCategory, String subCategory) throws Exception {
        new BasePage().clickByText(mainCategory);
        new BasePage().clickByText(subCategory);
    }

    @And("user enters Transaction Date")
    public void userEntersDate() {
        new TrackExpensesPage().enterDate();
        new LoginPage().clickOkSecurityAlert();
    }

    @And("user scroll to view Save Transaction")
    public void userScrollToViewSaveTransactionPaidFrom() throws Exception {
        new TrackExpensesPage().scrollToSaveTransaction();
    }

    @And("user click on Choose category")
    public void userClickOnChooseCategory() {
        new TrackExpensesPage().clickChooseCategory();
    }

    @And("user selects paid from {string}")
    public void userSelectsPaidFrom(String paidFrom) throws Exception {
        new TrackExpensesPage().clickPaidFrom();
        new BasePage().clickByText(paidFrom);
    }

    @And("users enters paid to as {string}")
    public void usersEntersPaidToAs(String paidTo) {
        new TrackExpensesPage().enterPaidTo(paidTo);
    }

    @And("user selects monthly recurring")
    public void userSelectsMonthlyRecurring() {
        new TrackExpensesPage().clickMonthlyRecurring();
    }

    @And("user selects frequency as {string}")
    public void userSelectsFrequencyAs(String frequency) throws Exception {
        new TrackExpensesPage().clickFrequency();
        new BasePage().clickByText(frequency);
    }

    @And("user selects date from date picker")
    public void userSelectsDateFromDatePicker() {
        new TrackExpensesPage().clickDatePick();
        new LoginPage().clickOkSecurityAlert();
    }

    @And("user selects end after {string}")
    public void userSelectsEndAfter(String endAfter) throws Exception {
        new TrackExpensesPage().clickEndAfter();
        new BasePage().clickByText(endAfter);
    }

    @Then("verify below in My Transaction Screen")
    public void verifyBelowInMyTransactionScreen(List<Map<String, String>> values) throws Exception {
        for (Map<String, String> value : values) {
            String spendingType = StringUtils.defaultString(value.get("SpendingType"));
            String spendingAmount = StringUtils.defaultString(value.get("SpendingAmount"));
            String paidFrom = StringUtils.defaultString(value.get("PaidFrom"));
            String paidTo = StringUtils.defaultString(value.get("PaidTo"));
            String category = spendingType.split(" ")[0];
            String subCategory = spendingType.split(" ")[1];
            TrackExpensesPage trackExpensesPage = new TrackExpensesPage();
            Assert.assertEquals(trackExpensesPage.getSpendingType(category), subCategory);
            Assert.assertEquals(trackExpensesPage.getSpendingAmount(category), spendingAmount);
            Assert.assertEquals(trackExpensesPage.getPaidFrom(category), paidFrom);
            Assert.assertEquals(trackExpensesPage.getPaidTo(category), paidTo);
        }
    }

    @And("user left swipe to select category for {string}")
    public void userLeftSwipeToSelectCategoryFor(String category) throws Exception {
        new TrackExpensesPage().leftSwipeForCategory(category);
    }

    @And("user click on Income")
    public void userClickOnIncome() throws Exception {
        new TrackExpensesPage().clickIncome();
    }

    @And("user enters Received Date")
    public void userEntersReceivedDate() {
        new TrackExpensesPage().enterReceivedDate();
        new LoginPage().clickOkSecurityAlert();
    }

    @And("user selects received from {string}")
    public void userSelectsReceivedFrom(String receivedFrom) throws Exception {
        new TrackExpensesPage().clickReceivedFrom();
        new BasePage().clickByText(receivedFrom);
    }

    @And("users enters received in as {string}")
    public void usersEntersReceivedInAs(String receivedIn) {
        new TrackExpensesPage().enterReceivedIn(receivedIn);
    }

    @Then("verify below in Income My Transaction Screen")
    public void verifyBelowInIncomeMyTransactionScreen(List<Map<String, String>> values) throws Exception {
        for (Map<String, String> value : values) {
            String spendingType = StringUtils.defaultString(value.get("IncomeType"));
            String spendingAmount = StringUtils.defaultString(value.get("IncomeAmount"));
            String paidFrom = StringUtils.defaultString(value.get("ReceivedFrom"));
            String paidTo = StringUtils.defaultString(value.get("ReceivedIn"));
            String category = spendingType.split(" ")[0];
            String subCategory = spendingType.split(" ")[1];
            TrackExpensesPage trackExpensesPage = new TrackExpensesPage();
            Assert.assertEquals(trackExpensesPage.getSpendingType(category), subCategory);
            Assert.assertEquals(trackExpensesPage.getSpendingAmount(category), spendingAmount);
            Assert.assertEquals(trackExpensesPage.getPaidFrom(category), paidFrom);
            Assert.assertEquals(trackExpensesPage.getPaidTo(category), paidTo);
        }
    }

    @Then("verify {string} > {string}")
    public void verify(String trans1, String trans2) throws Exception {
        Assert.assertTrue(new TrackExpensesPage().verifyGreaterThan(trans1, trans2));
    }

    @And("user select duration as {string}")
    public void userSelectDurationAs(String duration) throws Exception {
        new TrackExpensesPage().clickDuration();
        new BasePage().clickByText(duration);
    }

    @And("user enters transaction type {string}")
    public void userEntersTransactionType(String transactionType) {
        new TrackExpensesPage().enterSearch(transactionType);
    }

    @Then("Verify error message {string} count as {string}")
    public void verifyErrorMessageCountAs(String errorMessage, String count) throws Exception {
        Assert.assertEquals(new TrackExpensesPage().errorMessageCount(errorMessage), Integer.parseInt(count));
    }


    @And("user scroll to view Save Transaction Paid From")
    public void userScrollToViewSaveTransactionPaisFrom() throws Exception {
        new TrackExpensesPage().scrollToSaveTransactionPaidFrom();
    }
}

