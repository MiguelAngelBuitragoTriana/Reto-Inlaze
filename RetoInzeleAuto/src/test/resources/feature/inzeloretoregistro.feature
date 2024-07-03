#language:es

@HistoriaDeUsuario1

Característica: Verificar el registro correcto al ambiente inzele
  yo como cliente quiero realizar el registro a la inzele para verificar que tengo acceso a ella


  Antecedentes: se debe ingresar al ambiente de pruebas para las validaciones
    Dado que Miguel ingresa a inzele
  @registro
  Escenario:verificar registro correcto
    Cuando se registra con su usuario y email random
    Entonces deberia ver el mensaje de confirmacion