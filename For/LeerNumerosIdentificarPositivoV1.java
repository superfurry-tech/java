package jar.For;

import java.util.Scanner;

public class LeerNumerosIdentificarPositivoV1
{
  public static void main(String[] args)
  {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Te pediré 4 números y te diré cuántos son positivos");
    int[] numeros = new int[4];
    int contadorPositivos = 0;
    int [] numerosPositivos = new int[4];

    for (int i = 0; i < numeros.length; i++) // Los pido y los guardo en el array numeros
    {
      System.out.println("¿Número " + (i+1) + "?");
      numeros [i] = sc.nextInt();
    }
    System.out.println();
    System.out.println("Has dicho los números:");
    for (int i = 0; i < numeros.length; i++) // Los muestro por pantalla
    {
      System.out.println(numeros[i]);
    }

    for (int i = 0; i < numeros.length; i++)
    {
      if (numeros[i]>0)
      {
        /*
       Busco los positivos y los guardo en el array numerosPositivos. Con numerosPositivos[i] = numeros[i]; (lo que tenía en una versión anterior) tenía el problema de que donde hay negativo ponía un 0. Tal como pongo ahora, los 0 no quedan en los huecos intermedios, sino al final.
       */
        numerosPositivos[contadorPositivos] = numeros[i];
        contadorPositivos++; // Contador de positivos aumenta en 1 cuando se encuentra con un número positivo en el array numeros
      }
    }
    System.out.println("\n" + "Hay " + contadorPositivos + " números positivos. Son:");

    for (int i = 0; i < numerosPositivos.length; i++)
    {
      /*
      Cambio en V2 porque, aunque funciona igual, GMN me dice: "La corrección i < contadorPositivos es necesaria por si alguna vez cambias la lógica y decides incluir el cero como "no-negativo" (es decir, usas if (numeros[i] >= 0)), el código solo imprimiría el 10, perdiendo el 0 y el 20.
      */
      if (numerosPositivos[i] > 0)
      {
        System.out.println(numerosPositivos[i]);
      }
    }
    sc.close();
  }
}

// Leer 4 números, mostrarlos, identificar cuántos de ellos son positivos y mostrar los positivos.