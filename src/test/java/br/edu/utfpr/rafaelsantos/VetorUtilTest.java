package br.edu.utfpr.rafaelsantos;

import org.junit.Test;

import static org.junit.Assert.*;

public class VetorUtilTest {

    VetorUtil vetorUtil;

    public VetorUtilTest() {
        this.vetorUtil = new VetorUtil();
    }

    @Test
    public void medianaTest(){
        double[] vetor = {5.0, 6.0, 9.0};

        assertEquals(6.0, vetorUtil.calcularMediana(vetor), 0.1);
    }

    @Test
    public void medianaTest2(){
        double[] vetor = {5.0, 6.0, 1.0, 2.0, 5.0};

        assertEquals(1.0, vetorUtil.calcularMediana(vetor), 0.1);
    }

}