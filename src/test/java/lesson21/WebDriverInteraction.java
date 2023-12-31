package lesson21;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class WebDriverInteraction {

    private WebDriver driver;

    @BeforeTest
    public void initDriver(){
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void example(){
        WebElement inputSearch = driver.findElement(By.cssSelector("someClass"));
        WebElement btnSearch = driver.findElement(By.xpath("/div[@btnSearch]"));


        List<WebElement> elements = driver.findElements(By.cssSelector("myClass"));

        //element.sendKeys("some Text");
        inputSearch.sendKeys("Some Text");
        btnSearch.click();

        String colorBtn = btnSearch.getAttribute("color");
        String btnText = btnSearch.getText();

        boolean isDisplayBtnSearch = btnSearch.isDisplayed();
    }
}
