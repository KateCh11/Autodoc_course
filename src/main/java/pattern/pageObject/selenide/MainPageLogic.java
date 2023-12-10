package pattern.pageObject.selenide;

import com.codeborne.selenide.Condition;

import java.time.Duration;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPageLogic extends MainPageLokators{

    public MainPageLogic checkCategoriesQuantity(int categories) {
        sleep(15000);
        sideBarCategories.shouldHave(CollectionCondition.size(categories));
        sleep(5000);
        return this;
    }

    public CategoriesPageLogic clickOnCategory(int categoryNumber) {
        sideBarCategories.get(categoryNumber)
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        return page(CategoriesPageLogic.class);
    }


}
