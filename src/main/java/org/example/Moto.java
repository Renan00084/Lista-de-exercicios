package org.example;

import java.util.Scanner;

public class Moto extends Veiculo{
    private boolean temCarenagem, flag = false;

    Scanner scan = new Scanner(System.in);

    public boolean getTemCarenagem(){
        return temCarenagem;

    }

    public void setTemCarenagem(boolean temCarenagem) {
        do {
            if ((temCarenagem == true) || (temCarenagem == false)) {
                this.temCarenagem = temCarenagem;
                flag = true;

            } else {
                System.out.println("Valor invalido, Tente novamente");
                System.out.println("Tem carenagem(?)? (1 - Sim / 0 - Nao): ");
                temCarenagem = scan.nextBoolean();
                scan.nextLine();

            }

        } while (flag == false);
    }
}
