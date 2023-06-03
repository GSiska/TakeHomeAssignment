package Page;

import Manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public static String websiteLink = "https://www.saucedemo.com/";

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@name='login-button']")
    public WebElement loginSubmitButton;

    public void inputLoginUserName() {
        loginUserName.sendKeys("standard_user");
    }

    public void inputloginPassword() {
        loginPassword.sendKeys("secret_sauce");
    }
}
