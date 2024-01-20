package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class SetGoalsPage extends ProfilePage {

    TestUtils utils = new TestUtils();

    GlobalParams params = new GlobalParams();

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Essential Goals']//preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Essential Goals']//preceding-sibling::android.view.ViewGroup")
    private MobileElement areYouReadyForRainyDay;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Retirement'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Retirement']")
    private MobileElement retirementGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='More Goals']")
    @AndroidFindBy(xpath = "//*[@text='More Goals']")
    private MobileElement moreGoals;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Property Invest from now to buy your dream home']")
    @AndroidFindBy(xpath = "//*[@text='Property']")
    private MobileElement propertyGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Kid’s Education Plan & invest to afford the cost of quality education']")
    @AndroidFindBy(xpath = "//*[@text='Kid’s Education']")
    private MobileElement kidEducationGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Wedding Make it grand wedding for self or your kids']")
    @AndroidFindBy(xpath = "//*[@text='Wedding']")
    private MobileElement weddingGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add Financial Goal']/ancestor::XCUIElementTypeOther[5]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='Add Financial Goal']/ancestor::android.view.ViewGroup[3]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]")
    private MobileElement backButtonInAddFinancialGoalScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual Rate of Interest (%)']/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Annual Rate of Interest (%)']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    private MobileElement annualRateOfInterest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Years to Achieve this Goal']/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Years to Achieve this Goal']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    private MobileElement yearsToAchieveThisGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='In today’s value, what is the Goal Amount you wish to Achieve?']/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='In today’s value, what is the Goal Amount you wish to Achieve?']//following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    private MobileElement goalAmountYouWishToAchieve;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Existing Savings for this Goal']/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Existing Savings for this Goal']//following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    private MobileElement existingSavingAmount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Expected Annual Inflation %']/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Expected Annual Inflation %']//following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    private MobileElement expectedAnnualInflation;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add Financial Goal']")
    @AndroidFindBy(xpath = "//*[@text='Add Financial Goal']")
    private MobileElement addFinancialGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual Rate of Interest (%)']")
    @AndroidFindBy(xpath = "//*[@text='Annual Rate of Interest (%)']")
    private MobileElement AnnualRateOfInterest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='IPCLSPSGBTN']")
    @AndroidFindBy(xpath = "//*[@text='Save My Goal']")
    private MobileElement saveMyGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='What does this calculation mean?']")
    @AndroidFindBy(xpath = "//*[@text='Save My Goal?']")
    private MobileElement WhatDoesThisCalculationMean;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Save my goal as']/child::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Save my goal as']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement closeIconInSaveGoalBottomSlider;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Goal Name']//following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.widget.EditText")
    private MobileElement enterGoalNameInputBox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Jewellery']")
    @AndroidFindBy(xpath = "//*[@text='Jewellery']")
    private MobileElement jewellery;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Goal Name']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField\n")
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.widget.EditText")
    private MobileElement renameGoal;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Save Now'])[3]")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='IPCLSPSNBTN']")
    private MobileElement saveNowButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Financial Goals'])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Financial Goals']//following-sibling::android.view.ViewGroup")
    private MobileElement editIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add Financial Goal']/ancestor::XCUIElementTypeOther[5]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[9]")
    @AndroidFindBy(xpath = "//*[@text='Add Financial Goal']/ancestor::android.view.ViewGroup[3]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[5]")
    private MobileElement deleteIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Financial Goals']/ancestor::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]/descendant::XCUIElementTypeOther[8]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Ongoing')]/ancestor::android.view.ViewGroup[2]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    private MobileElement anyFinancialGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Completed(1)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeImage")
    @AndroidFindBy(xpath = "//*[contains(@text,'Ongoing')]/ancestor::android.view.ViewGroup[2]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    private MobileElement congratulationsBanner;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='370862% Liquid FundsGoal 123 ₹10 Completed'])[4]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Ongoing')]/ancestor::android.view.ViewGroup[2]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    private MobileElement investmentCompletedGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='IPGLMGOK']")
    @AndroidFindBy(xpath = "//*[@text='OK']")
    private MobileElement okButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='IPCLSPRNBTN']")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='IPCLSPRNBTN']")
    private MobileElement renameButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Completed(1)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[10]")
