Project Setup

1. Create new project in Intellij (File → New → Project)
2. Add plugins for Gherkin and Cucumber For Java (File → Settings → Plugins)
3. Add modules selenium jar files (File → Project Structure → Add Modules)
4. Add dependencies in pom.xml file (selenium java, cucumber java, junit and picocontainer)

Project Structure 

Files consist of features files, step definition files, step files, page files, driver file, runner (optional) and hooks file. Since we use Picocontainer Dependency Injection, we share cucumber features to multiple step definition or step classes.
1. Feature Files
This files contain all scenarios in gherkin language (Given, When, Then).
2. Step Definition Files
This files include methods for feature file steps. Every feature file has one step definition file. A step definition file calls methods from a step file which contains more detail commands.  
3. Step Files
This files call methods from page files. Any assertions are also in these files. This is the advantage of using Picocontainer. You want your Dependency Injection to do all the heavy liftings. So your step files have a constructor dependency on your page objects. 
4. Page Files
There is one page file that will be extended by all other page files. We call it base page. In this program, we named it LoginPage. LoginPage includes creating webdriver or getting webdriver reference. So you can share this between other page files. 
public class OtherPage extends BasePage {
 public OtherPage(WebDriver driver) {
        super(driver);
    }

5. Driver File
There file contains driver initialization or getting driver reference. In this case, we use chrome driver. 
6. Runner File
This file is for managing the tests running. We need to add plugins Create TestNG XML to produce this  file. Glue Option helps cucumber to locate the step definition files.It specify the package to load glue code (step definitions or hooks) in the glue option.
7. Hooks File
This file contains method to run after scenario by adding annotation @After. In this program, I added screenshot method to attach page screenshot at the of every scenario. 

Scenario Rules

1. Avoid using parameters in the steps of the scenarios. Because if this kind of step is used by many scenarios and there is a change in the parameter, we have to change all related scenarios. Instead, we can use static definitions defined in page files and call it in step files. 
2. If different scenarios have the same steps but parameters, then we can use example as the solution. The point is we have to prevent duplicate scenarios. This is also applied to step or step definition files. Avoid different methods with the same commands.
3. It is recommended to use relative xpath for the locators. As the position of the element changes, we do not need to change the locator. 

Step by Step to Run The Tests

1. Open GitHub link https://github.com/GSiska/TakeHomeAssignment/tree/master
2. Go to Code → SSH → copy the SSH
3. Open Intellij
4. File → New → Project from Version Control → paste the SSH into URL field → Clone
5. Trust Maven Project? → Trust Project
6.  In the Project bar → Open TakeHomeAssignment/src/test/userCredential/login.feature → Run ‘Scenario:verify user can login successfully’ (green arrow next to Scenario)
7.  The build will show error →java: package dev.failsafe.internal.util does not exist
8. Go to File → Project Structure → Modules → add selenium jar files –> Apply/Ok
9. Re-run the login.feature and this error will appear
Step failed
java.lang.IllegalStateException: The driver executable is a directory: /home/lpt-101/Downloads/chromedriver_linux64/chromedriver
10. Please update path of your chromedriver in method createLocalDriver() in TakeHomeAssignmentTestRunning/src/test/java/Manager/WebDriverManager.java then re-run the login.feature. Chomedriver can be downloaded from https://chromedriver.chromium.org/downloads.
11. The test should be successful! :))
12. There are 3 feature files: login.feature (1 scenario), ShoppingCart.feature (3 scenarios) and ProceedTransaction.feature(1 scenario). 
13. You can also run TakeHomeAssignmentTestRunning/src/test/java/Runner/Run.feature to produce cucumber report. The cucumber report is in your local path TakeHomeAssignmentTestRunning/target/cucumber-reports.html. 
