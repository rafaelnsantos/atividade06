package br.edu.utfpr.rafaelsantos;

import org.junit.Test;

import static org.junit.Assert.*;

public class VetorUtilTest {

    VetorUtil vetorUtil;

    public VetorUtilTest() {
        this.vetorUtil = new VetorUtil();
    }

    @Test
    public void medianaTest() {
        double[] vetor = {5.0, 6.0, 9.0};

        assertEquals(6.0, vetorUtil.calcularMediana(vetor), 0.1);
    }

    @Test
    public void medianaTest2() {
        double[] vetor = {5.0, 6.0, 1.0, 2.0, 5.0};

        assertEquals(1.0, vetorUtil.calcularMediana(vetor), 0.1);
    }

    @Test
    public void mediaTest() {
        double[] vetor = {8.0, 9.0, 10.0};

        assertEquals(9.0, vetorUtil.calcularMedia(vetor), 0.1);
    }

    @Test
    public void mediaTest2() {
        double[] vetor = {8.0, 8.0, 8.0};

        assertEquals(8.0, vetorUtil.calcularMedia(vetor), 0.1);
    }

    @Test
    public void menorValorTest() {
        double[] vetor = {8.0, 5.0, 3.0, 1.0};

        assertEquals(1.0, vetorUtil.calcularMenor(vetor), 0.1);
    }

    @Test
    public void menorValorTest2() {
        double[] vetor = {8.0, 0.2, 3.0, 1.0, -5.0};

        assertEquals(-5.0, vetorUtil.calcularMenor(vetor), 0.1);
    }

}