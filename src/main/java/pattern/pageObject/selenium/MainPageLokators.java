package pattern.pageObject.selenium;

import org.openqa.selenium.By;

public class MainPageLokators {

    By inputSearch = By.name("search");

    By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");
}
