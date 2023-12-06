package pattern.pageObject.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;


public class MainPage extends MainPageLokators implements ICartPage{

    final String URL = "https://rozetka.com.ua/ua/";

    final String cook = "DUmIcGup1O8DZXWuOoS3tS4AS1aG.acyYt2upBU5Q04-1701850486-0-1-6bc3b921.37f427c9.3cc2e6c1-0.2.1701850486";
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get(URL);
        ///
        driver.manage().deleteCookieNamed("cf_clearance");
        Cookie cookie = new Cookie("cf_clearance", cook);
        driver.manage().addCookie(cookie);
        ///
        driver.manage().window().maximize();

        return this;
    }

    public MainPage checkingCart(){
        checkingCartI(driver);
        return this;
    }

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

    //2. Перейти в раздел «Компьютеры и ноутбуки» //click Comp and Laptop
    public CompAndLaptop clickCompAndLaptopCategory() throws InterruptedException {
        sleep(12000);
        WebElement clickCompAndLaptopCateg = driver.findElement(compAndLaptopLocator);
        clickCompAndLaptopCateg.click();
        return new CompAndLaptop(driver);
    }

    /*
    @Override
    public void checkingCartI(WebDriver driver) {
        // Реализация метода checkingCartI
    }
    */
}
