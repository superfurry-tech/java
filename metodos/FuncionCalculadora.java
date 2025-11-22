package jar.metodos;

/*
Ejercicio: Calculadora básica con métodos
- Crear cuatro métodos: sumar, restar, multiplicar, dividir.
- Usar parámetros (a, b) para pasar los valores.
- Mostrar un menú para que el usuario elija la operación.
- Practicar cómo se llaman métodos desde el main.
 */

import java.util.Scanner;

public class FuncionCalculadora {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    double[] numeros;
    int opcion;

    do {
      mostrarMenu();
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          numeros= mostrarPeticionNumeros(sc);
          System.out.println("Suma: " + hacerSuma(numeros[0], numeros[1]) + "\n");
          break;

        case 2:
          numeros= mostrarPeticionNumeros(sc);
          System.out.println("Resta: " + hacerResta(numeros[0], numeros[1]) + "\n");
          break;

        case 3:
          numeros= mostrarPeticionNumeros(sc);
          System.out.printf("Multiplicación: %.2f\n\n", hacerMultiplicacion(numeros[0], numeros[1]));
          break;

        case 4:
          numeros= mostrarPeticionNumeros(sc);
          System.out.printf("División: %.2f\n\n", hacerDivision(numeros[0], numeros[1], sc));
          break;

        case 5:
          System.out.println("¡Adiós!");
          break;

        default:
          System.out.println("Opción inválida\n");
          break;
      }
    } while (opcion !=5);

    sc.close();
  }

  public static void mostrarMenu (){
    System.out.println("*** CALCULADORA. ELIJA OPCIÓN ***");
    System.out.println("1. SUMAR");
    System.out.println("2. RESTAR");
    System.out.println("3. MULTIPLICAR");
    System.out.println("4. DIVIDIR");
    System.out.println("5. SALIR");

  }

  public static double[] mostrarPeticionNumeros (Scanner sc){
    double[] numeros = new double[2];
    System.out.println("Número 1:");
    numeros[0] = sc.nextDouble();
    System.out.println("Número 2:");
    numeros[1] = sc.nextDouble();
    return numeros;

  }

  public static double hacerSuma(double a, double b) {
    return a + b;
  }

  public static double hacerResta(double a, double b) {
    return a - b;
  }

  public static double hacerMultiplicacion(double a, double b) {
    return a * b;
  }

  public static double hacerDivision(double a, double b, Scanner sc) {
    while (b == 0){
      System.out.println("Número 2 no puede ser 0. Escribe otro:");
      b = sc.nextDouble();
    }
    return a / b;
  }

}


