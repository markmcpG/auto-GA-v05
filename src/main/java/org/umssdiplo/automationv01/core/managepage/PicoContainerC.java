package org.umssdiplo.automationv01.core.managepage;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.umssdiplo.automationv01.core.managepage.Automovil.Car;
import org.umssdiplo.automationv01.core.managepage.Tours.Tours;

public class PicoContainerC {
    MutablePicoContainer pico;
    private Car car;
    private Tours tours;

    public PicoContainerC() {
        this.pico = new DefaultPicoContainer();
        pico.addComponent(Car.class);
        pico.addComponent(Tours.class);

    }

    public Car getCar() {
        car = pico.getComponent(Car.class);
        return car;
    }

    public Tours getTours() {
        tours = pico.getComponent(Tours.class);
        return tours;
    }
}
