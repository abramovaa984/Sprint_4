package orderPageTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtraStepsOrderPage {
    WebDriver chromeDriver;
    WebDriver firefoxDriver;

    @Before
    public void setUp() {
        chromeDriver = new ChromeDriver();
        firefoxDriver = new FirefoxDriver();
    }

    @After
    public void teardown() {
        // Закрыть браузер
        chromeDriver.quit();
        firefoxDriver.quit();
    }
}