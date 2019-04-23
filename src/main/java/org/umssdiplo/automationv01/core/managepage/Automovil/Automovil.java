package org.umssdiplo.automationv01.core.managepage.Automovil;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class Automovil extends BasePage {

    @FindBy(css = "a[href=\"#Cars\"]")
    private WebElement carBtn;

    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/cars\"] ")
    private WebElement carsSelectBtn;


    //*[@id="content"]/div[2]/form/button

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement addBtn;


    public void SeleccionarCars(){
        System.out.println(carBtn.getText());
        System.out.println(carsSelectBtn.getText());
        System.out.println(addBtn.getText());
        CommonEvents.clickButton(carBtn);
        CommonEvents.clickButton(carsSelectBtn);
        CommonEvents.clickButton(addBtn);

        //CommonEvents.clickButton();
    }
    public void setDatos(DataTable dt){
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);

        String descripcionAuto = list.get(0).get("descripcion");
        


    }

}
