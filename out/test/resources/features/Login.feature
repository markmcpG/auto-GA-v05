Feature: Login
#  @LOGIN
  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

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
    Given 'PHP travel section Rooms' page is loaded' Update
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
    Given 'PHP travel section Rooms' page is loaded' Delete
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
    Given 'PHP travel section EXTRAS' page is loaded' Update
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
    Given 'PHP travel section EXTRAS' page is loaded' Delete
    And Click en el Menu 'HOTELS' para Extras in home menu
    And Click en el Sub Menu 'EXTRAS' of menu EXTRAS MANAGEMENT
    Then Verify Extras a 'Remove' "<name>" in page EXTRAS MANAGEMENT
    And Click en el Button 'REMOVE' "<name>" in page EXTRAS MANAGEMENT
    Examples:
      |name |
      |Matrimonials |