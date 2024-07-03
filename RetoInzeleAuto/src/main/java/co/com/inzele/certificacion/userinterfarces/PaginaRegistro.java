package co.com.inzele.certificacion.userinterfarces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistro extends PageObject {
    public static final Target TXT_fullNombre=Target.the("Ingresar nombre")
            .located(By.id("full-name"));
    public static final Target TXT_email=Target.the("Ingresar email")
            .located(By.id("email"));
    public static final Target TXT_contrasenha= Target.the("Ingresar Contrasenha")
            .located(By.xpath("//input [@id='password']"));
    public static final Target TXT_contrasenhaConfi= Target.the("Ingresar Contrasenha")
            .located(By.xpath("//input [@id='confirm-password']"));
    public static Target MSG_ALERT=Target.the("Es la alerta")
            .located(By.xpath("//*[contains (text(), 'Successful registration!')]"));
}
