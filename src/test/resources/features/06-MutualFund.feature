@Regression @MutualFundRegression
Feature: Mutual Funds Scenarios

#  Scenario: Verify UI Elements of Mutual Funds Home Screen
#    Given user login with user "7612398012 | 7612398012"
#    And application launched successfully
#    When user clicks on Mutual Funds
#    And user verify static text "Current Value"
#    And user verify static text "Invested Amount"
#    And user verify static text "Growth"
#    And user verify static text "One Click Invest - MF Baskets"
#    And user verify partial static text "Design your own portfolio with multiple schemes and invest lump-sum or create SIP in one go"
#    And user verify partial text "Pick a fund on your own & invest"
#    And user verify static text "Scheme Categories"
#    And user click on refresh icon in Mutual Funds Screen
#    And user scroll to view Add External Folios
#    And user verify partial text "Investments done outside Floatr App"
#    When user go back from "Mutual Funds" screen
#    Then user verify partial static text "Hello"
#
#  @validation @MutualFundValidation
#  Scenario: User cannot invest without completing KYC
#    Given user login with user "9900123123 | 9900123124"
#    And application launched successfully
#    When user clicks on Mutual Funds
#    And user click by text contains "Explore All Mutual Fund Schemes"
#    And user wait for "5000" milli second
#    And user search for mutual fund "Aditya"
#    And user wait for "5000" milli second
#    And user click on Invest
#    Then user verify partial static text "You have not completed"
#    When user clicks on complete KYC
#    And user go back from "KYC" screen
#    And user go back from "Mutual Fund Schemes" screen
#    And user click by text "Create MF Baskets"
#    And user wait for "5000" milli second
#    And user search for mutual fund "Aditya"
#    And user click Add to Cart for Aditya Birla
#    When user clicks on complete KYC
#    And user go back from "KYC" screen
#    And user go back from "Mutual Fund Schemes" screen
#    And user click by text "Invest"
#    And user search for mutual fund "Aditya"
#    And user click Select Button on MutualFund scheme
#    When user clicks on complete KYC
#
#  Scenario: Verify Categories Filters Functionality
##    Given user login with user "7612398012 | 7612398012"
#    And application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    When user click by text "Categories"
#And user wait for "3000" milli second
#    Then user verify partial static text "Schemes)"
#    And user verify text "Equity"
#    And user verify text "Contra"
#    And user verify text "Large Cap"
#    And user verify text "Mid Cap"
#    And user verify text "Value"
#    When user search invalid categories name as "Debt"
#    Then user verify static text "No Record Found"
#    And user click by text "Solution Oriented"
#    And user click by text "Others"
#    And user click by text "Hybrid"
#    And user click by text "Dynamic Asset Allocation"
#    And user click by text "Apply Filters"
#    Then user verify static text "Aditya Birla Sun Life Savings Fund (G)"
#    And user verify static text "Dynamic Asset Allocation Fund"
#    And user verify static text "1Y Return"
#    And user verify static text "3Y Return"
#    And user verify static text "5Y Return"
#    And user verify static text "10Y Return"
#    And user verify static text "Min. SIP"
#    And user verify static text "NAV (26 Sep 22)"
#    Then user click by text "Categories"
#    When user go back from categories screen
#    Then user click by text "Categories"
#    And user click by text "Debt"
#    And user click by text "Low Duration"
#    And user click by text "Ultra Short Duration"
#    And user click by text "Clear"
#    And user verify static text "Mutual Fund Schemes"
#
#  Scenario: Verify AMC Filters Functionality
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user wait for "2000" milli second
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    And user click by text "AMC"
#    And user wait for "2000" milli second
#    And user verify partial static text "Asset Management Companies"
#    And user verify partial static text "AMC Name"
#    And user click by text "Aditya Birla Mutual Fund"
#    And user click by text "Axis1 Mutual Fund"
#    And user click by text "Clear"
#    And user click by text "AMC"
#    When user click by text "SBI Mutual Fund"
#    When user click by text "Apply Filters"
#    And user wait for "3000" milli second
#    Then user verify static text "SBI Magnum Ultra Short Duration Fund (G)"
#
#  Scenario: Verify Returns Filters Functionality
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user wait for "2000" milli second
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    When user click by text "Returns"
#    Then user verify static text "Sort by"
#    When user close sort by overly screen
#    And user click by text "Returns"
#    Then user click by text "1Y Returns High to Low"
#    And user verify static text "RainyDay"
#
#  Scenario: Verify "View" Link Displays Fund Performance Information
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user wait for "2000" milli second
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya birla sun life frontline"
#    And user wait for "3000" milli second
#    When user click view in MutualFund Schemes screen
#    And user verify static text "Scheme Detail"
#    And user verify static text "Aditya Birla Sun Life Frontline Equity Fund (G)"
#    And user verify static text "3 M"
#    And user verify static text "6 M"
#    And user verify static text "1 Y"
#    And user verify static text "3 Y"
#    And user verify static text "5 Y"
#    And user verify static text "Fund Performance"
#    And user verify static text "* Upto 1 year are absolute returns & others are annualized."
#    And user verify static text "Fund Information"
#    And user verify static text "ISIN"
#    And user verify static text "Initial Investment"
#    And user verify static text "Min. Additional Investment"
#    And user verify static text "Max. Investment"
#    And user verify static text "Min. SIP Amount"
#    And user verify static text "Min. SIP Installments"
#    And user verify static text "Monthly SIP Dates"
#    And user verify static text "Plan Type"
#    And user verify static text "Lockin Applicable"
#    And user verify static text "Lockin Period"
#    And user scroll to view Min. STP Installments (Monthly)
#    And user verify static text "Min. STP Amount (Quarterly)"
#    And user scroll to Min SWP Amount (Daily)
#    And user verify static text "Min SWP Amount (Weekly)"
#    And user scroll to view Lockin Period
#    When user click static text "Read Scheme Information Document"
#
#  Scenario: Functionality of "view" Links in purchase screen
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "5000" milli second
#    And user search for mutual fund "Aditya birla sun life frontline"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "3000" milli second
#    And user click view in purchase screen
#    And user wait for "3000" milli second
#    And user verify static text "Scheme Detail"
#
#  @validation @MutualFundValidation
#  Scenario: Verify Validation Error for Monthly Investment
##    Given user login with user "7612398012 | 7612398012"
#    And application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "5000" milli second
#    And user verify static text "Purchase"
#    And user verify static text "ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH"
#    And user verify static text "Mode of Investment"
#    And user select Monthly SIP radio button
#    And user selects monthly SIP date as "2"
#    And user enters SIP Duration as "10"
#    And user enters invest amount for monthly SIP "540"
#    And user select folio number
#    And user scroll to view Calculate
#    And user selects Goal "MF Goal 001"
#    And user wait for "3000" milli second
#    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
#    And user click by text "Save SIP"
#    Then verify validation error "Min duration should be 12"
#    And verify validation error " Min SIP amount should be ₹1,000"
#    And user enters SIP Duration as "241"
#    And user enters invest amount for monthly SIP "1999999999"
#    And user click by text "Save SIP"
#    Then verify validation error "Max duration should be 240"
#    And verify validation error "Max SIP amount should be ₹99,99,99,999"
#  @validation @MutualFundValidation
#  Scenario: Verify Validation Error for One-Time Investment
##    Given user login with user "7612398012 | 7612398012"
#    And application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Start SIP"
#    And user wait for "5000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "3000" milli second
#    And user select One Time radio button
#    And user enters invest amount for One Time "500"
#    And user selects Financial Goal "MF Goal 001"
#    And user select folio number
#    And user wait for "3000" milli second
#    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
#    And user click by text "Pay Now"
#    Then verify validation error "Amount should be greater or equal to 1000"
#    And user enters invest amount for One Time "2400001"
#    And user click by text "Pay Now"
#    Then verify validation error "You cannot enter more than ₹24,00,000"
#
#  @Smoke @MutualFundSmoke
#  Scenario: Invest One-Time in Mutual Funds schemes
##    Given user login with user "7612398012 | 7612398012"
#    And application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "4000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "3000" milli second
#    And user enters invest amount for One Time "5010"
#    And user selects Financial Goal "MF Goal 001"
#    And user select folio number
#    And user wait for "3000" milli second
#    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
#    And user click by text "Pay Now"
#    And user wait for "5000" milli second
#    And user verify static text "OTP Verification"
#    And user verify static text "Enter OTP to Confirm"
#    And user verify partial static text "We have sent an OTP to below mobile & email"
#    And user enter otp for purchase MF Scheme
#    And user click by text "Confirm Order"
#    And user wait for "30000" milli second
#    And user click on Netbanking All Indian banks
#    And user wait for "5000" milli second
#    And user click button text "Pay Now"
#    And user wait for "7000" milli second
#    And user click button text "Success"
#    And user wait for "17000" milli second
#    And user verify static text "Order Submitted"
#    And user verify partial static text "Units for this purchase will be allotted at"
#    And user verify static text "Purchase Processing"
#    And user verify static text "Orders are executed on the NAV of next business day"
#    And user verify static text "On units allotment you receive email / SMS from the AMC"
#    And user verify static text "The purchased units will be updated in the app in up to T+3 business days"
#    And user verify static text "If purchase is rejected by AMC, refund will be processed in your source account by the AMC"
#    When user click static text "View Transaction History"
#    And user wait for "5000" milli second
#    Then user verify partial text "₹5,010.00"
#
#  Scenario: Make a Payment failed for invest in Mutual Fund schemes
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "3000" milli second
#    And user enters invest amount for One Time "10001"
#    And user selects Financial Goal "MF Goal 001"
#    And user select folio number
#    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
#    And user click by text "Pay Now"
#    And user wait for "4000" milli second
#    And user enter otp for purchase MF Scheme
#    And user click by text "Confirm Order"
#    And user wait for "30000" milli second
#    And user click on Netbanking All Indian banks
#    And user click button text "Pay Now"
#    And user wait for "8000" milli second
#    And user click button text "Failure"
#    And user wait for "16000" milli second
#    And user verify static text "Transaction Failed"
#    And user verify partial static text "You can try again after some time"
#    And user verify partial static text "If amount has been debited from your"
#    Then user click by text "Home"
#    And user verify static text "Mutual Funds"
#
#  @Validation @MutualFundValidation
#  Scenario: Verify User Cannot Select Scheme Not Allowed for One-Time Purchase
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "5000" milli second
#    When user click Select Button on MutualFund scheme
#    Then user verify partial static text "Purchase in this scheme"
#
#  @Validation @MutualFundValidation @iOSIdentificationIssue
#  Scenario: Verify Validation Error for OTP during Investment
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Invest"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "3000" milli second
#    And user enters investment amount "5000"
#    And user wait for "3000" milli second
#    And user selects Goal "MF Goal 001"
#    And user select folio number
#    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
#    And user click by text "Pay Now"
#    When user enters invalid otp for purchase MF Scheme
#    And user click by text "Confirm Order"
#    Then user verify text "Invalid OTP"
#    And user wait for "4000" milli second
#    When user click by text "Resend OTP"
#    And user wait for "180000" milli second
#    When user click by text "Resend OTP"
#    And user wait for "500" milli second
#    And user verify text "OTP has been sent to mobile and email."
#    And user wait for "180000" milli second
#    And user enter otp for purchase MF Scheme
#    And user click by text "Confirm Order"
#    Then user verify text "OTP is expired. Please click on resend OTP"
#
#  @Smoke @MutualFundSmoke @SomethingWentWrong
#  Scenario: User Invests in Mutual Fund via SIP
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And  user click by text "Start SIP"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    And user click Select Button on MutualFund scheme
#    And user wait for "3000" milli second
#    And user selects monthly SIP date as "3"
#    And user enters SIP Duration as "15"
#    And user select SIP Duration as "3 years" from Recommended Duration Box
#    And user enters invest amount for monthly SIP "1008"
#    And user select investment amount as "₹1,000" from Suggested Amount box
#    And user select folio number
#    And user scroll to view Calculate
#    And user selects Goal "MF Goal 001"
#    And user wait for "3000" milli second
#    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
#    And user click by text "Save SIP"
#    And user wait for "30000" milli second
#    And user do payment
#    And user enter otp for purchase MF Scheme
#    When user click by text "Confirm Order"
#    And user wait for "8000" milli second
#    Then user verify static text "SIP Created Successfully"
#    And user verify partial static text "Your SIP will start"
#    When user click static text "View SIPs"
#    Then user verify static text "SIP Amount  ₹1,000"

