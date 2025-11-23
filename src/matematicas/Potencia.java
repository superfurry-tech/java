package matematicas;

import java.text.DecimalFormat;
import java.util.Scanner;

// Pido Base y Exponente y doy resultado

public class Potencia {
  public static void main(String[] args) {
    System.out.println();

    Scanner sc = new Scanner(System.in);
    int base, exponente;
    double res; // GMN: mejor con potencias poner double (resultado) porque abarca más y mejor no limitar

    System.out.println("¿Base?");
    base = sc.nextInt();
    System.out.println("¿Exponente?");
    exponente = sc.nextInt();
    res = Math.pow(base, exponente); // fórmula
    DecimalFormat df = new DecimalFormat("#.##"); // para que el double, de ser exacto no de .0 y de haber decimales, lo deje en 2 de haber muchos.
    System.out.println("Resultado: " + df.format(res));

    sc.close();
  }
}
