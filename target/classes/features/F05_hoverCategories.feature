@smoke

Feature: hoverCategories | users could select any category
  Scenario: user could select any category
    Given User at home page
    When User hover to a category and click on one of its sub-categories
    Then User will navigate to a page contains products about that sub-category
