package slease.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://app-slease-frontend-new-qa.azurewebsites.net")

public class LoginPage extends PageObject {

    public static final Target INICIO_USUARIO = Target.the("username field")
            .locatedBy(" .p-button-label.ng-star-inserted"); // Reemplaza esto con el ID real del campo de usuario
    public static final Target COMPANIA_BUTTON = Target.the("username field")
            .locatedBy(".g-cementos"); // Reemplaza esto con el ID real del campo de usuario

    public static final Target USERNAME_FIELD = Target.the("username field")
                        .locatedBy("#id_del_campo_de_usuario"); // Reemplaza esto con el ID real del campo de usuario

        public static final Target PASSWORD_FIELD = Target.the("password field")
                        .locatedBy("#id_del_campo_de_contraseña"); // Reemplaza esto con el ID real del campo de
                                                                   // contraseña
        public static final Target SUBMIT_BUTTON = Target.the("submit button")
                        .locatedBy("#id_del_boton_de_envio"); // Reemplaza esto con el ID real del botón de envío
}
