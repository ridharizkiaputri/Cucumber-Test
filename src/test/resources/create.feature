Feature: Create Data
  Scenario: User should be able to create data
    Given the user is on homepage
    When user click add button
    And user input First Name
    And user input Last Name
    And user input Email
    And user input Age
    And user input Salary
    And user input Department
    And user click submit
    Then user success add data to table