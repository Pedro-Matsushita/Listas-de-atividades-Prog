// Atividade avaliativa de Programação Imperativa - Manhã
// Prof: Robson
// Aluno: Pedro Miguel Matsushita de Araújo
// RA: 00000850239

import java.util.*;
public class atv1
{
    public static void main(String[] args){
        int vetA[] = new int[100000];
        int vetB[] = new int[100000];
        int tamanho = vetA.length;

        entradaValores(vetA, vetB, tamanho);

        int ordenarA[] = selecaoDireta(vetA);
        int ordernarB[] = selecaoDireta(vetB);

        long tempoInicio = System.currentTimeMillis();
        int vet[] = intercalarVetores(vetA, vetB);
        long tempoFim = System.currentTimeMillis();

        long tempoExecucao= tempoFim -tempoInicio;

        System.out.println("O tempo de execução foi de: "+tempoExecucao);
    }
    // Função para inserir valores aleatórios nos vetores
    public static void entradaValores(int vetA[], int vetB[], int tamanho){
        Random aleatorio = new Random();
        for(int i = 0; i<tamanho; i++){
            vetA[i]=aleatorio.nextInt(256);
            vetB[i]=aleatorio.nextInt(256);
        }
    }
    // Função para ordenar os vetores 
    public static int[] selecaoDireta(int[] vetA){
        int i, j, menor, aux;
        for (i = 0; i < vetA.length - 1; i++){
            menor = i;
            for (j = i + 1; j <= vetA.length - 1; j++){
                    if (vetA[j] < vetA[menor]){ 
                        menor = j;  
                    }
                }
                aux = vetA[i];
                vetA[i] = vetA[menor];
                vetA[menor] = aux;
            }
            return(vetA);
        }
    // Função para juntar os vetores
    public static int[] intercalarVetores(int[] vetA, int[] vetB) {
        int tamanhovetA = vetA.length;
        int tamanhovetB = vetB.length;
        int tamanhovetC = tamanhovetA + tamanhovetB;
        int[] vetC = new int[tamanhovetC];
 
        int i = 0, j = 0, k = 0;
 
        while (i < tamanhovetA && j < tamanhovetB) {
            if (vetA[i] < vetB[j]) {
                vetC[k] = vetA[i];
                i++;
            } else {
                vetC[k] = vetB[j];
                j++;
            }
            k++;
        }
 
        while (i < tamanhovetA) {
            vetC[k] = vetA[i];
            i++;
            k++;
        }
 
        while (j < tamanhovetB) {
            vetC[k] = vetB[j];
            j++;
            k++;
        }
 
        return vetC;
    }
}