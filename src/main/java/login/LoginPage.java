package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement pass;

    @FindBy(css = ".MuiButton-contained")
    private WebElement btnSign;

    @FindBy(xpath = "//img[@alt='logo']")
    private WebElement dashboard;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 mt-32 text-4xl font-extrabold " +
            "tracking-tight leading-tight muiltr-18q2h9t']")
    private WebElement loginPage;

    public void SetEmail(String email1){
        email.sendKeys(email1);
    }

    public void SetPass(String word){
        pass.sendKeys(word);
    }

    public void SetBtn(){
        btnSign.click();
    }

    public boolean setDash(){
        dashboard.isDisplayed();
        return true;
    }

    public boolean setLogin(){
        loginPage.isDisplayed();
        return true;
    }
}
