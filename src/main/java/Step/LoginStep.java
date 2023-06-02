package Step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {

        WebDriver driver=new ChromeDriver();
        public void userIsAtLoginPage() {
            driver.get("https://www.saucedemo.com/");
        }
}
