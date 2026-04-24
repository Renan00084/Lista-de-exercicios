package org.example;

import java.util.Scanner;

public class Moto extends Veiculo{
    private boolean temCarenagem, flag = false;

    private double aux;

    Scanner scan = new Scanner(System.in);

    public boolean getTemCarenagem(){
        return temCarenagem;

    }

    public void setTemCarenagem(boolean temCarenagem) {
        do {
            if ((temCarenagem == true) || (temCarenagem == false)) {
                this.temCarenagem = temCarenagem;
                flag = true;
                //sei que ta errado mas to com muuuuuuuuuiiiiiita preguiça de resolver, meia noite eu faço

            } else {
                System.out.println("Valor invalido, Tente novamente");
                System.out.println("Tem carenagem(?)? (1 - Sim / 0 - Nao): ");
                temCarenagem = scan.nextBoolean();
                scan.nextLine();

            }

        } while (flag == false);
    }

    @Override
    public void exibirInformacao(){
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nTem carga? ");
        if(temCarenagem){
            System.out.println("Sim");

        }else{
            System.out.println("Nao");

        }
    }
}
