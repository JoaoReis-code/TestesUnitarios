package org.example;

public class ProgressaoGeometrica {
    public double[] CalcularPG(int numeroDeTermos, double primeiroElemento, double razao){

        if(numeroDeTermos < 1){
            throw new NegativeArraySizeException("Numero de elementos invalido");
        }else{
            double[] PG;
            PG = new double[numeroDeTermos];
            for(int i = 1; i <= numeroDeTermos; i++){
                PG[i-1] = primeiroElemento * Math.pow(razao,(i-1));
            }
            return PG;
        }

    }
}
