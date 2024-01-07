Feature: TalenTek login feature


  Scenario: Students login with valid credentials.
    Given Student talentek at talentek homepage.
    And Student enter their valid email address.
    And Student enter their valid password.
    When When student click on login button.
    Then Student should be succesfuly login.

  Scenario: Students login with invalid email address.
    Given Student talentek at talentek homepage.
    And Student enter their invalid email address.
    And Student enter their valid password.
    When When student click on login button.
    Then Student should get an error message for entering invalid email.

  Scenario: Students login with invalid password.
    Given Student talentek at talentek homepage.
    And Student enter their valid email address.
    And Student enter their invalid password.
    When When student click on login button.
    Then Student should get an error message for entering invalid password.

  Scenario: Students login with invalid credentials.
    Given Student talentek at talentek homepage.
    And Student enter their invalid email address.
    And Student enter their invalid password.
    When When student click on login button.
    Then Student should get an error message for entering invalid credentials.