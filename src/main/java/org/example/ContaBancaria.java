package org.example;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public int getNumeroConta(){
        return numeroConta;

    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;

    }

    public double getSaldo(){
        return saldo;

    }

    public void setSaldo(double saldo){
        this.saldo = saldo;

    }

    public String getTitular(){
        return titular;

    }

    public void setTitular(String titular){
        this.titular = titular;

    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");

        }else{
            System.out.println("Valor negativo, deposito nao realizado");

        }

    }

    public void sacar(double valor){
        if((valor > 0) && (valor <= saldo)){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");

        }else{
            System.out.println("Valor de saque invalido");

        }
    }

    public void exibirSaldo(){
        System.out.println("O seu saldo atual e de: " + getSaldo());

    }
}
