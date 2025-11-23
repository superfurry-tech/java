package arrays_matrices;

public class SalaCine
  {
    public static void main(String[] args)
    {
      System.out.println();
      char [][] butacas = new char[4][5];
      char estadoButaca = 'L';

      for (int i = 0; i < butacas.length; i++) {
        for (int j = 0; j < butacas[i].length; j++) {
          butacas[i][j] = estadoButaca;
        }
      }
      System.out.println("Estado inicial de las butacas:");
      mostrarEstadoButacas(butacas);

      System.out.println("\nEstado final de las butacas:");
      butacas[0][2] = 'O';
      butacas[1][3] = 'O';
      butacas[2][4] = 'O';
      butacas[3][1] = 'O';
      mostrarEstadoButacas(butacas);
    }
    public static void mostrarEstadoButacas (char[][]butacas){
      for (int i = 0; i < butacas.length; i++) {
        for (int j = 0; j < butacas[i].length; j++) {
          System.out.print(butacas[i][j] + " ");
        }
        System.out.println();
      }
    }
  }