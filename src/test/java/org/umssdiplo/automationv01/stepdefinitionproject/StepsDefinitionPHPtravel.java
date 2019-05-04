package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Modelo.Vuelo;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Extras;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Room;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersManage;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSetting;

import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.Map;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Automovil.Car;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Tours.Tours;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import static org.testng.Assert.assertEquals;

public class StepsDefinitionPHPtravel {
    private Hotel hotel;
    private Login login;
    private Vuelo vuelo = new Vuelo();
    private Room room;
    private OffersSetting offersSetting;
    private OffersManage offersManage;
    private Extras extras;
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


    /***
     *  SECCION AIRPORTS
     *
     ***/

    @Given("^'PHP travel section Airport' page is loaded$")
    public void phpTravelSectionAirportPageIsLoaded() {
        vuelo = LoadPage.vueloPage();
        vuelo.goSectionAirport();
    }

    @And("^fill credentials on 'Airport' page in the form to create a new airport with data$")
    public void fillCredentialsOnAirportPageInTheFormToCreateANewAirportWithData(DataTable datos) {
        vuelo.createFly(datos);
    }

    @Given("^SEARCH button is located on 'Airport page'$")
    public void searchButtonIsLocatedOnAirportPage() {
        vuelo.locatorSearchButton();
    }

    @And("^SEARCH button is clicked on 'Airport page'$")
    public void searchButtonIsClickedOnAirportPage() {
        vuelo.initSearch();
    }

    @And("^fill in the search fields on 'Airport page' whit data$")
    public void fillInTheSearchFieldsOnAirportPageWhitData(DataTable data) {
        vuelo.fillSearchFields(data);
    }

    @And("^click botton GO on 'Airport page'$")
    public void clickBottonGOOnAirportPage() {
        vuelo.clickBottonGo();
    }


    @Given("^Verify that the product code to be deleted is displayed on 'Airport page' and remove$")
    public void verifyThatTheProductCodeToBeDeletedIsDisplayedOnAirportPageAndRemove(DataTable data) {
        for (Map<String, String> datos : data.asMaps(String.class, String.class)) {
            String codeDelete = datos.get("code-delete");
            Assert.assertEquals(codeDelete,vuelo.getCodeDelete(codeDelete,"remove"));
        }
    }

    @Given("^Verify item is displayed on 'Airport page' and click edit$")
    public void verifyItemIsDisplayedOnAirportPageAndClickEdit(DataTable data) {
        for (Map<String, String> datos : data.asMaps(String.class, String.class)) {
            String codeEdit = datos.get("code-edit");
            Assert.assertEquals(codeEdit,vuelo.getCodeDelete(codeEdit,"edit"));
        }
    }

    @And("^fill credentials on 'Airport' page in the form edit with data$")
    public void fillCredentialsOnAirportPageInTheFormEditWithData(DataTable data) {
            vuelo.editItem(data);
    }
/***
 *  SECCION COUNTRIES
 *
 ***/
    @Given("^'PHP travel section Countries' page is loaded$")
    public void phpTravelSectionCountriesPageIsLoaded() {
        vuelo.goSectionCountries();
    }

    @And("^click in bottom add on 'Country page'$")
    public void clickInBottomAddOnCountryPage() {
        vuelo.clickBottonAddOnCountry();
    }

    @And("^fill fields on 'Country' page in the form to create a new country with data$")
    public void fillFieldsOnCountryPageInTheFormToCreateANewCountryWithData(DataTable datos) {
        vuelo.createCountry(datos);
    }

    @Given("^SEARCH button is located on 'Country page'$")
    public void searchButtonIsLocatedOnCountryPage() {
        vuelo.locatorSearchButton();
    }

    @And("^SEARCH button is clicked on 'Country page'$")
    public void searchButtonIsClickedOnCountryPage() {
        vuelo.initSearch();
    }

    @And("^fill in the search fields on 'Country page' whit data$")
    public void fillInTheSearchFieldsOnCountryPageWhitData(DataTable data) {
        vuelo.fillSearchFields(data);
    }

    @And("^click botton GO on 'Country page'$")
    public void clickBottonGOOnCountryPage() {
        vuelo.clickBottonGo();
    }

