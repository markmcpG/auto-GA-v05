package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Automovil.Automovil;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Automovil automovil;


    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^fill credentials on 'Login' data$")
    public void fillCredentialsOnLoginData(DataTable dt) {
        login.setCredentials(dt);

    }


    @And("^click on 'Car' button in 'Header' page$")
    public void clickOnCarButtonInHeaderPage() {
        automovil = new Automovil();
        automovil.SeleccionarCars();


    }


    @And("^'PHP travel section Cars' page is loaded$")
    public void phpTravelSectionCarsPageIsLoaded() {


    }
}
