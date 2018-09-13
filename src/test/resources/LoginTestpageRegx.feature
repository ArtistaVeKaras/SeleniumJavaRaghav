Feature: as a user I want to able to log in


@TestCompleted
  Scenario: Login
    Given am on the login page
    When I enter my "username" as "Montego001"
    And I enter my "password" as "12345678"
    And I click  login button
    Then I shoud be on the login page

