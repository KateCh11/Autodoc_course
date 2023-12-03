package pattern.pageObject.selenium;

import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;


public class MainPage extends MainPageLokators {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    /*
    public MainPage checkingCart(){
        checkingCartI(driver);
        return this;
    }*/

    public MainPage typeTextInInputSearch(String text) throws InterruptedException {
        sleep(5000);
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }

    public MainPage clearOfInputSearch() {
        driver.findElement(inputSearch).clear();
        return this;
    }

    public SearchPage clickBtnSearch() {
        driver.findElement(btnSearch).click();
        return new SearchPage(driver);
    }
}
