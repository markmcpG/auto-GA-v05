# Login feature review the behavior in thie feature
# action, object, where
Feature: Login
  @LOGIN
  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

############################ SECCION AIRPORT #########################################
  @CREATE-NEW-AIRPORT
  Scenario: Airport page is displayed once set credential in login page
    Given 'PHP travel section Airport' page is loaded
    And fill credentials on 'Airport' page in the form to create a new airport with data
      |code|name        |cityCode|cityName  |countryName|countryCode|timeZone|lat|lon |city   |
    #Examples
      |8089|BOA CBBA    |591     |COCHABAMBA|COCHABAMBA |6          |UTM     |446|5466|CBBA   |
      |8088|BOA SANTCRUZ|592     |SANTA CRUZ|SANTA CRUZ |5          |UTM     |547|6786|SANT   |
      |8087|BOA LA PAZ  |593     |LA PAZ    |LA PAZ     |4          |UTM     |647|2222|LAPAZ  |
      |8086|BOA SUCRE   |594     |SUCRE     |SUCRE      |3          |UTM     |747|3567|SUCRE  |
      |8085|BOA TARIJA  |595     |TARIJA    |TARIJA     |2          |UTM     |847|9876|TARIJA |
      |8084|BOA BENI    |596     |BENI      |BENI       |1          |UTM     |947|1323|BENI   |

  @FIND-BY-CODE
  Scenario: Airport page is displayed once the airport items are created
    Given SEARCH button is located on 'Airport page'
    And SEARCH button is clicked on 'Airport page'
    And fill in the search fields on 'Airport page' whit data
      |code|
      |808 |
    And click botton GO on 'Airport page'

  @DELETE-AIRPORT
  Scenario: Airport page is displayed with the items searched
    Given Verify that the product code to be deleted is displayed on 'Airport page' and remove
      |code-delete|
      |8085      |
      |8084      |

  @UPDATE-AIRPORT
  Scenario: Airport page is displayed with the items searched
    Given Verify item is displayed on 'Airport page' and click edit
      |code-edit|
      |8086     |
    And fill credentials on 'Airport' page in the form edit with data
      |code|name         |cityCode|cityName  |countryName|countryCode|timeZone|lat|lon |city        |
      |8080|B-SUCRE-EDIT |694     |SUCRE-EDIT|SUCRE-EDIT |3          |UTM     |847|8765|SUCRE-EDIT  |



############################ SECCION COUNTRIES #########################################
  @CREATE-NEW-COUNTRY
  Scenario: Country page is displayed
    Given 'PHP travel section Countries' page is loaded
    And click in bottom add on 'Country page'
    And fill fields on 'Country' page in the form to create a new country with data
      |iso     |name           |nicename    |iso3  |numcode|phonecode|
    #Examples
      |BO-CBBA |COLCAPIRHUA    |COLCAPIRHUA |AFG-1  |45     |49       |
      |BO-OR   |ORURO          |ORURO       |AFG-2  |46     |50       |
      |BO-CHU  |CHUQUISACA     |CHUQUISACA  |AFG-3  |47     |51       |
      |BO-BENI |BENI           |BENI        |AFG-4  |48     |52       |

  @FIND-BY-ISO
  Scenario: Country page is displayed once the country items are created
    Given SEARCH button is located on 'Country page'
    And SEARCH button is clicked on 'Country page'
    And fill in the search fields on 'Country page' whit data
      |iso    |
      |BO-    |
    And click botton GO on 'Country page'

  @EDIT-COUNTRY
  Scenario: Country page is displayed with the items searched
    Given Verify item is displayed on 'Country page' and click edit
      |iso-edit|
      |BO-CHU  |
    And fill fields on 'Country' page in the form edit with data
      |iso       |name           |nicename    |iso3    |numcode|phonecode |
      |BO-CHU-ED |CHU-EDITADO    |CHU-EDITADO |AFG-10  |48     |34        |

  @VIEW-COUNTRY
  Scenario: Country page is displayed with the items searched
    Given Verify item is displayed on 'Country page' and click view
      |iso-view|
      |BO-CBBA |
    And click in bottom back on 'Country page'

  @DELETE-COUNTRY
  Scenario: Country page is displayed with the items searched
    Given Verify codeIso of item is displayed on 'Country page' and remove
      |iso-code  |
      |BO-OR     |
      |BO-BENI   |

############################ SECCION ROUTES #########################################
  @CREATE-NEW-ROUTE
  Scenario: Route page is displayed
    Given 'PHP travel section Routes' page is loaded
    And click in bottom add on 'Routes page'
    And fill fields on 'Routes' page in the form to create a new route with data
      |From    |To     |status   |Flight-Mode|Total-Hours|Departure-Date|Date-Arrival|Time-Departure|Time-Arrival|
      |CBBA    |LA PAZ |enable   |One Way    |1          |3/05/2019     |3/05/2019   |11:55 AM      |12:55 PM    |
      |SUCRE   |CBBA   |disabled |One Way    |2          |16/06/2019    |16/05/2019  |9:15 AM       |11:15 AM    |