//    @AndroidFindBy(xpath = "//*[@text='Liquid FundsGoal 123')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Ongoing')]/ancestor::android.view.ViewGroup[2]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    private MobileElement completedGoalInCompleteTab;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'test goal 01')])[23]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Malamal Wealth')]")
    private MobileElement testGoal01;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,'laptopGoal')])[23]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Large Basket')]")
    private MobileElement laptop;

    @AndroidFindBy(xpath = "//*[contains(@text,'Mission 1 Crore')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Mission 1 Crore ₹1.0 Cr 19 years left']")
    private MobileElement mission1Crore;

    @AndroidFindBy(xpath = "//*[@text='Completed']")
    private MobileElement completedGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='test ₹100 2 years left']")
    @AndroidFindBy(xpath = "//*[contains(@text,'test ₹100 2 years left')]")
    private MobileElement test;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Start Investment Now'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Start Investment Now']")
    private MobileElement startInvestmentNow;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Where do you want to invest?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Where do you want to invest?']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement whereDoYouCloseIcn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Completed(1)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='Where do you want to invest?']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement completedGoal1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Vacation\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Vacation']")
    private MobileElement vacation;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Vacation\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Goals']")
    private MobileElement goals;

    public String getValidationError(String error) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + error + "']";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='" + error + "']";
        }
        return getText(getElement(xpath), "Validation error: ");
    }

    public void clickRainyDayBanner() {
        click(areYouReadyForRainyDay);
    }

    public void clickRetireGoalHoSc() {
        if (! isVisible(retirementGoal)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Retirement");
            } else {
                iOSScrollToElementByName(retirementGoal, "up", "Retirement");
            }
        }
        click(retirementGoal);
    }
    public void clickMoreGoalHoSc() {
        if (! isVisible(moreGoals)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "More Goals");
            } else {
                iOSScrollToElementByName(moreGoals, "up", "More Goals");
            }
        }
        click(moreGoals);
    }
    public void clickPropertyGoal() {
        click(propertyGoal);
    }

    public void clickKidEducationGoal() {
        click(kidEducationGoal);
    }

    public void clickWeedingGoal() {
        click(weddingGoal);
    }

    public void enterTodayGoalAmountToAchieve(String amount) {
        sendKeys(goalAmountYouWishToAchieve, amount);
        click(AnnualRateOfInterest);


    }

    public void enterExistingSavingAmount(String amount) {
        sendKeys(existingSavingAmount, amount);
        click(AnnualRateOfInterest);

    }

    public void enterExpectedAnnualInflation(String amount) throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            sendKeys(expectedAnnualInflation, "0");
            for (int i = 0; i < 2; i++) {
                new BasePage().clickTypeKeyDelete();
            }
            sendKeys(expectedAnnualInflation, amount);
            click(addFinancialGoal);
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            clear(expectedAnnualInflation);
            sendKeys(expectedAnnualInflation, amount);
        }
    }

    public void clickBackButtonInAddFinancialGoalScreen() {
        click(backButtonInAddFinancialGoalScreen);
    }

    public void enterAnnualRateOfInterest(String AnnualRateOfInterest) throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            sendKeys(annualRateOfInterest, "0");
            for (int i = 0; i < 5; i++) {
                new BasePage().clickTypeKeyDelete();
            }
            sendKeys(annualRateOfInterest, AnnualRateOfInterest);
            click(addFinancialGoal);
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            clear(annualRateOfInterest);
            sendKeys(annualRateOfInterest, AnnualRateOfInterest);
        }
    }

    public void enterYearsToAchieveThisGoal(String YearsToAchieveThisGoal) throws Exception {
//        click(yearsToAchieveThisGoal);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            sendKeys(yearsToAchieveThisGoal, "0");
            for (int i = 0; i < 2; i++) {
                new BasePage().clickTypeKeyDelete();
            }
            sendKeys(yearsToAchieveThisGoal, YearsToAchieveThisGoal);
            click(AnnualRateOfInterest);
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            clear(yearsToAchieveThisGoal);
            sendKeys(yearsToAchieveThisGoal, YearsToAchieveThisGoal);
        }
    }

    public void scrollToSaveMyGoal() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
