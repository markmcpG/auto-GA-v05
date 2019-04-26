package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersManage;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSetting;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Hotel hotel;
    private OffersSetting offersSetting;
    private OffersManage offersManage;

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
        hotel = LoadPage.hotelPage();
    }

    @And("^fill input data on 'Hotels' page data$")
    public void fillInputDataOnHotelsPageData(DataTable datos) {
        CommonEvents.forceWait(5000);
        hotel.fillInputData(datos);
    }

    @And("^Click en menu HOTELS$")
    public void clickEnMenuHOTELS() {
        hotel.clickMenuHotles();
    }

    @And("^Click en el sub menu HOTEL$")
    public void clickEnElSubMenuHOTEL() {
        hotel.clickSubMenuHotlel();
    }

    @And("^Click en el Boton ADD$")
    public void clickEnElBotonADD() {
        hotel.clickButtonAdd();
    }

    @And("^Click en el Select STATUS$")
    public void clickEnElSelectSTATUS() {
        hotel.clickSelectStatus();
    }

    @And("^Click en el Option STATUS NO$")
    public void clickEnElOptionSTATUSNO() {
        hotel.clickOptionStatusNo();
    }

    @And("^Click en el Select STARS$")
    public void clickEnElSelectSTARS() {
        hotel.clickSelectStars();
    }

    @And("^Click en el 'OPTION STARS' elegir tres in page add  hotels$")
    public void clickEnElOPTIONSTARSElegirTresInPageAddHotels() {
        hotel.clickOptionStar3();
    }

    @And("^Click en el Select 'HOTEL TYPE' in page add hotels$")
    public void clickEnElSelectHOTELTYPEInPageAddHotels() {
        hotel.clickSelectHotelType();
    }

    @And("^Click en el Option 'HOTEL' in page add hotes$")
    public void clickEnElOptionHOTELInPageAddHotes() {
        hotel.clickOptionHotelType();
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
        offersManage.setSelectStatus(status);
        //throw new PendingException();
    }

    @And("^Insert input Title \"([^\"]*)\" in form offers manager Add$")
    public void insertInputTitleInFormOffersManagerAdd(String title) throws Throwable {
        offersManage.setInputOfferTitle(title);
    }

    @And("^Insert input Phone \"([^\"]*)\" in form offers manager Add$")
    public void insertInputPhoneInFormOffersManagerAdd(String phone) throws Throwable {
        offersManage.setInputOfferPhone(phone);
    }

    @And("^Insert input Email \"([^\"]*)\" in form offers manager Add$")
    public void insertInputEmailInFormOffersManagerAdd(String email) throws Throwable {
        offersManage.setInputOfferEmail(email);
    }

    @And("^Insert input Price \"([^\"]*)\" in form offers manager Add$")
    public void insertInputPriceInFormOffersManagerAdd(String price) throws Throwable {
        offersManage.setInputOfferPrice(price);
    }

    @And("^Data Time From \"([^\"]*)\" in form offers manager Add$")
    public void dataTimeFromInFormOffersManagerAdd(String dataFrom) throws Throwable {
        offersManage.setInputOfferOFrom(dataFrom);
    }

    @And("^Data Time To \"([^\"]*)\" in form offers manager Add$")
    public void dataTimeToInFormOffersManagerAdd(String dataTo) throws Throwable {
        offersManage.setInputOfferOTo(dataTo);
    }

    @And("^Insert TextArea \"([^\"]*)\" in form offers manager Add$")
    public void insertTextAreaInFormOffersManagerAdd(String descri) throws Throwable {
        offersManage.setTextAreaDescripcion(descri);
        //throw new PendingException();
    }

    @And("^Click Button 'Submit' in form offers manager Add$")
    public void clickButtonSubmitInFormOffersManagerAdd() {
        offersManage.clickButtonSubmit();
    }

    @And("^Clik en el Button 'All' in page Offers Manage$")
    public void clikEnElButtonAllInPageOffersManage() {
        offersManage.clickButtonSearchAll();
    }
    @Then("^Verify Offers existente \"([^\"]*)\"$")
    public void verifyOffersExistente(String id) throws Throwable {
        Assert.assertEquals(offersManage.buscarOffers(id),true);
    }

    @And("^Click Button 'Eliminar' in page Offer Manager \"([^\"]*)\"$")
    public void clickButtonEliminarInPageOfferManager(String id) throws Throwable {
        offersManage.verificarOfferAEliminar(id);
       // throw new PendingException();
    }



}
