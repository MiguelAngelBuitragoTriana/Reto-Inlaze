package co.com.inzele.certificacion.stepDefinitions;

import co.com.inzele.certificacion.questions.PagResgistro;
import co.com.inzele.certificacion.task.Ingresar;
import co.com.inzele.certificacion.task.Registrar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class InzeleRetoRegistroStepDefinitions {

    @Cuando("^se registra con su usuario y email random$")
    public void seRegistraConSuUsuarioYEmailRandom() {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.credenciales());
    }

    @Entonces("^deberia ver el mensaje de confirmacion$")
    public void deberiaVerElMensajeDeConfirmacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PagResgistro.verificar(), Matchers.equalTo("Successful registration!")));
    }
}
