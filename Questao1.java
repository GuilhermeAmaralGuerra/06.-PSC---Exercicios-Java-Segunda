//Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int[] num = new int[9];
            int divisao = 0;

            for(int i = 0; i < num.length; i++){
                System.out.print("Digite o" + (i +1) + " a seguir: ");
                num[i] = input.nextInt();
            }

            for(int i = 0; i < num.length; i++){
                for(int j = 1; j <= num[i]; j++){
                    if(num[i] % j == 0){
                        divisao++;
                    }
                }
                if(divisao <= 2){
                    System.out.println("O número " + num[i] + " é primo");
                    System.out.println("Sua posição é " + i);
            }
            divisao = 0;
        }
        input.close();
    }
}