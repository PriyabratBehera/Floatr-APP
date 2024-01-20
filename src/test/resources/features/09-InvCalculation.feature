
Feature: Calculation Scenario
  @Calculator
  Scenario: Verify validation in income screen
#    Given user login with user "9123123123 | 9123123123"
    And application launched successfully
    When user click income tax planner
    Then user verify static text "Income Tax Planning"
    And user verify partial static text "Input your income, HRA, LTA, Insurance, Investments & Loans to"
    And user verify partial static text "Compare Income Tax"
    And user verify partial static text "in Old & New Tax Regime"
    And user verify partial static text "For FY 2023-2024"
    When user click by text "Plan My Income Tax"
    And user enter gross salary as "999999999"
    Then user verify text "Salary Gross Salary Value cannot exceed ₹ 9,99,99,999"
    And user enter gross salary as "100000"
    And user enter basic salary plus DA as "60000"
    And user click on information icon for salary
    And user verify static text " A gross salary is a gratuity and EPF (employee provident fund) subtracted from the cost to the company. Basic Salary, HRA, LTA and Special allowance are some of the most popular component of Gross Salary."
    And close gross salary screen
    And the user selects Yes for the question Do you get rent from a residential property?
    And the user selects Yes for the question Have you taken a home loan from this property?
    And user enter rent received amount as "99999999"
    And user enter property tax paid amount as "99999999"
#    Then verify validation error "Value cannot exceed ₹ 10,00,000"
    And user scroll to any other income
    And user enter consulting income amount as "999999999"
    And user enter any other income amount as "999999999"
    And user click on information icon in income tax planner screen
    And user verify static text "Enter the actual rent received from your property and we will calculate your taxable rental income."
    And user verify static text "Municipal taxes paid for the property"
    And user verify static text "30% of the total rent receive as standard deduction mean for repair and maintenance of the house. This amount is calculated after deducting property taxes"
    And user close rental income screen
    And user click on information icon in additional income screen
    And user verify static text "In this section enter any income that you may have apart from salary and pension. If you have multiple such income, enter the sum of all."
    And user close additional income screen
    Then user verify static text "Additional Income, if any"

  Scenario: Calculate income tax for bellow seventy lack gross salary
#    Given user login with user "9123123123 | 9123123123"
    And application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "300000"
    And user enter basic salary plus DA as "200000"
    And the user selects Yes for the question Do you get rent from a residential property?
    And the user selects Yes for the question Have you taken a home loan from this property?
    And user enter rent received amount as "100000"
    And user enter property tax paid amount as "50000"
    And user scroll to any other income
    And user enter consulting income amount as "30000"
    And user enter any other income amount as "40000"
    When user click by text "Continue"
    Then user verify static text "Congratulations!"
    And user verify partial static text "Your Gross Income of ₹3,90,000"
    And user verify static text "Gross taxable income of upto ₹7 Lakhs is exempt from income tax for everyone. For someone who is salaried or drawing pension, additional ₹50,000 is exempted as standard deduction."
    When user click by text "Re-Calculate"
    Then user verify static text "Additional Income, if any"

  Scenario: Calculate income tax for above seventy lack gross salary
