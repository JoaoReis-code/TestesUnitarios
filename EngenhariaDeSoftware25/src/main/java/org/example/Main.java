package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var s = new Scanner(System.in);
        var somador = new SomadorIdades();
        String input = "";
        double numero = 0;

        System.out.println("======================================================");
        System.out.println("                  Somador de idade                    ");
        System.out.println("Digite um numero ou \"PARE\" para finalizar a execucao");
        System.out.println("======================================================");

        do{
            System.out.print("Digite uma idade > ");
            input = s.next();
            numero = somador.soma(numero,input);
        }while(!input.toUpperCase().equals("PARE"));

        System.out.println(numero);
    }
}