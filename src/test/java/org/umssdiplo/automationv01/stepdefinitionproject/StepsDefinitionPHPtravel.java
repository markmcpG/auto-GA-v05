package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Hotel hotel;

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
        hotel = LoadPage.hotelPage("https://www.phptravels.net/admin/hotels");
    }

    @And("^fill input data on 'Hotels' page data$")
    public void fillInputDataOnHotelsPageData(DataTable datos) {
        hotel.fillInputData(datos);
    }
}
