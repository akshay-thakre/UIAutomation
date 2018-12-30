package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPageElements;

/**
 * Created by Thakre on 30/12/2018.
 */
public class LoginPageSteps {

    private LoginPageElements loginPageElements;

    @Step
    public void user_navigates_to(String url) throws Throwable{
        loginPageElements.openPage(url);
        System.out.println("in steps");

    }

    @Step
    public void enter_username(){
        loginPageElements.inputemail("");
    }
    @Step
    public void enter_password(){
        loginPageElements.inputpassword("");
        loginPageElements.inputrefcode("");
        loginPageElements.loginbuttonclick();

    }

}
