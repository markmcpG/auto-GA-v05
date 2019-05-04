package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Modelo.Vuelo;
import org.umssdiplo.automationv01.core.managepage.PicoContainer;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;


public class StepsDefinitionPicoContainer {

    private PicoContainer pico = new PicoContainer();
    private Login login;
    private Vuelo vuelo;

    @Given("^'PHP travel' page is loaded using pico-container$")
    public void phpTravelPageIsLoadedUsingPicoContainer() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        login = pico.getLogin();
    }

    @And("^fill credentials on 'Login' data using pico-container$")
    public void fillCredentialsOnLoginDataUsingPicoContainer(DataTable dt) {
        login.setCredentials(dt);
    }

    /***
     *  SECCION AIRPORTS
     *
     ***/


    @Given("^'PHP travel section Airport' page is loaded using pico-container$")
    public void phpTravelSectionAirportPageIsLoadedUsingPicoContainer() {
        vuelo = pico.getVuelo();
        vuelo.goSectionAirport();
    }

    @And("^fill credentials on 'Airport' page in the form to create a new airport with data using pico-container$")
    public void fillCredentialsOnAirportPageInTheFormToCreateANewAirportWithDataUsingPicoContainer(DataTable datos) {
        pico.getAeropuerto().fillCredentials(datos);
    }
}
