package org.umssdiplo.automationv01.core.managepage.Tours;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Tours extends BasePage {
    @FindBy(css = "a[href='#Tours']")
    private WebElement toursMenuBtn;

    @FindBy(css = "a[href='https://www.phptravels.net/admin/tours']")
    private WebElement toursSubMenuBtn;


    @FindBy(css = "button[type='submit']")
    private WebElement toursAddBtn;

    @FindBy(name="tourstatus")
    private WebElement selectToursStatus;

    @FindBy(name="tourname")
    private WebElement nameToursInputField;

    @FindBy(name="maxadult")
    private WebElement quantityAdultsInputField;

    @FindBy(name="adultprice")
    private WebElement priceAdultsInputField;

    @FindBy(id="childbtn")
    private WebElement toursChildBtn;

    @FindBy(name="maxchild")
    private WebElement quantityChildInputField;

    @FindBy(name="childprice")
    private WebElement priceChildInputField;

    @FindBy(name="tourstars")
    private WebElement selectToursStars;

    @FindBy(name="tourdays")
    private WebElement daysToursInputField;

    @FindBy(name="tournights")
    private WebElement nightsToursInputField;


    @FindBy(id="s2id_autogen11")
    private WebElement tourTypeBtn;

    @FindBy(css="div#select2-drop li:nth-child(13) > div")
    private WebElement selectToursType;



    @FindBy(id="isfeatured")
    private WebElement selectToursFeatured;

    @FindBy(css = "div[id='s2id_locationlist1']")
    private WebElement location1ToursBtn;

    @FindBy(css = "div#select2-drop input")
    private WebElement location1ToursInputField;

    @FindBy(css = "div[class='select2-result-label']")
    private WebElement selectTourslocation1;



    @FindBy(name="deposittype")
    private WebElement selectToursDeposit;

    @FindBy(name="depositvalue")
    private WebElement depositToursInputField;

    @FindBy(name="taxtype")
    private WebElement selectToursVat;

    @FindBy(name="taxvalue")
    private WebElement vatToursInputField;

    @FindBy(id="s2id_autogen14")
    private  WebElement relatedToursInputField;


    @FindBy(id="mapaddress")
    private  WebElement addressToursInputField;

    @FindBy(id="latitude")
    private  WebElement latitudeToursInputField;

    @FindBy(id="longitude")
    private  WebElement longitudeToursInputField;

    @FindBy(id="add")
    private  WebElement submitToursBtn;




    public void clickMenuTours() {
        CommonEvents.clickButton(toursMenuBtn);
    }
    public void clickSubMenuTours() {
        CommonEvents.clickButton(toursSubMenuBtn);
    }
    public void clickAddButton() {
        CommonEvents.clickButton(toursAddBtn);
    }
    public void selectOptionToursStatus(String status){
        CommonEvents.selectOption(selectToursStatus,status);
    }

    public void fillTourNameField(String name) {
        CommonEvents.setInputField(nameToursInputField, name);
    }

    public void fillQuantityAdultsField(String quantity) {
        CommonEvents.setInputField(quantityAdultsInputField, quantity);
    }

    public void fillPriceAdultsField(String price) {
        CommonEvents.setInputField(priceAdultsInputField, price);
    }
    public void clickChildButton() {
        CommonEvents.clickButton(toursChildBtn);
    }

    public void fillQuantityChildField(String quantity) {
        CommonEvents.setInputField(quantityChildInputField, quantity);
    }

    public void fillPriceChildField(String price) {
        CommonEvents.setInputField(priceChildInputField, price);
    }
    public void selectOptionToursStars(String stars){
        CommonEvents.selectOption(selectToursStars,stars);
    }

    public void fillDaysToursField(String days) {
        CommonEvents.setInputField(daysToursInputField, days);
    }

    public void fillNightsToursField(String nights) {
        CommonEvents.setInputField(nightsToursInputField, nights);
    }

    public void selectOptionToursFeatured(String featured){
        CommonEvents.selectOption(selectToursFeatured,featured);
    }

    public void selectOptionToursDeposit(String deposit){
        CommonEvents.selectOption(selectToursDeposit,deposit);
    }

    public void fillDepositToursField(String deposit) {

        CommonEvents.setInputField(depositToursInputField, deposit);
    }
    public void selectOptionToursVat(String vat){
        CommonEvents.selectOption(selectToursVat,vat);
    }

    public void fillVatToursField(String vat) {
        CommonEvents.setInputField(vatToursInputField,vat);
    }

    public void fillRelatedToursField(String relatedTours) {
        CommonEvents.setInputField(relatedToursInputField,relatedTours);
        relatedToursInputField.sendKeys(Keys.ENTER);
    }

    public void fillAddressToursField(String address) {
        CommonEvents.setInputField(addressToursInputField,address);
    }

    public void fillLatitudeToursField(String latitude) {
        CommonEvents.setInputField(latitudeToursInputField,latitude);
    }


    public void fillLongitudeToursField(String longitude) {
        CommonEvents.setInputField(longitudeToursInputField,longitude);
    }

    public void clickSubmitTours() {
        CommonEvents.forceWait(2000);
        CommonEvents.clickButton(submitToursBtn);
    }


    public void selectOptionToursLocation1(String location){
        CommonEvents.clickButton(location1ToursBtn);
        CommonEvents.setInputField(longitudeToursInputField, location);
        CommonEvents.forceWait(2000);
        CommonEvents.clickButton(selectTourslocation1);


    }

    public void selectOptionTourType(String type){
        CommonEvents.clickButton(tourTypeBtn);
        CommonEvents.clickButton(selectToursType);




    }
    public String searchTours(String name){
        String found = "";
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 )
            {

                WebElement tdElementName = td_collection.get(4);
                if(tdElementName.getText().equals(name))
                {
                    found = tdElementName.getText() ;
                    break;
                }

            }

        }
        return found;

    }
    public void deleteTour(String name){
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 )
            {
                WebElement tdElementName = td_collection.get(4);
                if(tdElementName.getText().equals(name))
                {
                    WebElement tdElementButtons = td_collection.get(10);
                    List<WebElement> btns_collection = tdElementButtons.findElements(By.xpath("span/a"));
                    WebElement deleteBtnElement = btns_collection.get(1);
                    CommonEvents.clickButton(deleteBtnElement);
                    Alert alert = webDriver.switchTo().alert();
                    alert.accept();
                    break;
                }

            }
        }

    }







}
