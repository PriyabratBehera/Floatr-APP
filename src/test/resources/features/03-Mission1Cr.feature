#@Regression @Mission1CrRegression
Feature: Mission 1 Cr Scenarios

  Scenario: Verify become a crorepati banner is functional
    Given user login with user "7272727272 | 7272727272"
    And application launched successfully
    And user scroll to view become a crorepati
    When user click on become a crorepati
    Then user verify with only two hundred rupees a day
    And user verify static text "1st step is to believe you can achieve this goal"
    And user verify static text "What do I need to do?"
    And user verify text "How should I start?"
    And user scroll to view where I should invest
    And user verify static text "Where should I invest?"
    And user verify text "Invest for this Goal"
    When user go back from "Mission ₹1 Crore" screen
    Then user verify partial static text "Hello"

  Scenario: Verify invest for this goal link is functional in investment maturity calculator screen
    Given application launched successfully
    And user scroll to view become a crorepati
    When user click on become a crorepati
    And user click on Let's Calculate
    And user click by text "Invest for this Goal"
    Then user verify static text "Start Investment in Portfolio"

  Scenario: Verify let's calculate link is functional
    Given application launched successfully
    And user scroll to view become a crorepati
    And user click on become a crorepati
    When user click on Let's Calculate
    And user wait for "3000" milli second
    Then user verify static text "Investment Maturity Calculator"
    And user verify static text "Try different values to evaluate the results"
    And user verify static text "Number of years I want to invest for this goal"
    And user verify default value number of years I want to invest for this goal
    And user verify static text "Investment per month (₹)"
    And user verify default value invest per month
    And user verify static text "Every year I will increase my investment by (%)"
    And user verify default value Every year I will increase my investment by
    And user verify static text "Expected annual rate of return on investment (% RoI)"
    And user verify default value Expected annual rate of return on investment
    And user verify static text "Expected corpus at the time of maturity"
    And user verify static text "My Investment"
    And user verify static text "Interest Earned"

#  @Smoke @Mission1CrSmoke
  Scenario: Verify user calculate investment maturity
    Given user login with user "7272727272 | 7272727272"
    And application launched successfully
    And user scroll to view become a crorepati
    And user click on become a crorepati
    And user click on Let's Calculate
    And user wait for "3000" milli second
    When user change the default value of number of years I want to invest to "8"
#    And user click static text "Investment Maturity Calculator"
    And user click on Calculate
    Then user verify expected maturity amount is "₹12,26,773"
    And user verify my investment amount is "₹8,23,387"
    And user verify interest earned is "₹4,03,386"
    And user go back from investment maturity screen
    And user click on Let's Calculate
    And user wait for "3000" milli second
    When user change the default value of invest per month to "6070"
    And user click static text "Investment Maturity Calculator"
    And user click on Calculate
    Then user verify expected maturity amount is "₹1,02,92,849"
    And user verify my investment amount is "₹41,71,958"
    And user verify interest earned is "₹61,20,891"
    And user go back from investment maturity screen
    And user click on Let's Calculate
    And user wait for "3000" milli second
    When user change the default value of every year increase investment to "11"
    And user click static text "Investment Maturity Calculator"
    And user click on Calculate
    Then user verify expected maturity amount is "₹1,10,72,479"
    And user verify my investment amount is "₹46,22,657"
    And user verify interest earned is "₹64,49,822"
    And user go back from investment maturity screen
    And user click on Let's Calculate
    And user wait for "3000" milli second
    When user change the default value of expected annual rate of return investment to "12"
    And user click static text "Investment Maturity Calculator"
    And user click on Calculate
    Then user verify expected maturity amount is "₹1,11,79,131"
    And user verify my investment amount is "₹41,23,847"
    And user verify interest earned is "₹70,55,284"

#  @Validation @Mission1CrValidation
  Scenario: Verify validation in investment maturity calculator screen
    Given user login with user "7272727272 | 7272727272"
    And application launched successfully
    And user scroll to view become a crorepati
    And user click on become a crorepati
    And user click on Let's Calculate
    And user wait for "3000" milli second
    When user change the default value of number of years I want to invest "5"
    And user change the default value of invest per month to "600"
    And user change the default value of every year increase investment to "4"
    And user change the default value of expected annual rate of return investment to "5"
    And user click static text "Investment Maturity Calculator"
    And user click on Calculate
    Then verify validation error "7yr to 50yr"
    And verify validation error "₹6000 to ₹10L"
    And verify validation error "5% to 25%"
    And verify validation error "6% to 15%"
    And user verify partial text "This investment plan is not sufficient"
    And user go back from investment maturity screen
    And user click on Let's Calculate
    When user change the default value of number of years I want to invest it "60"
    And user change the default value of invest per month to "10000000"
    And user change the default value of every year increase investment to "30"
    And user change the default value of expected annual rate of return investment to "20"
    And user click static text "Investment Maturity Calculator"
    And user click on Calculate
    Then verify validation error "7yr to 50yr"
    And verify validation error "₹6000 to ₹10L"
    And verify validation error "5% to 25%"
    And verify validation error "6% to 15%"

