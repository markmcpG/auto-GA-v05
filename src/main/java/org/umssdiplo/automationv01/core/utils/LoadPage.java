package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Extras;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Room;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Modelo.Vuelo;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersManage;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSetting;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static Vuelo vueloPage() {
        // ManageDriver.getInstance().getWebDriver()
        //        .navigate().to();
        return new Vuelo();
    }
    public static Hotel hotelPage() {
        return new Hotel();
    }
    public static Room roomPage(){
        return new Room();
    }
    public static OffersSetting offersSettingPage(){
        return new OffersSetting();
    }
    public static OffersManage offersManagePage(){
        return new OffersManage();
    }
    public static Extras extrasPage(){
        return new Extras();
    }
}
