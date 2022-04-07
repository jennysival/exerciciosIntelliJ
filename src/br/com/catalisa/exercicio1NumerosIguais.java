package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritmo que leia dois valores (x e y)
// e informe se eles são iguais
public class exercicio1NumerosIguais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numX = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int numY = leitor.nextInt();

        if(numX == numY){
            System.out.println("Os números digitados são iguais");
        }
        else{
            System.out.println("Os números digitados são diferentes");
        }
    }
}