#  @Validation @Mission1CrValidation
  Scenario: Verify validation in investing in mission 1Cr goal without KYC
    Given user login with user "9191787807 | 9191787806"
    And application launched successfully
    And user scroll to view become a crorepati
    When user click on become a crorepati
    And user click on Let's Calculate
    And user wait for "4000" milli second
    And user click on invest for this goal
    And user wait for "2000" milli second
    And user scroll to view AuthenticateAndSave
    When user click by text "Authenticate & Save"
    Then user verify static text "Create SIP"
    And user selects monthly SIP date "1st"
    And user verify default SIP duration is two hundred forty months
    And user click "I have read the scheme document of all the schemes in this portfolio before investing  " check box
    And user click "I wish to create an auto-debit mandate for this SIP from my registered bank account  " check box
    When user click by text "Authenticate & Save"
    Then user verify static text "Account Activation Pending"
    And user verify static text "Activate your account to avail all products & features on Floatr"
    When user clicks on Cancel button
    Then user verify static text "Create SIP"
    And user click by text "Authenticate & Save"
    When user clicks on start now button
    Then user verify static text "KYC"
    And user verify static text "Onboarding Process:"

#  @Validation @Mission1CrValidation
  Scenario: Verify validation error while enter otp for invest mission 1Cr goal
    Given user login with user "7272727272 | 7272727272"
    And application launched successfully
    And user scroll to view become a crorepati
    And user click on become a crorepati
    When user click on Let's Calculate
    And user wait for "3000" milli second
    And user click on invest for this goal
    And user wait for "2000" milli second
    And user scroll to view AuthenticateAndSave
    And user selects monthly SIP date "1st"
    And user wait for "2000" milli second
    Then user verify default SIP duration is two hundred forty months
    And user click "I have read the scheme document of all the schemes in this portfolio before investing  " check box
    And user click "I wish to create an auto-debit mandate for this SIP from my registered bank account  " check box
    And user click by text "Authenticate & Save"
    And user wait for "25000" milli second
    And user do payment
    And user wait for "15000" milli second
    And user verify static text "OTP Verification"
    And user verify static text "Enter OTP to Confirm"
    When user enters invalid otp for invest mission oneCr
    And user click by text "Confirm Order"
    Then user verify text "Invalid OTP"
    And user wait for "180000" milli second
    When user click by text "Resend OTP"
    And user wait for "500" milli second
    And user verify text "OTP has been sent to mobile and email."
    And user wait for "180000" milli second
    And user enter otp for invest mission oneCrore
    And user click by text "Confirm Order"
    Then user verify text "OTP is expired. Please click on resend OTP"

  Scenario: Verify invest for this goal link is functional
    Given application launched successfully
    And user scroll to view become a crorepati
    And user click on become a crorepati
    And user click on Let's Calculate
    And user wait for "3000" milli second
    When user click on invest for this goal
    Then user verify static text "Start Investment in Portfolio"
    And user verify static text "Total Monthly SIP Amount"
    And user verify static text "₹6,000"
    And user verify the minimum SIP amount for "HDFC Mid-Cap Opportunities Fund (G)" fund is "₹2,000"
    And user verify the minimum SIP amount for "SBI Contra Fund - Direct Plan (G)" fund is "₹2,000"
    And user verify the minimum SIP amount for "Aditya Birla Sun Life Frontline Equity Fund (G)" fund is "₹1,000"
    And user verify the minimum SIP amount for "ICICI Prudential Value Discovery Fund (G)" fund is "₹1,000"
    And user verify static text "Create SIP"
    When user click by text "Scheme Detail"
    Then user verify static text "Scheme Detail"

#  @Smoke @Mission1CrSmoke
  Scenario: Verify user invest in mission 1Cr goal with complete KYC
    Given application launched successfully
    And user scroll to view become a crorepati
    And user click on become a crorepati
    And user click by text "Invest for this Goal"
    And user wait for "2000" milli second
    And user scroll to view AuthenticateAndSave
    And user selects monthly SIP date "1st"
    And user wait for "2000" milli second
    And user click "I have read the scheme document of all the schemes in this portfolio before investing  " check box
    And user click "I wish to create an auto-debit mandate for this SIP from my registered bank account  " check box
    When user click by text "Authenticate & Save"
#    And user wait for "25000" milli second
    And user do payment
    And user wait for "15000" milli second
    And user enter otp for invest mission oneCrore
    And user click by text "Confirm Order"
    Then user verify static text "SIP Created Partially"
    And user verify static text "SIP Status"
    And user verify SIP status for "HDFC Mid-Cap Opportunities Fund (G)" fund  is "Failed"
    And user verify SIP status for "SBI Contra Fund - Direct Plan (G)" fund  is "Failed"
    And user verify SIP status for "ICICI Prudential Value Discovery Fund (G)" fund  is "Failed"
    And user verify SIP status for "Aditya Birla Sun Life Frontline Equity Fund (G)" fund  is Success
    Then user verify text "Home"
    When user click by text "Failed"
    Then user verify static text "is not available for transaction"
    When user close is not available for transaction pop up
    Then user click static text "View SIPs"
    And user wait for "7000" milli second
    Then user verify static text "My SIPs"
    And user wait for "2000" milli second
    And user verify static text "SIP Amount  ₹1,000"




