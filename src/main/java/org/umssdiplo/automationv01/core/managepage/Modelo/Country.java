package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.Map;

public class Country extends BasePage {

    @FindBy(css = "a[data-task=\"create\"]")
    private WebElement botonAdd;

    @FindBy(name = "cHRfZmxpZ2h0c19jb3VudHJpZXMuaXNv")
    private WebElement iso;

    @FindBy(name = "cHRfZmxpZ2h0c19jb3VudHJpZXMubmFtZQ--")
    private WebElement name;

    @FindBy(name = "cHRfZmxpZ2h0c19jb3VudHJpZXMubmljZW5hbWU-")
    private WebElement nicename;

    @FindBy(name = "cHRfZmxpZ2h0c19jb3VudHJpZXMuaXNvMw--")
    private WebElement iso3;

    @FindBy(name = "cHRfZmxpZ2h0c19jb3VudHJpZXMubnVtY29kZQ--")
    private WebElement numcode;

    @FindBy(name = "cHRfZmxpZ2h0c19jb3VudHJpZXMucGhvbmVjb2Rl")
    private WebElement phonecode;


    @FindBy(css = "a[data-after=\"list\"]")
    private WebElement botonSave;

    public void fillFields(DataTable datos) {

        //Write the code to handle Data Table
        int i = 0;
        for (Map<String, String> data : datos.asMaps(String.class, String.class)) {
            if(i != 0){
                clickBottonAdd();
            }

            iso.sendKeys(data.get("iso"));
            name.sendKeys(data.get("name"));
            nicename.sendKeys(data.get("nicename"));
            iso3.sendKeys(data.get("iso3"));
            numcode.sendKeys(data.get("numcode"));
            phonecode.sendKeys(data.get("phonecode"));

            CommonEvents.goComponent(botonSave,webDriver);
            i++;
            clickWebElement(botonSave);
        }

    }

    public void clickWebElement(WebElement elem){
        elem.click();
        CommonEvents.forceWait(2000);
    }

    public void clickBottonAdd(){
        clickWebElement(botonAdd);
    }

    public void editCountry(DataTable datos) {
        for (Map<String, String> data : datos.asMaps(String.class, String.class)) {
            iso.clear();
            name.clear();
            nicename.clear();
            iso3.clear();
            numcode.clear();
            phonecode.clear();

            iso.sendKeys(data.get("iso"));
            name.sendKeys(data.get("name"));
            nicename.sendKeys(data.get("nicename"));
            iso3.sendKeys(data.get("iso3"));
            numcode.sendKeys(data.get("numcode"));
            phonecode.sendKeys(data.get("phonecode"));

            CommonEvents.goComponent(botonSave,webDriver);
            clickWebElement(botonSave);
        }
    }
}
