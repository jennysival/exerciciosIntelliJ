package br.com.catalisa;
//Escreva um algoritmo que calcule a soma dos números de 1 a 15.
public class ex6Soma {
    public static void main(String[] args) {
        int numeros[] = new int[16];

        for(int i = 0; i < 16; i++){
            if(i >= 0 && i <= 16){
                numeros[i] = i;
            }
        }

        int soma = 0;

        for(int i = 0; i < 16; i++){
            soma = soma+numeros[i];
        }
        System.out.println("O resultado da soma de 1 até 15 é = "+soma);
    }
}
