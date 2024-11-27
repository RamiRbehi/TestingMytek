Feature: loggedIn User View

  Scenario: Validate user is able to successfully log in
    Given User navigates to login page
    When User enters correct email and password values
    Then User gets directed to home page