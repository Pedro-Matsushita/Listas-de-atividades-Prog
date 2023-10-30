import java.util.*;
public class Q2l2{
    public static void main(String[]args){
        int vet[] = new int[20];
        int tamanho = vet.length;

        entradaValores(vet, tamanho);

        System.out.println("Vetor padrão:");
        exibeVetor(vet, tamanho);
        System.out.println();

        int inverter[] = inverteVetor(vet, tamanho);

        System.out.println("Vetor invertido:");
        exibeVetor(inverter, tamanho);
    }
    public static void entradaValores(int vet[], int tamanho){
        Random r = new Random();
        for(int i = 0; i<tamanho; i++){
            System.out.println("Valor do "+ (i+1) +"° preenchido!");
            vet[i] = r.nextInt(25);
        }
        System.out.println();
    }
    public static int[] inverteVetor(int vet[], int tamanho){
        while(tamanho >= 2){
            for(int i = 0; i<tamanho-1;i++){
                if(vet[i] < vet[i+1]){
                    int temp = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = temp;
                }      
            }
            tamanho = tamanho-1;   
        }
        return vet;
    }
    public static void exibeVetor(int vet[], int tamanho){
        for(int i = 0; i<tamanho; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
}

