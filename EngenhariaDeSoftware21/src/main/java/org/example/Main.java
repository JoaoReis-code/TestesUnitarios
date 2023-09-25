package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var s = new Scanner(System.in);
        var f = new Fatorial();


        System.out.println("=====================");
        System.out.println("Calculadora fatorial!");
        System.out.println("=====================");
        System.out.print("Digite um valor inteiro > ");

        var input = s.next();

        if(input.matches("[0-9]*")){
            System.out.println(input+"! = " + f.calcularFatorial(Integer.parseInt(input)));
        }else{
            System.out.println("Tente digitar apenas numeros naturais");
        }


    }
}