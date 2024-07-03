package co.com.inzele.certificacion.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feature/inzeloretoregistro.feature",
        tags="@HistoriaDeUsuario1",
        glue = "co.com.inzele.certificacion.",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTagsInzeleRetoRegistro {
}
