package com.qa.stepdef;

import com.qa.pages.InvCalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class InvCalculatorStepDef {

    InvCalculatorPage invCalculatorPage=new InvCalculatorPage();
    @When("user click income tax planner")
    public void userClickIncomeTaxPlanner() throws Exception {
        invCalculatorPage.clickIncomeTaxPlan();
    }

    @And("user enter gross salary as {string}")
    public void userEnterGrossSalaryAs(String salaryAmt) throws Exception {
        invCalculatorPage.enterGrossSalary(salaryAmt);
    }

    @And("the user selects Yes for the question Do you get rent from a residential property?")
    public void theUserSelectsYesForTheQuestionDoYouGetRentFromAResidentialProperty() {
        invCalculatorPage.getRentFromResiYes();
    }

    @And("the user selects Yes for the question Have you taken a home loan from this property?")
    public void theUserSelectsYesForTheQuestionHaveYouTakenAHomeLoanFromThisProperty() {
        invCalculatorPage.takenHomeLoanYes();
    }

    @And("user enter rent received amount as {string}")
    public void userEnterRentReceivedAmountAs(String amt) throws Exception {
        invCalculatorPage.enterRentReceived(amt);
    }

    @And("user enter property tax paid amount as {string}")
    public void userEnterPropertyTaxPaidAmountAs(String amt) throws Exception {
        invCalculatorPage.enterPropertyTaxPaid(amt);
    }

    @And("user scroll to any other income")
    public void userScrollToAnyOtherIncome() throws Exception {
        invCalculatorPage.ScrollToAnyOtherIncome();
    }

    @And("user enter consulting income amount as {string}")
    public void userEnterConsultingIncomeAmountAs(String amt) throws Exception {
        invCalculatorPage.enterConsultingIncome(amt);
    }

    @And("user enter any other income amount as {string}")
    public void userEnterAnyOtherIncomeAmountAs(String amt) throws Exception {
        invCalculatorPage.enterAnyOtherIncome(amt);
    }

    @And("user enter basic salary plus DA as {string}")
    public void userEnterBasicSalaryPlusDAAS(String amt) throws Exception {
        invCalculatorPage.enterBasicSalPlusDa(amt);
    }

    @And("user click on information icon in income tax planner screen")
    public void userClickOnInformationIconInIncomeTaxPlannerScreen() {
        invCalculatorPage.clickInformIcon();
    }

    @And("user close rental income screen")
    public void userCloseRentalIncomeScreen() {
        invCalculatorPage.closeRentalInScreen();
    }

    @And("the user selects Yes for the question Are you paying home rent?")
    public void theUserSelectsYesForTheQuestionAreYouPayingHomeRent() {
        invCalculatorPage.areYouPayingHomRentYes();
    }

    @And("the user selects Yes for the question Are you claiming LTA?")
    public void theUserSelectsYesForTheQuestionAreYouClaimingLTA() {
        invCalculatorPage.areYouClaimingLTAYes();
    }

    @And("the user selects Yes for the question Do you stay in a metro city?")
    public void theUserSelectsYesForTheQuestionDoYouStayInAMetroCity() {
        invCalculatorPage.stayMetroCityYes();
    }

    @And("user enter annual hra received amount as {string}")
    public void userEnterAnnualHraReceivedAmountAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualHraReceive(amt);
    }

    @And("user enter rent paid amount as {string}")
    public void userEnterRentPaidAmountAs(String amt) throws Exception {
        invCalculatorPage.enterRentPaid(amt);
    }

    @And("user enter annual LTA received amount as {string}")
    public void userEnterAnnualLTAReceivedAmountAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualLta(amt);
    }

    @And("user enter travel coast amount as {string}")
    public void userEnterTravelCoastAmountAs(String amt) throws Exception {
        invCalculatorPage.enterTravelCoast(amt);
    }

    @And("user enter total PPf as {string}")
    public void userEnterTotalPPfAs(String amt) throws Exception {
        invCalculatorPage.enterPpfAmount(amt);
    }

    @And("user enter life insurance premium as {string}")
    public void userEnterLifeInsurancePremiumAs(String amt) throws Exception {
        invCalculatorPage.enterLifeInsuranceAmt(amt);
    }

    @And("user enter school tuition fees as {string}")
    public void userEnterSchoolTuitionFeesAs(String amt) throws Exception {
        invCalculatorPage.enterTuitionFees(amt);
    }

    @And("user enter self contribution to nps as {string}")
    public void userEnterSelfContributionToNpsAs(String amt) throws Exception {
        invCalculatorPage.enterSelfContribution(amt);
    }

    @And("user enter corporate contribution to nps as {string}")
    public void userEnterCorporateContributionToNpsAs(String amt) throws Exception {
        invCalculatorPage.enterCorporateContribution(amt);
    }

    @And("the user selects Yes for the question And the user selects Yes for the question  Have you got medical insurance for self & family?")
    public void theUserSelectsYesForTheQuestionAndTheUserSelectsYesForTheQuestionHaveYouGotMedicalInsuranceForSelfFamily() {
        invCalculatorPage.medicalInsForSelfYs();
    }

    @And("the user selects Yes for the question  Is any one of you aged above sixty years?")
    public void theUserSelectsYesForTheQuestionIsAnyOneOfYouAgedAboveSixtyYears() {
        invCalculatorPage.ageAbove60Ys();
    }

    @And("user enter Medical Insurance Premium for self and family as {string}")
    public void userEnterMedicalInsurancePremiumForSelfAndFamilyAs(String amt) throws Exception {
        invCalculatorPage.enterMedicalIns(amt);
    }

    @And("the user selects Yes for the question Medical Insurance Premium for self & family")
    public void theUserSelectsYesForTheQuestionMedicalInsurancePremiumForSelfFamily() {
        invCalculatorPage.medicalInsForSelfYs();
    }

    @And("the user selects Yes for the question Do you pay for medical insurance of parents?")
    public void theUserSelectsYesForTheQuestionDoYouPayForMedicalInsuranceOfParents() {
        invCalculatorPage.medicalInsPareYs();
    }

    @And("the user selects Yes for the question Is any of the insured parent aged above sixty years?")
    public void theUserSelectsYesForTheQuestionIsAnyOfTheInsuredParentAgedAboveSixtyYears() {
        invCalculatorPage.parentAgeAbo60();
    }

    @And("user enter medical insurance premium for parents as {string}")
    public void userEnterMedicalInsurancePremiumForParentsAs(String amt) throws Exception {
        invCalculatorPage.medicalInsParents(amt);
    }

    @And("the user selects Yes for the question Do you have loan for self occupied home?")
    public void theUserSelectsYesForTheQuestionDoYouHaveLoanForSelfOccupiedHome() {
        invCalculatorPage.doYouHaveLoanYs();
    }

    @And("user enter annual interest for loan as {string}")
    public void userEnterAnnualInterestForLoanAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualIntPayment(amt);
    }

    @And("user enter annual principle on this loan as {string}")
    public void userEnterAnnualPrincipleOnThisLoanAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualPrinciplePayment(amt);
    }

    @And("user enter annual interest on property that is rent out as {string}")
    public void userEnterAnnualInterestOnPropertyThatIsRentOutAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualIntPaid(amt);
    }

    @And("user scroll to Exemptions")
    public void userScrollToExemptions() throws Exception {
        invCalculatorPage.scrollToExemption();

    }

    @When("user click on exemption drop down")
    public void userClickOnExemptionDropDown() {
        invCalculatorPage.clickExemptionDrDwn();
    }

    @When("user close income tax break-up screen")
    public void userCloseIncomeTaxBreakUpScreen() {
        invCalculatorPage.closeIncTaxBreakUp();
    }

    @And("user go back from medical insurance screen")
    public void userGoBackFromMedicalInsuranceScreen() {
        invCalculatorPage.goBackMedicalInsSc();
    }

    @And("user click on information icon for salary")
    public void userClickOnInformationIconForSalary() {
        invCalculatorPage.clickImfIcForSalary();
    }
    @And("close gross salary screen")
    public void closeGrossSalaryScreen() {
        invCalculatorPage.closeImfIcForSalary();
    }

    @And("user click on information icon in additional income screen")
    public void userClickOnInformationIconInAdditionalIncomeScreen() {
        invCalculatorPage.clickImfIcAdiInc();
    }

    @And("user close additional income screen")
    public void userCloseAdditionalIncomeScreen() {
        invCalculatorPage.closeImfIcForAdiInc();
    }

    @And("user click on information icon for hra benefits")
    public void userClickOnInformationIconForHraBenefits() {
        invCalculatorPage.clickImfIcHraBani();
    }

    @And("user close hra benefit screen")
    public void userCloseHraBenefitScreen() {
        invCalculatorPage.closeImfIcForHraBani();
    }

    @And("user click on information icon for lta benefits")
    public void userClickOnInformationIconForLtaBenefits() {
        invCalculatorPage.clickImfIcLtaBani();
    }

    @And("user close lta benefit screen")
    public void userCloseLtaBenefitScreen() {
        invCalculatorPage.closeImfIcForLtaBani();
    }

    @And("user click on information icon for investment and insurance")
    public void userClickOnInformationIconForInvestmentAndInsurance() {
        invCalculatorPage.clickImfIcInvAndIns();
    }

    @And("user close investment and insurance screen")
    public void userCloseInvestmentAndInsuranceScreen() {
        invCalculatorPage.closeImfIcForInvAndIn();

    }

    @And("user click on information icon for nps investment")
    public void userClickOnInformationIconForNpsInvestment() {
        invCalculatorPage.clickImfIcNpsInv();
    }

    @And("user close nps investment screen")
    public void userCloseNpsInvestmentScreen() {
        invCalculatorPage.closeImfIcForNpsInv();
    }

    @And("user click on information icon for health insurance for family")
    public void userClickOnInformationIconForHealthInsuranceForFamily() {
        invCalculatorPage.clickImfIcHealthIns();
    }

    @And("user close health insurance for family screen")
    public void userCloseHealthInsuranceForFamilyScreen() {
        invCalculatorPage.closeImfIcForHealthIns();
    }

    @And("user click on information icon for health insurance for parents")
    public void userClickOnInformationIconForHealthInsuranceForParents() {
        invCalculatorPage.clickImfIcHealthInsPar();
    }

    @And("user close health insurance for parents screen")
    public void userCloseHealthInsuranceForParentsScreen() {
        invCalculatorPage.closeImfIcForHealthInsPar();
    }

    @And("user click on information icon for home loan")
    public void userClickOnInformationIconForHomeLoan() {
        invCalculatorPage.clickImfIcHmLoan();
    }

    @And("user close home loan screen")
    public void userCloseHomeLoanScreen() {
        invCalculatorPage.closeImfIcForHmLoan();
    }
}
