package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.RolePage;
import org.openqa.selenium.WebDriver;

public class RoleEditSteps {
    private final WebDriver webDriver;

    public RoleEditSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("user click icon")
    public void userClickIcon() throws InterruptedException {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setIcon();
        Thread.sleep(1000);
    }

    @When("User click edit")
    public void userClickEdit() {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setEdit();
    }

    @Then("Data already change")
    public void dataAlreadyChange() {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setAldan1();
    }

    @And("Edit data with {string} as new name")
    public void editDataWithAsNewName(String newName) {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setEditName(newName);
        rolePage.setBtn();
    }
}
