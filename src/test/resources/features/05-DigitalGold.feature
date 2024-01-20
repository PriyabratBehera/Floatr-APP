#@Regression @DigitalGoldRegression
Feature: Digital Gold Scenarios

  Scenario: Verify that the user can buy Silver without KYC user
    Given user login with user "9585034203 | 9585034203"
    And application launched successfully
    When user clicks on Digital Gold
    Then user verify static text "Buy 24K Gold & Silver at Market Price"
    And user verify static text "Start investing with only ₹51"
    And user click by text "Buy One Time"
    And user wait for "5000" milli second
    And user click by text "Silver"
    Then user verify text "Buy Price"
    And user enters value "51"
    And user verify partial text "gm"
    And user click on Buy in grams
    And user click on Buy in Rupees
    And user enters value "51"
    When user click by text "Buy Now"
    Then user verify static text "Account Activation Pending"
    And user clicks on Cancel button
    Then user verify static text "Digital Gold"
    And user click by text "Buy Now"
    And user clicks on start now button
    Then user verify static text "Onboarding Process:"


  @Smoke @DigitalGoldSmoke
  Scenario: Verify that the user can buy Gold - KYC Completed
    Given user login with user "8412398012 | 8412398012"
    And application launched successfully
    When user clicks on Digital Gold
    And user click by text "Buy One Time"
    And user wait for "5000" milli second
#    And user click by text "Gold"
    And user verify text "Buy Price"
    And user click on Buy in grams
    And user enters weight "0.02"
    And user click by text "Buy Now"
    And user wait for "5000" milli second
    And user selects Financial Goal "Liquid FundsGoal 123"
    And user click by text contains "Purchased quantity has a lockin period of 5 business days. During this period I can’t sell, gift or order delivery"
    And user click by text contains "I confirm that, I am not using a third-party bank account to pay for this investment."
    And user click by text "Proceed to Pay"
    And user wait for "20000" milli second
    And user click on Netbanking All Indian banks
    And user wait for "3000" milli second
    And user click on ICICI
    And user click on Pay Now
    And user wait for "2000" milli second
    And user click on Success
    And user wait for "8000" milli second
    And user verify static text "Transaction Successful"
    When user click static text "View Transaction History"
    And user wait for "3000" milli second
    Then verify below transaction History
      | TransactionFor  | TransactionType |
      | Gold (0.0200gm) | Buy             |

  Scenario: Verify that the user can buy silver - KYC Completed
    Given application launched successfully
    When user clicks on Digital Gold
    And user click by text "Buy One Time"
    And user wait for "5000" milli second
    And user click by text "Silver"
    And user verify text "Buy Price"
    And user enters weight "1"
    And user verify partial text "gm"
    And user click on Buy in grams
    And user enters weight "10"
    And user click by text "Buy Now"
    And user wait for "4000" milli second
    And user selects Financial Goal "Liquid FundsGoal 123"
    And user click by text contains "Purchased quantity has a lockin period of 5 business days. During this period I can’t sell, gift or order delivery"
    And user click by text contains "I confirm that, I am not using a third-party bank account to pay for this investment."
    And user click by text "Proceed to Pay"
    And user wait for "20000" milli second
    And user click on Netbanking All Indian banks
    And user wait for "3000" milli second
    And user click on ICICI
    And user click on Pay Now
    And user wait for "3000" milli second
    And user click on Success
    And user wait for "8000" milli second
    And user click static text "View Transaction History"

  @Smoke @DigitalGoldSmoke @DigitalGoldRegression
  Scenario: Verify that user can sell gold
    Given application launched successfully
    And user change the interval for "6478647864 | 8412398012"
