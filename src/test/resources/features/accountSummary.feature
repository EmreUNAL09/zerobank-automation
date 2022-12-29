
Feature: Account Summary

  Background:
    Given The user is on the login page
    When The user enters with "username" and "password" credentials

  Scenario: The user should be able to see following menu
    Then The user should be able to see as a page header "Zero - Account Summary"
    Then The user should be able to see account types, under the Account Summary
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

#    And The user should be able to see titles, under the Credit Accounts
#      | Account     |
#      | Credit Card |
#      | Balance     |

  Scenario Outline:
    Then  The user should be able to see with <CreditAccountNumber> this "<CreditAccountName>"
    Examples:
      | CreditAccountNumber | CreditAccountName |
      | 1                   | Account           |
      | 2                   | Credit Card       |
      | 3                   | Balance           |

