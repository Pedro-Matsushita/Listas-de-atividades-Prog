import java.util.*;
public class Q1l2
{
    static Scanner teclado = new Scanner(System.in);
public static void main(String[] args){
    double notas[] = new double[5];
    double nmaior[] = new double[5];
    double nmenor[] = new double[5];
    int tamanho = notas.length;


    entradaNotas(notas, tamanho);

    double calculaMedia = calculaNota(notas, tamanho);

    verificaNotas(notas, nmaior, nmenor, tamanho);

    exibeNotas(nmaior);
    exibeNotas(nmenor);
}
public static void entradaNotas(double notas[], int tamanho){
    for(int i = 0; i < tamanho; i++){
        System.out.print("Digite a "+(i+1)+"ª nota: ");
        notas[i] = teclado.nextDouble();
    }
    System.out.println();
}
public static double calculaNota(double notas[], int tamanho){
        double soma = 0;
        for(int i = 0; i<tamanho; i++){
            soma += notas[i];
        }
        double media = soma/tamanho;
        System.out.println("A média das notas é de: "+ media);

        return media;
}
public static void verificaNotas(double notas[], int tamanho, double nmaior[], double nmenor[]){
    for(int i = 0; i<tamanho; i++){
        if(notas[i] > calculaNota(notas, tamanho){
             nmaior[i]=notas[i];
        }
        else{
             nmenor[i]=notas[i];
        }
    }
}
public static void exibeNotas(double notas[]){
    for(int i = 0; i < notas.length; i++){
        System.out.println(notas[i] + "| ");
    }
    System.out.println();
}
}

