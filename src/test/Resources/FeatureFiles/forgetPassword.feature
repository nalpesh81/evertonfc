@ResetPassword
Feature: as a user i should be able reset password

  Background: I click on enter site link

  Scenario: 004-verify user should be able to reset password
    Given I navigate to evertonfc home page
    And I click on login link
    When the page has loaded
    And I click on reset your password link
    And I enter valid email address
    And I click on submit button
    Then I should be able to see confirmation message