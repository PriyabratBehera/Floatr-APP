#@Regression @MFBasketRegression
Feature: MutualFund Basket

  Scenario: Verify UI Elements of MF Basket Landing Screen
    Given user login with user "6123980123 | 6123980123"
    And application launched successfully
    When user click on gift yourself basket
    And user wait for "10000" milli second
    Then user verify static text "Gift Yourself"
    And user verify static text "Gift the best gift to Yourself"
    And user verify static text "Portfolio Performance"
    And user verify static text "*Annualised returns of the suggested asset allocation"
    And user verify static text "Portfolio Detail"
    And user verify static text "Schemes"
    And user verify static text "Allocation"
    When user scroll to view Disclaimer
    Then user verify static text "Basic Information"
    And user verify static text "Preferred Tenure"
    And user verify static text "Risk Category"
    And user verify static text "Minimum One-Time"
    And user verify static text "Minimum SIP"
    And user verify static text "Lockin Applicable"
    And user verify static text "Lockin Period"
    When user click by text contains "Aditya Birla Sun Life Frontline Equity"
    Then user verify static text "Fund Performance"
    And user verify static text "Fund Information"
    When user go back from "Scheme Detail" screen
    And user go back from "Investing For Gifting" screen
    Then user verify partial static text "Hello"

  Scenario: Calculation of Returns of MF Basket Investment
    Given application launched successfully
    And user click on gift yourself basket
    When user click by text "Calculate My Returns"
    And user select One Time radio button
    And user enter investment amount as "10000"
    And user click by text "3Y"
    Then user verify static text "Investment of ₹10,000 could be: "
    And user verify static text " ₹13,404.6 (+10.26%)"
    When user select Monthly SIP radio button
    Then user verify static text " ₹4,23,060.26 (+10.26%)"
    When user enter investment amount as "8000"
    And user click by text "5Y"
    Then user verify static text " ₹6,00,243.67 (+8.53%)"
    And user click on close icon in Returns Calculator
    And user click by text "Calculate My Returns"
    When user click by text "Done"
    Then user verify static text "Investing For Gifting"

  @Validation @MFBasketValidation
  Scenario: Validation in Personalise Your Financial Goal screen
#    Given user login with user "6123980123 | 6123980123"
    Given application launched successfully
    And user click by text "Goals"
    And user delete existing goal
    And user click on gift yourself basket
    When user click by text "Invest One Time"
    When user click by text "Continue"
    Then verify validation error "Amount is required"
    And verify validation error Amount is required in personal financial goal screen
    And verify validation error "This field is required"
    And user enter goal name in name of my goal input box as "RetirementGoal*"
    And user enter target goal amount as "50000"
    And user enter existing savings for this goal as "50001"
    And user enter number of years to achieve this goal as "1"
    When user click by text "Continue"
    Then verify validation error "Goal amount must be greater than savings"
    And verify validation error "Invalid characters in the name"
    And verify validation error "Year must be between 2 and 50"
    And user enter number of years to achieve this goal as "51"
    When user click by text "Continue"
    Then verify validation error "Year must be between 2 and 50"
    And user enter goal name in name of my goal input box as "RetirementGoal"
    And user enter target goal amount as "500000"
    And user enter existing savings for this goal as "50000"
    And user enter number of years to achieve this goal as "2"
    When user click by text "Continue"
    Then user verify static text "₹16,921 /month"
    And user verify static text "(At an expected return of 8.53% per annum)"
    And user verify static text "Considering inflation of 6%, you should invest"
    And user verify static text "₹19,292 /month"
    When user close investment needed for this goal screen
    Then user click by text "Continue"
    When user click by text "Continue to Invest"
    And user wait for "5000" milli second
    Then user go back from "Gift Yourself" screen
    And user click static text "I am investing for a new financial goal"
    And user verify static text " Personalise your financial goal"

  @Validation @MFBasketValidation
  Scenario: Validation in One Time Investment screen
    Given application launched successfully
    And user click on gift yourself basket
    When user click by text "Invest One Time"
    And user click static text "I am investing for a new financial goal"
    And user enter goal name in name of my goal input box as "RetirementGoal"
    And user enter target goal amount as "50000"
    And user enter existing savings for this goal as "5000"
    And user enter number of years to achieve this goal as "2"
    When user click by text "Continue"
    And user click by text "Continue to Invest"
    And user wait for "18000" milli second
    Then verify validation error "Goal is already created with this name"
    And user go back from "Gift Yourself" screen
    And user click by text "Invest One Time"
    And user select goal for invest gifting goal
    And user enter MF basket invest amount lower than minimum amount
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing  "
    And user click by text "Continue"
    Then verify validation error Amount must be greater than or equal to min amount
    When user enter MF basket invest amount higher than minimum amount
    And user click by text "Continue"
    Then verify validation error "Amount must be less than or equal to 99999999"

  @Smoke @MFBasketSmoke
  Scenario: One Time Investment in MF Basket
