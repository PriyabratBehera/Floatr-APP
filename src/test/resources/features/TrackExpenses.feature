#@Regression
Feature: Track Expenses Scenarios

#  @SmokeTest @TrackExpenses
  Scenario: Verify create Transaction for Spending Loan
    Given user login with user "9014672394"
    And application launched successfully
    And user clean up the app data for "9014672394"
    And user wait for "3000" milli second
    When user clicks on Track Expenses
    And user click on add Transaction
    And user enters amount "1000"
    And user click on Spending
    And user click on Choose category
#    And user selects category "Loan" --> "Motor"
#    And user enters Transaction Date
#    And user scroll to view Save Transaction
#    And user selects paid from "Bank Account"
#    And users enters paid to as "HDFC"
#    And user selects monthly recurring
#    And user selects frequency as "Monthly"
#    And user selects end after "Dec"
#    And user click by text "Continue"
#    And user scroll to view Save Transaction
#    And user click by text "Save Transaction"
#    Then verify below in My Transaction Screen
#      | SpendingType | SpendingAmount | PaidFrom     | PaidTo |
#      | Loan Motor   | ₹1,000         | Bank Account | Hdfc   |


  Scenario: Verify update category for Spending
    Given application launched successfully
#    When user clicks on Track Expenses
#    And user left swipe to select category for "Loan"
#    And user selects category "Loan" --> "Business"
#    Then verify below in My Transaction Screen
#      | SpendingType  | SpendingAmount | PaidFrom     | PaidTo |
#      | Loan Business | ₹1,000         | Bank Account | Hdfc   |

#  @SmokeTest
  Scenario: Verify create Transaction for Income
    Given user login with user "9014672394"
    And application launched successfully
    When user clicks on Track Expenses
    And user click on add Transaction
    And user enters amount "2000"
    And user click on Income
    And user click on Choose category
    And user click by text "Salary"
    And user enters Transaction Date
    And user scroll to view Save Transaction
    And user selects received from "Cash"
    And users enters received in as "HDFC"
    And user selects monthly recurring
    And user selects frequency as "Monthly"
    And user selects end after "Dec"
    And user click by text "Continue"
    And user scroll to view Save Transaction
    And user click by text "Save Transaction"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Salary | ₹2,000       | Cash         | Hdfc       |


  Scenario: Verify update category for Income
    Given application launched successfully
    When user clicks on Track Expenses
    And user wait for "5000" milli second
    And user left swipe to select category for "Income"
    And user click by text "Rental"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Rental | ₹2,000       | Cash         | Hdfc       |

  Scenario: Verify Filter Transaction with Newest
    Given application launched successfully
    When user clicks on Track Expenses
    And user click by text "Filter"
    And user click by text "Newest"
    And user click by text "Apply"
    Then verify "Income" > "Loan"

  Scenario: Verify Filter Transaction with Oldest
    Given application launched successfully
    When user clicks on Track Expenses
    And user click by text "Filter"
    And user click by text "Oldest"
    And user click by text "Apply"
    Then verify "Loan" > "Income"

  Scenario: Verify Filter Transaction with Highest
    Given application launched successfully
    When user clicks on Track Expenses
    And user click by text "Filter"
    And user click by text "Highest"
    And user click by text "Apply"
    Then verify "Income" > "Loan"

  Scenario: Verify Filter Transaction with Lowest
    Given application launched successfully
    When user clicks on Track Expenses
    And user click by text "Filter"
    And user click by text "Lowest"
    And user click by text "Apply"
    Then verify "Loan" > "Income"

  Scenario: Verify Filter Transaction by Income and Category
    Given application launched successfully
    When user clicks on Track Expenses
    And user click by text "Filter"
    And user click by text "Income"
    And user click by text "Choose category"
    And user click by text "Rental"
    And user click by text "Continue"
    And user click by text "Apply"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Rental | ₹2,000       | Cash         | Hdfc       |


  Scenario: Verify Filter Transaction by Spend and Category
    Given application launched successfully
    When user clicks on Track Expenses
    And user click by text "Filter"
    And user click by text "Spend"
    And user click by text "Choose category"
    And user click by text "Loan"
    And user click by text "Continue"
    And user click by text "Apply"
    Then verify below in My Transaction Screen
      | SpendingType  | SpendingAmount | PaidFrom     | PaidTo |
      | Loan Business | ₹1,000         | Bank Account | Hdfc   |


  Scenario: Verify Filter Transaction by Duration
    Given application launched successfully
    When user clicks on Track Expenses
    And user select duration as "Current Month"
    Then verify below in My Transaction Screen
      | SpendingType  | SpendingAmount | PaidFrom     | PaidTo |
      | Loan Business | ₹1,000         | Bank Account | Hdfc   |
    And user select duration as "Last Month"
    Then verify validation error "No Transaction Found"
    And user select duration as "Current Plus Last Month"
    Then verify below in My Transaction Screen
      | SpendingType  | SpendingAmount | PaidFrom     | PaidTo |
      | Loan Business | ₹1,000         | Bank Account | Hdfc   |
    And user select duration as "Last 30 Days"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Rental | ₹2,000       | Cash         | Hdfc       |
    And user select duration as "Last 60 Days"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Rental | ₹2,000       | Cash         | Hdfc       |
    And user select duration as "Current Fiscal Quarter"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Rental | ₹2,000       | Cash         | Hdfc       |
    And user select duration as "Last Fiscal Quarter"
    Then verify validation error "No Transaction Found"
    And user select duration as "This Financial Year"
    Then verify below in My Transaction Screen
      | SpendingType  | SpendingAmount | PaidFrom     | PaidTo |
      | Loan Business | ₹1,000         | Bank Account | Hdfc   |

  Scenario: Verify search filter for transaction
    Given application launched successfully
    When user clicks on Track Expenses
    And user enters transaction type "Income"
    Then verify below in Income My Transaction Screen
      | IncomeType    | IncomeAmount | ReceivedFrom | ReceivedIn |
      | Income Rental | ₹2,000       | Cash         | Hdfc       |
    And user enters transaction type "Loan"
    Then verify below in My Transaction Screen
      | SpendingType  | SpendingAmount | PaidFrom     | PaidTo |
      | Loan Business | ₹1,000         | Bank Account | Hdfc   |

