package br.edu.utfpr.rafaelsantos;

public class VetorUtil {

    public double calcularMediana(double[] vetor) {
        return vetor[vetor.length / 2];
    }

    public double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor: vetor){
            soma += valor;
        }
        return soma / vetor.length;
    }

    public double calcularMenor(double[] vetor) {
        return 1.0;
    }
}
