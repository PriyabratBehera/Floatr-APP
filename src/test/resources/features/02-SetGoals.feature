@Regression @SetGoalRegression
Feature: Set Goals Scenarios

  Scenario: Verify goals banner is functional in dashboard
    Given user login with user "9191787806 | 9191787806"
    And application launched successfully
    And user wait for "2000" milli second
    When user click on retirement goal on home screen
    Then user verify static text "Goal Category"
    And user verify static text "Retirement"
    When user go back from add financial goal screen
    Then user verify partial static text "Hello"

  Scenario: Verify the UI of set financial Goal Screen
    And application launched successfully
    When user click on More Goals on home screen
    And user verify static text "Select a goal to proceed"
    When user click by text "Rainy Days"
    Then user verify static text "Add Financial Goal"
    And user go back from add financial goal screen
    When user go back from "Set Financial Goals" screen
    Then user verify static text "More Goals"

  Scenario: Verify Goals tab is functional in Set Financial Goals screen
    Given application launched successfully
    And user click on More Goals on home screen
    When user click by text "Retirement"
    Then user verify static text "Retirement"
    And user verify static text "Add Financial Goal"
    And user go back from add financial goal screen
    And user click by text "Property"
    And user verify static text "Property"
    And user go back from add financial goal screen
    And user click by text "Education"
    And user verify static text "Education"
    And user go back from add financial goal screen
    And user click by text "Wedding"
    And user verify static text "Wedding"
    And user go back from add financial goal screen
    When user click by text "Mobile"
    Then user verify static text "Mobile"
    And user go back from add financial goal screen
    And user click by text "Laptop"
    And user verify static text "Laptop"
    And user go back from add financial goal screen
    And user click by text "Gadgets"
    And user verify static text "Gadgets"
    And user go back from add financial goal screen

  @Validation @SetGoalValidation
  Scenario: Verify Validation Error during Goal Creation
    Given user clean up the app data for "9191787806 | 9191787806"
#    And user login with user "9191787806 | 9191787806"
    And application launched successfully
    And user click on More Goals on home screen
    When user click by text "Retirement"
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "0"
    Then verify validation error "Allowed limit is between 1 to 99,99,99,999"
    And user go back from add financial goal screen
    And user wait for "2000" milli second
    And  user click by text "Retirement"
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "1000000000"
    Then verify validation error "Allowed limit is between 1 to 99,99,99,999"
    And user go back from add financial goal screen
    And user wait for "2000" milli second
    And  user click by text "Retirement"
    And user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "22000"
    When user enter amount for Existing Savings for this Goal as "22000"
    Then verify validation error "Should be less than goal"
    And user go back from add financial goal screen
    And user wait for "2000" milli second
    And  user click by text "Retirement"
    When user enter amount for Existing Savings for this Goal as "6000"
    And user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "5000"
    Then verify validation error "Should be greater than savings"
    And user go back from add financial goal screen
    And user wait for "2000" milli second
    And user click by text "Retirement"
    And user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "9000"
    And user enter amount for Existing Savings for this Goal as "5000"
    When user enter amount for Expected Annual Inflation % as "26"
    And user enter annual rate of interest as "2.2"
    And user enter years to achieve this goal as "0"
    Then verify validation error "Must not be more than 25%"
    And verify validation error "Interest rate must be between 2.5% to 30%"
    And verify validation error "Years should be between 1 - 50"
    And user enter annual rate of interest as "31"
    And user enter years to achieve this goal as "51"
    And verify validation error "Interest rate must be between 2.5% to 30%"
    And verify validation error "Years should be between 1 - 50"

  Scenario: Verify UI of financial goals screen before creating a goal
    Given application launched successfully
