@testfeature

Feature: Venta en Winforce

  @test1
  Scenario: Realizar una venta en Winforce
    Given que me encuentro en la página de Winforce
    When coloco las credenciales usuario: "idavila@winet.com.pe" y contraseña: "conecta"
    And me dirigo al botón de ventas y Nuevo LEAD
    And le doy clic al botón Añadir Nuevo Lead
    And coloco como Latitud: "-12.090252659316093" y como Longitud: "-77.00733708920505" luego al botón Confirmar
    And valido que me aparece la ventana para realizar una venta
    And coloco el tipo de documento: "DNI" y el DNI: "74841822"
    And le doy a buscar score crediticio al cliente
    And como tipo de domicilio: "Hogar", como predio: "Propietario", como tipo de contacto: "Venta"
    And le doy clic al botón Nuevo Cliente
    And coloco el número: "980123003" y el email: "analistaqa8@winempresas.pe"
    And le doy guardar Cliente
    And selecciono como vendedor a: "ICHIRO" y le doy guardar datos del cliente
    And valido que se guarda datos del cliente
    And selecciono como tipo de búsqueda: "Internet" y selecciono "Win 100 Mbps"
    And selecciono la oferta número 1 y le doy continuar
    And valido que me encuentro en la confirmación de la venta
    And le doy como Origen de Venta: "Ventas IN"
    And y selecciono la fecha de programación: 1/12/2023
    And y selecciono como tramo horario: "12:00"
    And que se enteró por: "Facebook" y le doy al botón de solicitar ahora
    Then valido que se realizo la venta




