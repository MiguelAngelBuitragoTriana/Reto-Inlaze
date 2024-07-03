package co.com.inzele.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.inzele.certificacion.userinterfarces.PaginaInicial;
public class Verificar implements Question<Boolean> {
    public static Verificar resultado() {
        return new Verificar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaInicial.MSG_ALERT.resolveFor(actor).isDisplayed();
    }
}
