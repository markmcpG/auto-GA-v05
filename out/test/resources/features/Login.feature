# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And fill credentials on 'Login' data
      |username|password|
      |admin@phptravels.com|demoadmin|

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