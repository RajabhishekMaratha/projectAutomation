Feature: Application login

  Scenario: Admin Page default login
    Given User is on Netbanking login page 
    When User login into application with "admin" and password "1234"
    Then Homepage is displayed
    And Cards are displayed
    
#Reusable

  Scenario: Admin Page default login
    Given User is on Netbanking login page 
    When User login into application with "user" and password "46290"
    Then Homepage is displayed
    And Cards are displayed