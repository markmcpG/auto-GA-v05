package org.umssdiplo.automationv01.core.managepage.Hoteles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.io.IOException;

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

    public boolean verificarElementoPasadoId(String id) {
        String css="a[data-primary=\""+id+"\"][title=\"Edit\"]";
        WebElement aux = webDriver.findElement(By.cssSelector(css));
        boolean respuesta=false;
        if(aux!=null){
            respuesta = true;
        }

        return respuesta;
    }
    public Extras clickButtonUpdateId(String id){
        String css="a[data-primary=\""+id+"\"][title=\"Edit\"]";
        WebElement aux = webDriver.findElement(By.cssSelector(css));
        if(aux!=null){
            CommonEvents.clickButton(aux);
        }
        else{
            System.out.println("Elemento no existe!!!, A ser Modificado");
        }
        return this;
    }
    public Extras clickButtonSaveReturnExtrasUpdate(){
        CommonEvents.clickButton(buttonSaveReturnExtrasUpdate);
        return this;
    }

    public boolean verficarElementoARemoveId(String id) {
        String css="a[data-primary=\""+id+"\"][data-task=\"remove\"]";
        boolean respuesta = false;
        WebElement aux = webDriver.findElement(By.cssSelector(css));
            if (aux!=null){
                respuesta = true;
            }
            else {
                System.out.println("Elemento no Existe A Ser Eliminado!!");
            }
        return respuesta;
    }

    public Extras clickButtonDeleteExtraId(String id) {
        String css="a[data-primary=\""+id+"\"][data-task=\"remove\"]";
        WebElement aux = webDriver.findElement(By.cssSelector(css));
        if (aux!=null){
            CommonEvents.clickButton(aux);
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
        }
        else {
            System.out.println("Elemento no Existe A Ser Eliminado!!");
        }
        return this;
    }
}
