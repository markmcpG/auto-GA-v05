package org.umssdiplo.automationv01.core.managepage.Offers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

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

    @FindBy(css = "textarea[name=\"offerdesc\"]")
    private WebElement textAreaOfferDesEdit;

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
        //CommonEvents.setInputField(textAreaOfferDesAdd,descri);
        return this;
    }
    public OffersManage clickButtonSubmitAdd(){
        CommonEvents.clickButton(buttonSubmitAdd);
        return this;
    }
    // END FORMULARIO ADD

    public OffersManage clickButtonSearchAll(){
        CommonEvents.scrollComponent(buttonSearchAll,webDriver);
        //CommonEvents.clickButton(buttonSearchAll);
        return this;
    }
    public boolean buscarOffers(String id){
        CommonEvents.forceWait(4000);
        WebElement aux = webDriver.findElement(By.cssSelector("a[id=\""+id+"\"]"));
        boolean respuesta= false;
        if (aux!=null){
            respuesta = true;
        }
        return respuesta;
    }
    // BEGIN ELIMINAR OFFERS
    public OffersManage verificarOfferAEliminar(String id){
        CommonEvents.forceWait(4000);
        WebElement elemento = webDriver.findElement(By.cssSelector("a[id=\""+id+"\"]"));
        CommonEvents.scrollComponent(elemento,webDriver);
        CommonEvents.clickButton(elemento);
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        return this;
    }
    // END ELIMINAR OFFERS

    // BEGIN EDIT
    public OffersManage clickButtonEditOffer(String title){
        title = title.replace(" ","-");
        WebElement aux = webDriver.findElement(By.cssSelector("a[href=\"https://www.phptravels.net/admin/offers/manage/"+ title +"\"]"));
        CommonEvents.scrollComponent(aux,webDriver);
        CommonEvents.clickButton(aux);
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