#    When user clicks on Digital Gold
#    And user click by text contains "Locker"
#    And user wait for "2000" milli second
#    When user click partial static text "Gold & Silver"
#    Then user verify static text "My Portfolio"
#    And user click by text contains "Liquid FundsGoal 123"
#    And user wait for "2000" milli second
#    And user clicks on ellipsis against "24K Gold"
#    And user click by text "Sell"
#    And user wait for "2000" milli second
#    And user click on Sell in Grams
#    And user enters weight "0.01"
#    And user selects Account for Receiving Money
#    And user click by text "Sell"
#    And user wait for "4000" milli second
#    And user enters OTP for Sell Gold
#    And user wait for "10000" milli second
#    And user verify static text "Transaction Successful"
#    When user click static text "View Transaction History"
#    And user wait for "3000" milli second
##    Then verify below transaction History
##      | TransactionFor  | TransactionType |
##      | Gold (0.0100gm)  | Sell           |
#
  Scenario: Verify that user can sell Silver
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "5000" milli second
    And user clicks on ellipsis against "24K Silver"
    And user click by text "Sell"
    And user click on Sell in Grams
    And user enters weight "3"
    And user selects Account for Receiving Money
    And user click by text "Sell"
    And user wait for "3000" milli second
    And user enters OTP for Sell Gold
    And user wait for "5000" milli second
    And user verify static text "Transaction Successful"
    And user click static text "View Transaction History"

  Scenario: Verify user can send gift for Silver
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user wait for "5000" milli second
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "5000" milli second
    And user clicks on ellipsis against "24K Silver"
    And user click by text "Send Gift"
    When user click by text "Next"
    Then user verify static text "Send Gift (Silver)"
    And user click on Gift in Grams
    And user click by text "5 gm"
    And user click by text "Next"
    And user wait for "2000" milli second
    When user click by text "Next"
    Then user verify static text "Receiver Details"
    And user enters Full Name "Litan Behera"
    And user enters Mobile Number "9014672393"
    And user selects state "Andhra Pradesh"
    And user click by text contains "I confirm the receiver’s number is correct"
    And user click by text "Next"
    And user wait for "4000" milli second
    And user enters OTP for Sell Gold
    And user wait for "4000" milli second
    And user verify static text "Transaction Successful"
    And user verify partial static text "You have gifted 5 gm of silver"
    And user click static text "View Transaction History"

  Scenario: Verify user can send gift for Gold
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user wait for "5000" milli second
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "5000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Send Gift"
    And user enters value "60"
    And user click by text "Next"
    And user enters Full Name "Litan Behera"
    And user enters Mobile Number "9014672393"
    And user selects state "Andhra Pradesh"
    And user click by text contains "I confirm the receiver’s number is correct"
    And user click by text "Next"
    And user wait for "8000" milli second
    And user enters OTP for Sell Gold
    And user wait for "4000" milli second
    And user verify static text "Transaction Successful"
    And user verify partial static text "You have gifted"
    And user wait for "4000" milli second
    When user click static text "View Transaction History"
    And user wait for "3000" milli second
#    Then verify below transaction History for gift gold
#      | TransactionAmount  | TransactionType |
#      | ₹60.00             | Gift Sent       |

  @Validation @DigitalGoldValidation
  Scenario: Verify the validations in Gold-24K, Silver -24K tile card
