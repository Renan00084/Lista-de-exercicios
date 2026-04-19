package org.example;

public class Livro {
    private String autor, titulo;
    private int numeroPag, atualPag;

    public String getAutor(){
        return autor;

    }

    public void setAutor(String autor){
        this.autor = autor;

    }

    public String getTitulo(){
        return titulo;

    }

    public void setTitulo(String titulo){
        this.titulo = titulo;

    }

    public int getNumeroPag(){
        return numeroPag;

    }

    public void setNumeroPag(int numeroPag){
        this.numeroPag = numeroPag;

    }

    public int getAtualPag(){
        return atualPag;

    }

    public void setAtualPag(int atualPag){
        this.atualPag = atualPag;

    }

    public void avancarPagina(){
        this.atualPag += 1;

        if(atualPag > numeroPag){
            this.atualPag = numeroPag;

        }

    }

    public void retrocederPagina(){
        this.atualPag -= 1;

        if(atualPag < 0){
            this.atualPag = 0;

        }

    }

    public void exibirStatus(){
        System.out.println("Voce esta na pagina " + getAtualPag() + " de " + getNumeroPag() + " do livro " + getTitulo() + " do autor " + getAutor());

    }

}
