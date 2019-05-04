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

#   Scenario: : Loguin
# BEGIN OFFERS
  # OFFERS SETTINGS
#    @REGISTRANDO_NUEVA_CONFIGURACION_OFFERS
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

  # OFFERS ADD
 #    @REGISTRANDO_NUEVO_OFFERS
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

  # OFFERS UPDATE
 #    @MODIFICANDO_CONFIGURACION_OFFERS
     Scenario Outline: Modificar Datos de un Offer in page Offer Manage
       Given 'PHP travel section Offers Manage' page is loaded
       And Click en el Menu 'OFFERS M' in home menu
       And Click en el Sub Menu 'Manage Offers' in home menu
       And Click en Button 'EDIT' "<offer_Title>" in page offers manage
       And Select Status "<status>" in form offers manager Edit
       And Insert input Title "<offer_Title>" in form offers manager Edit
       And Insert input Phone "<phone>" in form offers manager Edit
       And Insert input Email "<email>" in form offers manager Edit
       And Insert input Price "<offer_Price>" in form offers manager Edit
       And Data Time From "<from>" in form offers manager Edit
       And Data Time To "<to>" in form offers manager Edit
       And Insert TextArea "<offer_Description>" in form offers manager Edit
       And Click Button 'Submit' in form offers manager Edit
       Examples:
         |status  |offer_Title  |phone |email       |offer_Price|from       |to         |offer_Description|
         |Disabled |Ejemplo |12345|ejemplo@phptravels.com |1000|28/04/2019 |10/07/2019 |Una oferta imperdible|

# END OFFERS

  # OFFERS DELETE
#     @ELIMINANDO_OFFERS
  Scenario Outline: Eliminar Offers in page Offer Manage
    Given  'PHP travel section Offers Manage' page is loaded
    And Click en el Menu 'OFFERS M' in home menu
    And Click en el Sub Menu 'Manage Offers' in home menu
    Then Verify Offers existente "<offer_Title>"
    And Click Button 'Eliminar' in page Offer Manager "<offer_Title>"
    Examples:
      |offer_Title  |
      |Ejemplo |

# BEGIN HOTELS
  # ROOMS ADD
#     @REGISTARNDO_NUEVO_ROOMS
     Scenario Outline: ROOMS MANAGEMENT ADD page
       Given 'PHP travel section Rooms' page is loaded'
       And Click en el Menu 'HOTELS' in home menu
       And Click en el Sub Menu 'ROOMS' of menu Hotels
       And Click en el Button 'ADD' in ROOMS MANAGEMENT
       And Select Status "<status>" in form ROOMS MANAGEMENT Add
       And Insert input Room Type "<room_type>" in form ROOMS MANAGEMENT Add
       And Insert input Hotel "<hotel>" in form ROOMS MANAGEMENT Add
       And Text Area input Room Description "<room_description>" in form ROOMS MANAGEMENT Add
       And Insert input Price "<price>" in form ROOMS MANAGEMENT Add
       And Insert input Quantity "<quantity>" in form ROOMS MANAGEMENT Add
       And Insert input Minimum Stay "<minimum_stay>" in form ROOMS MANAGEMENT Add
       And Insert input Max Adults "<max_adults>" in form ROOMS MANAGEMENT Add
       And Insert input Max Children "<max_children>" in form ROOMS MANAGEMENT Add
       And Insert input No. of Extra Beds "<num_extra_beds>" in form ROOMS MANAGEMENT Add
       And Insert input Extra Bed Charges "<extra_bed_charges>" in form ROOMS MANAGEMENT Add
       And Click Button 'Submit' in form ROOMS MANAGEMENT Add
     Examples:
       |status    |room_type            |hotel                        |room_description|price|quantity|minimum_stay|max_adults|max_children |num_extra_beds |extra_bed_charges|
       |Disabled  |Two-Bedroom Apartment| Tria Hotel Istanbul Special |habitaciones     |500 |5       |5           |2         |5            |3              |3                |

# END ROOMS ADD

# BEGIN ROOMS UPDATE
#    @MODIFICANDO_ROOMS_ID
    Scenario Outline: ROOMS MANAGEMENT EDIT page
      Given 'PHP travel section Rooms' page is loaded'
      And Click en el Menu 'HOTELS' in home menu
      And Click en el Sub Menu 'ROOMS' of menu Hotels
      And Click en el Button 'EDIT' "<room_type>" in ROOMS MANAGEMENT
      And Select Status "<status>" in form ROOMS MANAGEMENT Add
      And Insert input Room Type "<room_type>" in form ROOMS MANAGEMENT Add
      And Insert input Hotel "<hotel>" in form ROOMS MANAGEMENT Add
      And Text Area input Room Description "<room_description>" in form ROOMS MANAGEMENT Add
      And Insert input Price "<price>" in form ROOMS MANAGEMENT Add
      And Insert input Quantity "<quantity>" in form ROOMS MANAGEMENT Add
      And Insert input Minimum Stay "<minimum_stay>" in form ROOMS MANAGEMENT Add
      And Insert input Max Adults "<max_adults>" in form ROOMS MANAGEMENT Add
      And Insert input Max Children "<max_children>" in form ROOMS MANAGEMENT Add
      And Insert input No. of Extra Beds "<num_extra_beds>" in form ROOMS MANAGEMENT Add
      And Insert input Extra Bed Charges "<extra_bed_charges>" in form ROOMS MANAGEMENT Add
      And Click Button 'Submit' in form ROOMS MANAGEMENT Edit

      Examples:
        |status    |room_type               |hotel                    |room_description |price|quantity|minimum_stay|max_adults  |max_children    |num_extra_beds   |extra_bed_charges|
        |Enabled   |Two-Bedroom Apartment   | Grand Plaza Apartments  |habitaciones     |1100 |4       |4           |1           |3               |2                |2                |

# END ROOMS UPDATE

# BEGIN ROOMS DELETE
#    @ELEIMINADO_ROOMS_ID
    Scenario Outline: Eliminar ROOMS in page ROOMS MANAGEMENT
      Given 'PHP travel section Rooms' page is loaded'
      And Click en el Menu 'HOTELS' in home menu
      And Click en el Sub Menu 'ROOMS' of menu Hotels
      Then Verfi for 'ROOM TITLE' "<room_Type>" in page ROOMS MANAGEMENT
      And Click Button 'Eliminar' in page ROOMS MANAGEMENT "<room_Type>"
      Examples:
        |room_Type|
        |Two-Bedroom Apartment |

# END ROOMS DELETE

# BEGIN EXTRAS ADD
#  @REGISTRANDO_NUEVO_EXTRA
  Scenario Outline: EXTRAS MANAGEMENT ADD page
    Given 'PHP travel section EXTRAS' page is loaded'
    And Click en el Menu 'HOTELS' para Extras in home menu
    And Click en el Sub Menu 'EXTRAS' of menu EXTRAS MANAGEMENT
    And Click en el Button 'ADD' in EXTRAS MANAGEMENT
    And Insert input Name "<name>" in form EXTRAS MANAGEMENT
    And Select option Status "<status>" in form EXTRAS MANAGEMENT
    And Isert input Price "<price>" in form EXTRAS MANAGEMENT
    And Click en el Button 'Save & Return' in form EXTRAS MANAGEMENT
  Examples:
      |name           |status   |price|
      |Matrimonials   |Yes      |50   |

# END EXTRAS

#BEGIN EXTRAS   UPDATE
#  @MODIFICANDO_EXTRAS_ID
  Scenario Outline: EXTRAS MANAGEMENT UPDATE page
    Given 'PHP travel section EXTRAS' page is loaded'
    And Click en el Menu 'HOTELS' para Extras in home menu
    And Click en el Sub Menu 'EXTRAS' of menu EXTRAS MANAGEMENT
    Then Verify Extras "<name>" in page EXTRAS MANAGEMENT
    And Click en el Button 'EDIT' "<name>" in page EXTRAS MANAGEMENT
    And Insert input Name "<name>" in form EXTRAS MANAGEMENT
    And Select option Status "<status>" in form EXTRAS MANAGEMENT
    And Isert input Price "<price>" in form EXTRAS MANAGEMENT
    And Click en el Button 'Save & Return' in form Update EXTRAS MANAGEMENT
  Examples:
      |name           |status   |price|
      |Matrimonials   |Yes      |80   |

