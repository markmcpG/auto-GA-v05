package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto extends BasePage {
    private List<Vuelo> flies = new ArrayList<>();

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
