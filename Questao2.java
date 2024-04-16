//Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] numInter = new int[20];
        int indice1 = 0, indice2 = 0;

        for(int i = 0; i < num1.length; i++){
            System.out.println("Digite o " + (i + 1) + " Número do primeiro vetor: ");
            num1[i] = input.nextInt();
        }
        for(int i = 0; i < num2.length; i++){
            System.out.println("Digite o " + (i + 1) + " Número do segundo vetor: ");
            num2[i] = input.nextInt();
        }

        for(int i = 0; i < numInter.length; i++){
           if (i % 2 == 0) {
            numInter[i] = num1[indice1];
            indice1++;
           }else{
            numInter[i] = num2[indice2];
            indice2++;
           }
        }
        System.out.println("A intercalação dos vetores é: ");
        for(int i = 0; i < numInter.length; i ++){
            System.out.println(numInter[i]);
        }

        input.close();
    }
}
