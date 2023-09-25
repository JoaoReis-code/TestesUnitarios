package org.example;

import java.math.BigInteger;

public class Fatorial {
    public BigInteger calcularFatorial(int numeroEntrada){
        BigInteger fatorial = BigInteger.ONE;

        if(numeroEntrada >= 0){
                for(int i = 1; i <= numeroEntrada; i++){
                    fatorial = fatorial.multiply(BigInteger.valueOf(i));
                }
           return fatorial;
        }else{
            return BigInteger.ZERO ;
        }
    }
}
