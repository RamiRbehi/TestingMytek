package stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.click_connexion_btn;
import static pages.LoginPage.email_username;
import static pages.LoginPage.password;
import static pages.LoginPage.logging_in;


public class LoginPage {

@Given("^User navigates to login page$")
    public void user_navigates_to_login_page() throws Exception {
        System.out.println("Login");
    click_connexion_btn ();
}

@When("^User enters correct email and password values$")
    public void user_enters_correct_values_to_login() throws Exception{
    email_username();
    password();
    System.out.println("user entered username and password correctly");
}

@Then("^User gets directed to home page$")
    public void user_get_directed_to_home_page() throws Exception {
    logging_in();
    System.out.println("user is directed successfully to home page");
}
}
