package pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Thakre on 30/12/2018.
 */
public class LoginPageElements extends PageObject {

    @FindBy(id = "id_email")
    WebElement emailinput;

    @FindBy(id = "id_first_name")
    WebElement firstname;

    @FindBy(id = "id_password")
    WebElement password;

    @FindBy(id = "id_referral_code")
    WebElement refcode;

    @FindBy(id = "login")
    WebElement login;

    public void openPage(String url){
        getDriver().get(url);
        System.out.println("in page");

    }

    public void inputemail(String inputemail) {
        firstname.sendKeys(inputemail);
    }
    public void inputpassword(String inputpassowrd) {
        password.sendKeys(inputpassowrd);
    }

    public void inputrefcode(String redcodeinput) {
        refcode.sendKeys(redcodeinput);
    }

    public void loginbuttonclick() {
        login.click();
    }
}

