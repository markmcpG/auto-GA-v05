package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto extends BasePage {
    @FindBy(css = "a[href=\"#Flights\"]")
    private WebElement botonFlies;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/flights/airports\"]")
    private WebElement botonAirports;

    private List<Vuelo> flies = new ArrayList<>();
    public Aeropuerto(){
        CommonEvents.clickButton(botonFlies);
        CommonEvents.forceWait(1000);
        CommonEvents.clickButton(botonAirports);
    }

    public Vuelo createFly(DataTable datos){
        Vuelo newFly = new Vuelo();
        newFly.fillCredentials(datos);
        flies.add(newFly);
        return newFly;
    }

    public List<Vuelo> getFlies() {
        return flies;
    }
}
