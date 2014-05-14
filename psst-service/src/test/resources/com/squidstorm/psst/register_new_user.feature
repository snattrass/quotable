Feature: Register New User

  Scenario: Register New User
    Given I have a new user
    When I browse to psst/register
    Then the page should display "Register User"