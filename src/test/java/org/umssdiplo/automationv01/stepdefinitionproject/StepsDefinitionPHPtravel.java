package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Automovil.Car;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Tours.Tours;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import static org.testng.Assert.assertEquals;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Car automovil;
    private Tours tours;


    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^fill credentials on 'Login' data$")
    public void fillCredentialsOnLoginData(DataTable dt) {
        login.setCredentials(dt);

    }

    @And("^'PHP travel section Cars' page is loaded$")
    public void phpTravelSectionCarsPageIsLoaded() {
        automovil = LoadPage.carsPage();
    }


    @And("^fill information on 'Add' data$")
    public void fillInformationOnAddData(DataTable dt) throws Throwable {
        automovil.setDatos(dt);
    }

    @And("^Click on the 'CARS' button  in the menu$")
    public void clickOnTheCARSButtonInTheMenu() {
        automovil.clickMenuCars();
    }

    @And("^Click on the 'CARS' button  in the Submenu$")
    public void clickOnTheCARSButtonInTheSubmenu() {
        automovil.clickSubMenuCars();
    }

    @And("^Click on the 'ADD' button  in 'CARS' page$")
    public void clickOnTheADDButtonInCARSPage() {
        automovil.clickButtonAdd();
    }

    @And("^fill \"([^\"]*)\" car name field in 'Add Car' page$")
    public void fillCarNameFieldInAddCarPage(String carName) throws Throwable {
        automovil.fillCarNameField(carName);
    }

    @And("^select \"([^\"]*)\" select option in 'Add Car' page$")
    public void selectSelectOptionInAddCarPage(String carStatus) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionStatus(carStatus);

    }

    @And("^fill \"([^\"]*)\" related cars field in 'Add Car' page$")
    public void fillRelatedCarsFieldInAddCarPage(String relatedCars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillRelatedCarsField(relatedCars);
    }

    @And("^fill \"([^\"]*)\" pick up location field in 'Add Car' page$")
    public void fillPickUpLocationFieldInAddCarPage(String pickUp) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillPickUpLocationField(pickUp);
    }

    @And("^select \"([^\"]*)\" Stars select option in 'Add Car' page$")
    public void selectStarsSelectOptionInAddCarPage(String stars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionStars(stars);
    }

    @And("^select \"([^\"]*)\" Passengers select option in 'Add Car' page$")
    public void selectPassengersSelectOptionInAddCarPage(String Passengers) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionPassangers(Passengers);
    }

    @And("^select \"([^\"]*)\" 'Car Doors' select option in 'Add Car' page$")
    public void selectCarDoorsSelectOptionInAddCarPage(String doors) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionDoors(doors);
    }

    @And("^select \"([^\"]*)\" 'Transmission' select option in 'Add Car' page$")
    public void selectTransmissionSelectOptionInAddCarPage(String transmission) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionTransmission(transmission);
    }

    @And("^select \"([^\"]*)\" 'Baggage' select option in 'Add Car' page$")
    public void selectBaggageSelectOptionInAddCarPage(String Baggage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionBaggage(Baggage);
    }

    @And("^select \"([^\"]*)\" 'AirportPickup' select option in 'Add Car' page$")
    public void selectAirportPickupSelectOptionInAddCarPage(String Airport) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionAirport(Airport);
    }

    @And("^select \"([^\"]*)\" 'Car Type' select option in 'Add Car' page$")
    public void selectCarTypeSelectOptionInAddCarPage(String type) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^select \"([^\"]*)\" 'Featured' select option in 'Add Car' page$")
    public void selectFeaturedSelectOptionInAddCarPage(String Featured) throws Throwable {
        automovil.selectOptionFeatured(Featured);
    }

    @And("^fill \"([^\"]*)\" 'From' field in 'Add Car' page$")
    public void fillFromFieldInAddCarPage(String from) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillFeaturedFromField(from);
    }

    @And("^fill \"([^\"]*)\" 'To' field in 'Add Car' page$")
    public void fillToFieldInAddCarPage(String to) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillFeaturedToField(to);

    }

    @And("^select \"([^\"]*)\" 'Deposit / Commission' select option in 'Add Car' page$")
    public void selectDepositCommissionSelectOptionInAddCarPage(String deposit) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionDeposit(deposit);
    }

    @And("^select \"([^\"]*)\" 'Vat Tax' select option in 'Add Car' page$")
    public void selectVatTaxSelectOptionInAddCarPage(String vatTax) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionVatTax(vatTax);
    }

    @And("^click on the 'SUBMIT' button in 'Add Car' page$")
    public void clickOnTheSUBMITButtonInAddCarPage() {
        automovil.clickButtonSUBMIT();
    }



    @And("^'PHP travel section Extra' page is loaded$")
    public void phpTravelSectionExtraPageIsLoaded() {
        automovil = LoadPage.carsPage();
    }

    @And("^Click on the 'EXTRAS' button  in the submenu$")
    public void clickOnTheEXTRASButtonInTheSubmenu() {

        automovil.clickSubMenuExtras();
    }







    @And("^select \"([^\"]*)\" 'Status' select option in 'Edit Car' form$")
    public void selectStatusSelectOptionInEditCarForm(String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionStatus(status);
    }

    @And("^fill \"([^\"]*)\" 'Car Name'car name field in 'Edit Car' form$")
    public void fillCarNameCarNameFieldInEditCarForm(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillCarNameField(name);
    }

    @And("^select \"([^\"]*)\" 'Stars' select option in 'Edit Car' form$")
    public void selectStarsSelectOptionInEditCarForm(String stars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionStars(stars);
    }

    @And("^select \"([^\"]*)\" 'Passengers' select option in 'Edit Car' form$")
    public void selectPassengersSelectOptionInEditCarForm(String pas) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionPassangers(pas);
    }

    @And("^select \"([^\"]*)\" 'Car Doors' select option in 'Edit Car' form$")
    public void selectCarDoorsSelectOptionInEditCarForm(String doors) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionDoors(doors);
    }

    @And("^select \"([^\"]*)\" 'Transmission' select option in 'Edit Car' form$")
    public void selectTransmissionSelectOptionInEditCarForm(String tra) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionTransmission(tra);
    }

    @And("^select \"([^\"]*)\" 'Baggage' select option in 'Edit Car' form$")
    public void selectBaggageSelectOptionInEditCarForm(String bagg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionBaggage(bagg);
    }

    @And("^select \"([^\"]*)\" 'AirportPickup' select option in 'Edit Car' form$")
    public void selectAirportPickupSelectOptionInEditCarForm(String air) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionAirport(air);
    }

    @And("^select \"([^\"]*)\" 'Featured' select option in 'Edit Car' form$")
    public void selectFeaturedSelectOptionInEditCarForm(String feat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionFeatured(feat);
    }

    @And("^fill \"([^\"]*)\" 'From' field in 'Edit Car' form$")
    public void fillFromFieldInEditCarForm(String from) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillFeaturedFromField(from);
    }

    @And("^fill \"([^\"]*)\" 'To' field in 'Edit Car' form$")
    public void fillToFieldInEditCarForm(String to) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillFeaturedToField(to);
    }

    @And("^select \"([^\"]*)\" 'Deposit / Commission' select option in 'Edit Car' form$")
    public void selectDepositCommissionSelectOptionInEditCarForm(String dep) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionDeposit(dep);
    }

    @And("^select \"([^\"]*)\" 'Vat Tax' select option in 'Edit Car' form$")
    public void selectVatTaxSelectOptionInEditCarForm(String vat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionVatTax(vat);
    }

    @And("^fill \"([^\"]*)\" 'related cars' field in 'Edit Car' form$")
    public void fillRelatedCarsFieldInEditCarForm(String rel) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillRelatedCarsField(rel);
    }

    @And("^click on the 'SUBMIT' button in 'Edit Car' form$")
    public void clickOnTheSUBMITButtonInEditCarForm() {
        automovil.clickButtonSubmitEdit();
    }

    @And("^Click on the 'ADD' button  in 'EXTRAS' page$")
    public void clickOnTheADDButtonInEXTRASPage() {
        automovil.clickButtonAddExtra();
    }

    @And("^fill \"([^\"]*)\" 'Name' field in 'Extra' form$")
    public void fillNameFieldInExtraForm(String nameExtra) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillExtraNameField(nameExtra);
    }

    @And("^fill \"([^\"]*)\" 'Status' select option in 'Extra' form$")
    public void fillStatusSelectOptionInExtraForm(String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionStatusExtra(status);
    }

    @And("^fill \"([^\"]*)\" 'Price' field in 'Extra' form$")
    public void fillPriceFieldInExtraForm(String price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillExtraPriceField(price);
    }

    @And("^Click on the 'SAVE & RETURN' button  in 'Extra' form$")
    public void clickOnTheSAVERETURNButtonInExtraForm() {
        automovil.clickButtonSaveReturnExtra();
    }





    @And("^fill \"([^\"]*)\" 'Name' field in 'Edit Extra' form$")
    public void fillNameFieldInEditExtraForm(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillExtraNameField(name);
    }

    @And("^fill \"([^\"]*)\" 'Status' select option in 'Edit Extra' form$")
    public void fillStatusSelectOptionInEditExtraForm(String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.selectOptionStatusExtra(status);
    }

    @And("^fill \"([^\"]*)\" 'Price' field in 'Edit Extra' form$")
    public void fillPriceFieldInEditExtraForm(String price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        automovil.fillExtraPriceField(price);
    }

    @And("^Click on the 'SAVE & RETURN' button  in 'Edit Extra' form$")
    public void clickOnTheSAVERETURNButtonInEditExtraForm() {
        automovil.clickButtonSaveReturnExtraEdit();
    }

    @And("^'PHP travel section Tours' page is loaded$")
    public void phpTravelSectionToursPageIsLoaded() {
        tours = LoadPage.toursPage();
    }

    @And("^Click on the 'TOURS' button  in the menu$")
    public void clickOnTheTOURSButtonInTheMenu() {
        tours.clickMenuTours();

    }

    @And("^Click on the 'TOURS' button  in the submenu$")
    public void clickOnTheTOURSButtonInTheSubmenu() {
        tours.clickSubMenuTours();
    }

    @And("^Click on the 'ADD' button  in 'TOURS' page$")
    public void clickOnTheADDButtonInTOURSPage() {
        tours.clickAddButton();
    }

    @And("^select \"([^\"]*)\" 'Status' select option in 'Add tours' form$")
    public void selectStatusSelectOptionInAddToursForm(String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionToursStatus(status);
    }

    @And("^fill \"([^\"]*)\" 'Tour Name' field in 'Add tours' form$")
    public void fillTourNameFieldInAddToursForm(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillTourNameField(name);
    }



    @And("^fill \"([^\"]*)\" 'Price Adults' field in 'Add tours' form$")
    public void fillPriceAdultsFieldInAddToursForm(String price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillPriceAdultsField(price);
    }

    @And("^fill \"([^\"]*)\" 'Quantity Adults' field in 'Add tours' form$")
    public void fillQuantityAdultsFieldInAddToursForm(String quantity) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       tours.fillQuantityAdultsField(quantity);
    }

    @And("^click on the 'ENABLE Child' button in 'Add tours' form$")
    public void clickOnTheENABLEChildButtonInAddToursForm() {
        tours.clickChildButton();
    }

    @And("^fill \"([^\"]*)\" 'Quantity Child' field in 'Add tours' form$")
    public void fillQuantityChildFieldInAddToursForm(String quantity) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillQuantityChildField(quantity);
    }

    @And("^fill \"([^\"]*)\" 'Price Child' field in 'Add tours' form$")
    public void fillPriceChildFieldInAddToursForm(String price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillPriceChildField(price);
    }

    @And("^select \"([^\"]*)\" 'Stars' select option in 'Add tours' form$")
    public void selectStarsSelectOptionInAddToursForm(String stars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionToursStars(stars);
    }

    @And("^fill \"([^\"]*)\" 'Total Days' field in 'Add tours' form$")
    public void fillTotalDaysFieldInAddToursForm(String days) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillDaysToursField(days);
    }

    @And("^fill \"([^\"]*)\" 'Total Nights' field in 'Add tours' form$")
    public void fillTotalNightsFieldInAddToursForm(String nights) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillNightsToursField(nights);
    }

    @And("^select \"([^\"]*)\" 'Featured' select option in 'Add tours' form$")
    public void selectFeaturedSelectOptionInAddToursForm(String featured) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionToursFeatured(featured);
    }

    @And("^select \"([^\"]*)\" 'Deposit / Commission' select option in 'Add tours' form$")
    public void selectDepositCommissionSelectOptionInAddToursForm(String deposit) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionToursDeposit(deposit);

    }

    @And("^fill \"([^\"]*)\" 'Deposit / Commission' field in 'Add tours' form$")
    public void fillDepositCommissionFieldInAddToursForm(String deposit) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillDepositToursField(deposit);
    }

    @And("^select \"([^\"]*)\" 'Vat Tax' select option in 'Add tours' form$")
    public void selectVatTaxSelectOptionInAddToursForm(String vat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionToursVat(vat);
    }

    @And("^fill \"([^\"]*)\" 'Vat Tax' field in 'Add tours' form$")
    public void fillVatTaxFieldInAddToursForm(String vat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillVatToursField(vat);
    }

    @And("^fill \"([^\"]*)\" 'Related tours' field in 'Add tours' form$")
    public void fillRelatedToursFieldInAddToursForm(String related) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillRelatedToursField(related);
    }

    @And("^fill \"([^\"]*)\" 'Address on Map' field in 'Add tours' form$")
    public void fillAddressOnMapFieldInAddToursForm(String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillAddressToursField(address);
    }

    @And("^fill \"([^\"]*)\" 'Latitude' field in 'Add tours' form$")
    public void fillLatitudeFieldInAddToursForm(String lat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillLatitudeToursField(lat);
    }

    @And("^fill \"([^\"]*)\" 'Longitude' field in 'Add tours' form$")
    public void fillLongitudeFieldInAddToursForm(String lon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.fillLongitudeToursField(lon);
    }

    @And("^click on the 'SUBMIT' button in 'Add tours' form$")
    public void clickOnTheSUBMITButtonInAddToursForm() {
        tours.clickSubmitTours();
    }

    @And("^select \"([^\"]*)\" 'Location (\\d+)' select option in 'Add tours' form$")
    public void selectLocationSelectOptionInAddToursForm(String arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionToursLocation1(arg0);
    }

    @And("^select \"([^\"]*)\" 'Tour Type' select option in 'Add tours' form$")
    public void selectTourTypeSelectOptionInAddToursForm(String type) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tours.selectOptionTourType(type);
    }

    @And("^Click on the 'DELETE' button \"([^\"]*)\" in 'Cars' page$")
    public void clickOnTheDELETEButtonInCarsPage(String name) throws Throwable {
       //automovil.deleteCar(name);
       automovil.deleteCar(name);
    }

    @And("^Click on the 'DELETE' button \"([^\"]*)\" in 'EXTRAS' page$")
    public void clickOnTheDELETEButtonInEXTRASPage(String name) throws Throwable {
        automovil.clickButtonDeleteExtra(name);
    }



    @Then("^verify the car \"([^\"]*)\" exist in 'Cars' page$")
    public void verifyTheCarExistInCarsPage(String carNameExpected) throws Throwable {

        String carNameActual = automovil.searchCar(carNameExpected);
        assertEquals(carNameActual, carNameExpected);
    }

    @And("^fill \"([^\"]*)\" 'Car Description' field in 'Add Car' page$")
    public void fillCarDescriptionFieldInAddCarPage(String des) throws Throwable {
        automovil.fillCarDescriptionField(des);
    }

    @Then("^verify the tours \"([^\"]*)\" exist in 'TOURS' page$")
    public void verifyTheToursExistInTOURSPage(String tourNameExpected) throws Throwable {
        String  tourNameActual = tours.searchTours(tourNameExpected);
        assertEquals(tourNameActual, tourNameExpected);

    }

    @And("^Click on the 'DELETE' button \"([^\"]*)\" in 'TOURS' page$")
    public void clickOnTheDELETEButtonInTOURSPage(String name) throws Throwable {
        tours.deleteTour(name);
    }

    @Then("^verify the extra \"([^\"]*)\" exist in 'EXTRAS' page$")
    public void verifyTheExtraExistInEXTRASPage(String extraNameExpected) throws Throwable {
        String  extraNameActual = automovil.searchExtra(extraNameExpected);
        assertEquals(extraNameActual, extraNameExpected);

    }



    @And("^Click on the 'Edit' button \"([^\"]*)\" in 'Cars' page$")
    public void clickOnTheEditButtonInCarsPage(String name) throws Throwable {
        automovil.clickButtonEditCar(name);
    }

    @And("^Click on the 'Edit' button \"([^\"]*)\" in 'EXTRAS' page$")
    public void clickOnTheEditButtonInEXTRASPage(String name) throws Throwable {
        automovil.clickButtonEditExtraCar(name);

    }
}
