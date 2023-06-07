Feature: Upload Data
  Scenario: user should be able to upload data
    Given the user is on homepage
    When user click Choose File
    And user choose file from computer
    And click open
    And click Upload button
    Then user success to upload file