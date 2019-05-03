Feature: Login
  @LOGIN
  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

  @HOTELS
  Scenario: Hotels Management page  hotels page
    Given 'PHP travel section Hotels' page is loaded whit url
    And Click en menu HOTELS
    And Click en el sub menu HOTEL
    And Click en el Boton ADD
    And Click en el Select STATUS
    And Click en el Option STATUS NO
    And Click en el Select STARS
    And Click en el 'OPTION STARS' elegir tres in page add  hotels
    And Click en el Select 'HOTEL TYPE' in page add hotels
    And Click en el Option 'HOTEL' in page add hotes
    And fill input data on 'Hotels' page data
      |name|Description|
      |REGUINA| HOTEL 5 ESTRELLAS |

