package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Automovil.Automovil;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }
    public static Automovil carsPage() {
        Automovil autoRes = new Automovil();
        autoRes.SeleccionarCars();
        return autoRes;
    }


}
