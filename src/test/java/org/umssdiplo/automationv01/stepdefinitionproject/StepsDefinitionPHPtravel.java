package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Modelo.Aeropuerto;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Aeropuerto aeropuerto;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^fill credentials on 'Login' data$")
    public void fillCredentialsOnLoginData(DataTable dt) {
        login.setCredentials(dt);

    }

    /*@Given("^'PHP travel section Airport' page is loaded whit url \"([^\"]*)\"$")
    public void phpTravelSectionAirportPageIsLoadedWhitUrl(String url){
        aeropuerto = LoadPage.aeropuertoPage(url);
    }*/

    @And("^fill credentials on 'Airport' page data$")
    public void fillCredentialsOnAirportPageData(DataTable datos) {
        aeropuerto.createFly(datos);
    }

    @Given("^'PHP travel section Airport' page is loaded whit url$")
    public void phpTravelSectionAirportPageIsLoadedWhitUrl() {
        aeropuerto = LoadPage.aeropuertoPage();
    }
}
