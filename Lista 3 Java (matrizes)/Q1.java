import java.util.*;

public class Q1 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        double matriz[][] = new double[2][2];

        System.out.println("Preenchimento da matriz.\n");
        entradaMatriz(matriz);

        double maiorElem = maiorElementoM(matriz);

        multiMatriz(matriz, maiorElem);

        System.out.println("Exibição da matriz:\n");
        exibeMatriz(matriz);
    }

    public static void entradaMatriz(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Insira o elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = ler.nextDouble();
            }
        }
        System.out.println();
    }

    public static double maiorElementoM(double matriz[][]) {
        double maiorElemento = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }
        return maiorElemento;
    }

    public static void multiMatriz(double matriz[][], double maiorElem) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz[i][j] * maiorElem;
            }
        }
    }

    public static void exibeMatriz(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Quebra de linha após cada linha da matriz
        }
    }
}
