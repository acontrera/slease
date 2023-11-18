package slease.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import slease.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LoginTest implements Task {
    private final String username;
    private final String password;

    public LoginTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(LoginPage.INICIO_USUARIO),
                    Click.on(LoginPage.COMPANIA_BUTTON),
                    Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                    Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                    Click.on(LoginPage.SUBMIT_BUTTON)
            );
        } catch (Exception e) {
            // Manejar la excepción o imprimir un mensaje de registro
            e.printStackTrace();
        }

    }

    public static LoginTest withCredentials(String username, String password) {
        return instrumented(LoginTest.class, username, password);
    }
}
