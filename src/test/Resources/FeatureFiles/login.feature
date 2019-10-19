@Login
Feature: As a user i should be able to login

  Background: I click on enter site link

  @ValidLogin
  Scenario: 002-verify login functionality with valid credentials
    Given I navigate to evertonfc home page
    And I click on login link
    When the page has loaded
    And i enter valid email address in email address field
    And i enter valid password in password filed
    And i click on login button
    Then i should be able to login successfully and see logout link
#    And i should be able to see Logout link

    @InvalidLogin
    Scenario Outline: 003-verify login functionality with invalid credentials
      Given I navigate to evertonfc home page
      And I click on login link
      And i enter "<email>" in email address field
      And i enter "<password>" in password field
      And i click on login button
      Then i should not able to login successfully
      And i should see an error

      Examples:
      | email              | password  |
      |nalpesh81@gmail.com | Savani81  |
