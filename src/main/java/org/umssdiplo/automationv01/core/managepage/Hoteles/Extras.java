package org.umssdiplo.automationv01.core.managepage.Hoteles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.io.IOException;
import java.util.List;

public class Extras extends BasePage {
    @FindBy(css = "a[href=\"#Hotels\"]")
    private WebElement menuHomeHotels;
    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/hotels/extras\"]")
    private WebElement subMenuHotelsExtras;
    @FindBy(css = "a[class=\"btn btn-success xcrud-action\"]")
    private WebElement buttonSubmitAddExtras;

    @FindBy(css = "input[name=\"cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--\"]")
    private WebElement inputNameExtrasAdd;
    @FindBy(css = "select[name=\"cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-\"]")
    private WebElement selectStatusExtrasAdd;
    @FindBy(css = "input[name=\"cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--\"]")
    private WebElement inputPriceExtrasAdd;
    @FindBy(css = "a[class=\"btn btn-primary xcrud-action\"]")
    private WebElement buttonSaveReturnExtrasAdd;
    @FindBy(css = "a[data-task=\"save\"][data-after=\"list\"]")
    private WebElement buttonSaveReturnExtrasUpdate;

    public Extras clickMenuHomeHotes(){
        CommonEvents.clickButton(menuHomeHotels);
        return this;
    }
    public Extras clickSubMenuHotelsExtras(){
        CommonEvents.clickButton(subMenuHotelsExtras);
        return this;
    }
    public Extras clickButtonSubmitAddExtras(){
        CommonEvents.clickButton(buttonSubmitAddExtras);
        return this;
    }
    public Extras setInputNameExtrasAdd(String name){
        CommonEvents.setInputField(inputNameExtrasAdd,name);
        return this;
    }
    public Extras setSelectStatusExtrasAdd(String status){
        CommonEvents.selectOption(selectStatusExtrasAdd,status);
        return this;
    }
    public Extras setInputPriceExtrasAdd(String price){
        CommonEvents.setInputField(inputPriceExtrasAdd,price);
        return this;
    }
    public Extras clickButtonSaveReturnExtrasAdd(){
        CommonEvents.clickButton(buttonSaveReturnExtrasAdd);
        return this;
    }

    public boolean verificarElementoPasadoName(String name) {
        boolean respuesta=false;
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 ){
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(name)){
                    respuesta=true;
                    break;
                }
            }
        }
        return respuesta;
    }
    public Extras clickButtonUpdateName(String name){
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 ){
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(name)){
                    WebElement tdElementButtons = td_collection.get(8);
                    WebElement btnEdit = tdElementButtons.findElement(By.cssSelector("a[title=\"Edit\"]"));
                    CommonEvents.clickButton(btnEdit);
                    break;
                }
            }
        }
        return this;
    }
    public Extras clickButtonSaveReturnExtrasUpdate(){
        CommonEvents.clickButton(buttonSaveReturnExtrasUpdate);
        return this;
    }

    public Extras clickButtonDeleteExtraName(String name) {
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 ){
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(name)){
                    WebElement tdElementButtons = td_collection.get(8);
                    WebElement btnEliminar = tdElementButtons.findElement(By.cssSelector("a[title=\"Remove\"]"));
                    CommonEvents.clickButton(btnEliminar);
                    Alert alert = webDriver.switchTo().alert();
                    alert.accept();
                    break;
                }
            }
        }

        return this;
    }

}
