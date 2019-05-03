Feature: Login
#  @LOGIN
  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

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