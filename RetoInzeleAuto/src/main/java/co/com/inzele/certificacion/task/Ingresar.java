package co.com.inzele.certificacion.task;

import co.com.inzele.certificacion.userinterfarces.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("prueba158@gmail.com").into(PaginaInicial.TXT_usuario),
                Enter.theValue("12345678Am.").into(PaginaInicial.TXT_contrasenha),
                Click.on(PaginaInicial.BTN_sign_in));

    }
}
