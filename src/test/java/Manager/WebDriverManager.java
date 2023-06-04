package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private WebDriver driver;

    public WebDriver getDriver() {
        if(driver == null) driver = createLocalDriver();
        return driver;
    }

    private WebDriver createLocalDriver() {
        //Please change the path according to your chromedriver location
        System.setProperty("webdriver.chrome.driver", "/home/lpt-101/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
