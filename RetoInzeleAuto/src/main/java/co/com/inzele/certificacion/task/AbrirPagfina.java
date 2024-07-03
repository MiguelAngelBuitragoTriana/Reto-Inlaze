package co.com.inzele.certificacion.task;

import co.com.inzele.certificacion.userinterfarces.AmbientePruebas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagfina implements Task {
    private AmbientePruebas ambientePruebas;
    public static Performable urlApp() {
        return Tasks.instrumented(AbrirPagfina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(ambientePruebas));

    }
}
