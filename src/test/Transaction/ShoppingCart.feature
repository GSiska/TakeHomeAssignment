Feature: ShoppingCartFeature
  This feature deals with the functionality of shopping experience

  Scenario: verify user can filter product from highest to lowest price
    Given user is at website first page
    When user filters product from highest to lowest price
    Then the top of the products is the highest price