#  @Validation @MutualFundValidation
#  Scenario: verify user can't add more than four Mutual Fund schemes in one time
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Create MF Baskets"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya"
#    And user wait for "5000" milli second
#    When user click Add to Cart for Aditya Birla
#    And user close the fund card in one click invest screen
#    And user go back from "Mutual Fund Schemes" screen
#    And user click by text "Create MF Baskets"
#    And user wait for "5000" milli second
#    And user click Add to Cart for different schemes
#    Then user verify partial static text "You can add only 4 schemes"
#    And user verify static text "Continue to invest in selected schemes"
#    Then user clicks on Cancel button
#    And user verify static text "Mutual Fund Schemes"
#    And user click Add to Cart
#    And user wait for "2000" milli second
#    And user clicks on continue button
#    And user verify static text "One-Click Invest"
#    And user go back from "One-Click Invest" screen
#    And user click by text "Review & Confirm Investment"
#    And user verify static text "One-Click Invest"
#    And user remove all Schemes from One Click Invest screen
#
#  Scenario: User Invests in Mutual Fund through Create MF Baskets Link
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "Create MF Baskets"
#    And user wait for "3000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user wait for "5000" milli second
#    When user click Add to Cart
#    And user click Add to Cart icon in Mutual Fund schemes screen
#    Then user verify static text "Mode of Investment"
#    When user select One Time radio button
#    Then user verify static text "One-Time Amount"
#    And user verify static text "Minimum ₹1,000"
#    And user enter monthly sip amount as "500" for Aditya Birla Sun Life Forntline Equity Fund
#    And user select one folio number in one click invest screen
#    And user click by text "Continue"
#    Then verify validation error "Minimum amount should be ₹1,000"
#    And user remove all Schemes from One Click Invest screen
#    And user go back from "One-Click Invest" screen
#    When user click Add to Cart
#    And user click by text "Review & Confirm Investment"
#    When user select One Time radio button
#    And user select "Choose minimum amount for all schemes" check box
#    And user click by text "Continue"
#    Then verify validation error "Select Folio Number"
#    And user select one folio number in one click invest screen
#    And user click by text "Continue"
#    And user selects Financial Goal "MF Goal 001"
#    And user click by text contains "I / We have read the related Scheme Document"
#    When user click by text "Pay Now"
#    And user wait for "12000" milli second
#    And user go back from "OTP Verification" screen
#    And user go back from "One-Click Invest" screen
#    And user select Monthly SIP radio button
#    And user enter monthly sip amount as "500" for Aditya Birla Sun Life Forntline Equity Fund
#    And user select one folio number in one click invest screen
#    When user click by text "Continue"
#    Then verify validation error "Minimum amount should be ₹1,000"
#    And user select "Choose minimum amount for all schemes" check box
#    And user verify static text "Total SIP Amount"
#    And user click by text "Continue"
#    And user verify static text "One-Click Invest"
#    And user verify static text "Select Investment Options"
#    And user selects monthly SIP date as "1"
#    And user enters SIP Duration as "12"
#    And user selects Financial Goal "MF Goal 001"
#    And user click by text contains "I / We have read the related Scheme Document"
#    And user click by text "Authorize & Save"
#    And user wait for "12000" milli second
##    And user click on  Netbanking via Bank account and Netbanking details
##    And user click button text "Authenticate"
#    And user enter otp for invest in mutualFund
#    And user click by text "Confirm Order"
#    And user verify static text "SIP Created Successfully"
#
#  Scenario: Functionality of "Explore All Mutual Fund Schemes" Link
#    And application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text contains "Explore All Mutual Fund Schemes"
#    And user wait for "2000" milli second
#    And user search for mutual fund "Aditya birla sun life short"
#    And user click plus button for HDFC Mid Cap
#    And user wait for "5000" milli second
#    And user click by text "Invest"
#    And user wait for "8000" milli second
#    And user verify static text "Purchase"

