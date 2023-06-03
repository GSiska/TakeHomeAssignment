package Page;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Enum.Credential;

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
        loginUserName.sendKeys(Credential.USERNAME.getCredential());
    }

    public void inputloginPassword() {
        loginPassword.sendKeys(Credential.PASSWORD.getCredential());
    }
}
