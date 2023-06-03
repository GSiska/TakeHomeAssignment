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
        driver = new ChromeDriver();
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
