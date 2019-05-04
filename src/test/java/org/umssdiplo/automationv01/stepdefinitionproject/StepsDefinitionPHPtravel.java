package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Extras;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Room;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersManage;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSetting;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Hotel hotel;
    private Login login;
    private Room room;
    private OffersSetting offersSetting;
    private OffersManage offersManage;
    private Extras extras;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^fill credentials on 'Login' data$")
    public void fillCredentialsOnLoginData(DataTable dt) {
        login.setCredentials(dt);

    }

    @Given("^'PHP travel section Hotels' page is loaded whit url$")
    public void phpTravelSectionHotelsPageIsLoadedWhitUrl() {
        //hotel = LoadPage.hotelPage();
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


    @Given("^'PHP travel section Hotels' page is loaded whit$")
    public void phpTravelSectionHotelsPageIsLoadedWhit() {
        hotel = LoadPage.hotelPage();
    }


    @And("^Contenido pico$")
    public void contenidoPico() {
        hotel.getLista();
    }

    @And("^Agregar$")
    public void agregar(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        hotel.AgregarList(list.get(0).get("name"));
        hotel.AgregarList(list.get(1).get("name"));

    }


    @Given("^'PHP travel section Rooms' page is loaded' Update$")
    public void phpTravelSectionRoomsPageIsLoadedUpdate() {
        room = LoadPage.getRoom();
    }

    @Given("^'PHP travel section Rooms' page is loaded' Delete$")
    public void phpTravelSectionRoomsPageIsLoadedDelete() {
        room = LoadPage.getRoom();
    }

    @Given("^'PHP travel section EXTRAS' page is loaded' Update$")
    public void phpTravelSectionEXTRASPageIsLoadedUpdate() {
        extras = LoadPage.getExtras();
    }

    @Given("^'PHP travel section EXTRAS' page is loaded' Delete$")
    public void phpTravelSectionEXTRASPageIsLoadedDelete() {
        extras = LoadPage.getExtras();
    }
}