#    When user click by text "Goals"
    When user click goals on dashboard
    Then user verify text "Ongoing(0)"
    And user verify text "Completed(0)"
    And user verify partial static text "You do not have an active goal"
    And user verify text "Add New Goal"
    When user click by text "Completed(0)"
    Then user verify static text "You are yet to complete a goal"
    When user click by text "Add New Goal"
    Then user verify static text "Select a goal to proceed"

  Scenario: Verify UI of add financial goal screen while create a goal
    And application launched successfully
    And user click on More Goals on home screen
    And user click by text "Retirement"
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "60"
    And user enter amount for Existing Savings for this Goal as "50"
    And user enter annual rate of interest as "2.8"
    And user enter years to achieve this goal as "2"
    And user scroll to view save my goals
    Then user verify static text "Future Inflation Adjusted Value of my Financial Goal"
    And user verify static text "Maturity Value of my existing funds at 2.8% rate of returns"
    And user verify static text "Amount I must invest at 2.8% rate of return to achieve my Financial Goal"
    And user verify static text "What does this calculation mean?"
    And user verify static text "Accumulating a corpus for future requires disciplined investment that gives required return on investment"
    And user verify static text "If Goal amount is high, you should either postpone it by few years or invest in something that gives a better return on investment. However, higher returns means higher risk, so need to choose investments wisely"
    When user click on save my goal
    Then user verify static text "Save my goal as"
    And user verify static text "Goal Name"
    And user verify text "Save Now"
    And user click close icon in save my goal bottom slider

  @Validation @SetGoalValidation
  Scenario: Verify validation while create a name for a goal
    And application launched successfully
    And user click on More Goals on home screen
    And user click by text "Retirement"
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "10000"
    And user enter amount for Existing Savings for this Goal as "2000"
    And user enter years to achieve this goal as "2"
    And user scroll to view save my goals
    And user click on save my goal
    When user enter goal name as "li"
    Then verify validation error "Goal name should be minimum of 3 characters"
    When user enter goal name as "liquidfund123mfgoal123mygoal123"
    Then verify validation error "Goal name should be maximum of 30 characters"
    When user enter goal name as "liquid*"
    Then verify validation error "Please enter valid goal name"

  @Smoke @SetGoalSmoke
  Scenario: Create a financial goal
    Given user clean up the app data for "9191787806 | 9191787806"
#    And user login with user "9191787806 | 9191787806"
    And application launched successfully
    And user click on More Goals on home screen
    And user click by text "Retirement"
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "1000"
    And user enter amount for Existing Savings for this Goal as "110"
    And user enter years to achieve this goal as "1"
    And user scroll to view save my goals
    And user click on save my goal
    And user enter goal name as "MyNewGoal1"
    When user click on Save Now
    And user wait for "3000" milli second
#    Then user verify partial static text "Your financial goal has been"
    And user verify partial text "MyNewGoal1"

  @Smoke @SetGoalSmoke
  Scenario: User rename an exciting financial gaol
    And application launched successfully
    And user click goals on dashboard
    And user click by text contains "MyNewGoal1"
    And user click on edit icon
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "10000"
    And user enter amount for Existing Savings for this Goal as "1100"
    And user enter years to achieve this goal as "2"
    And user scroll to view save my goals
    And user click on Rename button
    And user wait for "3000" milli second
    And user rename goal name as "Automation"
    And user click on Save Now
    And user wait for "3000" milli second
    Then user verify partial text "Automation"
#    Then user verify partial static text "Your Financial goal has been"

  @Validation @SetGoalValidation
  Scenario: Verify user start investment using without KYC user
    Given application launched successfully
    And user click goals on dashboard
    And user click by text contains "Automation"
    When user click by text "Start Investment Now"
    Then user verify static text "Investor KYC"
    And user verify static text "Complete your account setup before start investing"
    When user clicks on Cancel button
    Then user verify text "Start Investment Now"
    When user click by text "Start Investment Now"
    When user clicks on continue button
    Then user verify static text "KYC"
    And user verify static text "Onboarding Process:"

  @Smoke @SetGoalSmoke
  Scenario: Verify start investment now link is functional with completed KYC user
    Given user login with user "6888888888 | 6888888888"
    And application launched successfully
    And user click goals on dashboard
    And user wait for "7000" milli second
