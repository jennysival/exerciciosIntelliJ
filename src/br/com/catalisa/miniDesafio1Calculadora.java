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
        float numDig1 = leitor.nextInt();

        System.out.println("Digite o 2º número: ");
        float numDig2 = leitor.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("Escolha qual cálculo deseja realizar:");
        System.out.println("1. Adição(+)");
        System.out.println("2. Subtração(-)");
        System.out.println("3. Multiplicação(x)");
        System.out.println("4. Divisão");
        System.out.println("-------------------------------------");
        System.out.println("Digite apenas o nº da opção escolhida:");
        int opc = leitor.nextInt();

        if(opc == 1){
            adicao(numDig1, numDig2);
        }
        else if(opc == 2){
            subtracao(numDig1, numDig2);
        }
        else if(opc == 3){
            multiplicacao(numDig1, numDig2);
        }
        else if (opc ==4){
            divisao(numDig1, numDig2);
        }
        else{
            System.out.println("Seleção inválida");
        }



    }

    public static void adicao(float num1, float num2){
        float soma = num1+num2;
        System.out.println(num1+" + "+num2+" = "+soma);

        botaoSair();
    }

    public static void subtracao(float num1, float num2){
        float subt = num1-num2;
        System.out.println(num1+" - "+num2+" = "+subt);

        botaoSair();
    }

    public static void multiplicacao(float num1, float num2){
        float multi = num1*num2;
        System.out.println(num1+" x "+num2+" = "+multi);

        botaoSair();
    }

    public static void divisao(float num1, float num2){
        float divi = num1/num2;
        System.out.println(num1+" / "+num2+" = "+divi);

        botaoSair();
    }

    public static void botaoSair(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite [1] para sair; ");
        int opc = leitor.nextInt();

        if(opc == 1){
            System.exit(0);
        }
        else{
            System.out.println("Seleção inválida. Tente novamente");
            botaoSair();
        }

    }

}
