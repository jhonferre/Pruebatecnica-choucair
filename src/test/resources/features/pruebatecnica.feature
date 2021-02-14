@stories
Feature: Prueba tecnica
 El usuario quiere registrarse en la pagina de utest para aceder a sus beneficios
  @scenario1
  Scenario: Resgistrarse en la pagina de utest
    Given El usuario quiere registrarse en la pagina de utest
    When El llena el formulario de registro en la pagina de utest
      | strFirstName  | strLastName  |  strEmail               |  strMonth  | strDay  | strYear | strCity| strZip | strCountry| strComputer| strVersion | strLanguage| strMobil | strModel     | strOS             | strPassword       |
      | Jhonatan      | Ferreira     | jhonatanferreira0616@gmail.com |  June      | 16      | 1995    | Cúcuta | 540013 | Colombia  | Windows    | Vista         | English    | Motorola | Moto G6 Plus | Android 9.0 (Pie) | MiContraseña-2021 |
    Then el termina el registro satisfactoriamente
    |strConfirm                       |
    | The last step |
