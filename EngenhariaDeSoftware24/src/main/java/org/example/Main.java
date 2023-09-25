package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var s = new Scanner(System.in);
        var somador = new Somador();
        String input = "";
        double numero = 0;

        System.out.println("======================================================");
        System.out.println("                  Somador de numeros                  ");
        System.out.println("Digite um numero ou \"PARE\" para finalizar a execucao");
        System.out.println("======================================================");

        do{
            System.out.print("Digite um numero > ");
            input = s.next();
            numero = somador.soma(numero,input);
        }while(!input.toUpperCase().equals("PARE"));

        System.out.println(numero);
    }
}