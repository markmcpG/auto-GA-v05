package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Vuelo extends BasePage {
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
    //@FindBy(xpath = "//a[text()=\"Save & Return\"]")
    //@FindBy(xpath = "//a[text()=\"Save & New\"]")
    private WebElement botonSave;

    public Vuelo(){

    }

    public void fillCredentials(DataTable datos){
        CommonEvents.clickButton(botonAdd);
        CommonEvents.forceWait(1000);

        //Write the code to handle Data Table
        List<Map<String,String>> data = datos.asMaps(String.class,String.class);
        code.sendKeys(data.get(0).get("code"));
        name.sendKeys(data.get(0).get("name"));
        cityCode.sendKeys(data.get(0).get("cityCode"));
        cityName.sendKeys(data.get(0).get("cityName"));
        countryName.sendKeys(data.get(0).get("countryName"));
        countryCode.sendKeys(data.get(0).get("countryCode"));
        timeZone.sendKeys(data.get(0).get("timeZone"));
        lat.sendKeys(data.get(0).get("lat"));
        lon.sendKeys(data.get(0).get("lon"));
        city.sendKeys(data.get(0).get("city"));

        CommonEvents.forceWait(5000);
        System.out.println("ESTE ES EL TEXTO DEL BOTON SAVE");
        System.out.println(botonSave.getText());
        //CommonEvents.clickButton(botonSave);
        botonSave.click();
    }
}
