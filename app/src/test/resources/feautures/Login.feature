Feature: Login

  Scenario: Successful login
    Given the user opens the application
    When the user logs in with valid credentials
    Then the user should be taken to the dashboard

  Scenario: Unsuccessful login
    Given the user opens the application
    When the user logs in with invalid credentials
    Then the user should see an error message
