package For;

import java.util.Scanner;

public class PosicionMayorEnterosPositivosYNegativos
{
  public static void main(String[] args)
  {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[4];
    int posicion = 0;
    System.out.println("Te voy a pedir 4 números. Te diré cuál es el mayor y qué posición ocupa entre los 4 que me has dicho.");

    for (int i = 0; i < numeros.length; i++)  // Bucle de escritura para guardar los 4 datos
    {
      System.out.println("¿Número " + (i+1) + "?");
      numeros [i] = sc.nextInt();
    }
    int mayor = numeros [0];
    // Lo hay que poner aquí porque arriba estaría a 0 porque el array arriba es [0, 0, 0, 0] y hasta que escribo no puedo hacerlo
    for (int i = 0; i < numeros.length; i++)
    {
      if (numeros[i]>mayor)
      {
        mayor = numeros[i];
        posicion = i;
      }
    }
    System.out.println("El número mayor es el " + mayor + " y está en la posición " + (posicion+1) + ".");
    sc.close();
  }
}


// pide 4 números, dime cuál es el mayor y qué posición ocupa