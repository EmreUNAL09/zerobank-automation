Feature: Login Test

  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials

  Scenario: Positive scenario:  The user user should be able to login
    Then Verify with "Pay Bills"
    Then The user should be able to see as a page header "Zero - Pay Bills"