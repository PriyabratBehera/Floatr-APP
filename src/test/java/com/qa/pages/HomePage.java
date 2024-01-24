package com.qa.pages;

import com.qa.stepdef.DigitalGoldStepDef;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.eo.Se;
import org.testng.Assert;

import java.nio.file.Watchable;
import java.util.Objects;

public class HomePage extends ProfilePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Home']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Hello')]")
    private MobileElement home;
    @AndroidFindBy(xpath = "//*[@text='Wealth']")
    private MobileElement wealth;
    @AndroidFindBy(xpath = "//*[@text='Report']")
    private MobileElement report;
    @AndroidFindBy(xpath = "(//*[contains(@text, 'Set')])[2]")
    private MobileElement setGoal;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Set')]")
    private MobileElement setGoals;
    @AndroidFindBy(xpath = "(//*[contains(@text, 'Budget')])[2]")
    private MobileElement createBudget;
    @AndroidFindBy(xpath = "(//*[contains(@text, 'Track')])[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Track'")
    private MobileElement trackExpenses;
    @AndroidFindBy(accessibility = "HAMBURGER")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"HAMBURGER\"]")
    private MobileElement hamburger;
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Done'")
    private MobileElement done;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Logout']")
    @AndroidFindBy(xpath = "//*[@text='Logout']")
    private MobileElement logoutButton;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Yes']")
    @AndroidFindBy(xpath = "//*[@text='Yes']")
    private MobileElement yesButton;

    public void clickDone() {
        click(done);
    }

    public void verifyMenuOptionsInHomePage() {
        waitForVisibility(home);
        Assert.assertTrue(home.isDisplayed());
        Assert.assertTrue(wealth.isDisplayed());
        Assert.assertTrue(report.isDisplayed());
    }

    public void clickOnWealth() {
        waitForVisibility(home);
        Assert.assertTrue(wealth.isDisplayed());
        click(wealth);
    }

    public boolean verifyHome() {
        waitForVisibility(home);
        return home.isDisplayed();
    }

    public boolean verifyWealth() {
        return wealth.isDisplayed();
    }

    public boolean verifyReport() {
        return report.isDisplayed();
    }

    public SetGoalsPage clickSetGoal() {
        clickIfExist(setGoal);
        clickIfExist(setGoals);
        return new SetGoalsPage();
    }

    public CreateBudgetPage clickCreateBudget() {
        click(createBudget);
        return new CreateBudgetPage();
    }

    public TrackExpensesPage clickTrackExpenses() {
        click(trackExpenses);
        return new TrackExpensesPage();
    }

    public void logout() throws Exception {
        click(hamburger);
        String time = "4000";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            Thread.sleep(2000);
        }
        waitForVisibility(logoutButton);
        new BasePage().clickByText("Logout");
//        new DigitalGoldStepDef().userWainForMinute(time);
        waitForVisibility(yesButton);
        new BasePage().clickByText("Yes");
    }

}
