package Step;

import ChromeDriver.InitialChromeDriver;

public class LoginStep {

        private  InitialChromeDriver initialChromeDriver;
        public void Hooks(InitialChromeDriver initialChromeDriver) {
            this.initialChromeDriver = initialChromeDriver;
        }
        public void userIsAtLoginPage() {
            initialChromeDriver.chrom
        }
}
