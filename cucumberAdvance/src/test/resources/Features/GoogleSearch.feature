Feature: feature to test google search functionality

  @Capgemini
  Scenario Outline: Check Google search with Chrome
    Given user is on google search page
    When user searches for <searchText>
    Then user is navigated to search result
    Then close Browser
    Examples: 
      | searchText |
      | capgemini |
      
  @Accenture
  Scenario Outline: Check Google search with Mozilla
    Given user is on google search page
    When user searches for <searchText>
    Then user is navigated to search result
    Then close Browser
   
 Examples: 
      | searchText |
      | accenture |