#    Given user login with user "9123123123 | 9123123123"
    And application launched successfully
    When user click income tax planner
    And user click by text "Plan My Income Tax"
    And user enter gross salary as "7000000"
    And user enter basic salary plus DA as "5000000"
    And the user selects Yes for the question Do you get rent from a residential property?
    And the user selects Yes for the question Have you taken a home loan from this property?
    And user enter rent received amount as "500000"
    And user enter property tax paid amount as "200000"
    And user scroll to any other income
    And user enter consulting income amount as "200000"
    And user enter any other income amount as "100000"
    When user click by text "Continue"
    And user click on information icon for hra benefits
    And user verify static text "HRA is a component of salary that may be subject to partial or full tax deductions under Section 10(13A) of the Income Tax Act."
    And user close hra benefit screen
    And user click on information icon for lta benefits
    And user verify static text " LTA is a type of allowance part of a salary. It covers within country travel costs when you are on leave from work."
    And user close lta benefit screen
    And the user selects Yes for the question Are you paying home rent?
    And the user selects Yes for the question Do you stay in a metro city?
    And user enter annual hra received amount as "700000"
    And user enter rent paid amount as "250000"
    And the user selects Yes for the question Are you claiming LTA?
    And user enter annual LTA received amount as "100000"
    And user enter travel coast amount as "50000"
    When user click by text "Continue"
    And user click on information icon for investment and insurance
    And user verify static text "Investments done in some specified products are exempted from income tax upto certain limit u/s 80C"
    And user verify static text "Self Contribution to EPF"
    And user close investment and insurance screen
    And user click on information icon for nps investment
    And user verify static text "NPS offers multiple tax benefits to an individual under three different sections, 80CCD(1), 80CCD(1B) and 80CCD(2)"
    And user verify static text "Self Contribution in NPS"
    And user close nps investment screen
    And user close investment and insurance screen
    And user enter total PPf as "1500000"
    And user enter life insurance premium as "300000"
    And user enter school tuition fees as "200000"
    And user enter self contribution to nps as "2000000"
    And user enter corporate contribution to nps as "20000000"
    Then verify validation error "Value cannot exceed ₹ 1,50,000"
    And verify validation error "Value cannot exceed ₹ 2,00,000"
    And verify validation error "Value cannot exceed Basic Salary + DA"
    And user enter total PPf as "150000"
    And user enter life insurance premium as "30000"
    And user enter school tuition fees as "20000"
    And user enter self contribution to nps as "200000"
    And user enter corporate contribution to nps as "2000000"
    When user click by text "Continue"
    And user click on information icon for health insurance for family
    And user verify static text "Health Insurance premiums for self, spouse and children are eligible for tax exemption u/s 80D"
    And user verify static text " ₹25,000 if you are under 60y age"
    And user close health insurance for family screen
    And user click on information icon for health insurance for parents
    And user verify static text "Health Insurance premiums for parents are eligible for tax exemption u/s 80D"
    And user verify static text "Mediclaim Policy"
    And user close health insurance for parents screen
    And the user selects Yes for the question Medical Insurance Premium for self & family
    And the user selects Yes for the question  Is any one of you aged above sixty years?
    And user enter Medical Insurance Premium for self and family as "900000"
    Then verify validation error "Value cannot exceed ₹ 1,00,000"
    And the user selects Yes for the question Do you pay for medical insurance of parents?
    And the user selects Yes for the question Is any of the insured parent aged above sixty years?
    And user enter medical insurance premium for parents as "900000"
    And user enter Medical Insurance Premium for self and family as "50000"
    And user enter medical insurance premium for parents as "50000"
    When user click by text "Continue"
    And user click on information icon for home loan
    And user verify static text "Home loans taken for the house in which your are staying offers tax exemptions"
    And user close home loan screen
    And the user selects Yes for the question Do you have loan for self occupied home?
    And user enter annual interest for loan as "1000000"
    And user enter annual principle on this loan as "1000000"
    And user enter annual interest on property that is rent out as "1000000"
    Then verify validation error "Value cannot exceed ₹ 2,00,000"
    Then verify validation error "Value cannot exceed ₹ 1,50,000"
    Then verify validation error "Value cannot exceed ₹ 3,50,000"
    And user enter annual interest for loan as "100000"
    And user enter annual principle on this loan as "100000"
    And user enter annual interest on property that is rent out as "100000"
    When user click by text "Continue"
    Then user verify static text " Opt for Old Tax Regime and ₹25,740 more in taxes "
    And user verify static text " Old Regime Vs New Regime"
    When user click by text "View Detail"
    Then user verify static text "Gross Income"
    Then user verify static text "Salary"
    And user verify static text "₹70,00,000"
    Then user verify static text "Rental"
    And user verify static text "₹1,50,000"
    Then user verify static text "Other Income"
    And user verify static text "₹3,00,000"
    When user click by text "Tax Payable : ₹19,64,820"
    Then user verify static text "Income Tax Break-up"
    And user verify static text "Total Tax Payable"
    And user verify static text "₹19,64,820"
    And user verify static text "Surcharge"
    And user verify static text "₹1,71,750"
    And user verify static text "Education & Health Cess"
    And user verify static text "₹75,570"
    When user close income tax break-up screen
    When user click by text "New Regime"
    Then user verify static text "₹19,90,560"
    And user verify static text "₹17,40,000"
    And user verify static text "₹1,74,000"
    And user verify static text "₹76,560"
    And user click by text "Tax Payable : ₹19,90,560"
    And user scroll to Exemptions
    And user verify static text "Taxable Income"
    When user click on exemption drop down
    Then user verify static text "Corporate NPS u/s 80CCD(2)"
    And user verify static text "Loan Rented"
    And user verify static text "₹5,00,000"
    And user verify static text "₹1,00,000"
    When user click by text "Save Tax Now"
    Then user verify text "NPS Min. investment ₹500 Maturity at the age 60"

  Scenario: Start Investment for Tax Benefits link is functional
#    Given user login with user "9123123123 | 9123123123"
    And application launched successfully
    When user click income tax planner
    And user click by text "Start Investment for Tax Benefits"
    When user click by text "Start Investment for Tax Benefits"
    Then user verify static text "Start Investment for Tax Benefits"
    And user go back from "NPS" screen
    And user click income tax planner
    And user click by text "Start Investment for Tax Benefits"
    And user click by text "ELSS Mutual Fund High Returns up to 15% With only 3 years lock-in"
    And user go back from "ELSS Mutual Funds" screen
    And user click by text "Health Insurance Covers hospitalisation cost for self, family & parents"
    And user go back from medical insurance screen
    And user click by text "Hospital Cash Get fixed benefits in case of hospitalisation"
    And user go back from " Daily Hospital Cash" screen
    And user click by text "Term Insurance Secure family finances With high sum assured"
    And user go back from "Term Life Insurance" screen
    And user go back from "Income Tax Planning" screen
    And user go back from "Income Tax Planner" screen
    And user verify static text "Personal Financial Planners"