#    Given user login with user "8412398012 | 8412398012"
    And application launched successfully
    When user clicks on Digital Gold
    And user wait for "5000" milli second
    And user click by text "Buy One Time"
    And user click by text "Buy Now"
    Then verify validation error "Enter Amount"
    And user enters value "10"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user enters value "500001"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click on Buy in grams
    And user enters weight "251"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user enters weight "500001"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click by text "Silver"
    And user wait for "5000" milli second
    And user click on Buy in Rupees
    And user enters value "10"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user enters value "500001"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click on Buy in grams
    And user enters weight "21000"
    And user click by text "Buy Now"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.5,00,000"
    And user click by text "Gold"
    And user enters weight "12abcd"
    And user click by text "Buy Now"
    Then verify validation error "Only numeric values are allowed"

  Scenario: Verify UI of order physical gold screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user wait for "2000" milli second
    And user click by text contains "Order"
    Then user verify static text "Product Catalogue"
    And user verify partial text "0.10 gm Gold coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹200.00"
    And user verify partial text "0.50 gm Gold coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹300.00"
    And user verify partial text "1.00 gm Gold coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹350.00"
    And user verify partial text "2.00 gm Gold coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹400.00"
    When user click by text "Silver"
    And user verify partial text "1.00 gm Silver bar"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹100.00"
    And user verify partial text "20.00 gm Silver coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹250.00"
    And user verify partial text "50.00 gm Silver coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹350.00"
    And user verify partial text "100.00 gm Silver coin"
    And user verify partial text "24K, 99.99% Purity"
    And user verify partial text "Making & Delivery"
    And user verify partial text "₹550.00"

  Scenario: Verify NPS tab is functional in wealth screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    Then user verify partial text "MF"
    Then user verify partial text "Gold"
    When user click by text " NPS "
    And user wait for "5000" milli second
    Then user verify static text "No Record Found"

  @Validation @DigitalGoldValidation
  Scenario: Verify validations on Sell Gold/Silver screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "10000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Sell"
    And user enters value "50"
    And user selects Account for Receiving Money
    And user click by text "Sell"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enters value "1100000"
#    And user selects Account for Receiving Money for another value
    And user click by text "Sell"
    Then verify validation error "You do not have sufficient quantity to Sell"
    And user click on Sell in Grams
    And user enters value "0.0001"
#    And user selects Account for Receiving Money for another value
    And user click by text "Sell"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enters weight "100"
#    And user selects Account for Receiving Money for another value
    And user click by text "Sell"
    Then verify validation error "You do not have sufficient quantity to Sell"

  @Validation @DigitalGoldValidation
  Scenario: Verify validation error for send gift for silver
    Given application launched successfully
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "10000" milli second
    And user clicks on ellipsis against "24K Silver"
    And user click by text "Send Gift"
    And user enters value "50"
    And user click by text "Next"
    And user wait for "5000" milli second
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enters value "1100000"
    And user click by text "Next"
    Then verify validation error "You do not have sufficient quantity to Gift"
    And user click on Gift in Grams
    And user enters weight "0.00001"
    And user click by text "Next"
    Then verify validation error "After decimal 4 digit numeric values are allowed"
    And user verify static text "Available Quantity"
    And user verify static text "Buy Price"
    And user verify static text "Digital Gold"
    And user click on Gift in RS

    Scenario: Verify send gift link is functional in gold home screen
      Given application launched successfully
      And user scroll to view Gold
      When user clicks on Digital Gold
      And user click by text contains "Send"
      Then user verify static text "Receiver Details"

  @Validation @DigitalGoldValidation
  Scenario: Verify validations for send gift for gold
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "4000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Send Gift"
    And user enters value "50"
    And user click by text "Next"
    Then verify validation error "Minimum Rs.51 and Maximum Rs.10,00,000"
    And user enters value "1100000"
    And user click by text "Next"
    Then verify validation error "You do not have sufficient quantity to Gift"
    And user click on Gift in Grams
    And user enters weight "0.00001"
    And user click by text "Next"
    Then verify validation error "After decimal 4 digit numeric values are allowed"
    And user verify static text "Available Quantity"
    And user verify static text "Buy Price"
    And user enters weight "0.01"
    And user click by text "Next"
    And user wait for "5000" milli second
    And user enters Full Name "L"
    And user enters Mobile Number "90146"
    And user selects state "Andhra Pradesh"
    And user click by text contains "I confirm the receiver’s number is correct"
    And user click by text "Next"
    Then user verify static text "Name should contain minimum 2 characters"
    And user verify static text "Enter valid mobile number"

  Scenario: Verify functionality of Portfolio Transaction History
    Given application launched successfully
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "10000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Transaction History"
    Then user verify static text "Transaction History"


  Scenario: Verify that when the timer ends, navigate to the Digital Gold screen
    Given application launched successfully
    When user clicks on Digital Gold
    And user wait for "5000" milli second
    And user click by text "Buy One Time"
    And user click on Buy in grams
    And user enters weight "0.02"
    And user click by text "Buy Now"
    And user wait for "242000" milli second
    And user wait for "5000" milli second
    Then user verify text "Buy Price"

  Scenario: Verify functionality of Order Physical Gold
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
#    And user scroll to view Gold
    When user clicks on Digital Gold
    And user wait for "2000" milli second
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user clicks on ellipsis against "24K Gold"
    And user click by text "Order Coins"
    And user click by text contains "1.00 gm Gold coin"
    And user wait for "5000" milli second
    And user click by text "Buy Now"
    And user wait for "3000" milli second
    And user verify text "Cart Summary"
    And user remove coin from add to cart


  Scenario: Verify that order Gold is functional
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
    When user clicks on Digital Gold
    And user wait for "2000" milli second
    And user click by text contains "Order"
    And user click by text contains "0.10 gm Gold coin"
    And user verify partial static text "Product Details"
    And user verify partial static text "Weight"
    And user verify partial static text "Metal Purity"
    And user verify partial static text "Model"
    And user verify partial static text "Seller"
    And user verify partial static text "Price"
    And user verify partial static text "Making & Delivery"
    And user verify partial static text "Total"
    And user click by text "Add to Cart"
    And user click by text "Go to Cart"
    And user verify partial static text "Cart Summary"
    And user verify partial static text "gm Gold coin"
    And user verify partial static text "Total Amount Payable :"
    And user verify partial text "gm Gold coin"
    And user verify static text "Estimated Delivery: In 7 to 15 days."
    And user verify static text "Actually delivery date may vary based on the shipping location"
    And user select Financial Goal to Debit as "Liquid FundsGoal 123"
    And user click by text "Checkout"
    And user wait for "2000" milli second
    And user click by text contains "Puneet Naik"
    And user click by text "Proceed to Pay"
    And user wait for "20000" milli second
    And user click on Netbanking All Indian banks
    And user wait for "3000" milli second
    And user click on ICICI
    And user click on Pay Now
    And user wait for "2000" milli second
    And user click on Success
    And user wait for "12000" milli second
    And user click by text contains "View Transaction History"
