@smoke

Feature: Wishlist | users could add any item to wishlists
  Scenario: user could add any item to wishlists
    Given User at home page
    When User click on add to wishlist button of htc phone
    Then success message appears which confirm adding of the product
  Scenario: user could verify the number in wishlists
    Given User at home page
    When User click on add to wishlist button of htc phone
    And User click on Wishlist link
    Then User will navigate to wishlist page which contain htc phone product with its quantity
