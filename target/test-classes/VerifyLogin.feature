Feature: As a user I want to be able to login

@wip
  Scenario: Login
    Given am on the landing Page
    When I enter my username and password
    And I click the login button
    Then am on the Home Page