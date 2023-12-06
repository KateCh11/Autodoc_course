package init;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WebDriverInit {

    /*protected WebDriver driver;
    private WebDriverWait webDriverWait;*/

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @BeforeTest
    public void initDriver() {
        //WebDriverManager.chromedriver().setup();

        /*
        ChromeOptions o = new ChromeOptions();
        //set browser options
        o.addArguments("--disable-notifications");
        */

        //
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--no-sandbox");
        //chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        //chromeOptions.addArguments("--disable-features=AutomationControlled");

        //chromeOptions.addArguments("--user-agent=“Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36");
        //chromeOptions.addArguments("--ignore-certificate-errors");
        //

        driver = new ChromeDriver(chromeOptions);//передать в параметры обязательно
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void after(){
        driver.quit();
    }

}
