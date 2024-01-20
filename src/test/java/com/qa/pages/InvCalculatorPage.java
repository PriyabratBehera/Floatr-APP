package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class InvCalculatorPage extends ProfilePage{

    GlobalParams globalParams = new GlobalParams();
    TestUtils testUtils=new TestUtils();

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personal Financial Planners\"]/following::XCUIElementTypeOther[4]")
    private MobileElement incomeTaxPlan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]")
    private MobileElement setFinancialGoal;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Salary\"])[1]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement grossSalary;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you get rent from a\n" +
            "residential property?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement rentFromResiYes;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you get rent from a\n" +
            "residential property?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement rentFromResiNo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Have you taken home loan\n" +
            "for this property?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement takenHomeLoanYes;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement rentReceived;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Property Tax Paid\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement propertyTaxPaid;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Any Other Income\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement anyOtherIncomeBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Consulting Income\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement consultingIncomeBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Basic Salary + DA\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement basicSalPlusDa;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rental Income\"]")
    private MobileElement rentalIncome;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rental Income\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement informIcon;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Salary\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForSalary;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Additional Income, if any\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForAdiIncome;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HRA Benefits\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForHraBenefit;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Leave Travel Benefits (LTA)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForTravelBenefit;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investments & Insurance\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForInvAndIns;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" NPS Investments\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForNpsInv;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Health Insurance for Family\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForHealthInsFam;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Health Insurance for Parents\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForHealthInsPar;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Home Loan - Self Occupied\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForHmLoanSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Rental Income\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeICRenSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Gross Salary\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeICGroSaSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Additional Income\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeICAdiIncSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Home Rent Allowance (HRA)\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeICHraSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Leave Travel Allowance (LTA)\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeILtaSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investments & Insurance \"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeIcInvAndInsSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"National Pension System (NPS)\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeIcNpsInvSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Health- for Self & Family\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeIcHealthSeAndFamSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Health- for Parents\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeIcHealthParSc;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Home Loan for Self Occupied\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeIcHmLoanSelSc;


    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you paying home rent?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement aryYouPayingHmRentYes;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you claiming LTA?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement areYouClaimingLTAYes;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you stay in a metro city?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement tayInMetroCity;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual HRA Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualHarReceived;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Paid\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement rentPaid;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Paid\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualLTA;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Travel Cost\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement travelCost;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Total of PF, PPF,\n" +
            "Sukanya Samriddhi,\n" +
            "ELSS MF, NSC etc']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement ppfAmountBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Life Insurance\n" +
            "Premiums']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement lifeInsuranceBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kid’s School Tuition\n" +
            "Fees']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement tuitionFeesBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Self Contribution to\n" +
            "NPS']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement selfContributionNps;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Corporate Contribution\n" +
            "to NPS']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement corporateContribution;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' Have you got medical\n" +
            "insurance for self & family?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement medicalInsForSelfYes;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' Is any one of you aged\n" +
            "above 60 years?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement ageAbove60Yr;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Do you pay for medical\n" +
            "insurance of parents?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement medicalInsForParent;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Is any of the insured parent\n" +
            "aged above 60 years?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement parentAgeAbove60;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Medical Insurance\n" +
            "Premium for self &\n" +
            "family']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement medicalInsForSelfBx;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Medical Insurance\n" +
            "Premium for parents']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement medicalInsForParentsBx;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\" Rental Income\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Do you have loan for self\n" +
            "occupied home?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement doYouHaveLoanForSelfYs;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual interest\n" +
            "payment on this loan\n" +
            "(upto ₹2 Lakhs)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualIntForLoanBx;

    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual principal\n" +
            "payment on this loan']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualPrincipleForLoanBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual interest paid\n" +
            "on property that is\n" +
            "rented out']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualInsPaidForLoanBx;

    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Tax Evaluation\"]")
    private MobileElement taxEvaluation;
    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement exemption;
    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Income Tax Break-up\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement closeIcnIncTaxbreakUp;
    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Premium starts at only ₹1,465 + GST for 1L cover\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/parent::XCUIElementTypeOther/ancestor::XCUIElementTypeScrollView/ancestor::XCUIElementTypeOther[3]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    private MobileElement backIcnMedicalIns;
    public void clickIncomeTaxPlan() throws Exception {
        if (!isVisible(incomeTaxPlan)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Income Tax\n" +
                        "Planner");
            } else {
                andIosScroll(incomeTaxPlan, "up", setFinancialGoal);
            }
            click(incomeTaxPlan);
        } else {
            click(incomeTaxPlan);
        }
    }
        public void enterGrossSalary(String salaryAmt) throws Exception {
            click(grossSalary);
            clear(grossSalary);
            sendKeys(grossSalary,salaryAmt);
            clickStaticText("Salary");
        }
    public void getRentFromResiYes(){
        click(rentFromResiYes);
    }
    public void getRentFromResiNo(){
        click(rentFromResiNo);
    }
    public void takenHomeLoanYes(){
        click(takenHomeLoanYes);
    }
    public void enterRentReceived(String amt) throws Exception {
        click(rentReceived);
        clear(rentReceived);
        clickStaticText("Rental Income");
        sendKeys(rentReceived,amt);
        clickStaticText("Rental Income");
    }
    public void enterPropertyTaxPaid(String amt) throws Exception {
        click(propertyTaxPaid);
        clear(propertyTaxPaid);
        clickStaticText("Rental Income");
        sendKeys(propertyTaxPaid,amt);
        clickStaticText("Rental Income");
    }
    public void ScrollToAnyOtherIncome() throws Exception {
            andIosScroll(anyOtherIncomeBx,"up",rentalIncome);

    }
    public void enterConsultingIncome(String amt) throws Exception {
        click(consultingIncomeBx);
        clear(consultingIncomeBx);
        clickStaticText("Rental Income");
        sendKeys(consultingIncomeBx,amt);
        clickStaticText("Rental Income");
    }
    public void enterAnyOtherIncome(String amt) throws Exception {
        click(anyOtherIncomeBx);
        clear(anyOtherIncomeBx);
        clickStaticText("Additional Income, if any");
        click(anyOtherIncomeBx);
        sendKeys(anyOtherIncomeBx,amt);
        clickStaticText("Additional Income, if any");
    }
    public void enterBasicSalPlusDa(String amt) throws Exception {
        click(basicSalPlusDa);
        clear(basicSalPlusDa);
        clickStaticText("Rental Income");
        sendKeys(basicSalPlusDa,amt);
        clickStaticText("Salary");
    }
    public void clickInformIcon(){
        click(informIcon);
    }
    public void closeRentalInScreen(){
        click(closeICRenSc);
    }
    public void areYouPayingHomRentYes(){
        click(aryYouPayingHmRentYes);
    }
    public void areYouClaimingLTAYes(){
        click(areYouClaimingLTAYes);
    }
    public void stayMetroCityYes(){
        click(tayInMetroCity);
    }

    public void enterAnnualHraReceive(String amt) throws Exception {
        click(annualHarReceived);
        clear(annualHarReceived);
        clickStaticText("HRA Benefits");
        sendKeys(annualHarReceived,amt);
        clickStaticText("HRA Benefits");
    }
    public void enterRentPaid(String amt) throws Exception {
        click(rentPaid);
        clear(rentPaid);
        clickStaticText("HRA Benefits");
        sendKeys(rentPaid,amt);
        clickStaticText("HRA Benefits");
    }
    public void enterAnnualLta(String amt) throws Exception {
        click(annualLTA);
        clear(annualLTA);
        clickStaticText("Leave Travel Benefits (LTA)");
        sendKeys(annualLTA,amt);
        clickStaticText("Leave Travel Benefits (LTA)");
    }
    public void enterTravelCoast(String amt) throws Exception {
        click(travelCost);
        clear(travelCost);
        clickStaticText("Leave Travel Benefits (LTA)");
        sendKeys(travelCost,amt);
        clickStaticText("Leave Travel Benefits (LTA)");
    }
    public void enterPpfAmount(String amt) throws Exception {
        click(ppfAmountBx);
        clear(ppfAmountBx);
        clickStaticText("Investments & Insurance");
        sendKeys(ppfAmountBx,amt);
        clickStaticText("Investments & Insurance");
    }
    public void enterLifeInsuranceAmt(String amt) throws Exception {
        click(lifeInsuranceBx);
        clear(lifeInsuranceBx);
        clickStaticText("Investments & Insurance");
        sendKeys(lifeInsuranceBx,amt);
        clickStaticText("Investments & Insurance");
    }
    public void enterTuitionFees(String amt) throws Exception {
        click(tuitionFeesBx);
        clear(tuitionFeesBx);
        clickStaticText("Investments & Insurance");
        sendKeys(tuitionFeesBx,amt);
        clickStaticText("Investments & Insurance");
    }
    public void enterSelfContribution(String amt) throws Exception {
        click(selfContributionNps);
        clear(selfContributionNps);
        clickStaticText(" NPS Investments");
        sendKeys(selfContributionNps,amt);
        clickStaticText(" NPS Investments");
    }
    public void enterCorporateContribution(String amt) throws Exception {
        click(corporateContribution);
        clear(corporateContribution);
        clickStaticText(" NPS Investments");
        sendKeys(corporateContribution,amt);
        clickStaticText(" NPS Investments");
    }
    public void medicalInsForSelfYs(){
        click(medicalInsForSelfYes);
    }
    public void ageAbove60Ys(){
        click(ageAbove60Yr);
    }
    public void enterMedicalIns(String amt) throws Exception {
        click(medicalInsForSelfBx);
        clear(medicalInsForSelfBx);
        clickStaticText("Health Insurance for Family");
        sendKeys(medicalInsForSelfBx,amt);
        clickStaticText("Health Insurance for Family");
    }
    public void medicalInsPareYs(){
        click(medicalInsForParent);
    }
    public void parentAgeAbo60(){
        click(parentAgeAbove60);
    }
    public void medicalInsParents(String amt) throws Exception {
        click(medicalInsForParentsBx);
        clear(medicalInsForParentsBx);
        clickStaticText(" Health Insurance for Parents");
        sendKeys(medicalInsForParentsBx,amt);
        clickStaticText(" Health Insurance for Parents");
    }
    public void doYouHaveLoanYs(){
        click(doYouHaveLoanForSelfYs);
    }
    public void enterAnnualIntPayment(String amt) throws Exception {
        click(annualIntForLoanBx);
        clear(annualIntForLoanBx);
        clickStaticText("Home Loan - Self Occupied");
        sendKeys(annualIntForLoanBx,amt);
        clickStaticText("Home Loan - Self Occupied");
    }
    public void enterAnnualPrinciplePayment(String amt) throws Exception {
        click(annualPrincipleForLoanBx);
        clear(annualPrincipleForLoanBx);
        clickStaticText("Home Loan - Self Occupied");
        sendKeys(annualPrincipleForLoanBx,amt);
        clickStaticText("Home Loan - Self Occupied");
    }
    public void enterAnnualIntPaid(String amt) throws Exception {
        clear(annualInsPaidForLoanBx);
        clickStaticText(" Home Loan - Rented out");
        sendKeys(annualPrincipleForLoanBx,amt);
        clickStaticText(" Home Loan - Rented out");
    }
    public void scrollToExemption() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            andScrollToElementUsingUiScrollable("text","Exemptions");
        }
        else{
            scrollToElement(taxEvaluation,"up",exemption);
        }
    }
    public void clickExemptionDrDwn(){
        click(exemption);
    }
    public void closeIncTaxBreakUp(){
        click(closeIcnIncTaxbreakUp);
    }
    public void goBackMedicalInsSc(){
        click(backIcnMedicalIns);
    }

    public void clickImfIcForSalary(){
        click(infoIcnForSalary);
    }
    public void closeImfIcForSalary(){
        click(closeICGroSaSc);
    }
    public void clickImfIcAdiInc(){
        click(infoIcnForAdiIncome);
    }
    public void closeImfIcForAdiInc(){
        click(closeICAdiIncSc);
    }
    public void clickImfIcHraBani(){
        click(infoIcnForHraBenefit);
    }
    public void closeImfIcForLtaBani(){
        click(closeICHraSc);
    }
    public void clickImfIcLtaBani(){
        click(infoIcnForTravelBenefit);
    }
    public void closeImfIcForHraBani(){
        click(closeILtaSc);
    }
    public void clickImfIcInvAndIns(){
        click(infoIcnForInvAndIns);
    }
    public void closeImfIcForInvAndIn(){
        click(closeIcInvAndInsSc);
    }
    public void clickImfIcNpsInv(){
        click(infoIcnForNpsInv);
    }
    public void closeImfIcForNpsInv(){
        click(closeIcNpsInvSc);
    }
    public void clickImfIcHealthIns(){
        click(infoIcnForHealthInsFam);
    }
    public void closeImfIcForHealthIns(){
        click(closeIcHealthSeAndFamSc);
    }
    public void clickImfIcHealthInsPar(){
        click(infoIcnForHealthInsPar);
    }
    public void closeImfIcForHealthInsPar(){
        click(closeIcHealthParSc);
    }
    public void clickImfIcHmLoan(){
        click(infoIcnForHmLoanSc);
    }
    public void closeImfIcForHmLoan(){
        click(closeIcHmLoanSelSc);
    }
    }

