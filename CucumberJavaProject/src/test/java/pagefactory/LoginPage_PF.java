package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

    @FindBy(id ="txtUserID")
    private WebElement txtUserID;

    @FindBy(id = "txtPWD")
    private WebElement txtPWD;

    @FindBy(id = "Sign me in")
    private WebElement signMeIn;

    WebDriver driver;

    public LoginPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, LoginPage_PF.class);
    }

    public void enterUsername(String username) {
        txtUserID.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtPWD.sendKeys(password);
    }

    public void clickSign() {
        signMeIn.click();
    }

}


