#language:es

@HistoriaDeUsuario

Característica: Verificar el ingreso correcto al ambiente inzele
  yo como cliente quiero ingresar a la inzele para verificar que tengo acceso a ella


  Antecedentes: se debe ingresar al ambiente de pruebas para las validaciones
    Dado que Miguel ingresa a inzele

  @logueo
  Escenario:verificar ingreso correcto
    Cuando digita sus credenciales
    Entonces verifica que pudo ingresar correctamente