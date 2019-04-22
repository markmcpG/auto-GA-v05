# Login feature review the behavior in thie feature
Feature: Login
  @LOGIN
  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|
  @CREATE
  Scenario: Airport page is displayed once set credential in Airport page
    Given 'PHP travel section Airport' page is loaded whit url
    And fill credentials on 'Airport' page data
  |code|name|cityCode|cityName|countryName|countryCode|timeZone|lat|lon|city|
    |8081|BOA CBBA|591 |Cochabamba|Cochabamba|4         |UTM     |446|5466|CBBA|
