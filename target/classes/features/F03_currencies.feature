@smoke
Feature: F03_currencies | user change currency in the home page
  Scenario: Verify Euro Symbol on 4 products displayed in Home page

    Given the use login on the home page of the website
    When the user selects Euro currency from the dropdown list on the top left of the home page
    Then verify that the Euro Symbol (€) is shown on the four products displayed in the home page


