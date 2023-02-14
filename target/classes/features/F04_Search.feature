@smoke

Feature: Search | users could search

  Scenario Outline: user could search for laptop
    When User enter a product name "<string>" in search text field
    And User click on search button
    Then Search result appears with products "<string>"
    Examples:
      | string |
      | laptop |
      | book   |
      | nike   |

  Scenario Outline: user could search for sku
    When User enter a product sku "<sku>" in search text field
    And User click on search button
    Then Search result appears with products sku "<sku>"
    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |
