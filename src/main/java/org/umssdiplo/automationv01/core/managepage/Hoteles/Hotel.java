package org.umssdiplo.automationv01.core.managepage.Hoteles;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class Hotel extends BasePage {
    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[7]/a")
    private WebElement botonHotels;
    @FindBy(xpath = "//*[@id=\"Hotels\"]/li[1]/a")
    private WebElement botonHotel;
    @FindBy(xpath = "//*[contains(@type,'sub')]")
    private WebElement botonAdd;

    @FindBy(name="hotelname")
    private WebElement nameInputData;

    @FindBy(tagName = "iframe")
    private WebElement descripTextarea;
    @FindBy(css = "body.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders:nth-child(2) > p:nth-child(1)")
    private WebElement cuerpoIframe;

    public void fillInputData(DataTable datos){
        CommonEvents.clickButton(botonHotels);
        CommonEvents.clickButton(botonHotel);
        System.out.println("Nombre del boton "+botonAdd.getText());
        CommonEvents.clickButton(botonAdd);
        CommonEvents.forceWait(1000);
        List<Map<String,String>> data = datos.asMaps(String.class,String.class);
        nameInputData.sendKeys(data.get(0).get("name"));
        System.out.println("IFRAMEEEEEEEEEEEEEEE " + descripTextarea.getTagName());
        CommonEvents.forceWait(1000);
        CommonEvents.clickButton(descripTextarea);
        cuerpoIframe.sendKeys(data.get(0).get("Description"));
    }
}
