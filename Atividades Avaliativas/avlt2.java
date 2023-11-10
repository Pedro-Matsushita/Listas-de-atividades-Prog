/*
 Atividade avaliativa 2
 Disciplina: Programação Imperativa
 Prof: Robson Lins
 Data: 10/11/2023
 Aluno: Pedro Miguel Matsushita de Araújo
 */
import java.util.*;
public class avlt2
{
    public static void main(String[] args){
        int linha = 5;
        int coluna = 5;
        int m[][] = new int[linha][coluna];
        
        //Entrada dos valores com gerador
        entradaMatriz(m);
        System.out.println();
        //Exibição matriz original
        System.out.println("Exibição da matriz original:\n");
        exibeMatriz(m);
        System.out.println(); //Quebrar linha

        //Chamada do método para ordenar e exibir a diagonal principal
        System.out.println("Diagonal principal ordenada:\n");
        ordenaDiagPrincipal(m);
        exibeMatriz(m);
        System.out.println(); //Quebrar linha

        //Chamada do método para ordenar e exibir a diagonal secundária
        System.out.println("Diagonal secundária ordenada:\n");
        ordenaDiagSecundaria(m);
        exibeMatriz(m);
        System.out.println(); //Quebrar linha
    }
    public static void entradaMatriz(int m[][]){
        Random aleatorio = new Random();
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                System.out.println("Matriz ["+ (i+1) +"][" + (j+1) + "] preenchida.");
                m[i][j]= aleatorio.nextInt(15);
            }
        }
    }
    public static void exibeMatriz(int m[][]){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ordenaDiagPrincipal(int m[][]) {
        int tamanho = m.length;

        int diagPrincipal[] = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            diagPrincipal[i] = m[i][i];
        }

        //Ordenar o vetor da diagonal principal
        diagPrincipal = metodoBolhaPrincipal(diagPrincipal);

        for (int i = 0; i < tamanho; i++) {
            m[i][i] = diagPrincipal[i];
        }
    }

    public static int[] metodoBolhaPrincipal(int diagPrincipal[]) {
        int tamanho = diagPrincipal.length;
        int i = tamanho;
        while (i >= 2) {
            for (int j = 0; j < i - 1; j++) {
                if (diagPrincipal[j] > diagPrincipal[j + 1]) {
                    int temp = diagPrincipal[j];
                    diagPrincipal[j] = diagPrincipal[j + 1];
                    diagPrincipal[j + 1] = temp;
                }
            }
            i = i - 1;
        }
        return diagPrincipal;
    }
    public static void ordenaDiagSecundaria(int[][] m) {
        int tamanho = m.length;

        int diagSecundaria[] = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            diagSecundaria[i] = m[i][tamanho - 1 - i];
        }

        //Ordenar o vetor da diagonal secundária
        diagSecundaria = metodoBolhaSecundaria(diagSecundaria);

        //Inserir os elementos ordenados de volta na diagonal secundária da matriz
        for (int i = 0; i < tamanho; i++) {
            m[i][tamanho - 1 - i] = diagSecundaria[i];
        }
    }

    public static int[] metodoBolhaSecundaria(int diagSecundaria[]) {
        int tamanho = diagSecundaria.length;
        int i = tamanho;
        while (i >= 2) {
            for (int j = 0; j < i - 1; j++) {
                if (diagSecundaria[j] > diagSecundaria[j + 1]) {
                    int temp = diagSecundaria[j];
                    diagSecundaria[j] = diagSecundaria[j + 1];
                    diagSecundaria[j + 1] = temp;
                }
            }
            i = i - 1;
        }
        return diagSecundaria;
    }
}