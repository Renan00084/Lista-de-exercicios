package org.example;

import java.util.Scanner;

public class Produto {
    private int qtdProduto;
    private String nome;
    private double preco;
    private boolean flag = false;
    Scanner scan = new Scanner (System.in);

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public int getQtdProduto(){
        return qtdProduto;

    }

    public void setQtdProduto(int qtdProduto){
        do{
            this.flag = false;
            if(qtdProduto > 0){
                this.qtdProduto = qtdProduto;
                flag = true;

            }else{
                System.out.println("Quantidade invalida, Tente novamente");
                System.out.println("Digite a quantidade de " + getNome() + " no estoque atual: ");
                qtdProduto = scan.nextInt();
                scan.nextLine();

            }

        }while (flag == false);

    }

    public double getPreco(){
        return preco;

    }

    public void setPreco(double preco){
        do{
            this.flag = false;
            if(preco > 0){
                this.preco = preco;
                flag = true;

            }else{
                System.out.println("Preco invalido, Tente novamente");
                System.out.println("Digite o preco do produto: ");
                preco = scan.nextInt();
                scan.nextLine();

            }

        }while (flag == false);

    }

    public void adicionarEstoque(int qtd){
        if(qtd < 0){
            System.out.println("Quantidade invalida, tente novamente");

        }else{
            this.qtdProduto += qtd;

        }

    }

    public void removerEstoque(int qtd){
        if(qtd < 0){
            System.out.println("Valor invalido, tente novamente");

        }else{
            this.qtdProduto -= qtd;

            if(this.qtdProduto < 0){
                this.qtdProduto = 0;

            }

        }

    }

    public void exibirQtd(){
        System.out.println("No estoque ha " + getQtdProduto() + " de " + getNome());

    }

}
