Feature: As a user I want to be able to
  click on navigation tabs

#  Scenario: Login
#    Given am on the landing Page
#    When I enter my "Username" as "montego001"
#    And I enter my "Password" as "12345678"
#    And I click the login button
#    Then  am on the Home Page

  Scenario: Click on all nav tabs
    Given am on the landing Page
    When I enter my "Username" as "montego001"
    And I enter my "Password" as "12345678"
    And I click the login button
    And I click "TYJ" Tab
    And I click "BYJ" Tab
    And I click "JT" Tab
    And I click "ABTUS" Tab
    Then am on the "ABTUS Page"

