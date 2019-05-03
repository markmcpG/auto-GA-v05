package org.umssdiplo.automationv01.core.managepage.Automovil;

import cucumber.api.DataTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.awt.image.ColorModel;
import java.util.List;
import java.util.Map;

public class Car extends BasePage {

    @FindBy(css = "a[href=\"#Cars\"]")
    private WebElement carMenuBtn;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/cars\"] ")
    private WebElement carsSubMenuBtn;


    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/cars/extras\"]")
    private WebElement extrasSubMenuBtn;

    @FindBy(name = "carname")
    private WebElement carNameInputField;

    @FindBy(name = "carstatus")
    private WebElement selectCarStatus;

    @FindBy(id="cke_1_contents")
    private WebElement carDescriptionInputField;

    @FindBy(id="cardesc")
    private WebElement carDescriptionInputField2;

    @FindBy(name="carstars")
    private WebElement selectCarStars;


    @FindBy( name="passangers")
    private WebElement selectCarPassangers;

    @FindBy( name="doors")
    private WebElement selectCarDoors;

    @FindBy( name="transmission")
    private WebElement selectCarTransmission;

    @FindBy( name = "baggage")
    private WebElement selectCarBaggage;

    @FindBy(name="airportpickup")
    private WebElement selectCarAirport;

    @FindBy(id="isfeatured")
    private WebElement selectCarFeatured;

    @FindBy(name="ffrom")
    private WebElement featuredFromInputField;

    @FindBy(name="fto")
    private WebElement featuredToInputField;

    @FindBy(name="deposittype")
    private WebElement selectCarDeposit;

    @FindBy(name="taxtype")
    private WebElement selectCarVatTax;


    @FindBy(id = "s2id_autogen24")
    private  WebElement relatedCarsInputField;

    //*[@id="content"]/div[2]/form/button

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement addBtn;

    @FindBy(id="add")
    private WebElement submitBtn;



    @FindBy(id = "s2id_pickuplocationlist1")
    private WebElement pickUp;


    @FindBy(id = "pickuplocationlist1")
    //@FindBy(css = "input[class=\"select2-input\"][xpath = \"1\"]")
    private WebElement pickUpInputField;

    @FindBy(css = "div#content tr:nth-child(1) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.btn.btn-default.btn-xcrud.btn-danger")
    private WebElement deleteCarBtn;

    @FindBy(css = "div#content tr:nth-child(1) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.btn.btn-default.btn-xcrud.btn-warning")
    private WebElement editCarBtn;

    @FindBy(id = "update")
    private  WebElement submitEditBtn;



    @FindBy(css = "div[class=\"select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above\"] ul li")
    private WebElement pickUpInputField2;

    @FindBy(css = "a[data-task=\"create\"]")
    private WebElement addExtraBtn;

    @FindBy(name="cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--")
    private WebElement nameExtraInputField;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-")
    private WebElement selectStatusExtra;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--")
    private  WebElement priceExtraInputField;

    @FindBy(css = "a[class='btn btn-primary xcrud-action']")
    private  WebElement saveReturnExtraBtn;

    @FindBy(css = "div#content tr:nth-child(1) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.xcrud-action.btn.btn-danger.btn-xcrud")
    private WebElement deleteExtraCarBtn;

    @FindBy(css = "div#content tr:nth-child(1) > td.xcrud-current.xcrud-actions.xcrud-fix > span > a.xcrud-action.btn.btn-warning.btn-xcrud")
    private WebElement editExtraCarBtn;

    @FindBy(css = "a[class='btn btn-primary xcrud-action']")
    private  WebElement saveReturnExtraEditBtn;




    //body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders'][xpath='1'] p
    //@FindBy(css = "body[class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders'][xpath='1']")
    //@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders' and @xpath='1']")
    //private WebElement descripcionFile;



    public void setDatos(DataTable dt){
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        String descripcionAuto = list.get(0).get("descripcion");
        //CommonEvents.setInputField(descripcionFile, descripcionAuto);
    }

    public void clickMenuCars(){
        CommonEvents.clickButton(carMenuBtn);
    }
    public void clickSubMenuCars()
    {
        CommonEvents.clickButton(carsSubMenuBtn);
    }
    public void clickButtonAdd()
    {
        CommonEvents.clickButton(addBtn);
    }
    public void fillCarNameField(String carName)
    {
        CommonEvents.setInputField(carNameInputField, carName);
    }

    public void selectOptionStatus(String carStatus){
        CommonEvents.selectOption(selectCarStatus,carStatus);
    }


    public void fillRelatedCarsField(String relatedCars) {
        CommonEvents.setInputField(relatedCarsInputField,relatedCars);
        relatedCarsInputField.sendKeys(Keys.ENTER);
    }

    public void fillPickUpLocationField(String pickUpLocation){
        //CommonEvents.setInputField(pickUpInputField,pickUp);
        CommonEvents.clickButton(pickUp);
        CommonEvents.setInputField(pickUpInputField,pickUpLocation);
        pickUpInputField.sendKeys(Keys.ENTER);
        //CommonEvents.clickButton(pickUpInputField2);
    }

    public void selectOptionStars(String stars){
        CommonEvents.selectOption(selectCarStars,stars);
    }

    public void selectOptionPassangers(String passangers){
        CommonEvents.selectOption(selectCarPassangers,passangers);
    }

    public void selectOptionDoors(String carDoors){
        CommonEvents.selectOption(selectCarDoors,carDoors);
    }

    public void selectOptionTransmission(String carTransmission){
        CommonEvents.selectOption(selectCarTransmission,carTransmission);
    }

    public void selectOptionBaggage(String carBaggage){
        CommonEvents.selectOption(selectCarBaggage,carBaggage);
    }

    public void selectOptionAirport(String carAirport){
        CommonEvents.selectOption(selectCarAirport,carAirport);
    }

    public void selectOptionFeatured(String carFeatured){
        CommonEvents.selectOption(selectCarFeatured,carFeatured);
    }

    public void fillFeaturedFromField(String carFeaturedFrom){
        CommonEvents.setInputField(featuredFromInputField,carFeaturedFrom);
        CommonEvents.clickButton(featuredToInputField);
    }
    public void fillFeaturedToField(String carFeaturedTo){
        CommonEvents.setInputField(featuredToInputField,carFeaturedTo);
        CommonEvents.clickButton(featuredToInputField);
    }

    public void selectOptionDeposit(String deposit){

        CommonEvents.selectOption(selectCarDeposit,deposit);
    }

    public void selectOptionVatTax(String vatTax){
        CommonEvents.selectOption(selectCarVatTax,vatTax);
    }


    public void clickButtonSUBMIT() {
        CommonEvents.clickButton(submitBtn);
    }

    public void clickSubMenuExtras() {
        CommonEvents.clickButton(extrasSubMenuBtn);
    }


    public void clickButtonEditCar(String name) {

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
                    WebElement tdElementButtons = td_collection.get(11);
                    List<WebElement> btns_collection = tdElementButtons.findElements(By.xpath("span/a"));
                    WebElement editBtnElement = btns_collection.get(0);
                    CommonEvents.clickButton(editBtnElement);
                    break;
                }

            }
        }
    }

    public void clickButtonSubmitEdit() {
        CommonEvents.clickButton(submitEditBtn);
    }

    public void clickButtonAddExtra()
    {
        CommonEvents.clickButton(addExtraBtn);
    }
    public void fillExtraNameField(String nameExtra)
    {
        CommonEvents.setInputField(nameExtraInputField,nameExtra);
    }
    public void selectOptionStatusExtra(String statusExtra)
    {
        CommonEvents.selectOption(selectStatusExtra,statusExtra);
    }

    public void fillExtraPriceField(String priceExtra)
    {
        CommonEvents.setInputField(priceExtraInputField,priceExtra);
    }
    public void clickButtonSaveReturnExtra(){
        CommonEvents.clickButton(saveReturnExtraBtn);
    }

    public void clickButtonDeleteExtra(String name) {
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 )
            {
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(name))
                {
                    WebElement tdElementButtons = td_collection.get(8);
                    List<WebElement> btns_collection = tdElementButtons.findElements(By.xpath("span/a"));
                    WebElement deleteBtnElement = btns_collection.get(2);
                    CommonEvents.clickButton(deleteBtnElement);
                    Alert alert = webDriver.switchTo().alert();
                    alert.accept();
                    break;
                }

            }
        }
    }

    public String searchExtra(String name){
        String found = "";
        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 )
            {
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(name))
                {
                    found = tdElementName.getText() ;
                    break;
                }

            }
        }
        return found;

    }


    public void clickButtonEditExtraCar(String name) {

        WebElement table_element = webDriver.findElement(By.xpath("//table/tbody"));
        List<WebElement> tr_collection = table_element.findElements(By.xpath("//tr"));
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
            if(td_collection.size() != 0 )
            {
                WebElement tdElementName = td_collection.get(3);
                if(tdElementName.getText().equals(name))
                {
                    WebElement tdElementButtons = td_collection.get(8);
                    List<WebElement> btns_collection = tdElementButtons.findElements(By.xpath("span/a"));
                    WebElement editBtnElement = btns_collection.get(1);
                    CommonEvents.clickButton(editBtnElement);
                    break;
                }

            }
        }

    }

    public void clickButtonSaveReturnExtraEdit() {
        CommonEvents.clickButton(saveReturnExtraEditBtn);
    }


    public void deleteCar(String name){
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
                    WebElement tdElementButtons = td_collection.get(11);
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

    public String searchCar(String name){
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



    public void fillCarDescriptionField(String des) {
        //CommonEvents.forceWait(2000);
        //CommonEvents.clickButton(carDescriptionInputField);
        //CommonEvents.forceWait(2000);
        //CommonEvents.setInputField(carDescriptionInputField2,des);
        //carDescriptionInputField2.sendKeys(des);


    }


}