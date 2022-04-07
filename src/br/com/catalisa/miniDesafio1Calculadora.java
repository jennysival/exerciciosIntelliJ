package br.com.catalisa;

import java.util.Scanner;

//Nesse desafio você terá que desenvolver uma calculadora que vai:
//receber 2 números;
//exibir um menu de operações matemáticas;
//realizar calculo matemático e exibir o resultado
//opção de sair do programa
public class miniDesafio1Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        float num1 = leitor.nextInt();

        System.out.println("Digite o 2º número: ");
        float num2 = leitor.nextInt();

        System.out.println("Escolha qual cálculo deseja realizar:");
        System.out.println("1. Adição(+)");
        System.out.println("2. Subtração(-)");
        System.out.println("3. Multiplicação(x)");
        System.out.println("4. Divisão");


    }

    public static void adicao(float num1, float num2){
        float soma = num1+num2;
        System.out.println(num1+" + "+num2+" = "+soma);
    }

}
