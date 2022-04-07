package br.com.catalisa;

import java.util.Scanner;

//Escreva um algoritmo que leia 20 números do usuário e exiba
//quantos números são maiores que 8
public class ex7numerosMaioresQue8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeros[] = new int[20];

        for(int i = 0; i < 20; i++){
            int num = i+1;
            System.out.println("Digite o "+num+"º número: ");
            numeros[i] = leitor.nextInt();
        }

        int qtdNumMaior = 0;

        for(int i = 0; i < 20; i++){
            if(numeros[i] > 8){
               qtdNumMaior = qtdNumMaior+1;
            }
        }
        System.out.println("Foram digitados "+qtdNumMaior+" números maiores que 8");



    }
}
