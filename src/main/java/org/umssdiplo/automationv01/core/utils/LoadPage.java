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
    static MutablePicoContainer pico = new DefaultPicoContainer();

    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }
    public static Hotel hotelPage() {
        pico.addComponent(Hotel.class);
        Hotel hotel = pico.getComponent(Hotel.class);
        return hotel;
    }
    public static Room roomPage(){
        pico.addComponent(Room.class);
        Room room = pico.getComponent(Room.class);
        return room;
    }
    public static Room getRoom(){
        Room room = pico.getComponent(Room.class);
        return room;
    }

    public static OffersSetting offersSettingPage(){
        pico.addComponent(OffersSetting.class);
        OffersSetting offersSetting = pico.getComponent(OffersSetting.class);
        return offersSetting;
    }
    public static OffersManage offersManagePage(){
        pico.addComponent(OffersManage.class);
        OffersManage offersManage = pico.getComponent(OffersManage.class);
        return offersManage;
    }
    public static Extras extrasPage(){
        pico.addComponent(Extras.class);
        Extras extras = pico.getComponent(Extras.class);
        return extras;
    }
    public static Extras getExtras(){
        Extras extras = pico.getComponent(Extras.class);
        return extras;
    }
}
