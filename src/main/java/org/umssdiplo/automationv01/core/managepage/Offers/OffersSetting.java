package org.umssdiplo.automationv01.core.managepage.Offers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class OffersSetting extends BasePage {
    @FindBy(css = "nav[id=\"sidebar\"]")
    private WebElement scroll;
    @FindBy(css = "a[href=\"#SPECIAL_OFFERS\"]")
    private WebElement menuSelectOffer;
    @FindBy(css = "a[href=\"https://www.phptravels.net/admin/offers/settings/\"]")
    private WebElement subMenuOffersSetting;
    //Para el Formulario
    @FindBy(css = "select[class=\"form-control\"]")
    private WebElement selectTarget;
    @FindBy(css = "input[name=\"headertitle\"]")
    private WebElement inputPageTitle;
    @FindBy(css = "input[name=\"listings\"]")
    private WebElement inputListingsPage;
    @FindBy(css = "button[class=\"btn btn-primary\"]")
    private WebElement buttonSubmit;

    public void clickMenuOffer(){
        CommonEvents.scrollComponent(menuSelectOffer,webDriver);
        CommonEvents.clickButton(menuSelectOffer);
    }
    public void clickSubMenuOfferSetting(){
        CommonEvents.clickButton(subMenuOffersSetting);
    }

    public void setSelectTarget(String target){
        CommonEvents.selectOption(selectTarget,target);
    }
    public void setInputPageTitle(String page_Title){
        CommonEvents.setInputField(inputPageTitle,page_Title);
    }
    public void setInputListingsPage(String listings_Page){
        CommonEvents.setInputField(inputListingsPage,listings_Page);
    }
    public void clickButtonSubmit(){
        CommonEvents.clickButton(buttonSubmit);
    }
}
