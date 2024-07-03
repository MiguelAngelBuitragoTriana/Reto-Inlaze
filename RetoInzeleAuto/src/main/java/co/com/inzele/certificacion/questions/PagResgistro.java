package co.com.inzele.certificacion.questions;

import co.com.inzele.certificacion.userinterfarces.PaginaRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PagResgistro implements Question {
    public static PagResgistro verificar() {
        return new PagResgistro();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaRegistro.MSG_ALERT).viewedBy(actor).asString();
    }
}
