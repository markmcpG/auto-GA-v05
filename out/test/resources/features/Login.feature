Feature: Login
  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

    Scenario Outline: Configurando Offers
      Given 'PHP travel section Offers Setting' page is loaded
      And Click en el Menu 'OFFERS' in home menu
      And Click en el Sub Menu 'Offers Settings' in home menu
      And Insert Target "<Target>" in form Offer Setiing
      And Insert Page Title "<Page_Title>" in form Offer Setiing
      And Insert Listings Page "<Listings_Page>" in form Offer Setiing
      And Click 'SUBMIT' in for Offers Setting
     Examples:
        |Target |Page_Title     |Listings_Page|
        |Blank  |Special Offers |8            |

     Scenario Outline: Offer Manage page
       Given  'PHP travel section Offers Manage' page is loaded
       And Click en el Menu 'OFFERS M' in home menu
       And Click en el Sub Menu 'Manage Offers' in home menu
       And Click en Button 'ADD' in page offers manage
       And Select "<status>" in form offers manager Add
       And Insert input Title "<offer_Title>" in form offers manager Add
       And Insert input Phone "<phone>" in form offers manager Add
       And Insert input Email "<email>" in form offers manager Add
       And Insert input Price "<offer_Price>" in form offers manager Add
       And Data Time From "<from>" in form offers manager Add
       And Data Time To "<to>" in form offers manager Add
       And Insert TextArea "<offer_Description>" in form offers manager Add
       And Click Button 'Submit' in form offers manager Add
     Examples:
       |status|offer_Title|phone |email       |offer_Price|from       |to         |offer_Description|
       |Enabled|Ejemplo    |123456|eje@php.com |2000       |28/04/2019 |01/07/2019 |Una oferta imperdible|

     Scenario Outline: Eliminar Offers in page Offer Manage
       Given  'PHP travel section Offers Manage' page is loaded
       And Click en el Menu 'OFFERS M' in home menu
       And Click en el Sub Menu 'Manage Offers' in home menu
       And Clik en el Button 'All' in page Offers Manage
       Then Verify Offers existente "<id>"
       And Click Button 'Eliminar' in page Offer Manager "<id>"
     Examples:
       |id  |
       |104 |

     Scenario Outline: Modificar Datos de un Offer in page Offer Manage
       Given 'PHP travel section Offers Manage' page is loaded
       And Click en el Menu 'OFFERS M' in home menu
       And Click en el Sub Menu 'Manage Offers' in home menu
     Examples:
       | id |
       |100 |