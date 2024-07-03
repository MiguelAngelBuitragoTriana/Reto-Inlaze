package co.com.inzele.certificacion.util;

import co.com.inzele.certificacion.model.User;
import org.apache.commons.lang3.RandomStringUtils;

public class GeneradoDataRandom {
    public static User generadorrandomusuario(){
        String primerNombre= RandomStringUtils.randomAlphabetic(5);
        String segundoNombre= RandomStringUtils.randomAlphabetic(7);
        String fullName=primerNombre+" "+segundoNombre;
        String email=primerNombre+"."+segundoNombre+"@gmail.com";
        return new User(fullName,email);
    }
}
