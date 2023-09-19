Feature: Probar la busqueda en Google

  Scenario: Busco algo en Google
     Given navego a la pagina de Google
      When Ingreso mi criterio de busqueda
       And Click en el boton buscar
      Then Obtengo resultado

