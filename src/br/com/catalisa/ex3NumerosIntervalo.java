package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritmo que leia dois valores (x e y) representando um
//intervalo. Em seguida, leia um novo valor (z) e verifique se z pertence
//ao intervalo [x, y]
public class ex3NumerosIntervalo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo: ");
        int numX = leitor.nextInt();

        System.out.println("Digite o último número do intervalo: ");
        int numY = leitor.nextInt();

        System.out.println("Digite um número qualquer: ");
        int numZ = leitor.nextInt();

        if(numZ > numX && numZ < numY){
            System.out.println("O número "+numZ+" pertence ao intervalo");
        }
        else{
            System.out.println("O número "+numZ+" não pertence ao intervalo");
        }
    }
}
