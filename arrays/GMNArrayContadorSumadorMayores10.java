package jar.arrays;


/*
El objetivo es que el programa pida al usuario 5 números enteros y los guarde en un array. Una vez guardados, debe calcular y mostrar dos cosas:
1. La suma total de todos los números ingresados.
2. Cuántos de esos números ingresados son mayores que 10.
 */

import java.util.Scanner;

public class GMNArrayContadorSumadorMayores10
{
  public static void main(String[] args)
  {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int[] almacen = new int[5];
    int numero = 0;
    int suma = 0;
    int contadorMayores = 0;
    System.out.println("*** Te pido 5 números y te digo la suma total y cuántos son mayores de 10 ***");
    for (int i = 0; i < 5; i++)
    {
      System.out.println("¿Número " + (i+1) + "?:");
      numero = sc.nextInt();
      almacen[i] = numero;
    }
    for (int i = 0; i < 5; i++)
    {
      suma = suma + almacen[i];
      if (almacen[i]>10)
      {
        contadorMayores++;
      }
    }
    System.out.println("Suma: " + suma);
    System.out.println("Números mayores de 10: " + contadorMayores);
    sc.close();
  }
}
