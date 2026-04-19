package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0, opcao2 = 0;

        do{
            System.out.println("--- EXERCÍCIOS ---");
            System.out.println("1. Carros");
            System.out.println("2. Livros");
            System.out.println("3. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    int velocidade, ano;
                    double acelerar, frear;
                    String marca, modelo;

                    Carro carro = new Carro();

                    System.out.println("Digite a marca do carro: ");
                    marca = scanner.nextLine();
                    carro.setMarca(marca);

                    System.out.println("Digite o modelo do carro: ");
                    modelo = scanner.nextLine();
                    carro.setModelo(modelo);

                    System.out.println("Digite o ano do carro: ");
                    ano = scanner.nextInt();
                    carro.setAno(ano);
                    scanner.nextLine(); // limpa o buffer, ou seja, o enter que não é lido pelo nextInt

                    System.out.println("Digite a velocidade atual do carro: ");
                    velocidade = scanner.nextInt();
                    carro.setVelocidadeAtual(velocidade);
                    scanner.nextLine();

                    do{
                        System.out.println("--- CARRO ---");
                        System.out.println("1. Mostrar Velocidade Atual");
                        System.out.println("2. Acelerar");
                        System.out.println("3. Frear");
                        System.out.println("4. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                carro.exibirVelocidade();

                            break;
                            case 2:
                                System.out.println("Digite o quanto voce deseja acelerar");
                                acelerar = scanner.nextInt();
                                scanner.nextLine();
                                carro.acelerar(acelerar);

                            break;
                            case 3:
                                System.out.println("Digite o quanto voce quer frear");
                                frear = scanner.nextInt();
                                scanner.nextLine();
                                carro.frear(frear);

                            break;

                            case 4:
                                System.out.println("Saindo..");

                            break;

                            default:
                                System.out.println("Numero invalido, tente novamente");

                            break;

                        }


                    }while(opcao2 != 4);

                break;

                case 2:
                    String titulo, autor;
                    int numPag, pagAtual;

                    Livro livro = new Livro();

                    System.out.println("Digite o titulo do livro: ");
                    titulo = scanner.nextLine();
                    livro.setTitulo(titulo);

                    System.out.println("Digite o autor do livro: ");
                    autor = scanner.nextLine();
                    livro.setAutor(autor);

                    System.out.println("Digite o numero de paginas do livro: ");
                    numPag = scanner.nextInt();
                    livro.setNumeroPag(numPag);
                    scanner.nextLine();

                    System.out.println("Digite a pagina atual: ");
                    pagAtual = scanner.nextInt();
                    livro.setAtualPag(pagAtual);;
                    scanner.nextLine();

                    do{
                        System.out.println("--- Livro ---");
                        System.out.println("1. Exibir status");
                        System.out.println("2. Avancar pagina");
                        System.out.println("3. Regredir pagina");
                        System.out.println("4. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                livro.exibirStatus();

                            break;

                            case 2:
                                livro.avancarPagina();

                            break;

                            case 3:
                                livro.retrocederPagina();

                            break;

                            case 4:
                                System.out.println("Saindo...");

                            break;

                            default:
                                System.out.println("Numero invalido, tente novamente");

                            break;


                        }

                    }while(opcao2 != 4);

            }

        }while(opcao != 3);

    }
}
