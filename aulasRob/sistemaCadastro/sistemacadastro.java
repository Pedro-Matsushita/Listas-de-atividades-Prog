/*
 1- Construir e exibir uma lista com 5 funcionários 
 2- Pesquisar um funcionário pelo nome. Apresentar os dados do funcionário.
 3- Ordenar pelo nome a lista de funcionário a partir do exercício 1
 */


import java.util.*;
public class sistemacadastro {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[]args){

        int nf = 3; // Número de funcionários

        funcionario[] f; // Vetor funcionário
        f = new funcionario[nf];

        // Laço de cadastro dos funcionários
        for(int i = 0; i<nf; i++){
            System.out.println();
            System.out.print("Digite o nome do "+ (i+1) +"° funcionário: ");
            String n = teclado.nextLine();
            System.out.print("Digite o salário do "+ (i+1) +"° funcionário: R$");
            double sal = teclado.nextDouble();
            f[i] = new funcionario();
            f[i].nome = n;
            f[i].salario = sal;
            teclado.nextLine();
        }
        System.out.println();
        System.out.println("Lista de funcionários:\n");
        exibeFuncionarios(f);

        System.out.print("Digite o nome do funcionário que você busca: ");
        String procurado = teclado.nextLine();

        int procurarFuncionario = buscaSequencial(f, procurado);
        if(procurarFuncionario == -1){
            System.out.println("\nO nome "+ procurado +" não está presente no cadastro.");
        } else{
            //System.out.println("\nO funcionário "+ procurado +" está presente na posição: "+ procurarFuncionario);
            exibeFuncionarios(procurado);
        }


        exibeFuncionarios(f);
    }
        public static void exibeFuncionarios(funcionario[] f){
            for(int i = 0; i<f.length; i++){
                System.out.println("Nome: "+ f[i].nome);
                System.out.println("Salário: R$"+ f[i].salario);
                System.out.println();
            }
        }
        public static int buscaSequencial(funcionario[] f, String procurado){
            boolean achou = false;
            for(int i = 0; i < f.length; i++){
                if(f[i].nome.compareTo(procurado) == 0){
                    achou = true;
                    break;
                }
            }
            if(achou == true){
                    return procurado;
                } else{
                    return -1;
                }
        }
        public static void exibeProcurado(funcionario[] f, String procurado){
            for(int i = 0; i<f.length; i++){
                if(f[i].nome.equals(procurado)){
                System.out.println("Nome: "+ procurado);
                System.out.println("Salário: R$"+ f[i].salario);
                System.out.println();
                }
            }
        }
}

