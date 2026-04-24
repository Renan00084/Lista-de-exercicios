package org.example;

public class Calculadora {
    private int aux;

    private double aux2;

    public int multiplicar(int a, int b){
        aux = a * b;
        return aux;

    }

    public int multiplicar(int a, int b, int c){
        aux = a * b * c;
        return aux;

    }

    public double multiplicar(double d, double e){
        aux2 = d * e;
        return aux2;

    }

}
