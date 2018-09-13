Feature: As a user I want to be able to login
  using my username and password and confirm
  am on the home page

  @TestCompleted
  Scenario Outline: login
    Given am on the loginpage
    When I enter my "Username" as "<Username_Details>" in the textfield
    And I enter my "Password" as "<Password_Details>" in the textfield
    And I click the on login button
    Then I should be on home page


    Examples: login Details
    | Username_Details  | Password_Details |
    | montego01         | 12345678         |
    | montego123        | 123459999        |
    | claudiomontego    | 128888777        |