#    And user click one financial goal
    And user click by text contains "Rainy Day Funds"
    And user wait for "7000" milli second
    When user click on Start Investment Now
    And user wait for "7000" milli second
    Then user verify text "Where do you want to invest?"
    When user click by text "Mutual Funds"
    And user wait for "4000" milli second
    Then user verify static text "Mutual Funds"
    And user go back from "Mutual Funds" screen
    And user click on Start Investment Now
    When user click by text "Gold & Silver"
    Then user verify static text "Digital Gold"
    And user go back from "Digital Gold" screen
    And user click on Start Investment Now
    And user close where do you want to invest pop up

  Scenario: Verify the goal which is invested in digital gold
    Given user login with user "6888888888 | 6888888888"
    And application launched successfully
    And user click goals on dashboard
    And user wait for "7000" milli second
    And user click on test goal which is invested in digital gold
    And user click by text "Gold"
    Then user verify static text "24K Gold"

  Scenario: Verify the goal which is not invested in mutual fund goal
    Given application launched successfully
    And user click goals on dashboard
    And user wait for "7000" milli second
    And user click on test goal which is invested in digital gold
    Then user verify partial static text "No records found"

  Scenario: Verify the goal which is invested in  mutual fund
    And user wait for "20000" milli second
    And application launched successfully
    And user click goals on dashboard
    And user wait for "7000" milli second
    And user click on laptop goal which is invested in MF goal
    Then user verify static text "Aditya Birla Sun Life Frontline Equity Fund (G)"

  Scenario: Verify the goal which is not invested in digital gold
    Given application launched successfully
    And user click goals on dashboard
    And user wait for "7000" milli second
    And user click on laptop goal which is invested in MF goal
    When user click by text "Gold"
    Then user verify partial static text "No records found"

  Scenario: Verify the UI of the completed tab in financial goal screen
    Given application launched successfully
    And user click goals on dashboard
    When user click by text contains "Completed"
    And user wait for "7000" milli second
    Then user verify congratulations banner
    When user click by text "Add New Goal"
    Then user verify static text "Set Financial Goals"

  @Validation @SetGoalValidation
  Scenario: Verify validation when user Delete invested completed goal
    And user wait for "20000" milli second
    And application launched successfully
    And user click goals on dashboard
    And user wait for "7000" milli second
    And user click by text contains "Completed"
    And user wait for "6000" milli second
    And user click on completed Goal
    And user click on edit icon
    And user wait for "2000" milli second
    When user click on delete icon
    Then user verify static text "This goal can’t be deleted"
    And user verify partial static text "You have investments linked to this Goal This"
    When user click on ok
    Then user verify static text "Add Financial Goal"

  @Validation @SetGoalValidation
  Scenario:Verify validation when user create a goal which is already exists
    Given user login with user "9191787806 | 9191787806"
    And application launched successfully
    And user click on More Goals on home screen
    And user click by text "Retirement"
    When user enter amount for In today’s value, what is the Goal Amount you wish to Achieve as "60"
    And user enter amount for Existing Savings for this Goal as "50"
    And user enter years to achieve this goal as "2"
    And user scroll to view save my goals
    And user click on save my goal
    When user enter goal name as "Automation"
    And user click on Save Now
    Then verify validation error "Goal name already exists"

  Scenario: User delete an exciting financial goal
    And application launched successfully
    And user click goals on dashboard
    And user click by text contains "Automation"
    And user click on edit icon
    When user click on delete icon
    Then user verify static text "Delete this goal?"
    And user verify partial static text "Once deleted it can’t be recovered."
    When user clicks on Cancel button
    Then user verify static text "Add Financial Goal"
    And user click on delete icon
    When user click on yes button
#    Then user verify partial static text "Your financial goal has been"
    And user wait for "2000" milli second
    Then user verify static text "Financial Goals"
