package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordSegmentPage {


    public PasswordSegmentPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userSegment;

    @FindBy(xpath = "//*[@id='account-menu']/div/a[2]")
    public WebElement password;

    @FindBy(name = "currentPassword")
    public WebElement currentPassword;

    @FindBy(id = "newPassword")
    public WebElement newPassword;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@class='btn btn-success']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div")
    public WebElement verifiesPasswordSuccessfully;

    @FindBy(xpath = "//*[text()='Your password is required to be at least 4 characters.']")
    public WebElement newPasswordCharCheckText;

}

   /* public void passwordSegment(String userName, String pass) {

       currentPassword.sendKeys();
       newPassword.sendKeys();
      confirmPassword.sendKeys();
       saveButton.click();

   }
}
*/