@RoleEdit
  Feature: Edit data in role menu

    Scenario: Edit data role
      Given User already in website
      When User input "addiyat.sandi@gmail.com" as email and "Nashta@2023" as password
      And Click sign button
      Then User already on dashboard page
      When User already on role menu
      And Already on add from
      And User input "aldan" as name
      Then data is in menu
      And user click icon
      When User click edit
      And Edit data with "aldan mf" as new name
      Then Data already change