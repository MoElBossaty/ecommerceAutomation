@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given the user is on the login page
    When the user enters their valid username and password "P@ssw0rd"
    And the user presses the login button
    Then the user should be able to log in to the system successfully

  Scenario: User could login with valid email and password
    Given the user is on the login page
    When the user enters their invalid username "wrong@example.com" and password "P@ssw0rd"
    And the user presses the login button
    Then the user should not be able to log in to the system.