#  @Validation
#  Scenario: Verify validation error for Spending
#    Given application launched successfully
#    When user clicks on Track Expenses
#    And user click on add Transaction
#    And user click on Spending
#    And user click on Choose category
#    And user selects category "Loan" --> "Motor"
#    And user scroll to view Save Transaction Paid From
#    And user click by text "Save Transaction"
#    Then Verify error message "Field cannot be left blank" count as "3"
#    When user click on back button
#    And user click on add Transaction
#    And user enters amount "1000"
#    And user click on Spending
#    And user click on Choose category
#    And user selects category "Loan" --> "Motor"
#    And user enters Transaction Date
#    And user scroll to view Save Transaction
#    And user selects paid from "Bank Account"
#    And users enters paid to as "HDFC"
#    And user selects monthly recurring
#    And user selects frequency as "Monthly"
#    And user selects end after "Jan"
#    And user click by text "Continue"
#    Then verify validation error "Previous month selection is not allowed"
#
#  @Validation
#  Scenario: Verify validation error for Income
#    Given application launched successfully
#    When user clicks on Track Expenses
#    And user click on add Transaction
#    And user click on Income
#    And user click on Choose category
#    And user click by text "Salary"
#    And user scroll to view Save Transaction
#    And user click by text "Save Transaction"
#    Then Verify error message "Field cannot be left blank" count as "3"
#    When user click on back button
#    And user click on add Transaction
#    And user enters amount "2000"
#    And user click on Income
#    And user click on Choose category
#    And user click by text "Salary"
#    And user enters Transaction Date
#    And user scroll to view Save Transaction
#    And user selects received from "Cash"
#    And users enters received in as "HDFC"
#    And user selects monthly recurring
#    And user selects frequency as "Monthly"
#    And user selects end after "Jan"
#    And user click by text "Continue"
#    Then verify validation error "Previous month selection is not allowed"
