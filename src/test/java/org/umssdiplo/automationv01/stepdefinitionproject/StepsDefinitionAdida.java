package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.pagePuma.Men;
import org.umssdiplo.automationv01.core.managepage.pagePuma.Puma;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdida {
    private Puma adidas;
    private Men sectionMens;

    @Given("^'adidas mx' page is loaded$")
    public void adidasMxPageIsLoaded() {
        adidas = LoadPage.AdidaPage();
    }

    @And("^hover on menu 'mens'$")
    public void hoverOnMenuMens() {
        adidas.hoverOnMen();
    }

    @And("^click on subMenu 'futbol'$")
    public void clickOnSubMenuFutbol() {
        adidas.clickSectionMens();
    }

    @And("^get name firt product on section futbol$")
    public void getNameFirtProductOnSectionFutbol() {
        sectionMens = new Men();

    }
}
