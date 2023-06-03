package Step;

import Manager.WebDriverManager;
import Page.HomePage;
import Page.LoginPage;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStep {

        WebDriverManager webDriverManager = new WebDriverManager();
        private WebDriver driver = webDriverManager.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        public void userIsAtLoginPage() {
            driver.get(loginPage.websiteLink);
        }

        public void userInputsValidUsernameAndPassword() {
            loginPage.inputLoginUserName();
            loginPage.inputloginPassword();
        }

        public void userClicksLoginButton() {
            loginPage.loginSubmitButton.click();
        }

        public void userIsAtHomepage() {
            Assert.isTrue(homePage.homepageLogoIsDisplayed(),"Homepage not found!");
        }
}
