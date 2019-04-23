Feature: Puma
  Scenario Outline: Home page is displayed
    Given 'adidas mx' page is loaded
    And hover on menu 'mens'
    And click on subMenu 'futbol'
    And get Price of product name "<nombre-producto>"
    And click on product "<nombre-producto>"
    And select talla "<talla>"
    And click on add-cart button
    And Verify that view shooping bag cantity is "<cantidad>"
    And click show-cart link
    And Verify "<nombre-producto>" title is displayed
    And Quantity should be "<cantidad>"
    And Price should be "<precio>"
    And Total should be "<precio-total>"
    Examples:
      | nombre-producto            | talla  | cantidad | precio | precio-total|
#       |Calzado de Fútbol X 18.3 TF| MX 9.5 | 1        | $1,329.00    |$1,428.00  |
       |Calzado de Fútbol Nemeziz 18.3 Terreno Firme| MX 9.5 | 1        | $1,999.00 |$1,999.00|


#EXAMEN
#Go https://www.adidas.mx
#Hover HOMBRE link HEADER
#En la columna TENNIS : Click Futbol link sub menú
#Get Price “Calzado de Fútbol X 18.3 TF” ($1329) (El primero)
#Click “Calzado de Fútbol X 18.3 TF”
#Select ELIGE TALLA ‘MX 9.5’
#Click AÑADIR AL CARRITO button
#Verify that VIEW SHOOPING BAG is ONE  Verify CANTIDAD is 1 (Cantidad: 1)
#Click VER CARRITO link
#Verify “Calzado de Fútbol X 18.3 TF” title is displayed
#Quantity should be 1removed
#Price should be $1,329.00
#Total should be $1,428.00
