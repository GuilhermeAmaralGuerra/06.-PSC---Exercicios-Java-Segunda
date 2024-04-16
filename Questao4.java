//Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos 
//(número, origem e destino) e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados).
// Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
//consultar;
//efetuar reserva; e
//sair.
//Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes opções:
//por número do voo;
//por origem; e
//por destino.
//Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pessoa deseja viajar. 
//O programa deverá dar as seguintes respostas:
//reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
//voo lotado — caso não exista lugar disponível nesse voo;
//voo inexistente — caso o código do voo não exista.
//A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação de consulta ou reserva, 
//o programa volta ao menu principal.

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Nvoo = new int[2];
        String[] Origem = new String[2];
        String[] destino = new String[2];
        int[] NumAssentos = new int[2];
        int escolha, escolhaConsultar, numVoo;

        for(int i = 0; i < Nvoo.length; i++){
            System.out.print("Insira o número do " + (i + 1) + " voo: ");
            Nvoo[i] = input.nextInt();
            input.nextLine();

            System.out.print("Insira a origem do " + (i + 1) + " voo: ");
            Origem[i] = input.nextLine();

            System.out.print("Insira o destino do " + (i + 1) + " voo: ");
            destino[i] = input.nextLine();

            System.out.print("Insira o número de assentos do " + (i + 1) + " voo: ");
            NumAssentos[i] = input.nextInt();
        }

        do{
            System.out.println("1 para consultar;");
            System.out.println("2 para efetuar reserva;");
            System.out.println("3 para sair;");
            System.out.print("Digite sua escolha: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    do{
                        System.out.println("1 Para número de voo;");
                        System.out.println("2 para origem do voo;");
                        System.out.println("3 para destino do voo;");
                        System.out.println("4 para sair e voltar ao menu principal;");
                        System.out.print("Digite sua escolha a seguir: ");
                        escolhaConsultar = input.nextInt();
                        switch (escolhaConsultar) {
                            case 1:
                                System.out.println("Consulta por número de voo selecionada");
                                break;
                            case 2:
                                System.out.println("Consulta por origem do voo selecionada");
                                break;
                            case 3:
                                System.out.println("Consulta por destino do voo selecionada");
                                break;
                            case 4:
                                System.out.println("Você saiu da tela de consulta!");
                                break;
                            default:
                                System.out.println("Insira uma opção válida!");
                                break;
                        }
                    }while(escolhaConsultar != 4);    
                break;
                case 2:
                    System.out.print("Digite o número do voo onde você quer efetuar a reserva: ");
                    numVoo = input.nextInt();

                    boolean vooEncontrado = false;

                    for (int i = 0; i < Nvoo.length; i++) {
                        if (numVoo == Nvoo[i]) {
                            System.out.println("Você selecionou o voo " + Nvoo[i]);
                            if (NumAssentos[i] == 0) {
                                System.out.println("Voo lotado!");
                            } else if (NumAssentos[i] > 0) {
                                System.out.println("Reserva efetuada!");
                                NumAssentos[i]--;
                            }
                            vooEncontrado = true;
                            break;
                        }
                    }

                    if (vooEncontrado) {
                        System.out.println("Voo inexistente!");
                    }
                    break;
                case 3:
                    System.out.println("Você saiu do programa!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }while(escolha != 3);

        input.close();
    }
}
