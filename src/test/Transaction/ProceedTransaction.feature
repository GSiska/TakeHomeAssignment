Feature: ShoppingCartFeature
  This feature deals with the functionality of proceeding transaction

  Scenario: verify user can proceed transaction
    Given user is at website first page
    When user filters product from highest to lowest price
    And user selects the first product
    And user clicks on add to cart button
    And user does checkout
    And user inputs valid data to proceed transaction
    Then user is at order verification page