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

        entradaMatriz(m);

        System.out.println("Exibição da matriz:\n");
        exibeMatriz(m);
    }
    public static void entradaMatriz(double m[][]){
        Random r = new Random();
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                System.out.println("Matriz ["+ (i+1) +"] preenchida.");
                m[i][j]= r.nextInt(15);
            }
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
}