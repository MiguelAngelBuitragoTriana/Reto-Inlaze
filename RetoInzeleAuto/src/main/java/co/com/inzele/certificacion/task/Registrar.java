package co.com.inzele.certificacion.task;

import co.com.inzele.certificacion.model.User;
import co.com.inzele.certificacion.userinterfarces.PaginaInicial;
import co.com.inzele.certificacion.userinterfarces.PaginaRegistro;
import co.com.inzele.certificacion.util.GeneradoDataRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrar implements Task {
    private final User user;
    public Registrar (User user){
        this.user=user;
    }
    public static Registrar credenciales() {
        User randomUser= GeneradoDataRandom.generadorrandomusuario();
        return Tasks.instrumented(Registrar.class,randomUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.BTN_registrar_in),
                Enter.theValue(user.getFullName()).into(PaginaRegistro.TXT_fullNombre),
                Enter.theValue(user.getEmail()).into(PaginaRegistro.TXT_email),
                Enter.theValue("12345678Am.").into(PaginaRegistro.TXT_contrasenha),
                Enter.theValue("12345678Am.").into(PaginaRegistro.TXT_contrasenhaConfi),
                Click.on(PaginaInicial.BTN_registrar_in));

    }
}
