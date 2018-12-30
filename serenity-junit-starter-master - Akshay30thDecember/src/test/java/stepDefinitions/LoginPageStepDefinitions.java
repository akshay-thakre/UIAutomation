package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import steps.LoginPageSteps;

/**
 * Created by Thakre on 30/12/2018.
 */
public class LoginPageStepDefinitions {

    @Steps
    LoginPageSteps loginPageSteps;

    @Given("^User navigates to (.*)$")
    public void user_navigates_to(String url) throws Throwable{
        loginPageSteps.user_navigates_to(url);
        System.out.println("in step definition");
    }

    @And("^I enter username$")
    public void enter_username(){
        loginPageSteps.enter_username();
    }
    @And("^I enter password and click on submit$")
    public void enter_password(){
        loginPageSteps.enter_password();
    }

    @And("^I should be logged in$")
    public void logged_in(){
        System.out.println("User logged in");
    }

}
