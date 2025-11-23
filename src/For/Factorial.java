package For;

import java.util.Scanner;

// Escribe un número y muestra su factorial
/* Había puesto if(numero!=1 && numero !=0), y con &&, si las dos propuestas son verdad, tira para el for. Ejemplo 7: no es 1 y no es 0, true + true = true y tira para el for. y si una no es verdad, ejemplo: 1: la primera es falsa, la segunda verdadera, false + true = false y no tira para el for. Con ||, si una es true, tira para el for. Lo del 7 es igual. Y lo del 1: la primera no se cumple (false) y la segunda sí (true), entonces es true y tira para adelante. Pero tira para adelante pero no entra en el for porque la condición del for es i<numero y entonces factorial se queda con el valor inicial de 1. SIEMPRE ES MEJOR USAR CONDICIONES POSITIVAS, en plan "si es de esta forma" y no, "si no es de esta forma". Por eso mejor usar if(numero>1) porque ya evito el 1, el 0 y los negativos.
 */

public class Factorial
{
  public static void main(String[] args)
  {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int factorial = 1;
    System.out.println("¿Número para saber su factorial?:");
    numero = sc.nextInt();

    if (numero>1)
    {
      for (int i = 2; i<=numero; i++) // Había puesto desde int i=1; i < numero... y abajo: fac = fac * (i+1), pero GMN me dice que mejor es así
      {
        factorial = factorial * i;
      }
    }
    System.out.println(factorial);
  }
}