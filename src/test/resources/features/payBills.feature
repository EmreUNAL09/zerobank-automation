@wip
Feature: Pay Bills Page Test

  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And The user selects the "Pay Bills" menu
    And The user should be able to see as a page header "Zero - Pay Bills"

  Scenario: Positive -Payment scenario
    And The user selects "Bank of America" in Payee menu
    And The user selects "Savings" in Account menu
    And The user enters amount
    And The user enters date
    And The user enters "House rent" to description box
    When The user pay submit
    Then The user should be able to see "The payment was successfully submitted."


  Scenario Outline: Negative scenario : The user should NOT be able to
    When The amount field must NOT contain alphabetic or special "<characters>"
    And The user enters date
    When The user pay submit
    Then When alphabetic or special characters are entered in the amount field, the "<message>" should NOT be displayed.
    Examples:
      | characters | message                                 |
      | /1200      | The payment was successfully submitted. |
      | *500$      | The payment was successfully submitted. |
      | ?1400      | The payment was successfully submitted. |
      | SELAM      | The payment was successfully submitted. |

  Scenario: Negative scenario : The user should NOT enters alphabetical characters in the date field
    When Alphabetical characters "Slm" should NOT be written in the date field.
    When The user pay submit
    Then The user should be able to see "The payment was successfully submitted."


