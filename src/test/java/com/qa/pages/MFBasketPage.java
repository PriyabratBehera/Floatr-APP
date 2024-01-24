package com.qa.pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

import java.util.Objects;

public class MFBasketPage extends ProfilePage {
    GlobalParams globalParams = new GlobalParams();
    int oneTimeLowAmount;
    int amount;
    int monthlyLowAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Goal : Gifting Gift Yourself Goal Tenure 2+ years Invest']")
    @AndroidFindBy(xpath = "//*[@text='Gift Yourself']")
    private MobileElement giftYourselfMFB;
    @AndroidFindBy(xpath = "//*[@text='Goal : Gifting Gift Yourself Goal Tenure 2+ years Invest']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"One Click Investing for Goals\"]")
    private MobileElement oneClickInv;
    @AndroidFindBy(xpath = "//*[contains(@text,'Disclaimer: Mutual fund investments are subject to market risks.')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Disclaimer: Mutual fund investments are subject to market risks. Please read the scheme information and other related documents before investing. Past performance is not indicative of future returns of the schemes. Please consider your specific investment goal before choosing to invest in a fund.\"]")
    private MobileElement disclaimer;
    @AndroidFindBy(xpath = "//*[@text='Portfolio Detail']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Portfolio Detail\"]")
    private MobileElement portfolioDetails;
    @AndroidFindBy(xpath = "//*[@text='Returns Calculator']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Returns Calculator']/XCUIElementTypeOther")
    private MobileElement closeIconInReturnsScreen;
    @AndroidFindBy(xpath = "//*[@text='Name of my Goal']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Name of my Goal\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement goalNameInputBx;
    @AndroidFindBy(xpath = "//*[@text='Target Goal Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Target Goal Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement targetAmountBx;
    @AndroidFindBy(xpath = "//*[@text='Existing Savings for this Goal']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Existing Savings for this Goal\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement existingGoalBx;
    @AndroidFindBy(xpath = "//*[@text='Number of years to achieve this Goal']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Number of years to achieve this Goal\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement yearAchieveGoalBx;
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investAmtBx;
    @AndroidFindBy(xpath = "//*[@text='Amount is required']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Amount is required\"])[2]")
    private MobileElement amtIsRequire;
    @AndroidFindBy(xpath = "//*[@text='Investment needed for this goal']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment needed for this goal\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement closeIconInvNeedForGoal;
    @AndroidFindBy(xpath = "//*[@text='Large Basket']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Large Basket Goal Tenure 10+ years Invest\"])[2]")
    private MobileElement monthlyInvBasket;
    @AndroidFindBy(xpath = "//*[@text='Returns Calculator']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Set Financial Goals']")
    private MobileElement setFinancialGoal;
    @AndroidFindBy(xpath = "//*[@text='Amount']//following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement minInvAmount;
    @AndroidFindBy(xpath = "//*[@text='Select']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select\"])[2]")
    private MobileElement sipSelectDate;
    @AndroidFindBy(xpath = "//*[@text='Select one to proceed or add new']/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Gift Yourself No investment 0%  of 500000\"]")
    private MobileElement goalForMFBas;
    @AndroidFindBy(xpath = "//*[@text='How long do you want to invest?']//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How long do you want to invest?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement InvDurationBx;
    @AndroidFindBy(xpath = "//*[@text='Ongoing(1)']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How long do you want to invest?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement ongoing1;

    public void clickGiftYorSelfMFB() {
        if (!isVisible(giftYourselfMFB)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Gift Yourself");
            } else {
                iOSScrollToElementByName(oneClickInv, "up", "One Click Investing for Goals");
            }
            click(giftYourselfMFB);
        } else {
            click(giftYourselfMFB);
        }
    }

    public void scrollToDisclaimer() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(disclaimer, "up", portfolioDetails);
        } else {
            andIosScroll(disclaimer, "up", portfolioDetails);
        }
    }

    public void enterGoalName(String goalName) throws Exception {
        clear(goalNameInputBx);
        sendKeys(goalNameInputBx, goalName);
        clickStaticText("Name of my Goal");
    }

    public void enterTargetAmt(String tarGoalAmt) throws Exception {
        clear(targetAmountBx);
        sendKeys(targetAmountBx, tarGoalAmt);
        clickStaticText("Target Goal Amount");
    }

    public void enterExistingAmt(String existingGaolAmt) throws Exception {
        clear(existingGoalBx);
        sendKeys(existingGoalBx, existingGaolAmt);
        clickStaticText("Existing Savings for this Goal");
    }

    public void enterNoYrAchieveGoal(String achieveGoal) throws Exception {
        clear(yearAchieveGoalBx);
        sendKeys(yearAchieveGoalBx, achieveGoal);
        clickStaticText("Number of years to achieve this Goal");
    }

    public void enterLowerThanMinEnvAmt() throws Exception {
        String invAmt = minInvAmount.getText();
        String amt = invAmt.split("Min. ₹")[1];
        amount = Integer.parseInt(amt);
        oneTimeLowAmount = Integer.parseInt(amt) - 100;
        clear(investAmtBx);
        sendKeys(investAmtBx, Integer.toString(oneTimeLowAmount));
        clickStaticText("Amount");
    }

    public void enterHigherThanMinEnvAmt() throws Exception {
        String invAmt = minInvAmount.getText();
        String amt = invAmt.split("Min. ₹")[1];
        amount = Integer.parseInt(amt);
        System.out.println(amount);
        oneTimeLowAmount = Integer.parseInt(amt) + 100;
        clear(investAmtBx);
        sendKeys(investAmtBx, Integer.toString(999999999));
        clickStaticText("Amount");
    }

    public boolean verifyValidAmtReq() {
        return isVisible(amtIsRequire);
    }

    public void closeInvNeedForGoal() {
        click(closeIconInvNeedForGoal);
    }

    public void clickMonthlyInvBasket() throws Exception {
        if (!isVisible(monthlyInvBasket)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Large Basket");
            } else {
                scrollElement(monthlyInvBasket, "up", setFinancialGoal);
            }
            click(monthlyInvBasket);
        } else {
            click(monthlyInvBasket);
        }
    }

    public void verifyLowerMinValida() throws Exception {
        verifyStaticText("Amount must be greater than or equal to " + amount);
    }

    public void selectFirstInvDt() throws Exception {
        click(sipSelectDate);
        clickByText("5");
    }

    public void selectGoalForInvMfBas() throws Exception {
        if (isVisible(goalForMFBas)) {
            click(goalForMFBas);
        } else {
            enterGoalName("RetirementGoal");
            enterTargetAmt("500000");
            enterExistingAmt("50000");
            enterNoYrAchieveGoal("2");
            clickByText("Continue");
        }
    }

    public void selectGoalForInvTaxG() throws Exception {
        if (isVisible(goalForMFBas)) {
            click(goalForMFBas);
        } else {
            enterGoalName("RetirementGoal");
            enterTargetAmt("1000000");
            enterExistingAmt("60000");
            enterNoYrAchieveGoal("10");
            clickByText("Continue");
        }
    }

    public void enterInvestmentDuration(String duration) throws Exception {
        clear(InvDurationBx);
        sendKeys(InvDurationBx, duration);
        clickStaticText("How long do you want to invest?");
    }

    public void verifyGoalExist() throws Exception {
        if (isVisible(ongoing1)) {
            SetGoalsPage setGoalsPage = new SetGoalsPage();
            setGoalsPage.clickOneFinancialGoal();
            setGoalsPage.clickEditIcon();
            Thread.sleep(2000);
            setGoalsPage.clickDeleteIcon();
            new CreateBudgetPage().clickYesButton();
            Thread.sleep(3000);
        }
        new MutualFundPage().goBackFromScreen("Financial Goals");
    }
}



