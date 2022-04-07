package br.com.catalisa;

import java.util.Scanner;

//Nesse desafio você terá que desenvolver um programa que leia um valor e
//apresente o número de Fibonacci correspondente a este valor lido.
//Lembre-se que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e
//cada próximo termo é a soma dos 2 anteriores a ele. No final imprima a
//mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.
public class MiniDesafio2Fibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        long numDig = leitor.nextLong();

        System.out.println("Fib("+numDig+") = "+fibo(numDig));
    }

    public static long fibo(long num){
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return fibo(num -1) + fibo(num-2);
        }
    }
}
