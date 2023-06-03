package Step;

import Manager.WebDriverManager;
import Page.HomePage;
import Page.LoginPage;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStep {

        private WebDriver driver;
        private WebDriverManager webDriverManager;

        public LoginStep() {
            webDriverManager = new WebDriverManager();
            driver = webDriverManager.getDriver();
        }

        public void userIsAtLoginPage() {
            LoginPage loginPage = new LoginPage(driver);
            driver.get(loginPage.websiteLink);
        }

        public void userInputsValidUsernameAndPassword() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.inputLoginUserName();
            loginPage.inputloginPassword();
        }

        public void userClicksLoginButton() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.loginSubmitButton.click();
        }

        public void userIsAtHomepage() {
            HomePage homePage = new HomePage(driver);
            Assert.isTrue(homePage.homepageLogoIsDisplayed(),"Homepage not found!");
        }
}
