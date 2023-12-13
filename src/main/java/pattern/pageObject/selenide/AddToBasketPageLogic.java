package pattern.pageObject.selenide;

import com.codeborne.selenide.Condition;
import org.testng.Assert;

import java.time.Duration;


public class AddToBasketPageLogic extends AddToBasketPageLokators {
    String textOfTittleOfFirstProduct;
    public AddToBasketPageLogic addToBasket(int itemIndex) {
        textOfTittleOfFirstProduct = tittleOfFirstProduct.attr("innerText");

        addToBasketButton.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return this;
    }

    public AddToBasketPageLogic verifyBasketItem() {
        String numFromBasketCounter = basketCounter.attr("innerText");
        Assert.assertEquals(numFromBasketCounter, EXPECTED_PRODUCT_QUANTITY, "Items are different. Quantity is not equal.");
        return this;
    }

    public AddToBasketPageLogic navigateToBasket() {
        addToBasketButton.shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return this;
    }

    public void verifyBasketTitle() {
        String actualTitleInTheBasket = textOfTittleInBasket
                .attr("innerText");
        Assert.assertEquals(actualTitleInTheBasket, textOfTittleOfFirstProduct, "Titles are different");
    }
}
