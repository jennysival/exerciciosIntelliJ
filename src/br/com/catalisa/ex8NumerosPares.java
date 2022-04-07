package br.com.catalisa;

import java.util.Scanner;

//Escreva um algoritmo que leia 20 números do usuário e exiba
//quantos números são pares
public class ex8NumerosPares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeros[] = new int[20];

        for(int i = 0; i < 20; i++){
            int num = i+1;
            System.out.println("Digite o "+num+"º número: ");
            numeros[i] = leitor.nextInt();
        }

        int qtdNumPar = 0;

        for(int i = 0; i < 20; i++){
            if(numeros[i] % 2 == 0){
                qtdNumPar = qtdNumPar+1;
            }
        }
        System.out.println("Foram digitados "+qtdNumPar+" números pares");
    }
}
