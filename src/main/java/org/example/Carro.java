package org.example;

public class Carro {
    private String marca, modelo;
    private int ano;
    private double velocidadeAtual;

    public String getMarca(){
        return marca;

    }

    public void setMarca(String marca){
        this.marca = marca;

    }

    public String getModelo(){
        return modelo;

    }

    public void setModelo(String modelo){
        this.modelo = modelo;

    }

    public int getAno(){
        return ano;

    }

    public void setAno(int ano){
        this.ano = ano;

    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;

    }

    public void setVelocidadeAtual(double velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;

    }

    public void acelerar(double incremento){
        this.velocidadeAtual += incremento;

        if(getVelocidadeAtual() > 100){
            this.velocidadeAtual = 100;

        }

    }

    public void exibirVelocidade(){
        System.out.println("Velocidade Atual: " + getVelocidadeAtual() + " km");

    }

    public void frear(double decremento){
        if(decremento < 0){
            System.out.println("Valor invalido, tente novamente");

        }else{
            this.velocidadeAtual -= decremento;

            if(this.velocidadeAtual < 0){
                this.velocidadeAtual = 0;

            }

        }
    }


}