//            scrollInAndroid(WhatDoesThisCalculationMean,204,793,201,252);
//            andScrollToElementUsingUiScrollable("text","Save My Goal");
            andIosScroll(WhatDoesThisCalculationMean, "up", AnnualRateOfInterest,2);
        }
        else{
            scrollToElement(WhatDoesThisCalculationMean, "up", AnnualRateOfInterest);
//            iOSScrollToElementUsingMobileScrollParent(saveMyGoal,"label == \"Save My Goal\"");
//            iOSScrollToElementByName(saveMyGoal,"up","")
        }
    }

    public void clickSaveMyGoal() {
        click(saveMyGoal);
    }

    public void clickCloseIconInSaveGaolBottomSlider() {
        click(closeIconInSaveGoalBottomSlider);
    }

    public void enterGoalName(String goalName) throws Exception {
        clear(enterGoalNameInputBox);
        sendKeys(enterGoalNameInputBox, goalName);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickEnterOnKeyboard();
        }
    }

    public void scrollToJewellery() throws Exception {
        scrollToElement(jewellery, "up", weddingGoal);
    }

    public void renameGoal(String newGoalName) {
        renameGoal.clear();
        sendKeys(renameGoal, newGoalName);
    }

    public void clickOnSaveNow() {
        click(saveNowButton);
    }

    public void clickEditIcon() {
        click(editIcon);
    }

    public void clickDeleteIcon() {
        click(deleteIcon);
    }

    public void clickOneFinancialGoal() {
        click(anyFinancialGoal);
    }

    public boolean verifyCongratulationBanner() {
        return isVisible(congratulationsBanner);
    }

    public void clickInvestmentCompletedGoal() {
        click(investmentCompletedGoal);
    }

    public void ClickOnOkButton() {
        click(okButton);
    }

    public void clickRenameButton() {
        click(renameButton);
    }

    public void clickCompletedGoalPresentInCompletedTab() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            while (!isVisible(completedGoal1)) {
//                iOSScrollToElementByName(testGoal01, "down", "test goal 01 ₹10,000 1 years left");
                scrollDown();
                if (isVisible(completedGoal1)) {
//                    Thread.sleep(15000);
                    click(completedGoal1);
                    break;
                }
            }
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
//            while (!isVisible(liquidFundsGoal123)) {
//            scrollToElement(liquidFundsGoal123, "up", completedGoal);
//                if (isVisible(liquidFundsGoal123)) {
//                    Thread.sleep(15000);
//                    click(liquidFundsGoal123);
//                    break;
//                }
//            click(liquidFundsGoal123);
            click(completedGoal);
        }
    }

    public void clickOnInvestedGoalInFinancialGoalScreen() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            if (! isVisible(testGoal01)) {
                while (!isVisible(testGoal01)) {
//                iOSScrollToElementByName(testGoal01, "down", "test goal 01 ₹10,000 1 years left");
                    scrollDown();
                    if (isVisible(testGoal01)) {
                        Thread.sleep(15000);
                        click(testGoal01);
                        break;
                    }
                }
            }
            else{
                click(testGoal01);
            }
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            if (! isVisible(testGoal01)) {
                while (!isVisible(testGoal01)) {
//                scrollToElement(testGoal01, "up", mission1Crore);
                    andIosScroll(testGoal01, "up", mission1Crore, 20);
                    if (isVisible(testGoal01)) {
                        Thread.sleep(15000);
                        click(testGoal01);
                        break;
                    }
                }
            }
            else{
                click(testGoal01);
            }
        }
    }
    public void clickInvestedGoalInMf() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            if (! isVisible(laptop)) {
                while (!isVisible(laptop)) {
//                iOSScrollToElementByName(testGoal01, "down", "test goal 01 ₹10,000 1 years left");
                    scrollDown();
                    if (isVisible(laptop)) {
                        Thread.sleep(15000);
                        click(laptop);
                        break;
                    }
                }
            }
            else{
                click(laptop);
            }
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            if (! isVisible(laptop)) {
                while (!isVisible(laptop)) {
                    andIosScroll(laptop, "up", mission1Crore);
                    if (isVisible(laptop)) {
                        Thread.sleep(15000);
                        click(laptop);
                        break;
                    }
                }
            }
            else{
                click(laptop);
            }
        }

        }

    public void clickOnNotInvestedGoalInFinancialGoalScreen() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            while (!isVisible(test)) {
//                iOSScrollToElementByName(test, "down", "test ₹100 2 years left");
                scrollDown();
                if (isVisible(test)) {
                    Thread.sleep(15000);
                    click(test);
                    break;
                }
            }
        } else if (Objects.equals(params.getPlatformName(), "Android")) {
            while (!isVisible(test)) {
                scrollToElement(test, "up", mission1Crore);
                if (isVisible(test)) {
                    Thread.sleep(15000);
                    click(test);
                    break;
                }
            }
        }
    }

    public void scrollDown() throws InterruptedException {
        swipe(204, 793, 201, 252, 2000);
    }

    public void clickOnStartInvestNow() {
        click(startInvestmentNow);
    }

    public void swipeGoalBan() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"Android")) {
            swipe(864, 1914, 169, 1910, 1000);
        }
        else{
            swipe(365, 789, 78, 802, 1000);
//            iOSScrollToElementByName(vacation,"left","Vacation");
//            scrollToElement(vacation,"left",retirementGoal);
        }
    }

    public void closeWhereDoYouPopup() {
        click(whereDoYouCloseIcn);
    }
    public void clickGoalsDash() {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            click(goals);
        }
        else{
            tapOn(203,871);
        }

    }

}
