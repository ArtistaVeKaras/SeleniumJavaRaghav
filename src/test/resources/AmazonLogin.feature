Feature:  As a user I want to login to Amazon Webpage!!

    #Comment!
  Scenario: Login to Amazon Webpage
    Given The user is the Login page
    When  The user enter the username
    And   The use clicks the continue button
    And   The user enter the password
    And   The user clicks the sign in button
    Then  The use should be in the main page!!
    #Also added a new line here!!!
