Feature: LoginFeature
  This feature deals with the functionality of login application

  Scenario: user can login successfully
    Given user is at login page
    When user inputs valid username and password
    And user clicks login button
    Then user is at homepage