    @Given("^Verify item is displayed on 'Country page' and click edit$")
    public void verifyItemIsDisplayedOnCountryPageAndClickEdit(DataTable data) {
        for (Map<String, String> datos : data.asMaps(String.class, String.class)) {
            String isoEdit = datos.get("iso-edit");
            Assert.assertEquals(isoEdit,vuelo.getCountryIso(isoEdit,"edit"));
        }
    }

    @And("^fill fields on 'Country' page in the form edit with data$")
    public void fillFieldsOnCountryPageInTheFormEditWithData(DataTable data) {
        vuelo.editItemCountry(data);
    }

    @Given("^Verify item is displayed on 'Country page' and click view$")
    public void verifyItemIsDisplayedOnCountryPageAndClickView(DataTable data) {
        for (Map<String, String> datos : data.asMaps(String.class, String.class)) {
            String isoView = datos.get("iso-view");
            Assert.assertEquals(isoView,vuelo.getCountryIso(isoView,"view"));
        }
    }

    @And("^click in bottom back on 'Country page'$")
    public void clickInBottomBackOnCountryPage() {
        vuelo.clickBottonBack();
    }

    @Given("^Verify codeIso of item is displayed on 'Country page' and remove$")
    public void verifyCodeIsoOfItemIsDisplayedOnCountryPageAndRemove(DataTable data) {
        for (Map<String, String> datos : data.asMaps(String.class, String.class)) {
            String isoDelete = datos.get("iso-code");
            Assert.assertEquals(isoDelete,vuelo.getCountryIso(isoDelete,"remove"));
        }
    }

/***
 *  SECCION ROUTES
 *
 ***/

    @Given("^'PHP travel section Routes' page is loaded$")
    public void phpTravelSectionRoutesPageIsLoaded() {
        vuelo.goSectionRoutes();
    }

    @And("^click in bottom add on 'Routes page'$")
    public void clickInBottomAddOnRoutesPage() {
        vuelo.clickBottonAddOnRoutes();
    }

    @And("^fill fields on 'Routes' page in the form to create a new route with data$")
    public void fillFieldsOnRoutesPageInTheFormToCreateANewRouteWithData(DataTable data) {
        vuelo.createRoute(data);
    }

    @Given("^'PHP travel section Hotels' page is loaded whit url$")
    public void phpTravelSectionHotelsPageIsLoadedWhitUrl() {
        hotel = LoadPage.hotelPage();
    }

    @Given("^'PHP travel section Offers Setting' page is loaded$")
    public void phpTravelSectionOffersSettingPageIsLoaded() {
        offersSetting = LoadPage.offersSettingPage();
    }

    @And("^Click en el Menu 'OFFERS' in home menu$")
    public void clickEnElMenuOFFERSInHomeMenu() {
        offersSetting.clickMenuOffer();
    }

    @And("^Click en el Sub Menu 'Offers Settings' in home menu$")
    public void clickEnElSubMenuOffersSettingsInHomeMenu() {
        offersSetting.clickSubMenuOfferSetting();
    }

    @And("^Click 'SUBMIT' in for Offers Setting$")
    public void clickSUBMITInForOffersSetting() {
        offersSetting.clickButtonSubmit();
    }

    @And("^Insert Target \"([^\"]*)\" in form Offer Setiing$")
    public void insertTargetInFormOfferSetiing(String target) throws Throwable {
        offersSetting.setSelectTarget(target);
//        throw new PendingException();
    }

    @And("^Insert Page Title \"([^\"]*)\" in form Offer Setiing$")
    public void insertPageTitleInFormOfferSetiing(String page_Title) throws Throwable {
        offersSetting.setInputPageTitle(page_Title);
    }

    @And("^Insert Listings Page \"([^\"]*)\" in form Offer Setiing$")
    public void insertListingsPageInFormOfferSetiing(String listings_Page) throws Throwable {
        offersSetting.setInputListingsPage(listings_Page);
    }

    @Given("^'PHP travel section Offers Manage' page is loaded$")
    public void phpTravelSectionOffersManagePageIsLoaded() {
        offersManage = LoadPage.offersManagePage();
    }

    @And("^Click en el Menu 'OFFERS M' in home menu$")
    public void clickEnElMenuOFFERSMInHomeMenu() {
        offersManage.clickMenuOffer();
    }
    @And("^Click en el Sub Menu 'Manage Offers' in home menu$")
    public void clickEnElSubMenuManageOffersInHomeMenu() {
        offersManage.clicksubMenuOffersManager();
    }

