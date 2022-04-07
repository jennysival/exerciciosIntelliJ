package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o
//resultado da multiplicação de x por y
public class ex4Multiplicacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numX = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int numY = leitor.nextInt();

        int multi = numX*numY;

        System.out.println(numX+" x "+numY+" = "+multi);
    }
}
