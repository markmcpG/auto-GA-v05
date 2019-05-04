package org.umssdiplo.automationv01.core.managepage;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Modelo.Aeropuerto;
import org.umssdiplo.automationv01.core.managepage.Modelo.Country;
import org.umssdiplo.automationv01.core.managepage.Modelo.Route;
import org.umssdiplo.automationv01.core.managepage.Modelo.Vuelo;

public class PicoContainer {

    MutablePicoContainer pico;
    public PicoContainer(){
        pico = new DefaultPicoContainer();
        pico.addComponent(Login.class);
        pico.addComponent(Vuelo.class);
        pico.addComponent(Aeropuerto.class);
        pico.addComponent(Country.class);
        pico.addComponent(Route.class);
    }

    public Login getLogin(){
        return (Login)pico.getComponent(Login.class);
    }

    public Vuelo getVuelo() {
        return (Vuelo)pico.getComponent(Vuelo.class);
    }

    public Aeropuerto getAeropuerto() {
        return (Aeropuerto) pico.getComponent(Aeropuerto.class);
    }

    public Country getCountry() {
        return (Country)pico.getComponent(Country.class);
    }

    public Route getRoute() {
        return (Route)pico.getComponent(Route.class);
    }
}
