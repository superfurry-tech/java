package jar.For;

public class MatrizMaximoYPosicionNumero
{
  public static void main(String[] args)
  {
    System.out.println();
    int[][] matriz = new int[3][3];
    matriz[0][0] = 4;
    matriz[0][1] = 169;
    matriz[0][2] = 46;
    matriz[1][0] = 10;
    matriz[1][1] = 144;
    matriz[1][2] = 22;
    matriz[2][0] = 11;
    matriz[2][1] = 2;
    matriz[2][2] = 6;
    int maximo = 0;
    int posicionMaximoI = 0;
    int posicionMaximoJ = 0;

    for (int i = 0; i < matriz.length; i++)
    {
      for (int j = 0; j < matriz.length; j++)
      {
        if (matriz[i][j] > maximo)
        {
          maximo = matriz [i][j];
          posicionMaximoI = i;
          posicionMaximoJ = j;
        }
      }
    }
    System.out.println("El número mayor es: " + maximo + " y ocupa la posición " + "[" + posicionMaximoI + "] [" + posicionMaximoJ + "]");
  }
}

// Encontrar máximo y posición [][]
