@wip
Feature: Account Activity

  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials

  Scenario: Positive scenario:  The user user should be able to login
    And The user selects the "Account Activity" menu
    And The user should be able to see as a page header "Zero - Account Activity"
    And The default option in the Account menu should be "Savings"

#  Scenario Outline:
#    And The account menu should also contain the following "<options>"
#    Examples:
#      | options     |
#      | Savings     |
#      | Checking    |
#      | Savings     |
#      | Loan        |
#      | Credit Card |
#      | Brokerage   |
#
#  Scenario Outline:
#    Then The user should be able to see "<TransactionsTableHeaders>" with <TransactionTableLocNumber>
#    Examples:
#      | TransactionTableLocNumber | TransactionsTableHeaders |
#      | 1                         | Date                     |
#      | 2                         | Description              |
#      | 3                         | Deposit                  |
#      | 4                         | Withdrawal               |