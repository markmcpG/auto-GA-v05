package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Automovil.Car;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Tours.Tours;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }
    public static Car carsPage() {
        Car autoRes = new Car();
        return autoRes;
    }


    public static Tours toursPage() {
        Tours tours = new Tours();
        return tours;
    }
}
