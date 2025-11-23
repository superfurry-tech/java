package metodos;

import java.util.Scanner;

public class NumeroFactorial {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    System.out.println("Número para saber su factorial:");
    numero = sc.nextInt();
    int resultado = obtenerFactorial(numero);
    System.out.println(resultado);
  }

  public static int obtenerFactorial(int num) {
    int factorial = 1;
    if (num > 1) {
      for (int i = 2; i <= num; i++) {
        factorial = factorial * i;
      }
    }
    return factorial;
  }
}

// Escribe una función llamada factorial que reciba un número y muestre su factorial

