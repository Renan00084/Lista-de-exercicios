package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0, opcao2 = 0, opcao3;

        do{
            System.out.println("--- EXERCÍCIOS ---");
            System.out.println("1. Carro");
            System.out.println("2. Livro");
            System.out.println("3. Aluno");
            System.out.println("4. Conta Bancaria");
            System.out.println("5. Produto");
            System.out.println("6. Pessoa");
            System.out.println("7. Animais");
            System.out.println("8. Veiculos");
            System.out.println("9. Colaboradores");
            System.out.println("10. Sair");

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
                    livro.setAtualPag(pagAtual);
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

                break;

                case 3:
                    String nome, matricula;
                    double nota1, nota2;

                    Aluno aluno = new Aluno();

                    System.out.println("Digite o nome do aluno: ");
                    nome = scanner.nextLine();
                    aluno.setNome(nome);

                    System.out.println("Digite a matriculo do aluno: ");
                    matricula = scanner.nextLine();
                    aluno.setMatricula(matricula);

                    System.out.println("Digite a nota 1: ");
                    nota1 = scanner.nextInt();
                    aluno.setNota1(nota1);
                    scanner.nextLine();

                    System.out.println("Digite a nota 2: ");
                    nota2 = scanner.nextInt();
                    aluno.setNota2(nota2);
                    scanner.nextLine();

                    do{
                        System.out.println("--- ALUNO ---");
                        System.out.println("1. Calcular media");
                        System.out.println("2. Verificar aprovacao");
                        System.out.println("3. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                aluno.calcularMedia();

                            break;

                            case 2:
                                aluno.verificarAprovacao();

                            break;

                            case 3:
                                System.out.println("Saindo...");

                            break;

                            default:
                                System.out.println("Numero invalido. Tenta novamente");

                            break;

                        }

                    }while (opcao2 != 3);
                break;

                case 4:
                    int numeroConta;
                    String titular;
                    double saldo, valor;

                    ContaBancaria c1 = new ContaBancaria();

                    System.out.println("Digite o titular da conta: ");
                    titular = scanner.nextLine();
                    c1.setTitular(titular);

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextInt();
                    c1.setNumeroConta(numeroConta);
                    scanner.nextLine();

                    System.out.println("Digite o saldo atual da conta: ");
                    saldo = scanner.nextInt();
                    c1.setSaldo(saldo);
                    scanner.nextLine();

                    do{
                        System.out.println("--- CONTA BANCARIA ---");
                        System.out.println("1. Depositar");
                        System.out.println("2. Sacar");
                        System.out.println("3. Exibir saldo");
                        System.out.println("4. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                System.out.println("Digite o valor a ser depositado");
                                valor = scanner.nextInt();
                                c1.depositar(valor);
                                scanner.nextLine();
                            break;

                            case 2:
                                System.out.println("Digite o valor a ser retirado");
                                valor = scanner.nextInt();
                                c1.sacar(valor);
                                scanner.nextLine();
                            break;

                            case 3:
                                c1.exibirSaldo();
                            break;

                            case 4:
                                System.out.println("Saindo...");
                            break;

                            case 5:
                                System.out.println("Numero invalido. Tente novamente");
                            break;
                        }

                    }while(opcao2 != 4);
                break;

                case 5:
                    int qtdProduto, qtd;
                    String nomep;
                    double preco;

                    Produto p1 = new Produto ();

                    System.out.println("Digite o nome do produto: ");
                    nomep = scanner.nextLine();
                    p1.setNome(nomep);

                    System.out.println("Digite o preco do produto: ");
                    preco = scanner.nextInt();
                    p1.setPreco(preco);
                    scanner.nextLine();

                    System.out.println("Digite a quantidade de " + p1.getNome() + " no estoque atual: ");
                    qtdProduto = scanner.nextInt();
                    p1.setQtdProduto(qtdProduto);
                    scanner.nextLine();

                    do{
                        System.out.println("--- PRODUTO ---");
                        System.out.println("1. Exibir quantidade no estoque");
                        System.out.println("2. Adicionar ao estoque");
                        System.out.println("3. Remover do estoque");
                        System.out.println("4. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao2){
                            case 1:
                                p1.exibirQtd();

                            break;

                            case 2:
                                System.out.println("Digite a quantidade a ser adiconada ao estoque: ");
                                qtd = scanner.nextInt();
                                p1.adicionarEstoque(qtd);
                                scanner.nextLine();

                            break;

                            case 3:
                                System.out.println("Digite a quantidade a ser removida do estoque: ");
                                qtd = scanner.nextInt();
                                p1.removerEstoque(qtd);
                                scanner.nextLine();

                            break;

                            case 4:
                                System.out.println("Saindo...");

                            break;

                            default:
                                System.out.println("Numero invalido. Tente novamente");

                            break;
                        }

                    }while(opcao2 != 4);
                break;

                case 6:
                    int idade;
                    String nomePessoa;

                    Pessoa pessoa = new Pessoa();

                    System.out.println("Digite o nome da pessoa: ");
                    nomePessoa = scanner.nextLine();
                    pessoa.setNome(nomePessoa);

                    System.out.println("Digite a idade da pessoa: ");
                    idade = scanner.nextInt();
                    pessoa.setIdade(idade);
                    scanner.nextLine();

                    do{
                        System.out.println("--- PESSOA ---");
                        System.out.println("1. Exibir informacoes");
                        System.out.println("2. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                pessoa.exibirInformacoes();

                            break;

                            case 2:
                                System.out.println("Saindo...");

                            break;

                            default:
                                System.out.println("Comando nao identificado");

                            break;

                        }

                    }while (opcao2 != 2);
                break;

                case 7:
                    do{
                        double peso;
                        String nomeAnimal, raca;

                        System.out.println("--- ANIMAIS ---");
                        System.out.println("1. Cachorro");
                        System.out.println("2. Gato");
                        System.out.println("3. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                Cachorro cachorro = new Cachorro();

                                System.out.println("Digite o nome do cachorro: ");
                                nomeAnimal = scanner.nextLine();
                                cachorro.setNome(nomeAnimal);

                                System.out.println("Digite o nome da raca de " + cachorro.getNome() + ": ");
                                raca = scanner.nextLine();
                                cachorro.setRaca(raca);

                                System.out.println("Digite o peso do cachorro: ");
                                peso = scanner.nextInt();
                                cachorro.setPeso(peso);
                                scanner.nextLine();

                                do{
                                    System.out.println("--- CACHORRO ---");
                                    System.out.println("1. Exibir informacoes");
                                    System.out.println("2. Som do animal");
                                    System.out.println("3. Sair");

                                    opcao3 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch(opcao3){
                                        case 1:
                                            cachorro.exibirInformacoes();

                                        break;

                                        case 2:
                                            cachorro.emitirSom();

                                        break;

                                        case 3:
                                            System.out.println("Saindo...");

                                        break;

                                        default:
                                            System.out.println("Comando invalido, tente novamente");

                                        break;
                                    }

                                }while (opcao3 != 3);

                            break;

                            case 2:
                                Gato gato = new Gato();

                                System.out.println("Digite o nome do gato: ");
                                nomeAnimal = scanner.nextLine();
                                gato.setNome(nomeAnimal);

                                System.out.println("Digite o peso do gato: ");
                                peso = scanner.nextInt();
                                gato.setPeso(peso);
                                scanner.nextLine();

                                do {
                                    System.out.println("--- GATO ---");
                                    System.out.println("1. Exibir informacoes");
                                    System.out.println("2. Som do animal");
                                    System.out.println("3. Sair");

                                    opcao3 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (opcao3) {
                                        case 1:
                                            gato.exibirInformacoes();

                                            break;

                                        case 2:
                                            gato.emitirSom();

                                            break;

                                        case 3:
                                            System.out.println("Saindo...");

                                            break;

                                        default:
                                            System.out.println("Comando invalido, tente novamente");

                                            break;
                                    }
                                }while (opcao3 != 3);
                            break;

                            case 3:
                                System.out.println("Saindo...");

                            break;

                            default:
                                System.out.println("Valor invalido, tente novamente");

                            break;
                        }

                    }while (opcao2 != 3);
                break;

                case 8:
                    do{
                        double capacidadeCarga;
                        String modeloV, marcaV;
                        boolean temCarenagem;

                        System.out.println("--- VEICULOS ---");
                        System.out.println("1. Moto");
                        System.out.println("2. Caminhao");
                        System.out.println("3. Sair");

                        opcao2 = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcao2){
                            case 1:
                                Moto moto = new Moto();

                                System.out.println("Digite a marca da moto: ");
                                marcaV = scanner.nextLine();
                                moto.setMarca(marcaV);

                                System.out.println("Digite o modelo da moto: ");
                                modeloV = scanner.nextLine();
                                moto.setModelo(modeloV);

                                System.out.println("Tem carenagem(?)? (1 - Sim / 0 - Nao): ");
                                temCarenagem = scanner.hasNext();
                                moto.setTemCarenagem(temCarenagem);
                                scanner.nextLine();

                                do{
                                    System.out.println("--- MOTO ---");
                                    System.out.println("1. Exibir informacoes");
                                    System.out.println("2. Ligar");
                                    System.out.println("3. Sair");

                                    opcao3 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch(opcao3){
                                        case 1:
                                            moto.exibirInformacao();

                                            break;

                                        case 2:
                                            moto.ligar();

                                            break;

                                        case 3:
                                            System.out.println("Saindo...");

                                            break;

                                        default:
                                            System.out.println("Comando invalido, tente novamente");

                                            break;
                                    }

                                }while (opcao3 != 3);

                                break;

                            case 2:
                                Caminhao caminhao = new Caminhao();

                                System.out.println("Digite a marca: ");
                                marcaV = scanner.nextLine();
                                caminhao.setMarca(marcaV);

                                System.out.println("Digite o modelo: ");
                                modeloV = scanner.nextLine();
                                caminhao.setModelo(modeloV);

                                System.out.println("Digite a capacidade de carga: ");
                                capacidadeCarga = scanner.nextDouble();
                                caminhao.setCapacidadeCarga(capacidadeCarga);

                                do {
                                    System.out.println("--- CAMINHAO ---");
                                    System.out.println("1. Exibir informacoes");
                                    System.out.println("2. Ligar");
                                    System.out.println("3. Sair");

                                    opcao3 = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (opcao3) {
                                        case 1:
                                            caminhao.exibirInformacao();

                                            break;

                                        case 2:
                                            caminhao.ligar();

                                            break;

                                        case 3:
                                            System.out.println("Saindo...");

                                            break;

                                        default:
                                            System.out.println("Comando invalido, tente novamente");

                                            break;
                                    }
                                }while (opcao3 != 3);
                                break;

                            case 3:
                                System.out.println("Saindo...");

                                break;

                            default:
                                System.out.println("Valor invalido, tente novamente");

                                break;
                        }

                    }while (opcao2 != 3);
                break;

                case 9:

            }

        }while(opcao != 10);

    }
}
