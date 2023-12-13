package pattern.pageObject.selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddToBasketPageLokators {

    SelenideElement addToBasketButton = $(byXpath("(//button[contains(@class, 'buy-button')])[1]"));
    SelenideElement basketCounter = $(byXpath("//span[contains(@class, 'badge badge')]"));
    SelenideElement textOfTittleInBasket = $(byXpath("//a[@class='cart-product__title']"));
    SelenideElement tittleOfFirstProduct = $(byXpath("(//span[@class='goods-tile__title'])[1]"));
    final String EXPECTED_PRODUCT_QUANTITY = "1";

}