#    Then verify below in Gold Delivery History
#      | TransactionFor  | TransactionType | TransactionStatus |
#      | Coins / Bars    | Delivery        |  In process       |



  Scenario: Verify that order Silver is functional
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
    When user clicks on Digital Gold
    And user wait for "2000" milli second
    And user click by text contains "Order"
    And user click by text "Silver"
    And user click by text contains "1.00 gm Silver bar"
    And user click by text "Buy Now"
    And user wait for "5000" milli second
    And user select Financial Goal to Debit as "Liquid FundsGoal 123"
    And user click by text "Checkout"
    And user wait for "2000" milli second
    And user click by text contains "Puneet Naik"
    And user click by text "Proceed to Pay"
    And user wait for "20000" milli second
    And user click on Netbanking All Indian banks
    And user wait for "3000" milli second
    And user click on ICICI
    And user click on Pay Now
    And user wait for "2000" milli second
    And user click on Success
    And user wait for "12000" milli second
    And user click by text "Home"


  Scenario: Edit Shipping Address for Gold Order
    Given application launched successfully
    And user change the interval for "8412398012 | 8412398012"
#    And user scroll to view Gold
    When user clicks on Digital Gold
    And user wait for "2000" milli second
    And user click by text contains "Order"
    And user click by text contains "0.10 gm Gold coin"
    And user click by text "Buy Now"
    And user wait for "5000" milli second
    And user select Financial Goal to Debit as "Liquid FundsGoal 123"
    And user click by text "Checkout"
    And user wait for "2000" milli second
    When user click static text "Add New"
    Then user verify static text "New Address"
    And user verify static text "Shipping Address"
    When user go back from "Address" screen
    Then user edit shipping address
    When user click by text "Save Address"
    Then user verify static text "Anantapur: 943476"
    And user reedit shipping address

