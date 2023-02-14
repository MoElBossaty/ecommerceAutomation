@smoke
  Feature: F01_Registration | guest users could create new accounts


    Scenario: user could create new account with valid data
      Given user go to register page
      When user select gender type
      And user enter "automation" & "tester"
      And user select date of birth
      And user enter email
      And user enter "P@ssw0rd" password and confirm password
      And user click on register button
      Then account is created successfully

