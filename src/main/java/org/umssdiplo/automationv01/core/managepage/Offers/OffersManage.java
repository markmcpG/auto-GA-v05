package org.umssdiplo.automationv01.core.managepage.Offers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import javax.swing.plaf.ButtonUI;

public class OffersManage extends BasePage {

    @FindBy(css = "a[href=\"#SPECIAL_OFFERS\"]")
    private WebElement menuSelectOffer;
    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/offers/\"]")
    private WebElement subMenuOffersManager;
    @FindBy(css = "button[class=\"btn btn-success\"][type=\"submit\"]")
    private WebElement buttonAdd;

    // Agregando Offers
    @FindBy(css = "select[name=\"offerstatus\"]")
    private WebElement selectStatus;
    @FindBy(css = "input[name=\"offertitle\"]")
    private WebElement inputOfferTitle;
    @FindBy(css = "input[name=\"offerphone\"]")
    private WebElement inputOfferPhone;
    @FindBy(css = "input[name=\"offeremail\"]")
    private WebElement inputOfferEmail;
    @FindBy(css = "input[name=\"offerprice\"]")
    private WebElement inputOfferPrice;
    @FindBy(css = "input[name=\"ofrom\"]")
    private WebElement inputOfferOFrom;
    @FindBy(css = "input[name=\"oto\"]")
    private WebElement inputOfferOTo;
    @FindBy(css = "textarea[name=\"offerdesc\"]")
    private WebElement textAreaOfferDes;
    @FindBy(css = "button[id=\"add\"]")
    private WebElement buttonSubmit;

    // ELIMINAR UN OFFER
    @FindBy(css = "div[class=\"panel-body\"]")
    private WebElement divContenedor;
    @FindBy(css = "button[data-limit=\"all\"]")
    private WebElement buttonSearchAll;
    //@FindBy(css = "a[id='104']")



    public void clickMenuOffer(){
        CommonEvents.scrollComponent(menuSelectOffer,webDriver);
        CommonEvents.clickButton(menuSelectOffer);
    }
    public void clicksubMenuOffersManager(){
        CommonEvents.clickButton(subMenuOffersManager);
    }
    public void clickButtonAdd(){
        CommonEvents.clickButton(buttonAdd);
    }
    public void setSelectStatus(String status){
        CommonEvents.selectOption(selectStatus,status);
    }
    public void setInputOfferTitle(String title){
        CommonEvents.setInputField(inputOfferTitle,title);
    }

    public void setInputOfferPhone(String phone) {
        CommonEvents.setInputField(inputOfferPhone,phone);
    }

    public void setInputOfferEmail(String emal) {
        CommonEvents.setInputField(inputOfferEmail,emal);
    }

    public void setInputOfferPrice(String price) {
        CommonEvents.forceWait(6000);
        CommonEvents.setInputField(inputOfferPrice,price);
    }

    public void setInputOfferOFrom(String dateFrom) {
        CommonEvents.setInputField(inputOfferOFrom,dateFrom);
    }

    public void setInputOfferOTo(String dateTo) {
        CommonEvents.setInputField(inputOfferOTo,dateTo);
        CommonEvents.clickButton(inputOfferOTo);
    }

    // insertando descripcion
    public void setTextAreaDescripcion(String descri) {
        CommonEvents.scrollComponent(buttonSubmit,webDriver);
        textAreaOfferDes.click();
        textAreaOfferDes.sendKeys(descri);
        //CommonEvents.setInputField(textAreaOfferDes,descri);
    }
    public void clickButtonSubmit(){
        CommonEvents.clickButton(buttonSubmit);
    }
    public void clickButtonSearchAll(){
        CommonEvents.scrollComponent(buttonSearchAll,webDriver);
        //CommonEvents.clickButton(buttonSearchAll);
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
    public OffersManage verificarOfferAEliminar(String id){
        CommonEvents.forceWait(4000);
        WebElement aux = webDriver.findElement(By.cssSelector("a[id=\""+id+"\"]"));
        CommonEvents.scrollComponent(aux,webDriver);
        CommonEvents.clickButton(aux);

        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        return this;
    }
}