    @And("^Click en Button 'ADD' in page offers manage$")
    public void clickEnButtonADDInPageOffersManage() {
        offersManage.clickButtonAdd();
    }

    @And("^Select \"([^\"]*)\" in form offers manager Add$")
    public void selectInFormOffersManagerAdd(String status) throws Throwable {
        offersManage.setSelectStatusAdd(status);
        //throw new PendingException();
    }

    @And("^Insert input Title \"([^\"]*)\" in form offers manager Add$")
    public void insertInputTitleInFormOffersManagerAdd(String title) throws Throwable {
        offersManage.setInputOfferTitleAdd(title);
    }

    @And("^Insert input Phone \"([^\"]*)\" in form offers manager Add$")
    public void insertInputPhoneInFormOffersManagerAdd(String phone) throws Throwable {
        offersManage.setInputOfferPhoneAdd(phone);
    }

    @And("^Insert input Email \"([^\"]*)\" in form offers manager Add$")
    public void insertInputEmailInFormOffersManagerAdd(String email) throws Throwable {
        offersManage.setInputOfferEmailAdd(email);
    }

    @And("^Insert input Price \"([^\"]*)\" in form offers manager Add$")
    public void insertInputPriceInFormOffersManagerAdd(String price) throws Throwable {
        offersManage.setInputOfferPriceAdd(price);
    }

    @And("^Data Time From \"([^\"]*)\" in form offers manager Add$")
    public void dataTimeFromInFormOffersManagerAdd(String dataFrom) throws Throwable {
        offersManage.setInputOfferOFromAdd(dataFrom);
    }

    @And("^Data Time To \"([^\"]*)\" in form offers manager Add$")
    public void dataTimeToInFormOffersManagerAdd(String dataTo) throws Throwable {
        offersManage.setInputOfferOToAdd(dataTo);
    }

    @And("^Insert TextArea \"([^\"]*)\" in form offers manager Add$")
    public void insertTextAreaInFormOffersManagerAdd(String descri) throws Throwable {
        offersManage.setTextAreaDescripcionAdd(descri);
        //throw new PendingException();
    }

    @And("^Click Button 'Submit' in form offers manager Add$")
    public void clickButtonSubmitInFormOffersManagerAdd() {
        offersManage.clickButtonSubmitAdd();
    }

    @Then("^Verify Offers existente \"([^\"]*)\"$")
    public void verifyOffersExistente(String title) throws Throwable {
        Assert.assertEquals(offersManage.buscarOffers(title),true);
    }

    @And("^Click Button 'Eliminar' in page Offer Manager \"([^\"]*)\"$")
    public void clickButtonEliminarInPageOfferManager(String title) throws Throwable {
        offersManage.verificarOfferAEliminar(title);
       // throw new PendingException();
    }


    @And("^Click en Button 'EDIT' \"([^\"]*)\" in page offers manage$")
    public void clickEnButtonEDITInPageOffersManage(String title) throws Throwable {
        offersManage.clickButtonEditOffer(title);
    }

    @And("^Select Status \"([^\"]*)\" in form offers manager Edit$")
    public void selectStatusInFormOffersManagerEdit(String status) throws Throwable {
        offersManage.setSelectStatusEdit(status);
    }

    @And("^Insert input Title \"([^\"]*)\" in form offers manager Edit$")
    public void insertInputTitleInFormOffersManagerEdit(String title) throws Throwable {
        offersManage.setInputOfferTitleEdit(title);
    }

    @And("^Insert input Phone \"([^\"]*)\" in form offers manager Edit$")
    public void insertInputPhoneInFormOffersManagerEdit(String phone) throws Throwable {
        offersManage.setInputOfferPhoneEdit(phone);
    }

    @And("^Insert input Email \"([^\"]*)\" in form offers manager Edit$")
    public void insertInputEmailInFormOffersManagerEdit(String email) throws Throwable {
        offersManage.setInputOfferEmailEdit(email);
    }

    @And("^Insert input Price \"([^\"]*)\" in form offers manager Edit$")
    public void insertInputPriceInFormOffersManagerEdit(String price) throws Throwable {
        offersManage.setInputOfferPriceEdit(price);
    }

