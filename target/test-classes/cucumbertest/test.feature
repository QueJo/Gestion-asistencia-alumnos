
Feature: Controlar asistencia

  Scenario: Alumno logado
    Given Profe logado en el sistema
    And Alumno logado al sistema
    When  Profe lista Alumnos
    Then Mostrar Alumno presente


  Scenario: Alumno no logado
    Given Profe logado en el sistema
    And Alumno no logado al sistema
    When  Profe lista Alumnos
    Then Mostrar Alumno no presente


  Scenario Outline: Cambiar estado Alumno
    Given  Listado Alumnos
    And  Alumno está "<estado_inicial>"
    When  Profe cambia  Alumno a "<estado_final>"
    Then  Mostrar Alumno en "<estado_final>"

    Examples: Estado alumnos

      | estado_inicial | estado_final |
      | presente       |  ausente     |
      | ausente        |  presente    |


