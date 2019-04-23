package org.umssdiplo.automationv01.core.managepage.pagePuma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Men extends BasePage {

    @FindBy(css = "div[title=\"Calzado de Fútbol X 18.3 TF\"]")
    private WebElement primerProducto;

    private WebElement producto;
    private String cssFind;

    public String getNameFirstProduct(){
        return primerProducto.getText();
    }

    public void clickFirtProduct(){
        CommonEvents.clickButton(primerProducto);
    }

    public String getPriceOfProductName(String name){

        cssFind = "div[title=\""+ name + "\"]";
        producto = getWebElement(cssFind);
        String cssPrice;
        if(name.equals("Calzado de Fútbol X 18.3 TF")){
            cssPrice = "span[class=\"gl-price__value gl-price__value--sale\"]";
        }
        else{
           cssPrice = "span[class=\"gl-price__value\"]";
        }

        WebElement precio = getWebElement(cssPrice);

        return precio.getText();
    }

    public void clickOnProductName(String name){
        cssFind = "div[title=\""+ name + "\"]";
        producto = getWebElement(cssFind);
        //CommonEvents.forceWait(2000);
        producto.click();
    }

    public void selectTalla(String talla){
        cssFind = "button[title=\"Elige tu talla\"]";
        producto = getWebElement(cssFind);
        producto.click();
        //CommonEvents.forceWait(1000);
        cssFind = "button[title=\""+ talla +"\"]";
        producto =  getWebElement(cssFind);
        producto.click();
    }

    public void clickOnAddCartButton() {
        cssFind = "button[data-auto-id=\"add-to-bag\"]";
        producto = getWebElement(cssFind);
        producto.click();
        //CommonEvents.forceWait(1000);
    }

    public WebElement getWebElement(String cssFind) {
        return webDriver.findElement(By.cssSelector(cssFind));
    }

    public void clickOnShowCart() {
        cssFind = "a[data-auto-id=\"view-bag-desktop\"]";
        producto = getWebElement(cssFind);
        //CommonEvents.forceWait(1000);
        producto.click();
    }
}