#  Scenario:Verify Functionality of "View All" Link in Mutual Funds Screen
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "View All"
#    And user verify text "Equity"
#    And user verify static text "Market Capitalization"
#    And user click by text contains "Large Cap"
#    And user wait for "3000" milli second
#    And user verify static text "Large Cap"
#    And user verify static text "Funds that invest primarily in the top 100 companies which are more stable"
##    And user wait for "5000" milli second
#    And user verify static text "RainyDay"
#    And user verify static text "Large Cap Fund"
#    And user verify text "View"
#    And user verify text "Invest"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Funds that invest in the mid-sized companies with potential for high growth"
##    And user wait for "3000" milli second
#    And user verify static text "Mid Cap"
#    And user verify static text "Funds that invest in the mid-sized companies with potential for high growth"
##    And user wait for "5000" milli second
#    And user verify static text "HDFC Mid-Cap Opportunities Fund (G)"
#    And user verify static text "Mid Cap Fund"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Small Cap"
##    And user wait for "3000" milli second
#    And user verify static text "Small Cap"
#    And user verify static text "Suitable for long term, 7+ years. Carries high risk with potential for high return"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Large & Mid Cap"
##    And user wait for "3000" milli second
#    And user verify static text "Large & Mid Cap"
#    And user verify static text "Invests in top 250 stocks, diversification in large & mid size companies"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Flexi Cap"
##    And user wait for "3000" milli second
#    And user verify static text "Flexi Cap"
#    And user verify static text "Invests in any company regardless of size, flexible investment strategy"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Multi Cap"
##    And user wait for "3000" milli second
#    And user verify static text "Multi Cap"
#    And user verify static text "Invests in companies of all sizes with a pre-defined asset allocation"
#    And user go back from "Investment Ideas" screen
#    And user verify static text "Tax Saver"
#    And user scroll to value oriented
##    And user wait for "3000" milli second
#    And user click by text contains "ELSS"
##    And user wait for "3000" milli second
#    And user verify static text "ELSS"
#    And user verify static text "Get 80C tax benefits. Lock-in period of 3yr, shortest among tax saving options "
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user verify static text "Diversification"
#    And user click by text contains "Thematic"
##    And user wait for "3000" milli second
#    And user verify static text "Thematic"
#    And user verify static text "Invests in stocks selected from single sector or that fits in specific theme"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Focused"
##    And user wait for "3000" milli second
#    And user verify static text "Focused"
#    And user verify static text "Restricts the number of stocks in the portfolio to a maximum of 30"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Value Oriented / Contra"
##    And user wait for "3000" milli second
#    And user verify static text "Value Oriented / Contra"
#    And user verify static text "Invest in stocks that are undervalued & potential to grow in long term"
#    And user verify static text "SBI Contra Fund - Direct Plan (G)"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text "Debt"
##    And user wait for "3000" milli second
#    And user verify partial static text "Better than FD"
#    And user click by text contains "Banking & PSU"
#    And user verify static text "Banking & PSU"
#    And user verify static text "Invests in debt instruments of banks, PSU and public financial institutions"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Corporate Bond"
#    And user verify static text "Corporate Bond"
#    And user verify static text "Investment in high rates corporate bonds for a moderate to high returns"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user verify static text "Park Your Saving"
#    And user click by text contains "Investment horizon of upto 3 years can give steady returns with low risk"
#    And user verify static text "Short Duration"
#    And user verify static text "Investment horizon of upto 3 years can give steady returns with low risk"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Overnight"
#    And user verify static text "Overnight"
#    And user verify static text "Average maturity of these instruments are, 1 day. As good as savings account"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Liquid"
#    And user verify static text "Liquid"
#    And user verify static text "Best alternative to savings bank account, average maturity of portfolio is 91 days"
#    And user go back from "Investment Ideas" screen
##    And user wait for "3000" milli second
#    And user click by text contains "Ultra Short Duration"
#    And user verify static text "Ultra Short Duration"
#    And user verify static text "Average maturity period of these portfolio is 3 to 6 months"
##    And user wait for "5000" milli second
#    And user verify static text "SBI Magnum Ultra Short Duration Fund (G)"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Low Duration"
#    And user verify static text "Low Duration"
#    And user verify static text "Average maturity of the invested bonds is between 6 to 12 months"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Money Market"
#    And user verify static text "Money Market"
#    And user verify static text "Suitable for parking money for short term, better returns than savings account"
#    And user go back from "Investment Ideas" screen
#    And user scroll to others
#    And user click by text contains "Average maturity for portfolio is between 3 to 4 years"
#    And user verify static text "Medium Duration"
#    And user verify static text "Average maturity for portfolio is between 3 to 4 years"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Medium to Long Duration"
#    And user verify static text "Medium to Long Duration"
#    And user verify static text "More sensitive to interest rates changes, can give higher returns in long term"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Average maturity of above 7 years. Potential for high returns with added risk"
#    And user verify static text "Long Duration"
#    And user verify static text "Average maturity of above 7 years. Potential for high returns with added risk"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Dynamic Bond"
#    And user verify static text "Dynamic Bond"
#    And user verify static text "Invests in bonds across maturity period, can give stable return, less risky"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Credit Risk"
#    And user verify static text "Credit Risk"
#    And user verify static text "High risk as portfolio includes bonds that are rated risky, but can give high returns"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Investment mostly in government bonds, best for capital protection"
#    And user verify static text "Gilt"
#    And user verify static text "Investment mostly in government bonds, best for capital protection"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Gilt with 10 years Duration"
#    And user verify static text "Gilt with 10 years Duration"
#    And user verify static text "Invested in government bonds with average maturity period of 10 years"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Floatr"
#    And user verify static text "Floatr"
#    And user verify static text "Invest in bonds which have floating interest rate, sensitive to rate changes"
#    And user go back from "Investment Ideas" screen
#    And user click by text "Hybrid"
#    And user verify static text "Diversified Asset Class"
#    And user click by text contains "Dynamic Asset Allocation"
#    And user verify static text "Dynamic Asset Allocation"
#    And user verify static text "Allocation between debt and stocks can vary as per market conditions"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Funds invest in atleast 3 asset classes with atleast 10% in each asset classes"
#    And user verify static text "Multi Asset Allocation"
#    And user verify static text "Funds invest in atleast 3 asset classes with atleast 10% in each asset classes"
#    And user go back from "Investment Ideas" screen
#    And user verify static text "Equity - Debt Allocation"
#    And user click by text contains "Aggressive Hybrid"
#    And user verify static text "Aggressive Hybrid"
#    And user verify static text "Invests upto 65-80% in stocks and remaining in debt/ bonds"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Balanced Hybrid"
#    And user verify static text "Balanced Hybrid"
#    And user verify static text "Invests in equity and debt instruments with balanced allocation across both"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Conservative Hybrid"
#    And user verify static text "Conservative Hybrid"
#    And user verify static text "Invests upto 75-90% in debt/ bonds and only the remaining in stocks"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Equity Saving"
#    And user verify static text "Equity Saving"
#    And user verify static text "Invest in equity and equity Arbitrage positions with upto 65% in equity"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Exposure across stocks and bonds to reduce the impact of stock price change"
#    And user verify static text "Arbitrage"
#    And user verify static text "Exposure across stocks and bonds to reduce the impact of stock price change"
#    And user go back from "Investment Ideas" screen
#    And user click by text "Other"
#    And user verify static text "Other Funds"
#    And user click by text contains "Index Funds"
#    And user verify static text "Index Funds"
#    And user verify static text "Portfolio mimics a given index so the expected returns are similar to index"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Exchange Traded (ETF)"
#    And user verify static text "Exchange Traded (ETF)"
#    And user verify static text "Tracks a particular index, sector, commodity, or other assets"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Funds of Funds"
#    And user verify static text "Funds of Funds"
#    And user verify static text "Investments are done in other funds to take exposure in multiple themes"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Dividend Yield"
#    And user verify static text "Dividend Yield"
#    And user verify static text "Investments in sectoral or thematic stocks that pays dividends, high risk funds"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Children"
#    And user verify static text "Children"
#    And user verify static text "Get 80C tax benefits. Lock-in period of 3yr, shortest among tax saving options "
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Retirement"
#    And user verify static text "Retirement"
#    And user verify static text "Get 80C tax benefits. Lock-in period of 3yr, shortest among tax saving options "
#    And user go back from "Investment Ideas" screen
#    And user go back from "Investment Ideas" screen
#    Then user verify static text "Scheme Categories"
#
#  Scenario:verify funds categories in mutual fund schemes
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user wait for "2000" milli second
#    And user scroll to view Add External Folios
#    And user click by text contains "Large"
##    And user wait for "3000" milli second
#    And user verify static text "Large Cap"
#    And user verify static text "Funds that invest primarily in the top 100 companies which are more stable"
##    And user wait for "5000" milli second
#    And user verify static text "RainyDay"
#    And user verify static text "Large Cap Fund"
#    And user verify text "View"
#    And user verify text "Invest"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Mid"
##    And user wait for "3000" milli second
#    And user verify static text "Mid Cap"
#    And user verify static text "Funds that invest in the mid-sized companies with potential for high growth"
##    And user wait for "5000" milli second
#    And user verify static text "HDFC Mid-Cap Opportunities Fund (G)"
#    And user verify static text "Mid Cap Fund"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Small"
##    And user wait for "3000" milli second
#    And user verify static text "Small Cap"
#    And user verify static text "Suitable for long term, 7+ years. Carries high risk with potential for high return"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Flexi"
##    And user wait for "3000" milli second
#    And user verify static text "Flexi Cap"
#    And user verify static text "Invests in any company regardless of size, flexible investment strategy"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Equity"
#    And user verify static text "Market Capitalization"
#    And user click by text contains "Debt"
#    And user verify partial static text "Better than FD"
#    And user click by text contains "Hybrid"
#    And user verify static text "Diversified Asset Class"
#    And user go back from "Investment Ideas" screen
#    And user click by text contains "Tax Saver"
#    And user verify static text "Tax Saver"
#
#  Scenario: Verify "History" link is functional
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    When user click by text "History"
#    When user click on refresh icon in History Screen
#    And user wait for "3000" milli second
#    And user verify static text "Transactions"
#    And user click by text "Filter By"
#    And user wait for "2000" milli second
#    When user go back from "History" screen
#    Then user click by text "Filter By"
#    And user click by text "Failed"
#    And user click by text "Clear"
#    And user click by text "Filter By"
#    And user click by text "In Process"
#    And user click by text "Apply Filters"
#    And user wait for "2000" milli second
#    And user click on in Process transaction view
#    And user verify transaction under process
#    And user click by text "Filter By"
#    And user wait for "2000" milli second
#    And user click by text "Successful"
#    And user click by text "Apply Filters"
#    And user wait for "2000" milli second
#    And user verify partial text "Folio"
#    And user verify partial text "NAV"
#    And user verify partial text "Units"
#    And user verify partial text "Date"
#    And user click by text "Filter By"
#    And user wait for "2000" milli second
#    And user click by text "Failed"
#    And user click by text "Apply Filters"
#    And user wait for "2000" milli second
#    And user verify transaction failed
#    And user verify partial text "Transaction failed"
#    And user click by text "Filter By"
#    And user wait for "2000" milli second
#    And user click by text "Clear"
#    And user click by text "Filter By"
#    And user wait for "2000" milli second
#    And user click by text "Type"
#    And user click by text "switch_in"
#    And user click by text "Apply Filters"
#    And user wait for "3000" milli second
#    Then user verify partial text "Switch In"
#And user click by text "Filter By"
#    And user wait for "2000" milli second
#    And user click by text "Type"
#  And user click by text "SWP"
#And user click by text "Apply Filters"
#    And user wait for "3000" milli second
#    Then user verify partial text "SWP"
#    When user search for mutual fund "Uco"
#    Then user verify static text "No Record Found"
#    When user go back from "History" screen
#    Then user verify text "Mutual Funds"
#
#    @iOSIdentificationIssue
#  Scenario: verify "filter" link is functional in History screen
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    When user click by text "History"
#    When user click by text "Filter By"
#    And user wait for "2000" milli second
#    Then user verify text "Status"
#    And user verify text "Cancelled"
#    And user verify text "Payment_Confirmed"
#    And user click by text "Type"
#    And user verify text "Buy"
#    And user verify text "Sell"
#    And user verify text "SIP"
#    And user click by text "AMC"
#    And user verify text "Aditya Birla"
#    And user verify partial text "Axis"
#    And user verify text "HDFC"
#    And user verify text "ICICI"
#    And user verify text "IDFC"
#    And user verify text "Kotak"
#    And user verify text "Mirae Asset"
#    And user verify text "SBI"
#    And user verify text "UTI"
#    And user search invalid AMC as "Abc"
#    Then  user verify static text "No Record Found"
#    And user go back from "History" screen
#    When user click by text "Filter By"
#    And user wait for "2000" milli second
#    When user click by text "Goals"
#    And user verify text "MF Goal 001"
#    When user click by text "Folio"
#    Then user verify partial text "Aditya"
#    When user click by text "Source"
#    Then user verify text "In App Transactions"
#    And user verify text "External Transactions"
#    When user click by text "External Transactions"
#    And user click by text "Clear"
#    When user click by text "Filter By"
#    And user wait for "2000" milli second
#    When user click by text "Source"
#    When user click by text "External Transactions"
#    And user click by text "Apply Filters"
#    Then user verify static text "No Record Found"
#    When user search for mutual fund "Uco"
#    Then user verify static text "No Record Found"
#    When user click on refresh icon in History Screen
#    Then user verify static text "History page is up to date"
#
#  Scenario: verify Manage SIP is functional
##    Given user login with user "8528528522 | 8528528522"
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    When user click by text "Manage SIP"
#    And user wait for "2000" milli second
#    And user go back from "My SIPs" screen
#    And user click by text "Manage SIP"
#    And user click by text "MF STP"
#    And user verify partial static text "STP Amount"
#    And user verify partial static text "Start Date"
#    And user verify partial static text "STP Amount"
#    And user verify partial static text "Frequency"
#    And user verify partial static text "Installments"
#    And user verify partial static text "Transferred Till Date"
#    And user click by text "MF SWP"
#    And user verify partial static text "SWP Amount"
#    And user click by text "Gold SIP"
#    And user click by text "MF SIP"
#    And user verify partial static text "SIP Amount"
#    When user click three dot icon in My SIP Screen
#    Then user verify text "Manage SIP"
#    When user click by text "Transaction History"
#    And user verify static text "Goal"
#    And user verify partial static text "Folio:"
#    And user verify static text "ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH"
#    And user verify static text "Created on"
#    And user verify partial static text "Successful"
#    And user verify partial static text "Failed / Skipped"
#    And user verify static text "Date"
#    And user verify static text "Amount"
#    And user verify static text "Type"
#    And user verify static text "Action"
##    When user click transaction process drop down
##    Then user verify static text "Transaction under process"
##    When user click transaction skipped drop down
##    Then user verify static text "Instalment skipped"
##    When user click transaction success drop down
##    Then user verify partial static text "NAV ₹"
##    And user verify partial static text "Units"
#    And user go back from "SIP Transaction History" screen
#    And user click three dot icon in My SIP Screen
#    And user click by text "Stop SIP"
#    Then user verify static text "This SIP cannot be stopped"
#    And user verify partial static text "Minimum"
#    And user remove stop SIP popup
#    And user wait for '2000' milli second
#    And user click three dot icon in My SIP Screen
#    When user click by text "Skip Next Instalment"
#    Then user verify partial static text "This will skip your instalment"
#
#  @Validation @MutualFundValidation
#  Scenario: Verify validation error in Add External Folio screen
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user scroll to view Add External Folios
#    When user click by text contains "Add External Folios"
#    Then user verify static text "Add External Folio"
#    And user verify static text "What is external folio?"
#    And user verify partial static text "These can be folios created through an offline"
#    And user verify partial static text "Folio must have an investment under the"
#    And user verify partial static text "Once a folio is added, the investment under that folio will be"
#    When user enter folio number as "qw3465gftr87bv54xsa321vh876547y768tyf"
#    And user click by text "Submit"
#    Then verify validation error "Folio number must not be more than 30 characters"
#    When user enter folio number as "QQ54we9iu8765"
#    And user click by text "Submit"
#    And user wait for "2000" milli second
#    Then user verify static text "Failed"
#    And user verify partial static text "This folio may not be mapped to Floatr"
#    And user click by text "OK"
#    Then user verify static text "Add External Folio"
#    When user enter folio number "QQ4V4CY1Y5TSW"
#    And user click by text "Submit"
#    And user wait for "2000" milli second
#    Then user verify static text "Failed"
#    And user verify partial static text "Folio number already exists"
#    And user click by text "OK"
#    When user enter folio number as "QQ4"
#    And user click by text "Submit"
#    Then verify validation error "Folio number must be atleast 4 characters"
#
#  @Validation @MutualFundValidation
#  Scenario: Verify validation error in redeem mutual funds screen
##    Given user login with user "6888888888 | 6888888888"
#    And application launched successfully
#    When user clicks on Mutual Funds
#    Then user click by text "View Mutual Fund Portfolio"
#    And user wait for "4000" milli second
#    And user click by text contains "MF Goal 001"
#    And user wait for "2000" milli second
#    And user click on three dot icon in wealth screen
#    And user click by text "Sell"
#    And user wait for "3000" milli second
#    And user verify partial static text "NAV"
#    And user verify partial static text "Units"
#    And user verify partial static text "Fund Value"
#    And user verify partial static text "P&L"
#    And user verify static text "Receive funds in"
#    And user verify static text "How do you wish to redeem"
#    And user click by text "Partial Funds"
#    When user enter partial funds amount as "65"
#    And user click by text "Continue to OTP Confirmation"
#    Then verify validation error "Amount should be greater or equal to ₹1,000"
#    And user click by text "Partial Units"
#    When user enter partial units as "1000000"
#    And user click by text "Continue to OTP Confirmation"
#    Then user verify partial static text "Units should not be greater than"
#
#  Scenario: Verify Functionality of "Transaction History" in MF wealth Screen
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "View Mutual Fund Portfolio"
#    And user wait for "4000" milli second
#    And user click by text contains "MF Goal 001"
#    And user wait for "2000" milli second
#    And user click on three dot icon in wealth screen
#    When user click by text "Transaction History"
#    Then user verify static text "Goal"
#    And user verify static text "Aditya Birla Sun Life Frontline Equity Fund (G)"
#    And user verify static text "Date"
#    And user verify static text "Amount"
#    And user verify static text "Type"
#    And user verify static text "Action"
##    And user click processed transaction history
##    And user verify static text "Transaction under process"
##    And user click skipped instalment history
##    And user click successful invested transaction history
##    And user verify partial static text "NAV"
##    And user verify partial static text "Units"
#    And user click refreshIcon in Fund Transaction History screen
#
#  @Smoke @MutualFundSmoke
#  Scenario: Verify User Can Sell Mutual Funds Partial Funds
##    Given user login with user "9809801218 | 9809801218"
#    And application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "View Mutual Fund Portfolio"
#    And user wait for "4000" milli second
#    And user click by text contains "MF Goal 001"
#    And user wait for "2000" milli second
#    And user click on three dot icon in aditya birla short term goal
#    And user click by text "Sell"
#    And user wait for "3000" milli second
#    And user click by text "Partial Funds"
#    And user enter partial funds amount as "1000"
#    And user click by text "Continue to OTP Confirmation"
#    And user wait for "6000" milli second
#    And user enter otp for redeem partial funds
#    And user click by text "Confirm Order"
#    And user wait for "8000" milli second
#    And user verify static text "Order Submitted"
#    When user click static text "View Transaction History"
#    Then user verify static text "Sell"
#
#  Scenario: Verify User Can Sell Mutual Funds by Partial Units
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "View Mutual Fund Portfolio"
#    And user wait for "2000" milli second
#    And user click by text contains "MF Goal 001"
#    And user wait for "2000" milli second
#    And user click on three dot icon in aditya birla short term goal
#    And user click by text "Sell"
#    And user wait for "3000" milli second
#    And user click by text "Partial Units"
#    And user enter partial units as "1"
#    And user click by text "Continue to OTP Confirmation"
#    And user wait for "6000" milli second
#    And user enter otp for redeem partial units
#    And user click by text "Confirm Order"
#    And user wait for "8000" milli second
#    And user verify static text "Order Submitted"
#
  Scenario: Verify User Can Invest More After Initial Investment
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user click by text contains "Invest More"
    And user wait for "2000" milli second
    And user click by text "₹2,000"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Pay Now"
    And user wait for "4000" milli second
    And user enter otp for purchase MF Scheme
    And user click by text "Confirm Order"
    And user wait for "20000" milli second
    And user click on Netbanking All Indian banks
    And user click button text "Pay Now"
    And user wait for "7000" milli second
    And user click button text "Success"
    And user wait for "20000" milli second
    And user verify static text "Order Submitted"

  Scenario: verify Functionality of Start SIP link in wealth screen
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    When user click by text "Start SIP"
    And user selects monthly SIP date as "3"
    And user select SIP Duration as "3 years" from Recommended Duration Box
    And user select investment amount as "₹1,000" from Suggested Amount box
    And user scroll to I we have read the related schemes
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Save SIP"
    And user wait for "30000" milli second
    And user do payment
    And user enter otp for purchase MF Scheme
    When user click by text "Confirm Order"
    And user wait for "2000" milli second
    Then user verify static text "SIP Created Successfully"
    And user verify partial static text "Your SIP will start"

