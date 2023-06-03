package Step;

import Page.HomePage;
import Page.LoginPage;
import dev.failsafe.internal.util.Assert;


public class LoginStep{

        private final LoginPage loginPage;
        private final HomePage homePage;

        public LoginStep(LoginPage loginPage, HomePage homePage) {
            this.loginPage = loginPage;
            this.homePage = homePage;
        }

        public void userIsAtLoginPage() {
            loginPage.userIsAtLoginPage();
        }

        public void userInputsValidUsernameAndPassword() {
            loginPage.inputLoginUserName();
            loginPage.inputloginPassword();
        }

        public void userClicksLoginButton() {
            loginPage.clickOnLoginSubmitButton();
        }

        public void userIsAtHomepage() {
            Assert.isTrue(homePage.homepageLogoIsDisplayed(),"Homepage not found!");
        }
}
