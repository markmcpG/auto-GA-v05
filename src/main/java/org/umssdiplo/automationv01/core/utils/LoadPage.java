package org.umssdiplo.automationv01.core.utils;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Extras;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Room;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersManage;
import org.umssdiplo.automationv01.core.managepage.Offers.OffersSetting;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }
    public static Hotel hotelPage() {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(Hotel.class);
        Hotel hotel = pico.getComponent(Hotel.class);
        return hotel;
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
