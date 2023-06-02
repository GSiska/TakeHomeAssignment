package ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialChromeDriver {
    @BeforeAll
    public void chromeBrowser(){
        WebDriver driver=new ChromeDriver();
    }
}