#  Scenario: Verify detailed transaction for Buy
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    And user click by text contains "Transaction"
##    And user click by text contains "Liquid FundsGoal 123"
##    And user wait for "4000" milli second
##    And user clicks on ellipsis against "24K Silver"
##    And user click by text contains "Transaction History"
#    And user wait for "14000" milli second
#    And user selects Goal Type as "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user selects Transaction Type as "Buy"
#    And user wait for "4000" milli second
#    And user click on View details transaction
#    And user verify partial static text "Purchase History"
#    Then user verify partial text "Augmont"
#    And user verify partial static text "Purchase History"
#    And user verify partial text "Purchase Detail"
#    And user verify partial text "Weight"
#    And user verify partial text "Metal Purity"
#    And user verify partial text "Seller"
#    And user verify partial text "Transaction ID"
#    And user verify partial text "Date & Time"
#    And user verify partial text "Price"
#    And user verify partial text "GST"
#    And user verify partial text "Total Amount"


  Scenario: Verify detailed transaction for Sell
    Given application launched successfully
#    And user scroll to view Gold
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "4000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text contains "Transaction History"
    And user wait for "10000" milli second
    And user selects Goal Type as "Liquid FundsGoal 123"
    And user wait for "4000" milli second
    And user selects Transaction Type as "Sell"
    And user wait for "4000" milli second
    And user click on View details transaction
    Then user verify partial text "Augmont"
    Then user verify partial text "Sell History"
    And user verify partial text "Sell Detail"
    And user verify partial text "Weight"
    And user verify partial text "Metal Purity"
    And user verify partial text "Seller"
    And user verify partial text "Transaction ID"
    And user verify partial text "Date & Time"
    And user verify partial text "Price"
    And user verify partial text "GST"
    And user verify partial text "Total Amount"

#  Scenario: Verify detailed transaction for Gift
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    And user click by text contains "Locker"
#    And user click by text contains "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user clicks on ellipsis against "24K Gold"
#    And user click by text contains "Transaction History"
#    And user wait for "6000" milli second
#    And user selects Goal Type as "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user selects Transaction Type as "Gift"
#    And user wait for "4000" milli second
#    And user click on View details transaction
#    Then user verify partial text "Augmont"
#    Then user verify partial text "Gift History"
#    And user verify partial text "Weight"
#    And user verify partial text "Metal Purity"
#    And user verify partial text "Seller"
#    And user verify partial text "Transaction ID"
#    And user verify partial text "Date & Time"
#    And user verify partial text "Gifted To"
#    And user verify partial text "Mobile Number"
##    And user verify partial text "PIN"
#    And user verify partial text "Litan"
#    And user verify partial text "9014672393"
##    And user verify partial text "500084"

  Scenario: Verify detailed transaction for Delivery
    Given application launched successfully
#    And user scroll to view Gold
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click by text contains "Liquid FundsGoal 123"
    And user wait for "4000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text contains "Transaction History"
    And user wait for "4000" milli second
    And user selects Transaction Type as "Delivery"
    And user wait for "4000" milli second
    Then user verify static text "Delivery"
#    And user click on View details transaction
    And user click by text "View"
    And user verify partial text "Order Placed"
    And user verify partial text "Date"
    And user verify partial text "Transaction ID"
    And user verify partial text "Product"
    And user verify partial text "Weight"
    And user verify partial text "Metal Purity"
    And user verify partial text "Model"
    And user verify partial text "Seller"
    And user verify partial text "Quantity"
    And user verify partial text "Amount"
    And user verify partial text "GST"
    And user wait for "15000" milli second
    And user verify partial text "Total Amount"
    And user verify partial text "Buyer Details"
    And user verify Buyer name
    And user verify partial text "Delivery Status"
    And user verify partial text "In process"
    And user verify partial text "View Invoice"