#  Scenario: verify Functionality of Scheme Details Link
#    Given application launched successfully
#    And user clicks on Mutual Funds
#    And user click by text "View Mutual Fund Portfolio"
#    And user wait for "2000" milli second
#    And user click by text contains "MF Goal 001"
#    And user wait for "2000" milli second
#    And user click on three dot icon in aditya birla short term goal
#    When user click by text "Scheme Details"
#    And user verify static text "Scheme Detail"
#    And user verify static text "Fund Performance"

  @Validation @MutualFundValidation
  Scenario: Verify validation when Switching from one mutual fund scheme to another
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user click by text "Switch"
    And user verify partial static text "NAV"
    And user verify partial static text "Units"
    And user verify partial static text "Fund Value"
    And user verify partial static text "P&L"
    And user verify static text " Target Scheme"
    When user click static text " Please Select Target Scheme"
    And user wait for "3000" milli second
    Then user scroll to view aditya birla sun life infrastructure fund
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    When user remove "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes from swith screen
    Then user click static text " Please Select Target Scheme"
    And user wait for "3000" milli second
    Then user scroll to view aditya birla sun life infrastructure fund
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user click by text "Partial Fund"
    When user enter partial funds amount as "900"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    Then verify validation error "Minimum Amount is ₹1,000"
    When user enter amount more than fund value
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Amount must be less than fund value"
    And user click by text "Partial Unit"
    And user click by text "Continue to OTP Confirmation"
    Then verify validation error "Unit must be greater than 0.001"
    When user enter partial units as "1000000"
