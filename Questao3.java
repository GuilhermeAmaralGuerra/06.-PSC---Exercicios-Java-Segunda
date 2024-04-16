//Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. 
//O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter, 
//no máximo, oito posições, que não poderão ser completamente utilizadas.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Inserir = new int[8];
        int[] positivo = new int[8];
        int[] negativo = new int[8];
        int indicePositivo = 0, indiceNegativo = 0;

        for(int i = 0; i < Inserir.length; i++){
            System.out.print("Insira o número " + (i + 1) + " a seguir: ");
            Inserir[i] = input.nextInt();
        }

        for(int i = 0; i < Inserir.length; i++){
            if (Inserir[i] >= 0) {
                positivo[indicePositivo] = Inserir[i]; 
                indicePositivo++;
            }else{
                negativo[indiceNegativo] = Inserir[i]; 
                indiceNegativo++;
            }
        }

        if (indicePositivo == 8) {
            System.out.println("Insira números negativos!");
        } else if (indiceNegativo == 8) {
            System.out.println("Insira números positivos!");
        } else{
            System.out.println("Os números positivos são: ");
            for(int i = 0; i < indicePositivo; i++){
                System.out.print(positivo[i] + " ");
            }
            System.out.println();
            System.out.println("Os números negativos são: ");
            for(int i = 0; i < indiceNegativo; i++){
                System.out.print(negativo[i] + " ");
            }
        }

        input.close();
    }
}
