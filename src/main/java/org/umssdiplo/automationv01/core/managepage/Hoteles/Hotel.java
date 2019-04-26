package org.umssdiplo.automationv01.core.managepage.Hoteles;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class Hotel extends BasePage {
    @FindBy(css = "a[href=\"#Hotels\"]")
    private WebElement botonHotels;
    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/hotels\"]")
    private WebElement botonHotel;
    @FindBy(css = "button[type=\"submit\"]")
    private WebElement botonAdd;
    @FindBy(css = "select[data-placeholder=\"Select\"]")
    private WebElement selectStatus;
    @FindBy(css = "option[value=\"No\"]")
    private WebElement optionNo;

    @FindBy(name="hotelname")
    private WebElement nameInputData;
    @FindBy(css = "body[class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"][xpath=\"1\"]")
    private WebElement iframeDescripcion;

    @FindBy(css = "select[data-placeholder=\"Select\"]")
    private WebElement selectStars;
    @FindBy(css = "option[value=\"3\"]")
    private WebElement option3;
    @FindBy(name="hoteltype")
    private WebElement selectHotelType;
    @FindBy(css = "option[value=\"191\"]")
    private WebElement optionHotel;
    @FindBy(name="isfeatured")
    private WebElement selectFeature;
    @FindBy(css = "option[value=\"no\"]")
    private WebElement optionFeaNo;

    public void clickMenuHotles(){
        CommonEvents.clickButton(botonHotels);
    }
    public void clickSubMenuHotlel(){
        CommonEvents.clickButton(botonHotel);
    }
    public void clickButtonAdd() {
        CommonEvents.clickButton(botonAdd);
    }
    public void clickSelectStatus(){
        CommonEvents.clickButton(selectStatus);
    }
    public void clickOptionStatusNo(){
        CommonEvents.clickButton(optionNo);
    }
    public void clickSelectStars(){
        CommonEvents.clickButton(selectStars);
    }
    public void clickOptionStar3(){
        CommonEvents.clickButton(option3);
    }
    public void clickSelectHotelType(){
        CommonEvents.clickButton(selectHotelType);
    }
    public void clickOptionHotelType(){
        CommonEvents.clickButton(optionHotel);
    }
    public void fillInputData(DataTable datos){
        System.out.println("IFRAME "+ iframeDescripcion.getTagName());
        List<Map<String,String>> data = datos.asMaps(String.class,String.class);
        nameInputData.sendKeys(data.get(0).get("name"));
        CommonEvents.setInputField(iframeDescripcion,"HOLA MUNDO");
        CommonEvents.clickButton(selectFeature);
        CommonEvents.clickButton(optionFeaNo);
    }
}
