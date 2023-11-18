package slease.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import slease.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheApplicationTest implements Task {

    private LoginPage loginPage = new LoginPage();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(loginPage)
        );
    }

    public static OpenTheApplicationTest onLoginPage() {
        return instrumented(OpenTheApplicationTest.class);
    }
}
