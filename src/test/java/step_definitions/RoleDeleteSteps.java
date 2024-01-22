package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import login.RolePage;
import org.openqa.selenium.WebDriver;

public class RoleDeleteSteps {
    private final WebDriver webDriver;

    public RoleDeleteSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click delete icon")
    public void userClickDeleteIcon() {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setDelete();
        rolePage.setVerifDelete();
    }

    @Then("The data is no longer in the list table")
    public void theDataIsNoLongerInTheListTable() {
        RolePage rolePage = new RolePage(webDriver);
        rolePage.setVerification();
    }
}
