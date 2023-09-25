package org.example;

public class SomadorIdades {
    public double soma(double numero, String input) {
        if(input.toUpperCase().equals("PARE")){
            return numero;
        } else {
            if(input.matches("[0-9]*(\\.[0-9]+)?")){
                if(Double.parseDouble(input) >= 18){
                    numero += Double.parseDouble(input);
                }
            }
        }
        return numero;
    }
}
