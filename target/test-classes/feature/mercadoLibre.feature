
@tag
Feature: Title of your feature
  se desea navegar por la plataforma y guardar información de ciertos productos

  @tag2
  Scenario Outline: ingresamos a la pagina principal de mercado libre
    Given buscamos camisas de mujeres <camisasMujeres> en la casilla de busqueda
    And agremos los productos de la primera hoja al carro de compras


    Examples: 
      | camisasMujeres    | 
      | "camisas mujer" |