#  Scenario: Buy link is functional in wealth screen
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    And user click by text contains "Locker"
#    And user click by text contains "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user clicks on ellipsis against "24K Gold"
#    When user click by text contains "Buy"
#    Then user verify static text "Digital Gold"
#
#  Scenario: Order Coins link is functional in wealth screen
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    And user click by text contains "Locker"
#    And user click by text contains "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user clicks on ellipsis against "24K Gold"
#    When user click by text contains "Order Coins"
#    Then user verify static text "Order Physical Gold"
#
#  Scenario: View Order History link is functional in Digital Gold screen
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    When user click by text contains "Transaction"
#    Then user verify static text "Transaction History"

  @Smoke @DigitalGoldSmoke
  Scenario: Verify that invest via SIP for Gold Monthly
#    And user login with user "7010000000 | 7010000000"
    Given application launched successfully
#    And user scroll to view Gold
    When user clicks on Digital Gold
    And user click by text "Start SIP"
    And user select SIP start date as "2"
    And user set SIP duration as "20"
    And user enters investment amount "500"
    And user select Financial for digital gold as "Wealth"
    And user wait for "2000" milli second
    And user click by text "With Debit Card"
    And user click by text "Authorise & Save SIP"
    And user wait for "2000" milli second
    And user click by text contains "ICIC"
    And user wait for "25000" milli second
    And user click on simulate success
    And user wait for "3000" milli second
    Then user verify static text "SIP Created Successfully"
    And user verify partial static text "Your SIP will start on"
    When user click static text "View SIPs"
    Then user verify static text "My SIPs"
    And user verify text "All SIPs"
    And user verify text "Mutual Funds"
    And user verify text "Gold & Silver"
    And user verify static text "24K Gold"
    And user verify static text "Wealth"
    And user verify partial static text "SIP Amount"
    And user verify partial static text "Monthly SIP"
    And user verify partial static text "Invested"
    And user verify partial static text "Installments"
    And user verify static text "Bank"

#  Scenario: Verify that invest via SIP for Silver Weekly
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    And user click by text "Start SIP"
#    And user click by text "SILVER"
#    And user wait for "2000" milli second
#    And user click weekly SIP
#    And user select SIP start date as "2"
#    And user set SIP duration as "21"
#    And user click by text "₹2,000"
#    And user select Financial for digital gold as "Wealth"
#    And user wait for "2000" milli second
#    And user click by text "Through Net Banking"
#    And user click by text "Authorise & Save SIP"
#    And user click by text contains "ICIC"
#    And user wait for "25000" milli second
#    And user click on simulate success
#    And user wait for "3000" milli second
#    And user verify static text "SIP Created Successfully"
#    And user verify partial static text "Your SIP will start on"
#    And user click static text "View SIPs"
#    And user verify text "24K Silver"
#    And user verify static text "Wealth"
#    And user verify partial static text "SIP Amount"
#    And user verify partial static text "Weekly SIP"
#    And user verify partial static text "Invested"
#    And user verify partial static text "Installments"
#    And user verify static text "Bank"
#
#  Scenario: Verify detailed transaction for SIP
##    And user login with user "8412398012 | 8412398012"
#    And user wait for "20000" milli second
#    Given application launched successfully
##    And user scroll to view Gold
#    When user clicks on Digital Gold
#    And user click by text contains "Locker"
#    And user click by text contains "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user clicks on ellipsis against "24K Gold"
#    And user click by text contains "Transaction History"
#    And user wait for "4000" milli second
#    And user selects Goal Type as "Liquid FundsGoal 123"
#    And user wait for "4000" milli second
#    And user selects Transaction Type as "SIP"
#    And user wait for "4000" milli second

  @Validation @DigitalGoldValidation
  Scenario: Verify validation error  while invest via SIP for monthly/weekly
    Given application launched successfully
