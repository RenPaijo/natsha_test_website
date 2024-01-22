package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.RolePage;
import org.openqa.selenium.WebDriver;

public class RoleAddSteps {
    private final WebDriver webDriver;

    public RoleAddSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User already on role menu")
    public void userAlreadyOnRoleMenu() {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.SetRole();
    }

    @And("Already on add from")
    public void alreadyOnAddFrom() {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setBtnAdd();
    }

    @And("User input {string} as name")
    public void userInputAsName(String name) throws InterruptedException {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setName(name);
        rolePage.setAdmin();
        rolePage.setSuperAd();
        rolePage.setBtn();
        Thread.sleep(1000);
    }

    @Then("data is in menu")
    public void dataIsInMenu() throws InterruptedException {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setAldan();
        Thread.sleep(1000);
    }
}
