package org.umssdiplo.automationv01.core.managepage.pagePuma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Puma extends BasePage {
    @FindBy(css = "a[href=\"/hombre\"]")
    private WebElement menuMens;

    @FindBy(css = "a[href=\"/calzado_de_futbol-hombre\"]")
    private WebElement seccionFutbol;

    public Puma(){
    }

    public void hoverOnMen(){
        Actions action = new Actions(ManageDriver.getInstance().getWebDriver());
        action.moveToElement(menuMens).build().perform();
        //CommonEvents.forceWait(1000);
    }

    public void clickSectionMens(){
        CommonEvents.clickButton(seccionFutbol);
    }
}
