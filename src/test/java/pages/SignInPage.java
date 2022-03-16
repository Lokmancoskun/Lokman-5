package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {


    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//*[@id='login-item']/span")
    public WebElement sigIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    // @FindBy(xpath = "//*[@id='rememberMe']")
    @FindBy(id = "rememberMe")
    public WebElement rememberMe;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[3]/button[2]/span")
    public WebElement signinButton;

    @FindBy(xpath= "//*[@id='account-menu']/a")
    public WebElement logInDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;

}

     /*   public void signInPage(String userName, String pass) {

            username.sendKeys("sunu");
            password.sendKeys("LKmn21!");
            sigIn.click();
}

        }
*/






