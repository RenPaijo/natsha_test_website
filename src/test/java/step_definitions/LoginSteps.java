package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as email and {string} as password")
    public void userInputAsEmailAndAsPassword(String email, String pass) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.SetEmail(email);
        loginPage.SetPass(pass);
        Thread.sleep(1000);
    }

    @Then("User already on dashboard page")
    public void userAlreadyOnDashboardPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setDash();
    }

    @And("Click sign button")
    public void clickSignButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.SetBtn();
        Thread.sleep(2000);
    }

    @Given("User already in website")
    public void userAlreadyInWebsite() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setLogin();
        Thread.sleep(1000);
    }
}
