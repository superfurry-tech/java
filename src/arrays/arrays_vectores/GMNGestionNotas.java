package arrays.arrays_vectores;

/* Queremos gestionar las notas de dos exámenes. El programa debe:
    1. Crear dos _arrays_ de tamaño 5: `examen1` y `examen2`.
    2. Pedir al usuario las 5 notas para el `examen1` y las 5 notas para el `examen2`.
    3. Calcular y mostrar:
    - La media final de cada alumno (la media de su nota de `examen1` y `examen2`).
    - Un contador de cuántos alumnos tienen una media final de 5.0 o superior (es decir, cuántos han "aprobado" la asignatura).
    Fran: "He creado mediaFormateada para sacar cada nota con dos decimales"
     String mediaFormateada = String.format("%.2f", media[i]);
     System.out.println("Media alumno " + (i+1) + " :" + mediaFormateada);
 */

import java.util.Scanner;

public class GMNGestionNotas
{
  public static void main(String[] args)
  {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    double[] examen1 = new double[5];
    double[] examen2 = new double[5];
    double[] media = new double[5];
    double nota = 0.00;
    int contadorAprobados = 0;
    System.out.println("3 alumnos y 2 exámenes. Te digo la media de cada alumno y nº alumnos aprobados");

    for (int i = 0; i < 5; i++)
    {
      System.out.println("Nota examen 1 -> alumno " + (i+1) + ":");
      nota = sc.nextDouble();
      examen1[i]=nota;

      System.out.println("Nota examen 2 -> alumno " + (i+1) + ":");
      nota = sc.nextDouble();
      examen2[i]=nota;
    }

    for (int i = 0; i < 5; i++)
    {
      media[i] = ((examen1[i] + examen2[i])/2);

      if (media[i]>=5)
      {
        contadorAprobados++;
      }
      String mediaFormateada = String.format("%.2f", media[i]);
      System.out.println("Media alumno " + (i+1) + " :" + mediaFormateada);
    }
    System.out.println("-------------------");
    System.out.println("Número aprobados: " + contadorAprobados);

    sc.close();
  }
}
