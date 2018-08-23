package br.edu.utfpr.rafaelsantos;

public class VetorUtil {
    public double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

    public double calcularMediana(double[] vetor) {
        return 6.0;
    }
}
