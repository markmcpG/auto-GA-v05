package org.umssdiplo.automationv01.core.managepage.Offers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class OffersManage extends BasePage {

    @FindBy(css = "a[href=\"#SPECIAL_OFFERS\"]")
    private WebElement menuSelectOffer;
    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/offers/\"]")
    private WebElement subMenuOffersManager;
    @FindBy(css = "button[class=\"btn btn-success\"][type=\"submit\"]")
    private WebElement buttonAdd;

    // Agregando Offers
    @FindBy(css = "select[name=\"offerstatus\"]")
    private WebElement selectStatusAdd;
    @FindBy(css = "input[name=\"offertitle\"]")
    private WebElement inputOfferTitleAdd;
    @FindBy(css = "input[name=\"offerphone\"]")
    private WebElement inputOfferPhoneAdd;
    @FindBy(css = "input[name=\"offeremail\"]")
    private WebElement inputOfferEmailAdd;
    @FindBy(css = "input[name=\"offerprice\"]")
    private WebElement inputOfferPriceAdd;
    @FindBy(css = "input[name=\"ofrom\"]")
    private WebElement inputOfferOFromAdd;
    @FindBy(css = "input[name=\"oto\"]")
    private WebElement inputOfferOToAdd;
    // Begin textArea
    @FindBy(css = "textarea[name=\"offerdesc\"]")
    private WebElement textAreaOfferDesAdd;
    // End TextArea
    @FindBy(css = "button[id=\"add\"]")
    private WebElement buttonSubmitAdd;

    // ELIMINAR UN OFFER
    @FindBy(css = "button[data-limit=\"all\"]")
    private WebElement buttonSearchAll;

    // MODIFICAR OFFERS
    @FindBy(css = "select[name=\"offerstatus\"]")
    private WebElement selectStatusEdit;
    @FindBy(css = "input[name=\"offertitle\"]")
    private WebElement inputOfferTitleEdit;
    @FindBy(css = "input[name=\"offerphone\"]")
    private WebElement inputOfferPhoneEdit;
    @FindBy(css = "input[name=\"offeremail\"]")
    private WebElement inputOfferEmailEdit;
    @FindBy(css = "input[name=\"offerprice\"]")
    private WebElement inputOfferPriceEdit;
    @FindBy(css = "input[name=\"ofrom\"]")
    private WebElement inputOfferOFromEdit;
    @FindBy(css = "input[name=\"oto\"]")
    private WebElement inputOfferOToEdit;

    @FindBy(css = "button[id=\"update\"]")
    private WebElement buttonSubmitEdit;



    public OffersManage clickMenuOffer(){
        CommonEvents.scrollComponent(menuSelectOffer,webDriver);
        CommonEvents.clickButton(menuSelectOffer);
        return this;
    }
    public OffersManage clicksubMenuOffersManager(){
        CommonEvents.clickButton(subMenuOffersManager);
        return this;
    }
    public OffersManage clickButtonAdd(){
        CommonEvents.clickButton(buttonAdd);
        return this;
    }
    // BEGIN FORMULARIO ADD
    public OffersManage setSelectStatusAdd(String status){
        CommonEvents.selectOption(selectStatusAdd,status);
        return this;
    }
    public OffersManage setInputOfferTitleAdd(String title){
        CommonEvents.setInputField(inputOfferTitleAdd,title);
        return this;
    }
    public OffersManage setInputOfferPhoneAdd(String phone) {
        CommonEvents.setInputField(inputOfferPhoneAdd,phone);
        return this;
    }
    public OffersManage setInputOfferEmailAdd(String emal) {
        CommonEvents.setInputField(inputOfferEmailAdd,emal);
        return this;
    }
    public OffersManage setInputOfferPriceAdd(String price) {
        CommonEvents.forceWait(6000);
        CommonEvents.setInputField(inputOfferPriceAdd,price);
        return this;
    }
    public OffersManage setInputOfferOFromAdd(String dateFrom) {
        CommonEvents.setInputField(inputOfferOFromAdd,dateFrom);
        CommonEvents.clickButton(inputOfferOFromAdd);
        return this;
    }
    public OffersManage setInputOfferOToAdd(String dateTo) {
        CommonEvents.setInputField(inputOfferOToAdd,dateTo);
        CommonEvents.clickButton(inputOfferOToAdd);
        return this;
    }
    // insertando descripcion
    public OffersManage setTextAreaDescripcionAdd(String descri) {
        CommonEvents.scrollComponent(buttonSubmitAdd,webDriver);
        String xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]";
        WebElement table_element = webDriver.findElement(By.xpath(xpath));
        table_element.click();
        table_element.sendKeys("MONTYYYYYYYYYYYYYYYYYYYY");

        return this;
    }
    public OffersManage clickButtonSubmitAdd(){
        CommonEvents.clickButton(buttonSubmitAdd);
        return this;
    }
    // END FORMULARIO ADD


    public boolean buscarOffers(String title){
        boolean respuesta=false;
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 ){
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(title)){
                    respuesta=true;
                    break;
                }
            }
        }
        return respuesta;
    }
    // BEGIN ELIMINAR OFFERS
    public OffersManage verificarOfferAEliminar(String title){
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 ){
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(title)){
                    WebElement tdElementButtons = td_collection.get(8);
                    WebElement btnEliminar = tdElementButtons.findElement(By.cssSelector("a[title=\"DELETE\"]"));
                    CommonEvents.clickButton(btnEliminar);
                    Alert alert = webDriver.switchTo().alert();
                    alert.accept();
                    break;
                }
            }
        }
        return this;
    }
    // END ELIMINAR OFFERS

    // BEGIN EDIT
    public OffersManage clickButtonEditOffer(String title){
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection){
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 ){
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(title)){
                    WebElement tdElementButtons = td_collection.get(8);
                    WebElement btnEdit = tdElementButtons.findElement(By.cssSelector("a[title=\"Edit\"]"));
                    CommonEvents.clickButton(btnEdit);
                    break;
                }
            }
        }
        return this;
    }


    public OffersManage setSelectStatusEdit(String status){
        CommonEvents.selectOption(selectStatusEdit,status);
        return this;
    }
    public OffersManage setInputOfferTitleEdit(String title){
        CommonEvents.setInputField(inputOfferTitleEdit,title);
        return this;
    }

    public OffersManage setInputOfferPhoneEdit(String phone) {
        CommonEvents.setInputField(inputOfferPhoneEdit,phone);
        return this;
    }

    public OffersManage setInputOfferEmailEdit(String emal) {
        CommonEvents.setInputField(inputOfferEmailEdit,emal);
        return this;
    }

    public OffersManage setInputOfferPriceEdit(String price) {
        CommonEvents.forceWait(6000);
        CommonEvents.setInputField(inputOfferPriceEdit,price);
        return this;
    }

    public OffersManage setInputOfferOFromEdit(String dateFrom) {
        CommonEvents.setInputField(inputOfferOFromEdit,dateFrom);
        return this;
    }

    public OffersManage setInputOfferOToEdit(String dateTo) {
        CommonEvents.setInputField(inputOfferOToEdit,dateTo);
        CommonEvents.clickButton(inputOfferOToEdit);
        return this;
    }

    // insertando descripcion
    public OffersManage setTextAreaDescripcionEdit(String descri) {
        CommonEvents.scrollComponent(buttonSubmitEdit,webDriver);
        //CommonEvents.setInputField(textAreaOfferDesAdd,descri);
        return this;
    }
    public OffersManage clickButtonSubmitEdit(){
        CommonEvents.clickButton(buttonSubmitEdit);
        return this;
    }
}
