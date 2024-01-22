package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        String appUrl = "https://hris.nashta.co.id/sign-in";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
}