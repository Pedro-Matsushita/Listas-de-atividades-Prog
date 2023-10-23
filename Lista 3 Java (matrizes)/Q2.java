/*
Escreva um programa que recebe uma matriz 3×4 com números reais e retorne:
a.A soma dos elementos de cada linha;
b.A soma dos elementos de cada coluna.
*/
import java.util.*;
public class Q2
{
    static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
	    double m[][] = new double[3][4];
	  
		entradaMatriz(m);
		exibeMatriz(m);
		
		System.out.println("Exibição das linhas somadas\n");
		exibeSomaLinha(m);

        System.out.println("Exibição das colunas somadas\n");
        exibeSomaColuna(m);
	}
	public static void entradaMatriz(double m[][]){
	    Random r = new Random();
	    for(int i = 0; i < m.length; i++){
	        for(int j = 0; j < m[i].length; j++){
	            System.out.println("Matriz [" + (i+1) + "][" + (j+1) + "] preenchida");
	            m[i][j]= r.nextInt(10);
	        }
	    }
	    System.out.println();
	}
	public static void exibeMatriz(double m[][]){
	    for(int i = 0; i < m.length; i++){
	        for(int j = 0; j < m[i].length; j++){
	        System.out.print(m[i][j] + " ");
	    }
	    System.out.println();
	}
    System.out.println(); 
	}
	public static void exibeSomaLinha(double m[][]){
	    for(int i = 0; i < m.length; i++){
	        double somaLinha = 0;
	        for(int j = 0; j < m[i].length; j++){
	            somaLinha += m[i][j];           
	        }
	        System.out.println("Linha "+ (i+1) +": "+ somaLinha);
	    }
        System.out.println();
	}
    public static void exibeSomaColuna(double m[][]){
	    for(int j = 0; j < m[0].length; j++){
	        double somaColuna = 0;
	        for(int i = 0; i < m.length; i++){
	            somaColuna += m[i][j];           
	        }
	        System.out.println("Coluna "+ (j+1) +": "+ somaColuna);
	    }
        System.out.println();
	}
}
