package jar.For;

public class MatrizCineLibreOcupado
{
  public static void main(String[] args)
  {
    System.out.println();
    char[][] butacas = new char[4][5];
    char libre = 'L';
    System.out.print("Sala de cine vacía:"); // No pongo println para no dejar línea vacía
    for (int i = 0; i < butacas.length; i++)
    {
      System.out.println();
      for (int j = 0; j < butacas[i].length; j++)
      {
        butacas[i][j] = libre;
        System.out.print(butacas[i][j] + " ");
      }
    }
    System.out.println();
    System.out.println();
    /* Podría poner System.out.println("\n"); para hacer los dos saltos, pero GMN dice que no es buena idea: "es menos claro. Es como si estuvieras forzando un doble salto sin saberlo: fuerzas uno con \n y Java añade el segundo con el ln".
    */

    System.out.print("Llegan algunos espectadores:"); // No pongo println para no dejar línea vacía
    butacas [0][2] = 'O';
    butacas [2][2] = 'O';
    butacas [3][4] = 'O';

    for (int i = 0; i < butacas.length; i++)
    {
      System.out.println();
      for (int j = 0; j < butacas[i].length; j++)
      {
        System.out.print(butacas[i][j] + " ");
      }
    }
    System.out.println();
  }
}
