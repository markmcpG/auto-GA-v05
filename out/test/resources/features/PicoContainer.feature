# Login feature review the behavior in thie feature
# action, object, where
Feature: Login
  @LOGIN
  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded using pico-container
    And fill credentials on 'Login' data using pico-container
      |username|password|
      |admin@phptravels.com|demoadmin|

  ############################ SECCION AIRPORT #########################################
  @CREATE-NEW-AIRPORT
  Scenario: Airport page is displayed once set credential in login page
    Given 'PHP travel section Airport' page is loaded using pico-container
    And fill credentials on 'Airport' page in the form to create a new airport with data using pico-container
      |code|name        |cityCode|cityName  |countryName|countryCode|timeZone|lat|lon |city   |
    #Examples
      |7071|BOA CBBA    |591     |COCHABAMBA|COCHABAMBA |6          |UTM     |446|5466|CBBA   |
      |7072|BOA SANTCRUZ|592     |SANTA CRUZ|SANTA CRUZ |5          |UTM     |547|6786|SANT   |
