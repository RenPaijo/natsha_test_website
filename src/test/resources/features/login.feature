@Login
  Feature: Login feature
    This test case is everything about login

  Scenario:
    Given User already in website
    When User input "addiyat.sandi@gmail.com" as email and "Nashta@2023" as password
    And Click sign button
    Then User already on dashboard page