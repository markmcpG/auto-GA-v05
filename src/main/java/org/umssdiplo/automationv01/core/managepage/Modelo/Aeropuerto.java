package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class Aeropuerto extends BasePage {

    @FindBy(css = "a[data-task=\"create\"]")
    private WebElement botonAdd;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb2Rl")
    private WebElement code;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5uYW1l")
    private WebElement name;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5Q29kZQ--")
    private WebElement cityCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5TmFtZQ--")
    private WebElement cityName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5TmFtZQ--")
    private WebElement countryName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5Q29kZQ--")
    private WebElement countryCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy50aW1lem9uZQ--")
    private WebElement timeZone;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5sYXQ-")
    private WebElement lat;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5sb24-")
    private WebElement lon;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5")
    private WebElement city;

    @FindBy(css = "a[data-after=\"list\"]")
    private WebElement botonSave;

    public void fillCredentials(DataTable datos){

        //Write the code to handle Data Table
        for (Map<String, String> data : datos.asMaps(String.class, String.class)) {

            clickWebElement(botonAdd);

            code.sendKeys(data.get("code"));
            name.sendKeys(data.get("name"));
            cityCode.sendKeys(data.get("cityCode"));
            cityName.sendKeys(data.get("cityName"));
            countryName.sendKeys(data.get("countryName"));
            countryCode.sendKeys(data.get("countryCode"));
            timeZone.sendKeys(data.get("timeZone"));
            lat.sendKeys(data.get("lat"));
            lon.sendKeys(data.get("lon"));
            city.sendKeys(data.get("city"));

            CommonEvents.goComponent(botonSave,webDriver);
            clickWebElement(botonSave);
        }
    }

    public void clickWebElement(WebElement elem){
        elem.click();
        CommonEvents.forceWait(1000);
    }

    public void editItem(DataTable datos) {
        for (Map<String, String> data : datos.asMaps(String.class, String.class)) {
            code.clear();
            name.clear();
            cityCode.clear();
            cityName.clear();
            countryName.clear();
            countryCode.clear();
            timeZone.clear();
            lat.clear();
            lon.clear();
            city.clear();

            code.sendKeys(data.get("code"));
            name.sendKeys(data.get("name"));
            cityCode.sendKeys(data.get("cityCode"));
            cityName.sendKeys(data.get("cityName"));
            countryName.sendKeys(data.get("countryName"));
            countryCode.sendKeys(data.get("countryCode"));
            timeZone.sendKeys(data.get("timeZone"));
            lat.sendKeys(data.get("lat"));
            lon.sendKeys(data.get("lon"));
            city.sendKeys(data.get("city"));

            CommonEvents.goComponent(botonSave,webDriver);
            clickWebElement(botonSave);
        }
    }
}
