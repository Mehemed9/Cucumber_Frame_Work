 Feature  : TalenTEK login Feature

  @test1
  Scenario  : Students logs in with valid credentials
    Given Student at talenTEK Homepage
    And Student enter their valid email address
    And Student enter their valid password
    When  student click on login button
    Then  Student should be successfully logged


@test2
  Scenario: Students login with invalid email address.
    Given Student at talenTEK Homepage
    And Student enter their invalid email address.
    And Student enter their valid password
    When  student click on login button
    Then Student should get an error message for entering invalid email.
@test3
  Scenario: Students login with invalid password.
    Given Student at talenTEK Homepage
    And Student enter their valid email address
    And Student enter their invalid password.
    When When student click on login button.
    Then Student should get an error message for entering invalid password.
@test4
  Scenario: Students login with invalid credentials.
    Given Student at talenTEK Homepage
    And Student enter their invalid email address.
    And Student enter their invalid password.
    When When student click on login button.
    Then Student should get an error message for entering invalid credentials.