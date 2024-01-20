package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.SetGoalsPage;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class SetGoalsStepDef {

    TestUtils utils = new TestUtils();

    GlobalParams globalParams = new GlobalParams();

    @When("user clicks on set goals")
    public void userClicksOnSetGoals(){
        new HomePage().clickSetGoal();
    }

    @And("user click by text contains {string}")
    public void userClickByTextContains(String text) throws Exception {
        new BasePage().clickByTextContains(text);
    }

    @When("user click on are you ready for the rainy days")
    public void userClickOnAreYouReadyForTheRainyDays() {
        new SetGoalsPage().clickRainyDayBanner();
    }

    @When("user click on retirement goal on home screen")
    public void userClickOnRetirementGoalOnHomeScreen() {
        new SetGoalsPage().clickRetireGoalHoSc();
    }

    @And("user click on property goal")
    public void userClickOnPropertyGoal() {
        new SetGoalsPage().clickPropertyGoal();
    }

    @And("user click on kid's eduction goal")
    public void userClickOnKidSEductionGoal() {
        new SetGoalsPage().clickKidEducationGoal();
    }

    @And("user click on weeding goal")
    public void userClickOnWeedingGoal() {
        new SetGoalsPage().clickWeedingGoal();
    }

    @And("user enter amount for {string} as {string}")
    public void userEnterAmountForAs(String text, String amount) throws Exception {
//        new SetGoalsPage().enterTodayGoalAmountToAchieve(text,amount);
    }

    @And("user go back from add financial goal screen")
    public void userGoBackFromAddFinancialGoalScreen() {
        new SetGoalsPage().clickBackButtonInAddFinancialGoalScreen();
    }

    @When("user enter annual rate of interest as {string}")
    public void userEnterAnnualRateOfInterestAs(String annualRateOfInterest) throws Exception {
        new SetGoalsPage().enterAnnualRateOfInterest(annualRateOfInterest);
    }

    @And("user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as {string}")
    public void userEnterAmountForInTodaySValueWhatIsTheGoalAmountYouWishToAchieveAs(String amount) throws Exception {
        new SetGoalsPage().enterTodayGoalAmountToAchieve(amount);
    }

    @When("user enter amount for Existing Savings for this Goal as {string}")
    public void userEnterAmountForExistingSavingsForThisGoalAs(String amount) throws Exception {
        new SetGoalsPage().enterExistingSavingAmount(amount);
    }

    @When("user enter amount for Expected Annual Inflation % as {string}")
    public void userEnterAmountForExpectedAnnualInflationAs(String amount) throws Exception {
        new SetGoalsPage().enterExpectedAnnualInflation(amount);

    }

    @And("user enter years to achieve this goal as {string}")
    public void userEnterYearsToAchieveThisGoalAs(String amount) throws Exception {
        new SetGoalsPage().enterYearsToAchieveThisGoal(amount);
    }

    @And("user scroll to view save my goals")
    public void userScrollToViewSaveMyGoals() throws Exception {
        new SetGoalsPage().scrollToSaveMyGoal();

    }

    @When("user click on save my goal")
    public void userClickOnSaveMyGoal() {
        new SetGoalsPage().clickSaveMyGoal();
    }

    @And("user click close icon in save my goal bottom slider")
    public void userClickCloseIconInSaveMyGoalBottomSlider() {
        new SetGoalsPage().clickCloseIconInSaveGaolBottomSlider();
    }

    @When("user enter goal name as {string}")
    public void userEnterGoalNameAs(String goalName) throws Exception {
        new SetGoalsPage().enterGoalName(goalName);
    }

    @And("user scroll to view Jewellery")
    public void userScrollToViewJewellery() throws Exception {
        new SetGoalsPage().scrollToJewellery();
    }

    @And("user rename goal name as {string}")
    public void userRenameGoalNameAs(String newGoalName) {
        new SetGoalsPage().renameGoal(newGoalName);
    }

    @And("user click on Save Now")
    public void userClickOnSaveNow() {
        new SetGoalsPage().clickOnSaveNow();
    }

    @And("user click on edit icon")
    public void userClickOnEditIcon() {
        new SetGoalsPage().clickEditIcon();
    }

    @And("user click on delete icon")
    public void userClickOnDeleteIcon() {
        new SetGoalsPage().clickDeleteIcon();
    }

    @And("user click one financial goal")
    public void userClickOneFinancialGoal() {
        new SetGoalsPage().clickOneFinancialGoal();
    }

    @Then("user verify congratulations banner")
    public void userVerifyCongratulationsBanner() {
        Assert.assertTrue(new SetGoalsPage().verifyCongratulationBanner());
    }

    @And("user click on a goal which is investment completed")
    public void userClickOnAGoalWhichIsInvestmentCompleted() {
        new SetGoalsPage().clickInvestmentCompletedGoal();
    }

    @When("user click on ok")
    public void userClickOnOk() {
        new SetGoalsPage().ClickOnOkButton();
    }

    @And("user click on Rename button")
    public void userClickOnRenameButton() {
        new SetGoalsPage().clickRenameButton();
    }

    @And("user click on completed Goal")
    public void userClickOnCompletedGoal() throws Exception {
        new SetGoalsPage().clickCompletedGoalPresentInCompletedTab();
    }

    @And("user click on test goal which is invested in digital gold")
    public void userClickOnTestGoalWhichIsInvestedInDigitalGold() throws Exception {
        new SetGoalsPage().clickOnInvestedGoalInFinancialGoalScreen();
    }

    @And("user click on test which is not invested in digital gold and mutual fund module")
    public void userClickOnTestWhichIsNotInvestedInDigitalGoldAndMutualFundModule() throws Exception {
        new SetGoalsPage().clickOnInvestedGoalInFinancialGoalScreen();
    }

    @When("user click on Start Investment Now")
    public void userKlickOnStartInvestmentNow() {
        new SetGoalsPage().clickOnStartInvestNow();
    }

    @When("user swipe goal banner in home page")
    public void userSwipeGoalBannerInHomePage() throws Exception {
        new SetGoalsPage().swipeGoalBan();
    }

    @When("user close where do you want to invest pop up")
    public void userCloseWhereDoYouWantToInvestPopUp() {
        new SetGoalsPage().closeWhereDoYouPopup();
    }

    @And("user click on laptop goal which is invested in MF goal")
    public void userClickOnLaptopGoalWhichIsInvestedInMFGoal() throws Exception {
        new SetGoalsPage().clickInvestedGoalInMf();
    }

    @When("user click on More Goals on home screen")
    public void userClickOnMoreGoalsOnHomeScreen() {
        new SetGoalsPage().clickMoreGoalHoSc();
    }

    @When("user click goals on dashboard")
    public void userClickGoalsOnDashboard() {
        new SetGoalsPage().clickGoalsDash();

    }
}