#    And user scroll to view Gold
    When user clicks on Digital Gold
    And user click by text "Start SIP"
    And user select SIP start date as "1"
    And user set SIP duration as "0"
    And user enters investment amount "400"
    And user select Financial for digital gold as "Liquid FundsGoal 123"
    And user wait for "2000" milli second
    And user click by text "With Debit Card"
    And verify validation error "Min duration is 12 months"
    And verify validation error "Minimum sip amount is 500"
    And user select SIP start date as "12"
    And user set SIP duration as "123"
    And user enters investment amount "51000"
    And verify validation error "Max duration is 120 months"
    And verify validation error "Maximum sip amount is 50,000"
    And user click weekly SIP
    And user select SIP start date as "1"
    And user set SIP duration as "0"
    And user enters investment amount "400"
    And verify validation error "Min duration is 12 weeks"
    And verify validation error "Minimum sip amount is 500"
    And user set SIP duration as "134"
    And user enters investment amount "500000"
    And verify validation error "Max duration is 120 weeks"
    And verify validation error "Maximum sip amount is 50,000"

  Scenario: Verify Gold & Silver link is functional in wealth dashboard
#    Given user login with user "7272727272 | 7272727272"
    And application launched successfully
    And user click by text "Wealth"
    And user wait for "7000" milli second
    And user click static text "Invest Now"
    And user click by text "Gold & Silver"
    And user verify static text "Digital Gold"

  Scenario: Verify Gold tab is functional in wealth
    Given application launched successfully
    And user click by text "Wealth"
    And user wait for "3000" milli second
    And user click static text "View All"
    And user wait for "2000" milli second
    And user click by text " Gold "
    And user verify static text "Wealth"
    And user verify static text "My Portfolio"
    When user click by text contains "Liquid FundsGoal 123"
    Then user verify static text "Invested"
    And user verify static text "XIRR"
    And user verify static text "P&L"
    And user verify static text "Current Value"

  Scenario: Verify Gold SIPs are displayed in My Systematic Plan
    Given application launched successfully
    And user click by text "Wealth"
    And user wait for "3000" milli second
    And user verify static text "My Systematic Plan (SIP)"
    And user verify partial static text "Mutual Funds"
    And user verify partial static text "Gold"
    And user verify partial static text "Silver"
    When user click arrow against my systematic plan
    And user verify static text "My SIPs"

  Scenario: Verify Invest for jewellery banner is functional
    Given application launched successfully
    And user click by text "Wealth"
    And user wait for "2000" milli second
    And user scroll to view invest for jewellery
    When user click on invest for jewellery
    Then user verify static text "Gold SIP"

  Scenario: Verify Manage SIPs is functional in hamburger Menu
    Given application launched successfully
    And user click on menu option
    When user click by text "Manage SIPs"
    And user wait for "2000" milli second
    And user verify static text "My SIPs"
    And user verify text "All SIPs"
    And user verify text "Mutual Funds"
    And user verify text "Gold & Silver"
    And user verify partial static text "SIP Amount"
    And user verify partial static text "Invested"
    And user verify static text "Bank"
    And user verify partial static text "Monthly SIP on"
    And user verify partial static text "Installments"
    When user click the three dot for any goal
    Then user verify text "Manage SIP"
    And user verify text "Stop SIP"
    When user click by text "Transaction History"
    And user wait for "2000" milli second
    Then user verify partial static text "Transaction History"

    @GoalDoesnotMoveIssue
  Scenario: Verify that Move to Another Goal link is functional
#    Given user login with user "9090909090 | 9090909090"
    And application launched successfully
    When user clicks on Digital Gold
    And user click by text contains "Locker"
    And user click a portfolio
    And user wait for "6000" milli second
    And user clicks on ellipsis against "24K Gold"
    And user click by text contains "Move to Another Goal"
    And user move to goal "Bike"
#    And user wait for "2000" milli second
#    And user click by text "Confirm"
#    Then user verify text "Current Value"







