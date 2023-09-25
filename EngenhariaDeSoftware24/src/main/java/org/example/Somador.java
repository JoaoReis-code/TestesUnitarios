package org.example;

public class Somador {
    public double soma(double numero, String input) {
        if(input.toUpperCase().equals("PARE")){
            return numero;
        } else {
            if(input.matches("-?[0-9]*(\\.[0-9]+)?")){
                numero += Double.parseDouble(input);
            }
        }
        return numero;
    }
}
