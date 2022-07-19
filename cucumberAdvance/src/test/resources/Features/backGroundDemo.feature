Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    And user enters username and password
    Then user is navigated to the homepage

  Scenario: Check logout functionality
   # Given user is logged in
    When user clicks on welcome link
    And logout link is displayed

  Scenario: Verify quick launch toolbar is present
   # Given user is logged in
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
