Feature: As a user a I want to be able to login
  to the application and logout

  Scenario: Login
    Given am on the "Login" page and the title is "Login"
    When I enter "username" in the textfield as "montego001"
    And  I enter "password" in the textfield as "12345678"
    And  I click  "Login" button on the "Login" page
    Then I should on the "Home" page and the title is displayed as "WEG Group"
