package org.umssdiplo.automationv01.core.managepage.Modelo;

import cucumber.api.DataTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Vuelo extends BasePage {

    @FindBy(css = "a[href=\"#Flights\"]")
    private WebElement botonFlies;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/flights/airports\"]")
    private WebElement botonAirports;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/flights/countries\"]")
    private WebElement botonCountry;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/flights/routes\"]")
    private WebElement botonRoutes;

    private List<Aeropuerto> aeropuertos = new ArrayList<>();
    private List<Country> countries = new ArrayList<>();
    private List<Route> routes = new ArrayList<>();

    @FindBy(css = "a[class=\"xcrud-search-toggle btn btn-default\"]")
    private WebElement searchButton;

    private String cssFind;
    private WebElement element;

    public Aeropuerto createFly(DataTable datos){
        Aeropuerto newFly = new Aeropuerto();
        newFly.fillCredentials(datos);
        aeropuertos.add(newFly);
        return newFly;
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public void locatorSearchButton() {
        CommonEvents.goComponent(searchButton,webDriver);
    }

    public void initSearch() {
        searchButton.click();
    }

    public void fillSearchFields(DataTable data) {

        List<Map<String,String>> datos = data.asMaps(String.class,String.class);
        cssFind = "input[class=\"xcrud-searchdata xcrud-search-active input-small form-control\"]";
        element = getWebElement(cssFind);
        if(datos.get(0).get("code") != null)
            element.sendKeys(datos.get(0).get("code"));
        if(datos.get(0).get("iso") != null)
            element.sendKeys(datos.get(0).get("iso"));

        //Seleccionando para la busqueda por codigo o iso
        cssFind = "select[class=\"xcrud-data xcrud-columns-select input-small form-control\"]";
        element = getWebElement(cssFind);
        CommonEvents.goComponent(element,webDriver);
        element.click();
        if(datos.get(0).get("code") != null)
            CommonEvents.selectOption(element,"Code");
        if(datos.get(0).get("iso") != null)
            CommonEvents.selectOption(element,"Iso");

    }

    public WebElement getWebElement(String cssFind) {
        return webDriver.findElement(By.cssSelector(cssFind));
    }

    public void clickBottonGo() {
        cssFind = "a[class=\"xcrud-action btn btn-primary\"]";
        element = getWebElement(cssFind);
        element.click();
        CommonEvents.forceWait(6000);
    }

    public void goSectionAirport() {
        CommonEvents.clickButton(botonFlies);
        CommonEvents.forceWait(1000);
        CommonEvents.clickButton(botonAirports);
    }

    public String getCodeDelete(String codeDelete, String action) {
        element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> allRows = element.findElements(By.tagName("tr"));
        String res = "";
        for (int i = 0; i < allRows.size();i++) {
            List<WebElement> tds = allRows.get(i).findElements(By.tagName("td"));
            for(int j = 0; j < tds.size(); j++){
                String codigo = tds.get(j).getText();
                if(codigo.equalsIgnoreCase(codeDelete)){
                    if(action.equalsIgnoreCase("remove")){
                        res = codigo;
                        WebElement buttonRemove = element.findElement(By.xpath("//tr["+ (i+1) +"]/td[13]/span/a[3]"));
                        eliminarItem(buttonRemove);
                        return res;
                    }
                    if(action.equalsIgnoreCase("edit")){
                        res = codigo;
                        WebElement buttonEdit = element.findElement(By.xpath("//tr["+ (i+1) +"]/td[13]/span/a[2]"));
                        ActualizarItem(buttonEdit);
                        return res;
                    }
                }
            }

        }
        return res;
    }

    private void ActualizarItem(WebElement buttonEdit) {
        buttonEdit.click();
        CommonEvents.forceWait(3000);
    }

    private void eliminarItem(WebElement buttonRemove) {
        try {
            buttonRemove.click();
            CommonEvents.forceWait(1000);
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
            CommonEvents.forceWait(5000);
        } catch (UnhandledAlertException f) {
            f.printStackTrace();

        }
    }

    public String prueba(String code){
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));

        System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
        int row_num,col_num;
        row_num = 1;
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            System.out.println("NUMBER OF COLUMNS="+td_collection.size());
            col_num = 1;
            for(WebElement tdElement : td_collection)
            {
                System.out.println("row # "+row_num+", col # "+col_num+ "text="+tdElement.getText());
                col_num++;
            }
            row_num++;
        }
        return "8081";
    }

    public void editItem(DataTable datos) {
        Aeropuerto AeroEdit = new Aeropuerto();
        AeroEdit.editItem(datos);
    }

    public void goSectionCountries() {
        CommonEvents.clickButton(botonFlies);
        CommonEvents.forceWait(1000);
        CommonEvents.goComponent(botonCountry,webDriver);
        CommonEvents.clickButton(botonCountry);
    }

    public Country createCountry(DataTable datos){
        Country newCountry = new Country();
        newCountry.fillFields(datos);
        countries.add(newCountry);
        return newCountry;
    }

    public void clickBottonAddOnCountry() {
        Country country = new Country();
        country.clickBottonAdd();
    }

    public String getCountryIso(String isoCode, String action) {
        element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> allRows = element.findElements(By.tagName("tr"));
        String res = "";
        for (int i = 0; i < allRows.size();i++) {
            List<WebElement> tds = allRows.get(i).findElements(By.tagName("td"));
            for(int j = 0; j < tds.size(); j++){
                String codigo = tds.get(j).getText();
                if(codigo.equalsIgnoreCase(isoCode)){
                    if(action.equalsIgnoreCase("view")){
                        res = codigo;
                        WebElement buttonView = element.findElement(By.xpath("//tr["+ (i+1) +"]/td[9]/span/a[1]"));
                        verItem(buttonView);
                        return res;
                    }
                    if(action.equalsIgnoreCase("edit")){
                        res = codigo;
                        WebElement buttonEdit = element.findElement(By.xpath("//tr["+ (i+1) +"]/td[9]/span/a[2]"));
                        ActualizarItem(buttonEdit);
                        return res;
                    }
                    if(action.equalsIgnoreCase("remove")){
                        res = codigo;
                        WebElement buttonRemove = element.findElement(By.xpath("//tr["+ (i+1) +"]/td[9]/span/a[3]"));
                        eliminarItem(buttonRemove);
                        return res;
                    }
                }
            }

        }
        return res;
    }

    private void verItem(WebElement buttonView) {
        buttonView.click();
    }

    public void editItemCountry(DataTable data) {
        Country countryEdit = new Country();
        countryEdit.editCountry(data);
    }

    public void clickBottonBack() {
        WebElement back = getWebElement("a[data-task=\"list\"]");
        CommonEvents.forceWait(2000);
        back.click();
        CommonEvents.forceWait(5000);
    }

    public void goSectionRoutes() {
        CommonEvents.clickButton(botonFlies);
        CommonEvents.forceWait(1000);
        CommonEvents.goComponent(botonRoutes,webDriver);
        CommonEvents.clickButton(botonRoutes);
    }

    public void clickBottonAddOnRoutes() {
        Route route = new Route();
        route.clickBottonAdd();
    }

    public Route createRoute(DataTable data) {
        Route newRoute = new Route();
        newRoute.fillFields(data);
        routes.add(newRoute);
        return newRoute;
    }
}
