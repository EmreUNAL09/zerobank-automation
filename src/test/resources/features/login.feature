
Feature: Login Test

  Background: Go to home page
    Given The user is on the login page

  Scenario: Positive scenario:  The user user should be able to login
    When The user enters with "username" and "password" credentials
    Then Verify with "Account Summary"

  Scenario Outline: Negative scenario : The user should NOT be able to login with invalid credentials
    When The user enters "<invalidUsername>" and "<invalidPassword>" credential
    Then  verify invalid credential "<message>"
    Examples:
      | invalidUsername | invalidPassword | message                          |
      | invaliduser     | password        | Login and/or password are wrong. |
      | username        | invalidpassword | Login and/or password are wrong. |
      |                 | password        | Login and/or password are wrong. |
      | username        |                 | Login and/or password are wrong. |
      |                 |                 | Login and/or password are wrong. |