#    Given user login with user "6123980123 | 6123980123"
    Given application launched successfully
    And user click on gift yourself basket
    When user click by text "Invest One Time"
    Then user select goal for invest gifting goal
    And user click by text "₹15,000"
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing  "
    When user click by text "Continue"
    And user wait for "3000" milli second
    And user click by text "Pay Now"
    And user wait for "10000" milli second
    And user enter otp for invest in mutualFund
    And user click by text "Confirm Order"
    And user wait for "30000" milli second
    And user click on Netbanking All Indian banks
    And user click button text "Pay Now"
    And user wait for "5000" milli second
    And user click button text "Success"
    And user wait for "16000" milli second
    Then user verify static text "Order Submitted"
    And user verify partial static text "Units for this purchase will be allotted at"
    When user click static text "View Transaction History"
    Then user verify static text "History"

  Scenario:Create a Goal For Monthly Investment
    Given application launched successfully
    And user click by text "Goals"
    And user delete existing goal
    And user click on basket which have monthly investment options
    When user click by text "Invest Monthly"
    And user enter goal name in name of my goal input box as "RetirementGoal"
    And user enter target goal amount as "1000000"
    And user enter existing savings for this goal as "60000"
    And user enter number of years to achieve this goal as "10"
    And user click by text "Continue"
    Then user click by text "Continue to Invest"
    And user wait for "2000" milli second
    And user enter MF basket invest amount lower than minimum amount
    When user click by text "Continue"
    Then verify validation error Amount must be greater than or equal to min amount
    And user verify partial static text "Minimum SIP duration is"
    And user verify static text "This field is required"
    When user enter MF basket invest amount higher than minimum amount
    And user click by text "Continue"
    Then user verify static text "Amount must be less than or equal to 1999999"

  @Validation @MFBasketValidation
  Scenario: Validation in Monthly Investment in MF Basket
    Given application launched successfully
    And user click on basket which have monthly investment options
    When user click by text "Invest Monthly"
    And user select goal for invest tax saving goal
    And user enter MF basket invest amount lower than minimum amount
    And user click static text "Enter any other duration"
    And user enter investment duration as "1"
    And user click by text "Continue"
    Then verify validation error Amount must be greater than or equal to min amount
    And verify validation error "Date cannot be empty"
    And user verify partial static text "Minimum SIP duration is"
    And verify validation error "This field is required"
    When user enter MF basket invest amount higher than minimum amount
    And user enter investment duration as "51"
    And user click by text "Continue"
    Then verify validation error "Amount must be less than or equal to 1999999"
    Then verify validation error "Maximum year cannot exceed 20"

  @Smoke @MFBasketSmoke
  Scenario: Monthly Investment in MF Basket
    Given application launched successfully
    And user click on basket which have monthly investment options
    When user click by text "Invest Monthly"
    And user select goal for invest tax saving goal
    And user click by text "₹9,000"
    And user select first investment date
    And user click by text "10Y"
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing  "
    And user click by text "Continue"
    And user wait for "10000" milli second
    And user click by text "Authorise Auto-Debit"
    And user wait for "30000" milli second
    And user do payment
    And user enter otp for invest in mutualFund
    And user click by text "Confirm Order"
    And user wait for "3000" milli second
    Then user verify static text "SIP Created Partially"

  @Validation @MFBasketValidation
  Scenario: Verify OTP Validation during Mutual Fund Basket Investment
    Given application launched successfully
    And user click on basket which have monthly investment options
    When user click by text "Invest One Time"
    And user select goal for invest tax saving goal
    And user click by text "₹15,000"
    And user click static text "I / We have read the related Scheme Document of the selected fund before investing  "
    And user click by text "Continue"
    And user click by text "Pay Now"
    When user enters invalid otp for purchase MF Scheme
    And user click by text "Confirm Order"
    Then user verify text "Invalid OTP"
    And user wait for "4000" milli second
    When user click by text "Resend OTP"
    And user wait for "180000" milli second
    When user click by text "Resend OTP"
    And user wait for "500" milli second
    And user verify text "OTP has been sent to mobile and email."
    And user wait for "180000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    Then user verify text "OTP is expired. Please click on resend OTP"