#Please visit https://opensource-demo.orangehrmlive.com/index.php/dashboard
Feature: Test Orange HRM website
   Background: user is logged in
    Given user is on login page
    And login using userid >Admin and Password >admin123
    Then user is navigated to the homepage
    
  Scenario: Check User Role column is present and search users
    When user clicks on Admin link
    Then user is redirected to user Management
    And Goto user Managment > users
    And Verify User Role column is present
    And Search for <user>
    Then logout and close browser

  Examples: 
      | user |
     | bhavana  |
      | priyanka|

  Scenario: Check Employee Name column is present
    When user clicks on level
    And user clicks on My level
    Then Verify Employee Name column is present
    Then logout and close browser1

