package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static WebDriver driver;

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shop.demoqa.com/");
        Thread.sleep(1000);
        driver.quit();
    }

    @When("User Navigate to LogIn Page")
    public void user_Navigate_to_LogIn_Page() {

    }

    @And("User enters UserName and Password")
    public void user_enters_UserName_and_Password() {

    }

    @And("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {

    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_Login_Successfully() {

    }

    @When("User LogOut from the Application")
    public void user_LogOut_from_the_Application() {

    }

    @Then("Message displayed LogOut Successfully")
    public void message_displayed_LogOut_Successfully() {

    }
}
