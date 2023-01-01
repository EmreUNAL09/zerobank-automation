
Feature: Account Activity

  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And The user selects the "Account Activity" menu


#  Scenario: Positive scenario:  The user user should be able to login
#    And The user should be able to see as a page header "Zero - Account Activity"
#    And The default option in the Account menu should be "Savings"
#    And The user should be able to see following options in the account box
#      | Savings     |
#      | Checking    |
#      | Savings     |
#      | Loan        |
#      | Credit Card |
#      | Brokerage   |


  Scenario Outline: The user should be able to see following menu
    Then The user should be able to see "<TransactionsTableHeaders>" with <TransactionTableLocNumber>
    Examples:
      | TransactionsTableHeaders | TransactionTableLocNumber |
      | Date                     | 1                         |
      | Description              | 2                         |
      | Deposit                  | 3                         |
      | Withdrawal               | 4                         |

#  BU SENARYOYU FARKLI BİR YÖNTEMLE YAPALIM ÖRNEĞİN: DDF