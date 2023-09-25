package org.example;

public class ProgressaoAritmetica {
    public double[] CalcularPA(int numeroDeTermos, double primeiroElemento, double razao){

        if(numeroDeTermos < 1){
            throw new NegativeArraySizeException("Numero de elementos invalido");
        }else{
            double[] PA;
            PA = new double[numeroDeTermos];
            for(int i = 1; i <= numeroDeTermos; i++){
                PA[i-1] = primeiroElemento + (i-1) * razao;
            }
            return PA;
        }

    }
}
