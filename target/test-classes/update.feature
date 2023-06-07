Feature: Update Data
  Scenario: user should be able to update data
    Given the user is on homepage
    When user click edit button on data
    And user edit one of data
    And user click submit
    Then user success to update data