    @And("^Data Time From \"([^\"]*)\" in form offers manager Edit$")
    public void dataTimeFromInFormOffersManagerEdit(String form) throws Throwable {
        offersManage.setInputOfferOFromEdit(form);
    }

    @And("^Data Time To \"([^\"]*)\" in form offers manager Edit$")
    public void dataTimeToInFormOffersManagerEdit(String to) throws Throwable {
        offersManage.setInputOfferOToEdit(to);
    }

    @And("^Insert TextArea \"([^\"]*)\" in form offers manager Edit$")
    public void insertTextAreaInFormOffersManagerEdit(String descri) throws Throwable {
        offersManage.setTextAreaDescripcionEdit(descri);
    }

    @And("^Click Button 'Submit' in form offers manager Edit$")
    public void clickButtonSubmitInFormOffersManagerEdit() {
        offersManage.clickButtonSubmitEdit();
    }

    @Given("^'PHP travel section Rooms' page is loaded'$")
    public void phpTravelSectionRoomsPageIsLoaded() {
        room = LoadPage.roomPage();
    }

    @And("^Click en el Menu 'HOTELS' in home menu$")
    public void clickEnElMenuHOTELSInHomeMenu() {
        room.clickMenuHomeHotels();
    }

    @And("^Click en el Sub Menu 'ROOMS' of menu Hotels$")
    public void clickEnElSubMenuROOMSOfMenuHotels() {
        room.clickSubMenuHotelsRooms();
    }

    @And("^Click en el Button 'ADD' in ROOMS MANAGEMENT$")
    public void clickEnElButtonADDInROOMSMANAGEMENT() {
        room.clickButtonSubmitAddRoom();
    }

    @And("^Select Status \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void selectStatusInFormROOMSMANAGEMENTAdd(String status) throws Throwable {
        room.setSelectStatusRoomAdd(status);
    }

    @And("^Insert input Room Type \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputRoomTypeInFormROOMSMANAGEMENTAdd(String type) throws Throwable {
        room.setInputRoomTypeAdd(type);
    }

    @And("^Insert input Hotel \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputHotelInFormROOMSMANAGEMENTAdd(String hotel) throws Throwable {
        room.setInputHotelRoomAdd(hotel);
    }

    @And("^Text Area input Room Description \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void textAreaInputRoomDescriptionInFormROOMSMANAGEMENTAdd(String descri) throws Throwable {
        room.setTextAreaDescripcionRoomAdd(descri);
    }

    @And("^Insert input Price \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputPriceInFormROOMSMANAGEMENTAdd(String price) throws Throwable {
        room.setInputPriceRoomAdd(price);
    }

    @And("^Insert input Quantity \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputQuantityInFormROOMSMANAGEMENTAdd(String quantity) throws Throwable {
        room.setInputQuantityRoomAdd(quantity);
    }

    @And("^Insert input Minimum Stay \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputMinimumStayInFormROOMSMANAGEMENTAdd(String stay) throws Throwable {
        room.setInputMinimunStayRoomAdd(stay);
    }

    @And("^Insert input Max Adults \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputMaxAdultsInFormROOMSMANAGEMENTAdd(String adults) throws Throwable {
        room.setInputMaxAdultsRoomAdd(adults);
    }

    @And("^Insert input Max Children \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputMaxChildrenInFormROOMSMANAGEMENTAdd(String children) throws Throwable {
        room.setInputMaxChildrenRoomAdd(children);
    }


    @And("^Insert input No\\. of Extra Beds \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputNoOfExtraBedsInFormROOMSMANAGEMENTAdd(String bebs) throws Throwable {
        room.setInputNumExtraBebsRoomAdd(bebs);
    }

    @And("^Insert input Extra Bed Charges \"([^\"]*)\" in form ROOMS MANAGEMENT Add$")
    public void insertInputExtraBedChargesInFormROOMSMANAGEMENTAdd(String charges) throws Throwable {
        room.setInputBedChargesRoomAdd(charges);
    }

    @And("^Click Button 'Submit' in form ROOMS MANAGEMENT Add$")
    public void clickButtonSubmitInFormROOMSMANAGEMENTAdd() {
        room.clickButtonSumitRoomAdd();
    }

    @And("^Click en el Button 'EDIT' \"([^\"]*)\" in ROOMS MANAGEMENT$")
    public void clickEnElButtonEDITInROOMSMANAGEMENT(String room_Type) throws Throwable {
        room.clickButtonEditRoom(room_Type);
    }

