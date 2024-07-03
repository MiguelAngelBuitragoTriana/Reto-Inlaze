package co.com.inzele.certificacion.userinterfarces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicial extends PageObject {
    public static final Target TXT_usuario=Target.the("Ingresar usuario")
            .located(By.id("email"));
    public static final Target TXT_contrasenha= Target.the("Ingresar Contrasenha")
            .located(By.xpath("//input [@id='password']"));

    public static Target BTN_sign_in=Target.the("Selecciona el btn ingresar")
            .located(By.xpath("//button[contains (text(), 'Sign in')]"));
    public static Target BTN_registrar_in=Target.the("Selecciona el btn registrar")
            .located(By.xpath("//*[contains (text(), ' Sign up ')]"));


    public static Target MSG_ALERT=Target.the("Es la alerta")
            .located(By.xpath("//h2[contains (text(), ' Welcome to Lorem ')]"));
}
