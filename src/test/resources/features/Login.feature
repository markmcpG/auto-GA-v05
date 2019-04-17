# Login feature review the behavior in thie feature
Feature: Login
  @LOGIN
  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|
  @HOTELS
  Scenario: Hotels Management page is displayed once set credential in hotels page
    Given 'PHP travel section Hotels' page is loaded whit url
    And fill input data on 'Hotels' page data
    |name|Description|
    |REGUINA| HOTEL 5 ESTRELLAS |
