package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var pa = new ProgressaoAritmetica();

        System.out.println("===============");
        System.out.println("Calculadora PA!");
        System.out.println("===============");

        System.out.print("Primeiro elemento > ");
        double primeiroElemento = Double.parseDouble(s.next());
        System.out.print("Razao > ");
        double razao = Double.parseDouble(s.next());
        System.out.print("Enesimo Termo > ");
        int enesimoTermo = Integer.parseInt(s.next());

        System.out.println("Valores respectivos da PA > " + Arrays.toString(pa.CalcularPA(enesimoTermo,primeiroElemento,razao)));
    }


}