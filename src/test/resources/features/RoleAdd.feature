@RoleAdd
  Feature: Role add
    This test case is everything abaout adding new role

  Scenario: Add new data in role menu
    Given User already in website
    When User input "addiyat.sandi@gmail.com" as email and "Nashta@2023" as password
    And Click sign button
    Then User already on dashboard page
    When User already on role menu
    And Already on add from
    And User input "aldan" as name
    Then data is in menu