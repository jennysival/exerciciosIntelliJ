package br.com.catalisa;

import java.util.Scanner;

//Escreva um algoritmo que leia um número inteiro (de 1 a 7)
//representando o dia da semana e informe o nome do dia
//correspondente
public class ex5DiasDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] diasSemana = new String[7];

        diasSemana[0] = "Segunda-feira";
        diasSemana[1] = "Terça-feira";
        diasSemana[2] = "Quarta-feira";
        diasSemana[3] = "Quinta-feira";
        diasSemana[4] = "Sexta-feira";
        diasSemana[5] = "Sábado";
        diasSemana[6] = "Domingo";

        System.out.println("Digite um número de 1 a 7: ");
        int numDig = leitor.nextInt();

        for(int i = 0; i < 7; i++){
            int dia = i+1;
            if(dia == numDig){
                System.out.println("A semana começou na segunda-feira, logo o número digitado corresponde à: "+diasSemana[i]);

            }

        }


    }
}
