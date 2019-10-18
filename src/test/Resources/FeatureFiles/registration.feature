@Register
Feature: as a user i should be able to register

  Scenario: 001-verify user should be able to register with valid credentials
    Given I navigate to everton fc home page
    And page has loaded
    When I scroll down
    And I enter valid email in email field
    And I enter valid password in password field
    And I enter valid password in confirm password field
    And I click on your details link
    And I enter valid first name in first name field
    And I enter valid last name in last name field
    And I enter valid date of birth in day field
    And I enter valid month of birth in month field
    And I enter valid year of birth in year field
    And I enter valid mobile number in mobile number field
    And I click on your address link
    And I enter valid postcode in postcode lookup field
    And I click on find address button
    And I select valid address
    And I click on your communication prefereances link
    And I agree terms & condition checkbox
    Then I click on creat account link
    And I should able to see verify your email message





