# Login feature review the behavior in thie feature
Feature: Automovil

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|
    And click on 'Car' button in 'Header' page


  Scenario: Create
    Given 'PHP travel section Cars' page is loaded