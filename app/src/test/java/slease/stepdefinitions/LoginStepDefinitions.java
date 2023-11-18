package slease.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import slease.tasks.LoginTest;
import slease.tasks.OpenTheApplicationTest;
import slease.ui.LoginPage;

public class LoginStepDefinitions {

    @Given("the user opens the application")
    public void theUserOpensTheApplication() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").attemptsTo(
                OpenTheApplicationTest.onLoginPage());
    }

    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LoginPage.INICIO_USUARIO),
                Click.on(LoginPage.COMPANIA_BUTTON),
                LoginTest.withCredentials("valid_username", "valid_password"));
    }

    @When("the user logs in with invalid credentials")
    public void theUserLogsInWithInvalidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LoginPage.INICIO_USUARIO),
                Click.on(LoginPage.COMPANIA_BUTTON),
                LoginTest.withCredentials("invalid_username", "invalid_password"));
    }

    @Then("the user should be taken to the dashboard")
    public void theUserShouldBeTakenToTheDashboard() {
        // Aquí deberías verificar que el usuario ha sido redirigido al dashboard
    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        // Aquí deberías verificar que se muestra un mensaje de error
    }
}