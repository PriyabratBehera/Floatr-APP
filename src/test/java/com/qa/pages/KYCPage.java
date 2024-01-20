package com.qa.pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class KYCPage extends ProfilePage {
    GlobalParams globalParams = new GlobalParams();

    @AndroidFindBy(xpath = "//*[@text='Mobile No']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile No\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement mobileNumber;

    @AndroidFindBy(xpath = "//*[@text='Email ID']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email ID\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement emailAddress;

    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement mobileVerificationOTPText;

    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement emailVerificationOTP;

    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[1]")
    private MobileElement mobileOTP1;

    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[2]")
    private MobileElement mobileOTP2;

    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[3]")
    private MobileElement mobileOTP3;

    @AndroidFindBy(xpath = "//*[@text='Mobile Number Verification']/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[4]")
    private MobileElement mobileOTP4;

    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[1]")
    private MobileElement emailOTP1;

    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[2]")
    private MobileElement emailOTP2;

    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[3]")
    private MobileElement emailOTP3;

    @AndroidFindBy(xpath = "//*[@text='Email Verification']/following-sibling::android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verification\"]/following-sibling::XCUIElementTypeStaticText[2]/following::XCUIElementTypeTextField[4]")
    private MobileElement emailOTP4;

    @AndroidFindBy(xpath = "//*[@text='Budgeting']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Please enter the following text in the box below:\"]/preceding-sibling::XCUIElementTypeTextField")
    private MobileElement aadhaarNumber;

    @AndroidFindBy(xpath = "//*[@text=\"About Me\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ About Me\"])[3]")
    private MobileElement completePersonalDetailPage;

    @AndroidFindBy(xpath = "//*[@text=\"Occupation\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ Occupation\"])[3]")
    private MobileElement occupationTab;

    @AndroidFindBy(xpath = "//*[@text=\"About Me\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"✓ About Me\"])[3]")
    private MobileElement aboutMeTab;

    @AndroidFindBy(xpath = "//*[@text=\"About Me\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1 About Me\"])[3]")
    private MobileElement personalDetailPage;

    @AndroidFindBy(xpath = "//*[@text=\"Father’s Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Father’s Name\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement fathersName;
    @AndroidFindBy(xpath = "//*[@text=\"Father’s Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PAN\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement panNum;


    @AndroidFindBy(xpath = "//*[@text=\"Mother’s Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mother’s Name\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement mothersName;
    @AndroidFindBy(xpath = "//*[@text=\"Place of Birth\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Place of Birth\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement PlaceOfBirth;
    @AndroidFindBy(xpath = "//*[@text=\"Place of Birth\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Marital Status\"]")
    private MobileElement maritalStatus;
    @AndroidFindBy(xpath = "//*[@text=\"Spouse Name\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Spouse Name\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement nameCanNotEmpty;
    @AndroidFindBy(xpath = "//*[@text=\"PAN\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PAN\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement pan;

    @AndroidFindBy(xpath = "//*[@text=\"Aadhaar\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Aadhaar\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement aadhaar;

    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[2]")
    private MobileElement politicallyExposedPersonNo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56\"])[2]")
    private MobileElement closeCamera;

    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[8]")
    private MobileElement politicallyExposedPersonYes;

    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[4]")
    private MobileElement relatedPoliticallyExposedPersonNo;

    @AndroidFindBy(xpath = "//*[contains(@text,\"I am politically exposed\")]/following-sibling::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[10]")
    private MobileElement relatedPoliticallyExposedPersonYes;

    @AndroidFindBy(xpath = "//*[@text='Self Employed']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Self Employed\"])[2]")
    private MobileElement occupationTypeSelfEmployed;

    @AndroidFindBy(xpath = "//*[@text=\"Professional\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Professional\"])[2]")
    private MobileElement occupationTypeProfessional;

    @AndroidFindBy(xpath = "//*[@text='Rental']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Rental\"])[2]")
    private MobileElement mainSourceIncomeRental;

    @AndroidFindBy(xpath = "//*[@text='Others']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Others\"])[2]")
    private MobileElement mainSourceIncomeOthers;

    @AndroidFindBy(xpath = "//*[@text='Main Source of Income']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Main Source of Income\"]")
    private MobileElement mainSourceOfIncome;

    @AndroidFindBy(xpath = "//*[@text='Annual Income']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Annual Income\"]")
    private MobileElement annualIncome;

    @AndroidFindBy(xpath = "//*[@text='1-5 Lakhs']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1-5 Lakhs\"])[2]")
    private MobileElement annualIncomeOneToFiveLacks;

    @AndroidFindBy(xpath = "//*[@text='5-10 Lakhs']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"5-10 Lakhs\"])[2]")
    private MobileElement annualIncomeFiveToTenLacks;

    @AndroidFindBy(xpath = "//*[@text=\"Account Number (Must be Savings Account)\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Account Number (Must be Savings Account)\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement accountNumberTextBox;

    @AndroidFindBy(xpath = "//*[@text=\"IFSC Code\"]/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"IFSC Code\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement ifscCodeTextBox;

    @AndroidFindBy(xpath = "//*[@text=\"Bank Name\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bank Name\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement bankNamedropDown;

    @AndroidFindBy(xpath = "//*[@text=\"My name in bank account matches with the name on PAN Card  \"]/parent::android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My name in bank account matches with the name on PAN Card  \"]/XCUIElementTypeOther")
    private MobileElement nameMatchWithPanCheckBox;

    @AndroidFindBy(xpath = "//*[@text='Bank of Baroda']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Bank of Baroda\"])[2]")
    private MobileElement axisBank;
    @AndroidFindBy(xpath = "//*[@text='UCO Bank']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"UCO Bank\"])[2]")
    private MobileElement ucoBank;

    @AndroidFindBy(xpath = "//*[@text='Continue']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Continue\"])[2]")
    private MobileElement continueBtn;

    @AndroidFindBy(xpath = "//*[@text=\"Nominee's Date of Birth\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee's Date of Birth\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement nomineeDob;

    @AndroidFindBy(xpath = "//*[@text=\"Guardian is nominee’s\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian is nominee’s\"]")
    private MobileElement guardianIsNomineesDropDwn;

    @AndroidFindBy(xpath = "//*[@text=\"Guardian’s Date of Birth (Must be adult)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Date of Birth (Must be adult)\"]")
    private MobileElement guardianDobDtPic;

    @AndroidFindBy(xpath = "//*[@text=\"Nominee is my\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee is my\"]/following-sibling::XCUIElementTypeOther[3]")
    private MobileElement nomineeIsMyTxtBox;

    @AndroidFindBy(xpath = "//*[@text=\"Nominee Name\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement nomineeNameTxtBox;

    @AndroidFindBy(xpath = "//*[@text=\"Guardian Name\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Date of Birth (must be adult)\"]")
    private MobileElement guardianNameTxtBox;

    @AndroidFindBy(xpath = "//*[@text='Upload PAN']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload PAN (jpeg or png)\"]")
    private MobileElement uploadPan;

    @AndroidFindBy(xpath = "//*[@text='Upload Photo']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload Photo (jpeg or png)\"]")
    private MobileElement uploadPhoto;

    @AndroidFindBy(xpath = "//*[@text='Upload Signature']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Upload Signature (jpeg or png)\"]")
    private MobileElement uploadSign;
    @AndroidFindBy(xpath = "//*[@text='Upload Signature']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow Once\"]")
    private MobileElement allowLocation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56  \"])[12]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    private MobileElement captureBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uDB80\uDD56  \"])[12]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement takePhoto;

    @AndroidFindBy(xpath = "(//*[@text='Resend OTP'])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Resend OTP\"])[2]")
    private MobileElement resendOtpMail;

    @AndroidFindBy(xpath = "//*[@text='Start New Application']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start New Application\"]")
    private MobileElement startNewApplication;

    @AndroidFindBy(xpath = "//*[@text='Re-start Onboarding?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Re-start Onboarding?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    private MobileElement closeStartNewAppli;

    @AndroidFindBy(xpath = "//*[@text='Yes, I want to Restart']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes, I want to Restart\"])[2]")
    private MobileElement wantToRestart;
    @AndroidFindBy(xpath = "//*[@text='Don’t allow']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Don’t allow\"]")
    private MobileElement dontAllow;
    @AndroidFindBy(xpath = "//*[@text='Only this time']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OK\"]")
    private MobileElement onlyThisTime;

    @AndroidFindBy(xpath = "//*[@text='Yes']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes\"]")
    private MobileElement yesButton;

    @AndroidFindBy(xpath = "//*[@text=' File size should be 2KB to 2MB only']/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes\"]")
    private MobileElement signSamplePopup;

    public void enterMobileNumber() {
        mobileNumber.clear();
        String phNumber = generateRandomMobileNumber();
        sendKeys(mobileNumber, phNumber);
    }

    public void enterEmailAddress(String emailId) {
        emailAddress.clear();
        sendKeys(emailAddress, emailId);
    }

    public void enterInvalidMobileNumber(String emailId) throws Exception {
        mobileNumber.clear();
        sendKeys(mobileNumber, emailId);
        clickStaticText("Contact Detail");
    }

    public void enterInvalidEmailAddress(String emailId) throws Exception {
        emailAddress.clear();
        sendKeys(emailAddress, emailId);
        clickStaticText("Contact Detail");
    }

    public void enterInvalidMobileOTP() throws Exception {
        String invalidEmailOTP = "1234";
        mobileOTP1.clear();
        sendKeys(mobileOTP1, String.valueOf(invalidEmailOTP.charAt(0)));
        if (mobileOTP2.getText().isEmpty()) {
            sendKeys(mobileOTP2, String.valueOf(invalidEmailOTP.charAt(1)));
            sendKeys(mobileOTP3, String.valueOf(invalidEmailOTP.charAt(2)));
            sendKeys(mobileOTP4, String.valueOf(invalidEmailOTP.charAt(3)));
            clickStaticText("Mobile Number Verification");
        } else {
            mobileOTP2.clear();
            mobileOTP4.clear();
            sendKeys(mobileOTP1, String.valueOf(invalidEmailOTP.charAt(0)));
            sendKeys(mobileOTP2, String.valueOf(invalidEmailOTP.charAt(1)));
            mobileOTP3.clear();
            sendKeys(mobileOTP3, String.valueOf(invalidEmailOTP.charAt(2)));
            mobileOTP4.clear();
            sendKeys(mobileOTP4, String.valueOf(invalidEmailOTP.charAt(3)));
            clickStaticText("Mobile Number Verification");
        }

    }

    public void enterInvalidEmailOTP() throws Exception {
        String invalidMobOTP = "1234";
        emailOTP1.clear();
        sendKeys(emailOTP1, String.valueOf(invalidMobOTP.charAt(0)));
        if (emailOTP2.getText().isEmpty()) {
            sendKeys(emailOTP2, String.valueOf(invalidMobOTP.charAt(1)));
            sendKeys(emailOTP3, String.valueOf(invalidMobOTP.charAt(2)));
            sendKeys(emailOTP4, String.valueOf(invalidMobOTP.charAt(3)));
            clickStaticText("Email Verification");
        } else {
            clear(emailOTP2);
            clear(emailOTP4);
            sendKeys(emailOTP1, String.valueOf(invalidMobOTP.charAt(0)));
            sendKeys(emailOTP2, String.valueOf(invalidMobOTP.charAt(1)));
            clear(emailOTP3);
            sendKeys(emailOTP3, String.valueOf(invalidMobOTP.charAt(2)));
            clear(emailOTP4);
            sendKeys(emailOTP4, String.valueOf(invalidMobOTP.charAt(3)));
            clickStaticText("Email Verification");
        }
    }

    public void enterValidMobileOTP() throws Exception {
        String mobileOTP = mobileVerificationOTPText.getText().split("OTP - ")[1].trim();
        mobileOTP1.clear();
        sendKeys(mobileOTP1, String.valueOf(mobileOTP.charAt(0)));
        if (mobileOTP2.getText().isEmpty()) {
            sendKeys(mobileOTP2, String.valueOf(mobileOTP.charAt(1)));
            sendKeys(mobileOTP3, String.valueOf(mobileOTP.charAt(2)));
            sendKeys(mobileOTP4, String.valueOf(mobileOTP.charAt(3)));
            clickStaticText("Mobile Number Verification");
        } else {
            mobileOTP2.clear();
            mobileOTP4.clear();
            sendKeys(mobileOTP1, String.valueOf(mobileOTP.charAt(0)));
            sendKeys(mobileOTP2, String.valueOf(mobileOTP.charAt(1)));
//            mobileOTP3.clear();
            sendKeys(mobileOTP3, String.valueOf(mobileOTP.charAt(2)));
//            mobileOTP4.clear();
            sendKeys(mobileOTP4, String.valueOf(mobileOTP.charAt(3)));
            clickStaticText("Mobile Number Verification");
        }
    }

    public void enterValidEmailOTP() throws Exception {
        String emailOTP = emailVerificationOTP.getText().split("OTP - ")[1].trim();
        emailOTP1.clear();
        sendKeys(emailOTP1, String.valueOf(emailOTP.charAt(0)));
        if (emailOTP2.getText().isEmpty()) {
            sendKeys(emailOTP2, String.valueOf(emailOTP.charAt(1)));
            sendKeys(emailOTP3, String.valueOf(emailOTP.charAt(2)));
            sendKeys(emailOTP4, String.valueOf(emailOTP.charAt(3)));
            clickStaticText("Email Verification");
        } else {
            clear(emailOTP2);
            clear(emailOTP4);
            sendKeys(emailOTP1, String.valueOf(emailOTP.charAt(0)));
            sendKeys(emailOTP2, String.valueOf(emailOTP.charAt(1)));
//            clear(emailOTP3);
            sendKeys(emailOTP3, String.valueOf(emailOTP.charAt(2)));
//            clear(emailOTP4);
            sendKeys(emailOTP4, String.valueOf(emailOTP.charAt(3)));
            clickStaticText("Email Verification");
        }
    }

    public void enterInvalidAadhaarNumber() {
        String invalidAadhaarNo = "123456789087";
        aadhaarNumber.clear();
        sendKeys(aadhaarNumber, invalidAadhaarNo);
    }

    public void personalDetailScreen() {
        if (isVisible(completePersonalDetailPage)) {
            click(completePersonalDetailPage);
        } else if (isVisible(personalDetailPage)) {
            click(personalDetailPage);
        }
    }

    public void doNotEnterFathersName() throws Exception {
        click(fathersName);
        clear(fathersName);
        clickStaticText("Title");

    }

    public void doNotEnterMothersName() throws Exception {
        click(mothersName);
        clear(mothersName);
        clickStaticText("Title");
    }

    public void doNotEnterPlaceOfBirth() throws Exception {
        click(PlaceOfBirth);
        clear(PlaceOfBirth);
        clickStaticText("Title");
    }

    public void scrollToMaritalSta() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Marital Status");
        } else {
            iOSScrollToElementByName(maritalStatus, "up", "Marital Status");
        }
    }

    public void scrollToSpouseName() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(nameCanNotEmpty, "up", maritalStatus);
        } else {
            andIosScroll(nameCanNotEmpty, "up", maritalStatus);
        }
    }

    public void enterFathersName(String fatherName) throws Exception {
        clear(fathersName);
        sendKeys(fathersName, fatherName);
        clickStaticText("Title");
    }

    public void verifySpouseName() throws Exception {
        isVisible(nameCanNotEmpty);
    }

    public void enterMothersName(String motherName) throws Exception {
        clear(mothersName);
        sendKeys(mothersName, motherName);
        clickStaticText("Title");
    }

    public void enterPlaceOfBirth(String placeOfBirth) throws Exception {
//        click(PlaceOfBirth);
        clear(PlaceOfBirth);
        clickStaticText("Title");
        click(PlaceOfBirth);
        sendKeys(PlaceOfBirth, placeOfBirth);
        clickStaticText("Title");
    }

    public void enterPanNumber() throws Exception {
        clear(pan);
        sendKeys(pan, "FWLPB2941D");
        clickStaticText("PAN");
    }

    public void enterAadhaarNumber() throws Exception {
        clear(aadhaar);
        sendKeys(aadhaar, "500633989586");
        clickStaticText("Aadhaar");
    }

    public void selectPoliticalExposedPersonNo() {
        click(politicallyExposedPersonNo);
    }

    public void closeCamera() throws Exception {
        if (isVisible(dontAllow)) {
            click(dontAllow);
            click(uploadPan);
            click(onlyThisTime);
            Thread.sleep(3000);
        }
        click(captureBtn);
        Thread.sleep(3000);
        click(closeCamera);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (isVisible(closeCamera)) {
                click(closeCamera);
            }
        }
        if (isVisible(yesButton)) {
            click(yesButton);
        }
        if (isVisible(closeCamera)) {
            click(closeCamera);
        }
        if (isVisible(yesButton)) {
            click(yesButton);
        }
    }

    public void selectPoliticalExposedPersonYes() {
        click(politicallyExposedPersonYes);
    }

    public void selectRelatedPoliticalExposedPersonNo() {
        click(relatedPoliticallyExposedPersonNo);
    }

    public void selectRelatedPoliticalExposedPersonYes() {
        click(relatedPoliticallyExposedPersonYes);
    }

    public void selectOccupationTypeSelfEmploy() {
        click(occupationTypeSelfEmployed);
    }

    public void selectOccupationTypeProfessional() {
        click(occupationTypeProfessional);
    }

    public void selectMainSourceOfIncomeOthers() {
        click(mainSourceIncomeOthers);
    }

    public void selectMainSourceOfIncomeRental() {
        click(mainSourceIncomeRental);
    }

    public void selectAnnualIncomeOneToFive() {
        click(annualIncomeOneToFiveLacks);
    }

    public void selectAnnualIncomeFiveToTen() {
        click(annualIncomeFiveToTenLacks);
    }

    public void scrollToAnnualIncome() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Annual Income");
        } else {
            scrollElement(annualIncome, "up", mainSourceOfIncome, 3000, 10);
        }

    }

    public void clearAccountNumber() throws Exception {
        clear(accountNumberTextBox);
        clickStaticText("IFSC Code");
    }

    public void enterAccountNumber(String accountNo) {
        clear(accountNumberTextBox);
        sendKeys(accountNumberTextBox, accountNo);
    }

    public void clearIfscCode() throws Exception {
        clear(ifscCodeTextBox);
        clickStaticText("IFSC Code");
    }

    public void enterIfscCode(String ifscCode) {
        clear(ifscCodeTextBox);
        sendKeys(ifscCodeTextBox, ifscCode);
    }

    public void scrollDownSelectBank() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
//                swipe(170, 607, 163, 506, 100);
            swipe(170, 607, 191, 231, 100);
            if (isVisible(ucoBank)) {
                break;
            }
        }
    }

    public void selectBankName(String bankName) throws Exception {
        click(bankNamedropDown);
//        scrollElement(ucoBank,"up",axisBank);
        scrollDownSelectBank();
        clickByText(bankName);
    }

    public void clickCheckBoxInBackAcScreen() throws Exception {
        if (!nameMatchWithPanCheckBox.isSelected()) {
            click(nameMatchWithPanCheckBox);
        }
    }

    public void clickOnContinue() {
        click(continueBtn);
    }

    public void selectDobOfNominee(String dob) throws Exception {
        click(nomineeDob);
        clickByText(dob);
        clickByText("OK");
        clickStaticText("Nominee Name");
    }

    public void scrollGuardiansDOB() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            andScrollToElementUsingUiScrollable("text", "Guardian’s Date of Birth (must be adult)");
            andIosScroll(guardianDobDtPic, "up", guardianIsNomineesDropDwn);
        } else {
            scrollElement(guardianDobDtPic, "up", guardianIsNomineesDropDwn, 3000, 10);
        }
    }

    public void clickOnOccupationTab() {
        click(occupationTab);
    }

    public void clickAboutTab() {
        click(aboutMeTab);
    }

    public void clickHeaderTab(String tabName) throws Exception {
        String tab = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            tab = "//*[@text='" + tabName + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            tab = "(//XCUIElementTypeOther[@name='✓ " + tabName + "'])[3]";
        }
        clickIfExist(getElement(tab));
    }

    public void selectNomineeRelationship() throws Exception {
        click(nomineeIsMyTxtBox);
        clickByText("Brother");
    }

    public void enterNomineeName() throws Exception {
        sendKeys(nomineeNameTxtBox, "Avishek Samal");
        clickStaticText("Nominee Detail");
    }

    public void clickPhotoTab() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            clickByText("Photo");
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickByText("5 Photo");
        }
    }

    public void uploadPan() throws Exception {
//        click(uploadPan);
        click(captureBtn);
//        click(takePhoto);
        click(closeCamera);
        clickByText("Yes");
    }

    public void uploadPhoto() {
        click(uploadPhoto);
        click(captureBtn);
        click(takePhoto);
    }

    public void uploadSignature() {
        click(uploadSign);
        click(captureBtn);
        click(takePhoto);
    }

    public void keepPANAsEmpty() throws Exception {
        clear(panNum);
        clickStaticText("PAN");

    }

    public void clickResendOTPEmail() {
        click(resendOtpMail);
    }

    public void clickStartNewApplication() throws Exception {
        if (isVisible(startNewApplication)) {
            click(startNewApplication);
            click(closeStartNewAppli);
            click(startNewApplication);
            click(wantToRestart);
            Thread.sleep(2000);
            clickByText("Start Onboarding");
        } else {
            clickByText("Start Onboarding");
        }

    }

    public void clickUploadPan() {
        click(uploadPan);
    }

    public void clickUploadPhoto() {
        click(uploadPhoto);
    }

    public void clickUploadSign() {
        click(uploadSign);
    }

    public void giveLocation() {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (isVisible(allowLocation)) {
                click(allowLocation);
            }
        }
    }

    public void closeSignPopup() {
        click(signSamplePopup);
    }
}