#      And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Unit must be less than MF Units"

  Scenario: Switching partial funds from one mutual fund scheme to another
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user click by text "Switch"
    When user click static text " Please Select Target Scheme"
    And user wait for "3000" milli second
    Then user scroll to view aditya birla sun life infrastructure fund
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user click by text "Partial Fund"
    When user enter partial funds amount as "1005"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    And user enter otp for redeem partial funds
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "Switch Order Successful"
    Then user verify bellow switch schemes status
      | Source Scheme                                  | Target Scheme                                      | Amount |
      | ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH | ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH | ₹1,005 |
    When user click static text "View Transaction History"
    And user wait for "5000" milli second
    Then user verify static text "Switch In"
    And user verify static text "Switch Out"

  @Validation @MutualFundValidation
  Scenario: Validation while doing systematic transfer plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user wait for "2000" milli second
    And user click by text "Systematic Transfer Plan"
    And user wait for "3000" milli second
    When user click static text " Please Select Target Scheme"
    And user wait for "3000" milli second
    Then user scroll to view aditya birla sun life infrastructure fund
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user select Daily STP radio button
    When user click by text "Continue to OTP Confirmation"
    Then verify validation error "This field is required"
    And verify validation error "Amount is required"
    And user enter number of transfer as "2"
    And user enter amount as "400" for stp
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    When user click by text "Continue to OTP Confirmation"
    Then verify validation error "Min Duration is 6"
    And verify validation error "Minimum Amount is ₹500"
    And user enter amount as "9999999999" for stp
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Amount must be less than fund value"
    When user click by text "Transfer till there is balance (Perpetual)  "
    Then number of transfer input box is disappear

  Scenario: Monthly systematic transfer plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user click by text "Systematic Transfer Plan"
    When user click static text " Please Select Target Scheme"
    Then user scroll to view aditya birla sun life infrastructure fund
    And user select button of "ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH" schemes
    And user select Monthly STP radio button
    And user scroll to I we have read the related schemes
    When user select stp start date as "10"
    And user enter number of transfer as "13"
    And user click by text "₹750"
    And user click "I / We have read the related Scheme Document of the selected fund before investing" check box
    And user click by text "Continue to OTP Confirmation"
    And user wait for "5000" milli second
    And user enter otp for redeem partial funds
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "STP Created Successfully"
    And user verify bellow STP status
      | Source Scheme                                  | Target Scheme                                      | Amount | Date        | Frequency |
      | ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH | ADITYA BIRLA SUN LIFE INFRASTRUCTURE FUND - GROWTH | ₹750   | 10 Feb 2024 | Monthly   |
    When user click static text "View STPs"
    And user wait for "3000" milli second
    Then user verify static text "STP Amount  ₹750"

  @Validation @MutualFundValidation
  Scenario: Validation Weekly systematic withdrawal plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user wait for "2000" milli second
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user click by text "Continue to OTP Confirmation"
    Then verify validation error "This field is required"
    And verify validation error "Amount is required"
    When user select swp start day as "Monday"
    And user enter swp duration as "2"
    And user enter amount as "400" for swp
    And user click by text "Continue to OTP Confirmation"
    Then verify validation error "Min Duration is 6"
    And verify validation error "Minimum Amount is ₹500"
    And user enter amount as "999999" for swp
    And user click by text "Continue to OTP Confirmation"
    Then user verify partial static text "Amount must be less than fund value"

  Scenario: Weekly systematic withdrawal plan
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user wait for "2000" milli second
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user select swp start day as "Monday"
    And user enter swp duration as "8"
    And user enter amount as "600" for swp
    And user click by text "Continue to OTP Confirmation"
    And user enter otp for redeem partial funds
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "SWP Created Successfully"
    And user verify bellow SWP status
      | Scheme                                         | Amount | Frequency |
      | ADITYA BIRLA SUN LIFE SHORT TERM FUND - GROWTH | ₹600   | Weekly    |
    When user click static text "View SWPs"
    Then user verify static text "SWP Amount  ₹600"
    And user verify static text "Frequency  Weekly"

  Scenario: Weekly systematic withdrawal plan with perputal
    Given application launched successfully
    And user clicks on Mutual Funds
    And user click by text "View Mutual Fund Portfolio"
    And user wait for "2000" milli second
    And user click by text contains "MF Goal 001"
    And user wait for "2000" milli second
    And user click on three dot icon in aditya birla short term goal
    And user wait for "2000" milli second
    And user click by text "Systematic Withdrawal Plan"
    And user select weekly swp radio button
    When user select swp start day as "Monday"
    And user click static text "Withdraw till there is balance (Perpetual)  "
    And user enter amount as "700" for swp
    And user click by text "Continue to OTP Confirmation"
    And user enter otp for redeem partial funds
    And user click by text "Confirm Order"
    And user wait for "5000" milli second
    Then user verify static text "SWP Created Successfully"
    When user click static text "View SWPs"
    Then user verify static text "SWP Amount  ₹700"
    And user verify static text "Installments   0/Perpetual"

#  Scenario: Verify Move Scheme to Another Goal Functionality
#    Given application launched successfully
#    When user clicks on Mutual Funds
#    And user click by text "View Mutual Fund Portfolio"
#    And user wait for "2000" milli second
#    And user click by text contains "MF Goal 001"
#    And user wait for "2000" milli second
#    And user click on three dot icon in wealth screen
#    And user click by text "Move Scheme to Another Goal"
##    And user move to goal "Wealth"
##    And user click by text "Confirm"
##    Then user verify text "Current Value"
