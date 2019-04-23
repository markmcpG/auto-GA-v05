# Login feature review the behavior in thie feature
Feature: Automovil

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|



  Scenario: Create
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|
    And 'PHP travel section Cars' page is loaded
    And fill information on 'Add' data
    |descripcion|
    |automovil grande|