    @And("^Click Button 'Submit' in form ROOMS MANAGEMENT Edit$")
    public void clickButtonSubmitInFormROOMSMANAGEMENTEdit() {
        room.clickButtonSubmitEditRoom();
    }


    @Given("^'PHP travel section EXTRAS' page is loaded'$")
    public void phpTravelSectionEXTRASPageIsLoaded() {
        extras = LoadPage.extrasPage();
    }

    @And("^Click en el Menu 'HOTELS' para Extras in home menu$")
    public void clickEnElMenuHOTELSParaExtrasInHomeMenu() {
        extras.clickMenuHomeHotes();
    }

    @And("^Click en el Sub Menu 'EXTRAS' of menu EXTRAS MANAGEMENT$")
    public void clickEnElSubMenuEXTRASOfMenuEXTRASMANAGEMENT() {
        extras.clickSubMenuHotelsExtras();
    }

    @And("^Click en el Button 'ADD' in EXTRAS MANAGEMENT$")
    public void clickEnElButtonADDInEXTRASMANAGEMENT() {
        extras.clickButtonSubmitAddExtras();
    }

    @And("^Insert input Name \"([^\"]*)\" in form EXTRAS MANAGEMENT$")
    public void insertInputNameInFormEXTRASMANAGEMENT(String name) throws Throwable {
        extras.setInputNameExtrasAdd(name);
    }

    @And("^Select option Status \"([^\"]*)\" in form EXTRAS MANAGEMENT$")
    public void selectOptionStatusInFormEXTRASMANAGEMENT(String status) throws Throwable {
        extras.setSelectStatusExtrasAdd(status);
    }

    @And("^Isert input Price \"([^\"]*)\" in form EXTRAS MANAGEMENT$")
    public void isertInputPriceInFormEXTRASMANAGEMENT(String price) throws Throwable {
        extras.setInputPriceExtrasAdd(price);
    }

    @And("^Click en el Button 'Save & Return' in form EXTRAS MANAGEMENT$")
    public void clickEnElButtonSaveReturnInFormEXTRASMANAGEMENT() {
        extras.clickButtonSaveReturnExtrasAdd();
    }


    @Then("^Verify Extras \"([^\"]*)\" in page EXTRAS MANAGEMENT$")
    public void verifyExtrasInPageEXTRASMANAGEMENT(String name) throws Throwable {
        Assert.assertEquals(extras.verificarElementoPasadoName(name),true);
    }

    @And("^Click en el Button 'EDIT' \"([^\"]*)\" in page EXTRAS MANAGEMENT$")
    public void clickEnElButtonEDITInPageEXTRASMANAGEMENT(String name) throws Throwable {
        extras.clickButtonUpdateName(name);
    }

    @And("^Click en el Button 'Save & Return' in form Update EXTRAS MANAGEMENT$")
    public void clickEnElButtonSaveReturnInFormUpdateEXTRASMANAGEMENT() {
        extras.clickButtonSaveReturnExtrasUpdate();
    }

    @Then("^Verify Extras a 'Remove' \"([^\"]*)\" in page EXTRAS MANAGEMENT$")
    public void verifyExtrasARemoveInPageEXTRASMANAGEMENT(String name) throws Throwable {
        Assert.assertEquals(extras.verificarElementoPasadoName(name),true);
    }

    @And("^Click en el Button 'REMOVE' \"([^\"]*)\" in page EXTRAS MANAGEMENT$")
    public void clickEnElButtonREMOVEInPageEXTRASMANAGEMENT(String name) throws Throwable {
        extras.clickButtonDeleteExtraName(name);
    }

    @Then("^Verfi for 'ROOM TITLE' \"([^\"]*)\" in page ROOMS MANAGEMENT$")
    public void verfiForROOMTITLEInPageROOMSMANAGEMENT(String room_Type) throws Throwable {
        Assert.assertEquals(room.buscarElementoExistente(room_Type),true);
    }

    @And("^Click Button 'Eliminar' in page ROOMS MANAGEMENT \"([^\"]*)\"$")
    public void clickButtonEliminarInPageROOMSMANAGEMENT(String roon_Type) throws Throwable {
        room.buscarElementoAEliminar(roon_Type);
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
