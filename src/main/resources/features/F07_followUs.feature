@smoke

Feature: followUs | users could open facebook, twitter , rss , youtube links
  Scenario: user could open the facebook page
    Given User at home page
    When User click on facebook icon
    Then "https://www.facebook.com/nopCommerce" is opened in new tab
  Scenario: user could select and open the twitter page
    Given User at home page
    When User click on twitter icon
    Then "https://twitter.com/nopCommerce" is opened in new tab
  Scenario: user could select and open the rss page
    Given User at home page
    When User click on rss icon
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab
  Scenario: user could select and open the youtube page
    Given User at home page
    When User click on youtube icon
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab
