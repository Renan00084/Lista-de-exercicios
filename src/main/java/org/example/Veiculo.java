package org.example;

public class Veiculo {
    protected String marca, modelo;

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

    public void ligar(){
        System.out.println("Vrum vrum");

    }

    public void exibirInformacao(){
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo());

    }


}
