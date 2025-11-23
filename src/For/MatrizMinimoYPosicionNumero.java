package For;

public class MatrizMinimoYPosicionNumero
{
  public static void main(String[] args)
  {
    System.out.println();
    int[][] matriz = new int[3][3];
    matriz[0][0] = 4;
    matriz[0][1] = 6;
    matriz[0][2] = 2;
    matriz[1][0] = 10;
    matriz[1][1] = 144;
    matriz[1][2] = 22;
    matriz[2][0] = 11;
    matriz[2][1] = 46;
    matriz[2][2] = 6;
    int minimo = matriz [0][0];
    int posicionMinimoI = 0;
    int posicionMinimoJ = 0;

    for (int i = 0; i < matriz.length; i++)
    {
      for (int j = 0; j < matriz.length; j++)
      {
        if (matriz[i][j] < minimo)
        {
          minimo = matriz [i][j];
          posicionMinimoI = i;
          posicionMinimoJ = j;
        }
      }
    }
    System.out.println("El número menor es: " + minimo + " y ocupa la posición " + "[" + posicionMinimoI + "] [" + posicionMinimoJ + "]");
  }
}

// Encontrar mínimo y posición [][]
