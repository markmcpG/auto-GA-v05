package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.security.Key;
import java.util.List;
import java.util.Map;

public class Route extends BasePage {

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement botonAdd;

    @FindBy(css = "select[name=\"flightstatus\"]")
    private WebElement status;

    @FindBy(css = "input[name=\"total_hours\"]")
    private WebElement totalHours;

    @FindBy(css = "input[name=\"tax\"]")
    private WebElement tax;

    @FindBy(css = "input[name=\"deposite\"]")
    private WebElement deposite;

    @FindBy(css = "div[id=\"s2id_autogen5\"]")
    private WebElement flyType;

    @FindBy(css = "div[id=\"s2id_autogen7\"]")
    private WebElement refundable;

    @FindBy(css = "div[id=\"s2id_flight_type\"]")
    private WebElement direction;

    @FindBy(css = "input[name=\"adultprice[]\"]")
    private WebElement adultPrice;

    @FindBy(css = "input[name=\"childprice[]\"]")
    private WebElement clildPrice;

    @FindBy(css = "input[name=\"infantprice[]\"]")
    private WebElement infantPrice;

    @FindBy(css = "div[id=\"s2id_locationlist_0\"]")
    private WebElement cityAirportDeparture;

    @FindBy(css = "div[id=\"s2id_locationlist_1\"]")
    private WebElement cityAirportArrival;

    @FindBy(css = "div[id=\"s2id_aeroplanes_0\"]")
    private WebElement airlineDeparture;

    @FindBy(css = "div[id=\"s2id_aeroplanes_1\"]")
    private WebElement airlineArrival;
/*
    @FindBy(css = "input[name=\"flightnos_[]\"]") //DEVUELVE 2
    private WebElement flyNroDepartureArrival;

    @FindBy(css = "input[name=\"date_[]\"]") //DEVUELVE 2
    private WebElement date;

    @FindBy(css = "input[name=\"times_[]\"]") //DEVUELVE 4
    private WebElement time; */

    @FindBy(css = "button[id=\"add\"]")
    private WebElement botonSave;

    public void clickBottonAdd() {
        clickWebElement(botonAdd);
    }
    public void clickWebElement(WebElement elem){
        elem.click();
        CommonEvents.forceWait(1000);
    }

    public void fillFields(DataTable datos) {
        int i = 0;
        //Write the code to handle Data Table
        for (Map<String, String> data : datos.asMaps(String.class, String.class)) {
            if(i != 0){
                clickWebElement(botonAdd);
            }
            status.click();
            if(data.get("status").equalsIgnoreCase("Enabled"))
                CommonEvents.selectOption(status,"Enabled");
            if(data.get("status").equalsIgnoreCase("Disabled"))
                CommonEvents.selectOption(status,"Disabled");

            totalHours.sendKeys(data.get("Total-Hours"));
            tax.sendKeys("13");
            deposite.sendKeys("3");

            flyType.click();
            WebElement box = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box.sendKeys("Business");
            box.sendKeys(Keys.ENTER);

            refundable.click();
            WebElement box1 = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box1.sendKeys("Refundable");
            box1.sendKeys(Keys.ENTER);

            direction.click();
            WebElement box2 = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box2.sendKeys("One Way");
            box2.sendKeys(Keys.ENTER);

            adultPrice.sendKeys("400");
            clildPrice.sendKeys("200");
            infantPrice.sendKeys("55");

            cityAirportDeparture.click();
            WebElement box3 = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box3.sendKeys(data.get("From"));
            CommonEvents.forceWait(4000);
            box3.sendKeys(Keys.ENTER);

            cityAirportArrival.click();
            WebElement box4 = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box4.sendKeys(data.get("To"));
            CommonEvents.forceWait(4000);
            box4.sendKeys(Keys.ENTER);

            airlineDeparture.click();
            WebElement box5 = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box5.sendKeys("BoA Boliviana de Aviacion");
            CommonEvents.forceWait(6000);
            box5.sendKeys(Keys.ENTER);

            airlineArrival.click();
            WebElement box6 = webDriver.findElement(By.cssSelector("div[id=\"select2-drop\"] div input"));
            box6.sendKeys("BoA Boliviana de Aviacion");
            CommonEvents.forceWait(6000);
            box6.sendKeys(Keys.ENTER);

            List<WebElement> flyNrosDAs = webDriver.findElements(By.cssSelector("input[name=\"flightnos_[]\"]"));
            flyNrosDAs.get(0).sendKeys("129");
            flyNrosDAs.get(1).sendKeys("229");

            List<WebElement> dates = webDriver.findElements(By.cssSelector("input[name=\"date_[]\"]"));
            dates.get(0).sendKeys(data.get("Departure-Date"));
            dates.get(1).sendKeys(data.get("Date-Arrival"));

            List<WebElement> times = webDriver.findElements(By.cssSelector("input[name=\"times_[]\"]"));
            times.get(0).sendKeys(data.get("Time-Departure"));
            times.get(1).sendKeys(data.get("Time-Departure"));
            times.get(2).sendKeys(data.get("Time-Arrival"));
            times.get(3).sendKeys(data.get("Time-Arrival"));
/*
            WebElement iframe = webDriver.findElement(By.cssSelector("div[id=\"cke_1_contents\"] iframe"));
            webDriver.switchTo().frame(1);
            CommonEvents.forceWait(3000);
            System.out.println("HERE");
            WebElement parrafo = iframe.findElement(By.tagName("html"));
            CommonEvents.goComponent(parrafo,webDriver);
            parrafo.click();
            parrafo.sendKeys("MONTI CUJUDO CULEADO");*/

            CommonEvents.goComponent(botonSave,webDriver);
            i++;
            clickWebElement(botonSave);
            CommonEvents.forceWait(12000);
        }
    }
}
