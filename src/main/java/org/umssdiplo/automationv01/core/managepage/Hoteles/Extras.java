package org.umssdiplo.automationv01.core.managepage.Hoteles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

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


}
