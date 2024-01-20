#@Regression @HamburgerMenuRegression
Feature: HamburgerMenu Scenarios

  @Smoke @HamburgerMenuSmoke
  Scenario: Change Profile Name
    Given user login with user "6888888888 | 6888888888"
    And application launched successfully
    And user click on hamburger menu
    When user click on my avatar icon
    And user verify static text "Mobile Number "
    When user click static text "Change Display Name"
    Then user verify static text "Update Display Name"
    When user edit profile name as one character
    Then verify validation error "Atleast 2 characters required"
    When user click on close icon in update display name screen
    Then user verify static text "My Profile"
    When user click static text "Change Display Name"
    When user rename profile name
    When user go back from "My Profile" screen
    Then user verify partial static text "Hello"

  Scenario: User try to delete Account
    Given application launched successfully
    And user click on hamburger menu
    When user click on my avatar icon
    When user click by text "Delete Account"
    Then user verify static text "Why do you want to delete the account?"
    And user verify static text "We are sad to see you go. Please let us know why you decided to leave us."
    When user choose other options in delete account screen
    And user write some reason
    And user click static text "Once I delete my account, all my account related data with Floatr will be deleted completely and it can’t be restored. I consent to delete my account.  "
    When user click by text "Cancel"
    When user click on add photo

  @Smoke @HamburgerMenuSmoke
  Scenario: KYC tab is functional in hamburger menu
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "KYC"
    Then user verify partial static text "Investor Onboarding"
    When user go back from "KYC" screen
    Then user verify partial static text "Hello"


  Scenario: Manage SIP's tab is functional
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "Manage SIPs"
    Then user verify static text "My SIPs"
    And user verify text "All SIPs"
    And user verify text "Mutual Funds"
    And user verify text "Gold & Silver"
    And user go back from "My SIPs" screen
    Then user verify partial static text "Hello"

  @IdentificationIssue
  Scenario: Verify Faq tab is functional
    Given application launched successfully
    And user click on hamburger menu
    When user click by text "FAQ"

  Scenario: Rewards is functional
#    Given user login with user "6888888888 | 6888888888"
    And application launched successfully
    And user click on hamburger menu
    When user click by text "Rewards"
    Then user verify static text "Total Floatr coins earned till date"
    And user verify static text "BRONZE MEMBER"
    And user verify static text "Rewards Ledger"
    When user click by text "Gold Rewards"
    Then user verify static text "hgiuu"
    And user verify static text "08 Dec, 2023 06:54 PM"
    And user verify static text "₹20.00"
    And user verify static text "0.0030 gm Gold"
    When user click by text "Floatr Coins"
    Then user verify static text "regretttt"
    And user verify static text "08 Dec, 2023 07:02 PM"
    And user verify static text "45 Coins"
    When user go back from "My Rewards" screen
    Then user verify partial static text "Hello"

  @Smoke @HamburgerMenuSmoke
  Scenario: Support link is functional
    Given application launched successfully
    And user click on hamburger menu
    And user verify text "Support"

  @IdentificationIssue @Smoke @HamburgerMenuSmoke
  Scenario: Feedback tab is functional
    Given application launched successfully
    And user click on hamburger menu
    And user verify text "Feedback"
    And user verify static text "Enjoying our services ?"
    And user verify static text "We'd love your feedback so we keep getting better"
    And user click on five star

  @Smoke @HamburgerMenuSmoke
  Scenario: Verify refer via message in english is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Refer"
    And user verify partial static text "My Referral Code :"
    And user verify partial static text "Refer your friend to Floatr App"
    When user click by text "Message"
    And user close the select language slider
    And user click by text "Message"
    When user click static text "English"
    And user wait for "5000" milli second
    And user verify static text "New Message"


  Scenario: Verify refer via message in hindi is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Refer"
    When user click by text "Message"
    When user click static text "Hindi"
    And user wait for "5000" milli second
    And user verify static text "New Message"

  Scenario: Verify refer via facebook in english is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Refer"
    When user click by text "Facebook"
    When user click static text "English"
    And user wait for "3000" milli second
    Then user verify ‎facebook.com, secure

  Scenario: Verify refer via facebook in hindi is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Refer"
    When user click by text "Facebook"
    When user click static text "Hindi"
    And user wait for "3000" milli second
    Then user verify ‎facebook.com, secure

  Scenario: Verify private policy is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Privacy Policy"
    And user verify static text "Updated On 23 Nov, 2022"
    And user verify partial static text " Floatr (ValueFloat Technologies Private Limited) (“we” or “us” or “our” or the “Company”) respects the privacy of its members"
    And user scroll to Address for Privacy Related Questions
    And user verify static text "13. Notifications of Changes"
    And user verify partial static text "1. We may update this Privacy Policy at any time, with or without advance notice."
    When user go back from "Privacy Policy" screen
    Then user verify partial static text "Hello"

  @IdentificationIssue
  Scenario: Verify terms of use is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Terms of use"


  Scenario: Verify logout is functional
    Given application launched successfully
    And user click on hamburger menu
    And user click by text "Logout"
    When user click by text "No"
    Then user verify partial static text "Hello"
    When user click on notification icon in dashboard
    When user go back from "Notifications" screen
    Then user verify partial static text "Hello"
    When user click on spendings on dashboard
    Then user verify static text "My Transactions"

  Scenario: Verify invest now link is functional in wealth screen
    Given application launched successfully
    When user click on my wealth
    Then user click static text "Invest Now"
    When user close where do you want to invest pop up
    And user click static text "Invest Now"
    When user click by text "Mutual Funds"
    Then user go back from "Mutual Funds" screen
    And user click static text "Invest Now"
    When user click by text "Gold & Silver"
    Then user go back from "Digital Gold" screen
    And user click on my wealth
    And user click static text "Invest Now"
    When user click by text "NPS"
    Then user go back from "NPS" screen

  Scenario: Verify my systematic plan (SIP) is functional in dashboard
    Given application launched successfully
    When user click on my wealth
    And user click on my systematic plan
    Then user verify static text "My SIPs"


  Scenario: Verify create a new saving goal is functional in dashboard
    Given application launched successfully
    When user click on my wealth
    When user click on create a new saving goal
    Then user verify static text "Select a goal to proceed"


  Scenario: Verify short term saving is functional
    Given application launched successfully
    When user click on my wealth
    And user click by text "Better than Savings Account Invest in liquid funds for 50% to 100% higher returns than savings account"
    Then user verify static text "Mutual Fund Schemes"
    And user verify text "Categories"
    And user verify text "AMC"
    And user verify text "Returns"
    When user go back from "Mutual Fund Schemes" screen
    Then user verify partial static text "Wealth"
    When user click by text "Save for Emergency with Full Liquidity Ideal solution for money that you want to deposit for 3 to 6 months"
    Then user verify static text "SBI Magnum Ultra Short Duration Fund (G)"
    And user go back from "Mutual Fund Schemes" screen
    When user scroll to short term deposits
    And user click by text "Short Term Deposits at Higher Returns Invest in Money Market Fund & better returns than Bank Deposits"
    And user go back from "Mutual Fund Schemes" screen
    And user scroll to view invest for jewellery
    When user click on invest for jewellery
    Then user verify static text "Gold SIP"
    And user verify static text "Create SIP"
