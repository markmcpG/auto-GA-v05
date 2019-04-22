package org.umssdiplo.automationv01.core.managepage.pagePuma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Men extends BasePage {

    @FindBy(css = "div[title=\"Calzado de Fútbol X 18.3 TF\"]")
    private WebElement primerProducto;

}
