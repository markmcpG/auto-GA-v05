package org.umssdiplo.automationv01.core.managepage.Hoteles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Room extends BasePage {

    @FindBy(css = "a[href=\"#Hotels\"]")
    private WebElement menuHomeHotels;
    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/hotels/rooms\"]")
    private WebElement subMenuHotelsRooms;
    @FindBy(css = "button[type=\"submit\"]")
    private WebElement buttonSubmitAddRoom;
    // FORMULARIO ADD ROOM
    @FindBy(css = "select[name=\"roomstatus\"]")
    private WebElement selectStatusRoomAdd;
    @FindBy(css = "select[name=\"roomtype\"]")
    private WebElement inputRoomTypeAdd;
    @FindBy(css = "select[name=\"hotelid\"]")
    private WebElement inputHotelRoomAdd;
    @FindBy(css = "textarea[name=\"roomdesc\"]")
    private WebElement textAreaDescripcionRoomAdd;
    @FindBy(css = "input[name=\"basicprice\"]")
    private WebElement inputPriceRoomAdd;
    @FindBy(css = "input[name=\"quantity\"]")
    private WebElement inputQuantityRoomAdd;
    @FindBy(css = "input[name=\"minstay\"]")
    private WebElement inputMinimunStayRoomAdd;
    @FindBy(css = "input[name=\"adults\"]")
    private WebElement inputMaxAdultsRoomAdd;
    @FindBy(css = "input[name=\"children\"]")
    private WebElement inputMaxChildrenRoomAdd;
    @FindBy(css = "input[name=\"extrabeds\"]")
    private WebElement inputNumExtraBebsRoomAdd;
    @FindBy(css = "input[name=\"bedcharges\"]")
    private WebElement inputBedChargesRoomAdd;
    @FindBy(css = "button[id=\"add\"]")
    private WebElement buttonSumitRoomAdd;

    // EDITAR
    @FindBy(css = "button[id=\"update\"]")
    private WebElement buttonSubmitEditRoom;

    public Room clickMenuHomeHotels(){
        CommonEvents.clickButton(menuHomeHotels);
        return this;
    }
    public Room clickSubMenuHotelsRooms(){
        CommonEvents.clickButton(subMenuHotelsRooms);
        return this;
    }
    // ADD
    public Room clickButtonSubmitAddRoom(){
        CommonEvents.clickButton(buttonSubmitAddRoom);
        return this;
    }
    public Room setSelectStatusRoomAdd(String status){
        CommonEvents.selectOption(selectStatusRoomAdd,status);
        return this;
    }
    public Room setInputRoomTypeAdd(String type){
        CommonEvents.selectOption(inputRoomTypeAdd,type);
        return this;
    }
    public Room setInputHotelRoomAdd(String hotel){
        CommonEvents.selectOption(inputHotelRoomAdd,hotel);
        return this;
    }
    public Room setTextAreaDescripcionRoomAdd(String descripcion){
        //CommonEvents.setInputField(textAreaDescripcionRoomAdd,descripcion);
        return this;
    }
    public Room setInputPriceRoomAdd(String price){
        CommonEvents.scrollComponent(inputPriceRoomAdd,webDriver);
        CommonEvents.setInputField(inputPriceRoomAdd,price);
        return this;
    }
    public Room setInputQuantityRoomAdd(String quantity){
        CommonEvents.scrollComponent(inputQuantityRoomAdd,webDriver);
        CommonEvents.setInputField(inputQuantityRoomAdd,quantity);
        return this;
    }
    public Room setInputMinimunStayRoomAdd(String stay){
        CommonEvents.scrollComponent(inputMinimunStayRoomAdd,webDriver);
        CommonEvents.setInputField(inputMinimunStayRoomAdd,stay);
        return this;
    }
    public Room setInputMaxAdultsRoomAdd(String adults){
        CommonEvents.scrollComponent(inputMaxAdultsRoomAdd,webDriver);
        CommonEvents.setInputField(inputMaxAdultsRoomAdd,adults);
        return this;
    }
    public Room setInputMaxChildrenRoomAdd(String children){
        CommonEvents.scrollComponent(inputMaxChildrenRoomAdd,webDriver);
        CommonEvents.setInputField(inputMaxChildrenRoomAdd,children);
        return this;
    }
    public Room setInputNumExtraBebsRoomAdd(String beds){
        CommonEvents.scrollComponent(inputNumExtraBebsRoomAdd,webDriver);
        CommonEvents.setInputField(inputNumExtraBebsRoomAdd,beds);
        return this;
    }
    public Room setInputBedChargesRoomAdd(String charges){
        CommonEvents.scrollComponent(inputBedChargesRoomAdd,webDriver);
        CommonEvents.setInputField(inputBedChargesRoomAdd,charges);
        return this;
    }
    public Room clickButtonSumitRoomAdd(){
        CommonEvents.scrollComponent(buttonSumitRoomAdd,webDriver);
        CommonEvents.clickButton(buttonSumitRoomAdd);
        return this;
    }

    public Room clickButtonEditRoom(String id) {
        String css= "a[href=\"https://www.phptravels.net/admin/hotels/rooms/manage/"+91+"\"]";
        WebElement aux = webDriver.findElement(By.cssSelector(css));
        if(aux!=null){
            CommonEvents.clickButton(aux);
        }
        else{
            System.out.println("Elemento no existe!!");
        }

        return this;
    }
    public Room clickButtonSubmitEditRoom(){
        CommonEvents.scrollComponent(buttonSubmitEditRoom,webDriver);
        CommonEvents.clickButton(buttonSubmitEditRoom);
        return this;
    }

    // ELIMINAR
    public Room verificarRoomAEliminar(String id){
        CommonEvents.forceWait(4000);
        WebElement aux = webDriver.findElement(By.cssSelector("a[id=\""+id+"\"]"));
        if (aux!=null) {
            CommonEvents.clickButton(aux);
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
        }
        else {
            System.out.println("Elemento no ex");
        }
        return this;
    }


}
