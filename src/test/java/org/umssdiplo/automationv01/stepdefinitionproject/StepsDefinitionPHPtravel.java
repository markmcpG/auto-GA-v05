package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Modelo.Country;
import org.umssdiplo.automationv01.core.managepage.Modelo.Vuelo;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Vuelo vuelo = new Vuelo();

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
}
