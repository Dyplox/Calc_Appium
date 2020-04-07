#Author: @AbelGuAr
#language: es

@Escenarios
Característica: Realizar operaciones aritméticas
  Yo Como usuario de la aplicación móvil calculadora
  quiero realizar varias operaciones matemáticas

  @CaseOne
  Esquema del escenario: Sumar dos valores
    Cuando ingresa las dos cifras <num1> y <num2> para la suma _.
    Entonces deberia encontrar el <resultado> en la pantalla

    Ejemplos:
      | num1 | num2 | resultado |
      | 3    | 3    | 6         |

  @CaseTwo
  Esquema del escenario: Restar dos valores
    Cuando ingresa las dos cifras <num1> y <num2> para la resta _.
    Entonces deberia encontrar el <resultado> en la pantalla

    Ejemplos:
      | num1 | num2 | resultado |
      | 20   | 10   | 10        |

  @Case3
  Esquema del escenario: Multiplicar dos valores
    Cuando ingresa las dos cifras <num1> y <num2> para la multiplicacion _.
    Entonces deberia encontrar el <resultado> en la pantalla

    Ejemplos:
      | num1 | num2 | resultado |
      | 10   | 10   | 100       |

  @Case$
  Esquema del escenario: Dividir dos valores
    Cuando ingresa las dos cifras <num1> y <num2> para la division _.
    Entonces deberia encontrar el <resultado> en la pantalla

    Ejemplos:
      | num1 | num2 | resultado |
      | 8    | 2    | 4         |