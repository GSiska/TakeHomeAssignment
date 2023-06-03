Feature: ShoppingCartFeature
  This feature deals with the functionality of shopping experience

  Scenario: verify user can filter product from highest to lowest price
    Given user is at website first page
    When user filters product from highest to lowest price
    Then the top of the products is the highest price

  Scenario: verify user can select the first product
    Given user is at website first page
    When user filters product from highest to lowest price
    And user selects the first product
    Then user is directed to selected product page

  Scenario: verify user can add to cart
    Given user is at website first page
    When user filters product from highest to lowest price
    And user selects the first product
    And user clicks on add to cart button
    Then remove button appears