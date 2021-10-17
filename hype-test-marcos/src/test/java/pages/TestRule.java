package pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestRule {

    private static WebDriver driver;

    @Before
    public void beforeCenario(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://hypeflame.blog");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After
    public void afterCenario(){
        if (driver != null){
            driver.close();
        }
    }

}
