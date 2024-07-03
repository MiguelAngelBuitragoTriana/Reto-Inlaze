package co.com.inzele.certificacion.stepDefinitions;

import co.com.inzele.certificacion.questions.Verificar;
import co.com.inzele.certificacion.task.AbrirPagfina;
import co.com.inzele.certificacion.task.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class InzeleRetoStepDefinitions {
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Miguel ingresa a inzele$")
    public void queMiguelIngresaAInzele() {
        OnStage.theActorCalled("Miguel").wasAbleTo(AbrirPagfina.urlApp());
    }

    @Cuando("^digita sus credenciales$")
    public void digitaSusCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Entonces("^verifica que pudo ingresar correctamente$")
    public void verificaQuePudoIngresarCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.is(true)));
    }
}
