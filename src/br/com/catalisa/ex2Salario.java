package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritmo que lê o salário de um funcionário, reajusta o
//salário em 7% e mostra o resultado
public class ex2Salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        float salario = leitor.nextFloat();

        float reajuste = ((salario*7)/100)+salario;

        System.out.println("Seu novo salário com reajuste de 7% será: "+reajuste);
    }
}
