@smoke

Feature: homeSliders | users could select and open home sliders
  Scenario: user could select and open the first home slider
    Given User at home page
    When User click on first slider nokia image
    Then User navigate to nokia product details page
  Scenario: user could select and open the second home slider
    Given User at home page
    When User click on second slider iphone image
    Then User navigate to iphone product details page
