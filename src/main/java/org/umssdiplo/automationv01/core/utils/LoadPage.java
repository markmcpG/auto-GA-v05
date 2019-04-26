package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Hoteles.Hotel;
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
        return new Hotel();
    }
    public static OffersSetting offersSettingPage(){
        return new OffersSetting();
    }
    public static OffersManage offersManagePage(){
        return new OffersManage();
    }
}
