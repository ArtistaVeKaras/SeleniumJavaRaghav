Feature: As a user I want to be able to login
  using my username and password and confirm
  am on the home pagemy username and password and confirm
  am on the home page

  # This is just another way of passing arguments via data table!!
  # Without having to add to many lines of code
  @TestCompleted
  Scenario: Login DataTable Examples
    Given am on the landing Page
    When I enter my Username and Password details as below
    | montego001 | 12345678 |
    And I click the login button
    Then Homepage should be displayed