#ELIMINADO EXTRAS
#  @ELIMINADO_EXTRAS_ID
  Scenario Outline: EXTRAS MANAGEMENT Remove page
    Given 'PHP travel section EXTRAS' page is loaded'
    And Click en el Menu 'HOTELS' para Extras in home menu
    And Click en el Sub Menu 'EXTRAS' of menu EXTRAS MANAGEMENT
    Then Verify Extras a 'Remove' "<name>" in page EXTRAS MANAGEMENT
    And Click en el Button 'REMOVE' "<name>" in page EXTRAS MANAGEMENT
  Examples:
      |name |
      |Matrimonials |

  Scenario Outline: Create Car
    Given 'PHP travel section Cars' page is loaded
    And Click on the 'CARS' button  in the menu
    And Click on the 'CARS' button  in the Submenu
    And Click on the 'ADD' button  in 'CARS' page
    And select "<status>" select option in 'Add Car' page
    And fill "<name>" car name field in 'Add Car' page
    And fill "<Description>" 'Car Description' field in 'Add Car' page
    And select "<stars>" Stars select option in 'Add Car' page
    And select "<Passengers>" Passengers select option in 'Add Car' page
    And select "<Doors>" 'Car Doors' select option in 'Add Car' page
    And select "<Transmision>" 'Transmission' select option in 'Add Car' page
    And select "<Baggage>" 'Baggage' select option in 'Add Car' page
    And select "<AirportPickup>" 'AirportPickup' select option in 'Add Car' page
    And select "<Featured>" 'Featured' select option in 'Add Car' page
    And fill "<FeaturedFrom>" 'From' field in 'Add Car' page
    And fill "<FeaturedTo>" 'To' field in 'Add Car' page
    And select "<Deposit>" 'Deposit / Commission' select option in 'Add Car' page
    And select "<VatTax>" 'Vat Tax' select option in 'Add Car' page
    And fill "<relatedCars>" related cars field in 'Add Car' page
    And click on the 'SUBMIT' button in 'Add Car' page
    Examples:
      |name        |status |Description|stars|Passengers|Doors|Transmision|Baggage|AirportPickup|Featured|FeaturedFrom|FeaturedTo|Deposit|VatTax|relatedCars|
      |grand vitara|Disabled|des|3|5|4|Manual|x4|No|Yes|16/05/2019|17/05/2019|Percentage|Percentage|Nisan Micra 2011|

  Scenario Outline: Edit Car
    Given 'PHP travel section Cars' page is loaded
    And Click on the 'CARS' button  in the menu
    And Click on the 'CARS' button  in the Submenu
    And Click on the 'Edit' button "<searchName>" in 'Cars' page
    And select "<status>" 'Status' select option in 'Edit Car' form
    And fill "<name>" 'Car Name'car name field in 'Edit Car' form
    And select "<stars>" 'Stars' select option in 'Edit Car' form
    And select "<Passengers>" 'Passengers' select option in 'Edit Car' form
    And select "<Doors>" 'Car Doors' select option in 'Edit Car' form
    And select "<Transmision>" 'Transmission' select option in 'Edit Car' form
    And select "<Baggage>" 'Baggage' select option in 'Edit Car' form
    And select "<AirportPickup>" 'AirportPickup' select option in 'Edit Car' form
    And select "<Featured>" 'Featured' select option in 'Edit Car' form
    And fill "<FeaturedFrom>" 'From' field in 'Edit Car' form
    And fill "<FeaturedTo>" 'To' field in 'Edit Car' form
    And select "<Deposit>" 'Deposit / Commission' select option in 'Edit Car' form
    And select "<VatTax>" 'Vat Tax' select option in 'Edit Car' form
    And fill "<relatedCars>" 'related cars' field in 'Edit Car' form
    And click on the 'SUBMIT' button in 'Edit Car' form
    Examples:
      |searchName|name        |status |stars|Passengers|Doors|Transmision|Baggage|AirportPickup|Featured|FeaturedFrom|FeaturedTo|Deposit|VatTax|relatedCars|
      |grand vitara|vitara|Enabled|1|6|5|Auto|x2|Yes|No|18/05/2019|19/05/2019|Fixed|Fixed|Kia Pacanto 2014|


  Scenario Outline: Delete Car
    Given 'PHP travel section Cars' page is loaded
    And Click on the 'CARS' button  in the menu
    And Click on the 'CARS' button  in the Submenu
    Then verify the car "<Name>" exist in 'Cars' page
    And Click on the 'DELETE' button "<Name>" in 'Cars' page
    Examples:
      |Name|
      |vitara|

  Scenario Outline: Create Extra Car
    Given 'PHP travel section Extra' page is loaded
    And Click on the 'CARS' button  in the menu
    And Click on the 'EXTRAS' button  in the submenu
    And Click on the 'ADD' button  in 'EXTRAS' page
    And fill "<Name>" 'Name' field in 'Extra' form
    And fill "<Status>" 'Status' select option in 'Extra' form
    And fill "<Price>" 'Price' field in 'Extra' form
    And Click on the 'SAVE & RETURN' button  in 'Extra' form
    Examples:
    |Name|Status|Price|
    |Baby Seat Test|Yes          |300|

  Scenario Outline: Edit Extra Car
    Given 'PHP travel section Extra' page is loaded
    And Click on the 'CARS' button  in the menu
    And Click on the 'EXTRAS' button  in the submenu
    And Click on the 'Edit' button "<searchName>" in 'EXTRAS' page
    And fill "<Name>" 'Name' field in 'Edit Extra' form
    And fill "<Status>" 'Status' select option in 'Edit Extra' form
    And fill "<Price>" 'Price' field in 'Edit Extra' form
    And Click on the 'SAVE & RETURN' button  in 'Edit Extra' form

    Examples:
      |searchName|Name|Status|Price|
      |Baby Seat Test|Baby Seat new|No|400|

  Scenario Outline: Delete Extra Car
    Given 'PHP travel section Extra' page is loaded
    And Click on the 'CARS' button  in the menu
    And Click on the 'EXTRAS' button  in the submenu
    Then verify the extra "<Name>" exist in 'EXTRAS' page
    And Click on the 'DELETE' button "<Name>" in 'EXTRAS' page
    Examples:
      |Name|
      |Baby Seat new|


  Scenario Outline: Create Tours
    Given 'PHP travel section Tours' page is loaded
    And Click on the 'TOURS' button  in the menu
    And Click on the 'TOURS' button  in the submenu
    And Click on the 'ADD' button  in 'TOURS' page
    And select "<status>" 'Status' select option in 'Add tours' form
    And fill "<tourName>" 'Tour Name' field in 'Add tours' form
    And fill "<Quantity>" 'Quantity Adults' field in 'Add tours' form
    And fill "<Price>" 'Price Adults' field in 'Add tours' form
    And click on the 'ENABLE Child' button in 'Add tours' form
    And fill "<QuantityChild>" 'Quantity Child' field in 'Add tours' form
    And fill "<PriceChild>" 'Price Child' field in 'Add tours' form
    And select "<stars>" 'Stars' select option in 'Add tours' form
    And fill "<TotalDays>" 'Total Days' field in 'Add tours' form
    And fill "<TotalNights>" 'Total Nights' field in 'Add tours' form
    And select "<TourType>" 'Tour Type' select option in 'Add tours' form
    And select "<Featured>" 'Featured' select option in 'Add tours' form
    And select "<Location1>" 'Location 1' select option in 'Add tours' form
    And select "<Deposit>" 'Deposit / Commission' select option in 'Add tours' form
    And fill "<DepositField>" 'Deposit / Commission' field in 'Add tours' form
    And select "<VatTax>" 'Vat Tax' select option in 'Add tours' form
    And fill "<VatTaxField>" 'Vat Tax' field in 'Add tours' form
    And fill "<RelatedTours>" 'Related tours' field in 'Add tours' form
    And fill "<AddressOnMap>" 'Address on Map' field in 'Add tours' form
    And fill "<latitude>" 'Latitude' field in 'Add tours' form
    And fill "<longitude>" 'Longitude' field in 'Add tours' form
    And click on the 'SUBMIT' button in 'Add tours' form
    Examples:
      |status |tourName     |Quantity|Price |QuantityChild|PriceChild|stars|TotalDays|TotalNights|TourType|Featured|Location1|Deposit   |DepositField|VatTax    | VatTaxField|RelatedTours|AddressOnMap|latitude|longitude|
      |Enabled|Sheraton Trip Test|8       |200   |5            |100       |5    |13       |12         |Holidays |Yes     |Pusa|Percentage|10          |Percentage|  5         |Days Around Thailand|Sheraton Kauai Resort, Hoonani Road, Koloa, HI, United States|21.8768446|-159.4646715|



  Scenario Outline: Delete Tours
    Given 'PHP travel section Tours' page is loaded
    And Click on the 'TOURS' button  in the menu
    And Click on the 'TOURS' button  in the submenu
    Then verify the tours "<tourName>" exist in 'TOURS' page
    And Click on the 'DELETE' button "<tourName>" in 'TOURS' page
    Examples:
      |tourName|
      |Sheraton Trip Test|

