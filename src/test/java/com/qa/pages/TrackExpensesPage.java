package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Objects;

public class TrackExpensesPage extends ProfilePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @AndroidFindBy(xpath = "//*[@text='Transaction']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Transaction'")
    private MobileElement addTransaction;

    @AndroidFindBy(xpath = "//*[contains(@text,'Category')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "label ENDSWITH 'category'")
    private MobileElement chooseCategory;

    @AndroidFindBy(xpath = "//*[contains(@text,'How much')]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"₹0\"]/XCUIElementTypeTextField")
    private MobileElement howMuch;

    @AndroidFindBy(xpath = "//*[@text='Spending']")
//    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Spending'")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Spending\"]")
    private MobileElement spending;

    @AndroidFindBy(xpath = "(//*[@text='Income'])[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Income'")
    private MobileElement income;

    @AndroidFindBy(xpath = "//*[contains(@text,'Transaction Date')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement transactionDate;

    @AndroidFindBy(xpath = "//*[contains(@text,'Received Date')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement receivedDate;

    @AndroidFindBy(xpath = "//*[@text='1']")
    private MobileElement date;

    @AndroidFindBy(xpath = "//*[@text='2']")
    private MobileElement dateReceived;

    @AndroidFindBy(xpath = "//*[@text='Save Transaction']")
    private MobileElement saveTransaction;

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid From')]/following-sibling::android.view.ViewGroup[1]//android.widget.ImageView")
    private MobileElement paidFrom;

    @AndroidFindBy(xpath = "//*[contains(@text,'Received From')]/following-sibling::android.view.ViewGroup[1]//android.widget.ImageView")
    private MobileElement receivedFrom;

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid To')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText[1]")
    private MobileElement paidTo;

    @AndroidFindBy(xpath = "//*[contains(@text,'Received In')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText[1]")
    private MobileElement receivedIn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Is this monthly recurring')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement monthlyRecurring;

    @AndroidFindBy(xpath = "//*[contains(@text,'Frequency')]/following-sibling::android.view.ViewGroup[1]//android.widget.ImageView")
    private MobileElement frequency;

    @AndroidFindBy(xpath = "//*[contains(@text,'Date')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement datePick;

    @AndroidFindBy(xpath = "//*[contains(@text,'End After')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement endAfter;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private MobileElement deleteTransaction;

    @AndroidFindBy(xpath = "//*[contains(@text,'My Transactions')]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement duration;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private MobileElement search;

    @AndroidFindBy(xpath = "//*[@text='Received From']")
    private MobileElement receivedFromScroll;

    @AndroidFindBy(xpath = "//*[@text='Paid From']")
    private MobileElement paidFromScroll;

    public void clickAddTransaction() {
        click(addTransaction);
    }

    public void clickSpending() {
        click(spending);
    }

    public void clickIncome() throws Exception {
        int count = getElementCount("//*[@text='Income']");
        click(getElement("(//*[@text='Income'])[" + count + "]"));
    }

    public void clickChooseCategory() {
        click(chooseCategory);
    }

    public void enterHowMuch(String amount) {
        GlobalParams params = new GlobalParams();
        sendKeys(howMuch, amount);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            click(spending);
        }
    }

    public void enterSearch(String searchText) {
        sendKeys(search, searchText);
    }

    public void enterDate() {
        click(transactionDate);
        click(date);
    }

    public void enterReceivedDate() {
        click(receivedDate);
        click(dateReceived);
    }

    public void scrollToSaveTransaction() throws Exception {
//        scrollToElement(saveTransaction, "up", receivedFromScroll);
        andScrollToElementUsingUiScrollable("text", "Save Transaction");
    }

    public void scrollToSaveTransactionReceivedFrom() throws Exception {
        scrollToElement(saveTransaction, "up", receivedFromScroll);
    }

    public void scrollToSaveTransactionPaidFrom() throws Exception {
        scrollToElement(saveTransaction, "up", paidFromScroll);
    }

    public void scrollUpToView(String toElement, String fromElement) throws Exception {
        String toElementXPATh = "//*[@text='" + toElement + "']";
        String fromElementXPATh = "//*[@text='" + fromElement + "']";
        scrollToElement(getElement(toElementXPATh), "up", getElement(fromElementXPATh));

    }


    public void clickPaidFrom() {
        click(paidFrom);
    }

    public void clickReceivedFrom() {
        click(receivedFrom);
    }

    public void enterPaidTo(String toWhom) {
        sendKeys(paidTo, toWhom);
    }

    public void enterReceivedIn(String toWhom) {
        sendKeys(receivedIn, toWhom);
    }

    public void clickMonthlyRecurring() {
        click(monthlyRecurring);
    }

    public void clickFrequency() {
        click(frequency);
    }

    public void clickDatePick() {
        click(datePick);
    }

    public void clickEndAfter() {
        click(endAfter);
    }

    public String getSpendingType(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[2]";
        return getText((getElement(xpath)), "Spending Type: ");
    }

    public String getSpendingAmount(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[1]";
        return getText((getElement(xpath)), "Spending Amount: ");
    }

    public String getPaidFrom(String category) throws Exception {
//        String xpath = "//*[contains(@text,'" + category + "')]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView[3]";
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[6]";
        return getText((getElement(xpath)), "Get Paid From: ");
    }

    public String getPaidTo(String category) throws Exception {
//        String xpath = "//*[contains(@text,'" + category + "')]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView[4]";
        String xpath = "//*[contains(@text,'" + category + "')]/following-sibling::android.widget.TextView[7]";
        return getText((getElement(xpath)), "Get Paid To: ");
    }

    public void leftSwipeForCategory(String category) throws Exception {
        String xpath = "//*[contains(@text,'" + category + "')]";
        scrollToElement(getElement(xpath), "left", getElement(xpath));
    }

    public boolean verifyGreaterThan(String trans1, String trans2) throws Exception {
        String trans1Xpath = "//*[contains(@text,'" + trans1 + "')]";
        String trans2Xpath = "//*[contains(@text,'" + trans2 + "')]";
        int trans1YCord = getElement(trans1Xpath).getLocation().getY();
        int trans2YCord = getElement(trans2Xpath).getLocation().getY();
        return trans2YCord > trans1YCord;
    }

    public void clickDuration() {
        click(duration);
    }

    public int errorMessageCount(String errorMessage) throws Exception {
        String xpath = "//*[contains(@text,'" + errorMessage + "')]";
        return getElementCount(xpath);
    }

}

