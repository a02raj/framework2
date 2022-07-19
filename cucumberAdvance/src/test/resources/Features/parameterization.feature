#Parameterization and data driven
#use country
Feature: feature to test login functionality with parameters

  Scenario Outline: Check login is successful with valid creditionals
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login page
    Then user is navigated to the home use <countries>
    
    Examples: 
      | username | password | countries |
      | name1    |    12345 | India |
      | name2    |    12345 | Russia |
