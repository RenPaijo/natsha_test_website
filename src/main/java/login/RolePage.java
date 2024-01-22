package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RolePage {
    public static WebDriver driver;

    public RolePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Role']")
    private WebElement roleIcon;

    @FindBy(css = ".MuiButton-containedSuccess")
    private WebElement btnAdd;

    @FindBy(xpath = "//input[@name='role_name']")
    private WebElement name;

    @FindBy(xpath = "//input[@name='is_admin']")
    private WebElement admin;

    @FindBy(xpath = "//input[@name='is_superadmin']")
    private WebElement superAd;

    @FindBy(css = ".MuiButton-containedWarning")
    private WebElement btn;

    @FindBy(xpath = "//span[.='aldan']")
    private WebElement aldan;

    @FindBy(css = "tr:nth-of-type(5) .MuiSvgIcon-root")
    private WebElement icon;

    @FindBy(css = ".muiltr-1ogfp93[tabindex='-1'] .MuiTypography-root")
    private WebElement edit;

    @FindBy(css = ".muiltr-1snc2j8")
    private WebElement delete;

    @FindBy(css = "[name='role_name']")
    private WebElement editName;

    @FindBy(id = ":rd:")
    private WebElement btnEdit;

    @FindBy(xpath = "//span[.='aldan mf']")
    private WebElement aldanMF;

    @FindBy(css = ".MuiButton-containedError")
    private WebElement verifDelete;

    @FindBy(css = ".MuiPaper-elevation6")
    private WebElement verification;


    public void SetRole(){
        roleIcon.click();
    }

    public void setBtnAdd(){
        btnAdd.click();
    }

    public void setName(String nama){
        name.sendKeys(nama);
    }

    public void setAdmin(){
        admin.click();
    }

    public void  setSuperAd(){
        superAd.click();
    }

    public void setBtn(){
        btn.click();
    }

    public boolean setAldan(){
        aldan.isDisplayed();
        return true;
    }

    public void setIcon(){
        icon.click();
    }

    public void setEdit(){
        edit.click();
    }

    public void setEditName(String edit){
        editName.clear();
        editName.sendKeys(edit);
    }

    public void setBtnEdit(){
        btnEdit.click();
    }

    public boolean setAldan1(){
        aldanMF.isDisplayed();
        return true;
    }

    public void setVerifDelete(){
        verifDelete.click();
    }

    public boolean setVerification(){
        verification.isDisplayed();
        return true;
    }

    public void setDelete(){
        delete.click();
    }
}
