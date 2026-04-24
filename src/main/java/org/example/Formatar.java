package org.example;

public class Formatar {

    public void imprimirMensagem(String ms){
        System.out.println("Sua mensagem e: " + ms);

    }

    public void imprimirMensagem(String ms, int a){
        for(int i = 0; i <= a; i++){
            System.out.println(i + ". " + ms);

        }

    }

    public void imprimirMensagem(String ms, double ma){
        boolean maiuscula;

        if(ma >= 1){
            maiuscula = true;

        }else{
            maiuscula = false;

        }

        if(maiuscula){
            ms = ms.toUpperCase();
            System.out.println("Sua mensagem e: " + ms);

        }else{
            ms = ms.toLowerCase();
            System.out.println("Sua mensagem e: " + ms);

        }

    }

}
