/*
Elabore um programa que preencha uma matriz 10×10 com números reais,
execute as trocas especificadas a seguir e mostre a matriz resultante:
a.A linha 2 com a linha 8;
b.A coluna 4 com a coluna 10;
c.A diagonal principal com a diagonal secundária;
d.A linha 5 com a coluna 10.
*/
import java.util.*;
public class Q3
{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args){
        double m[][] = new double[10][10];
        
        //Entrada dos valores com gerador
        entradaMatriz(m);

        //Exibição matriz original
        System.out.println("Exibição da matriz:\n");
        exibeMatriz(m);
        System.out.println();

        //Chamada dos métodos de troca
        trocarLinha(m, 2, 8);
        trocarColuna(m, 4, 9);
        trocarDiagonal(m);
        trocarLinhaColuna(m, 5, 9);
        
        //Exibição da matriz após troca
        System.out.println("Exibição da matriz após trocas:\n");
        exibeMatriz(m);
    }
    public static void entradaMatriz(double m[][]){
        Random r = new Random();
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                System.out.println("Matriz ["+ (i+1) +"] [" + (j+1) + "] preenchida.");
                m[i][j]= r.nextInt(15);
            }
            System.out.println();
        }
    }
    public static void exibeMatriz(double m[][]){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void trocarLinha(double m[][], int linha1, int linha2){
        for(int j = 0; j < m.length; j++){
            double temp = m[linha1][j];
            m[linha1][j] = m[linha2][j];
            m[linha2][j] = temp;
        }
    }
    public static void trocarColuna(double m[][], int coluna1, int coluna2){
        for(int i = 0; i < m.length; i++){
            double temp = m[i][coluna1];
            m[i][coluna1] = m[i][coluna2];
            m[i][coluna2] = temp;
        }
    }
    public static void trocarDiagonal(double m[][]){
        for(int i = 0; i < m.length; i++){
            double temp = m[i][i];
            m[i][i] = m[m.length -i -1][i];
            m[m.length -i  -1][i] = temp;
        }
    }
    public static void trocarLinhaColuna(double m[][], int linha, int coluna){
        for(int i = 0; i < m.length; i++){
            double temp = m[i][linha];
            m[i][linha] = m[i][coluna];
            m[i][coluna] = temp;
        }
    }
}