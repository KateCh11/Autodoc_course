package pattern.pageObject.selenide;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class CategoriesPageLogic extends CategoriesPageLokators {


    public SearchPageLogic clickOnSubCategoryLaptops() {
        laptopSubCategory
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(SearchPageLogic.class);
    }

    public AddToBasketPageLogic clickOnSubCategoryLaptopsBeforeAddToBasket() {
        sleep(3000);
        laptopSubCategory
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        sleep(2000);
        return page(AddToBasketPageLogic.class);
    }
}
