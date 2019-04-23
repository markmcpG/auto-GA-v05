package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.pagePuma.Men;
import org.umssdiplo.automationv01.core.managepage.pagePuma.Puma;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdida {
    private Puma adidas;
    private Men sectionMens = new Men();
    private String nameFirtsProduct;
    private WebElement producto;
    private String cssFind;

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
/*
    @And("^get name firt product on section futbol$")
    public void getNameFirtProductOnSectionFutbol() {
        sectionMens = new Men();
        nameFirtsProduct = sectionMens.getNameFirstProduct();
        System.out.println("El nombre del producto es:");
        System.out.println(nameFirtsProduct);
    }*/

    @And("^click on name firts product$")
    public void clickOnNameFirtsProduct() {
        sectionMens.clickFirtProduct();
    }

    @And("^get Price of product name \"([^\"]*)\"$")
    public void getPriceOfProductName(String name) {
        sectionMens.getPriceOfProductName(name);
    }

    @And("^select talla \"([^\"]*)\"$")
    public void selectTalla(String talla){
        sectionMens.selectTalla(talla);
    }

    @And("^click on product \"([^\"]*)\"$")
    public void clickOnProduct(String name){
        sectionMens.clickOnProductName(name);
    }

    @And("^click on add-cart button$")
    public void clickOnAddCartButton() {
        sectionMens.clickOnAddCartButton();
    }

    @And("^Verify that view shooping bag cantity is \"([^\"]*)\"$")
    public void verifyThatViewShoopingBagCantityIs(String cantidad)  {

        cssFind = "span[data-auto-id=\"add-to-bag-product-info-qty\"]";
        producto = sectionMens.getWebElement(cssFind);
        int tam = producto.getText().length();
        String cand = producto.getText().substring(tam-1);

       // System.out.println("ESTA ES LA CADENA: " + producto.getText());
       // System.out.println("ESTA ES LA CANTIDAD: " + cand);

        Assert.assertEquals(cand, cantidad);
    }

    @And("^click show-cart link$")
    public void clickShowCartLink() {
        sectionMens.clickOnShowCart();
    }

    @And("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String nameProduct){
        cssFind = "a[class=\"name\"]";
        producto = sectionMens.getWebElement(cssFind);
        Assert.assertEquals(producto.getText(),nameProduct.toUpperCase());
    }

    @And("^Price should be \"([^\"]*)\"$")
    public void priceShouldBe(String price)  {
        cssFind = "div[data-ci-test-id=\"orderTotalProductsDeliveryValue\"]";
        producto = sectionMens.getWebElement(cssFind);
        Assert.assertEquals(producto.getText(),price);
    }

    @And("^Total should be \"([^\"]*)\"$")
    public void totalShouldBe(String totalPrice) {
        cssFind = "div[data-ci-test-id=\"orderTotalCartValue\"]";
        producto = sectionMens.getWebElement(cssFind);
        Assert.assertEquals(producto.getText(),totalPrice);
    }

    @And("^Quantity should be \"([^\"]*)\"$")
    public void quantityShouldBe(String cand) {
        cssFind = "a[href=\"javascript:void(0)\"] > span";
        producto = sectionMens.getWebElement(cssFind);
        Assert.assertEquals(producto.getText(),cand);
    }
}
