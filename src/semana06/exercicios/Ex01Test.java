package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Ex01Test {
    
    @Test 
    public void volumeValoresPositivos() {
        double comprimento = 20.0;
        double altura = 40.0;
        double largura = 25.0;

        double calculaVolume = Ex01Metodos.calcularVolume(comprimento, altura, largura);

        assertEquals(20.0, calculaVolume);
    }

    @Test 
    public void potenciaTemperaturaDesejadaMaior() {
        double volume = 20.0;
        double temperaturaAmbiente = 19.0;
        double temperaturaDesejada = 25.0;

        double calculaPotencia = Ex01Metodos.calcularPotencia(volume, temperaturaAmbiente, temperaturaDesejada);

        assertEquals(6.0, calculaPotencia);
    }

    @Test
    public void potenciaTemperaturaDesejadaMenor() {
        double volume = 20.0;
        double temperaturaAmbiente = 25.0;
        double temperaturaDesejada = 19.0;

        double calculaPotencia = Ex01Metodos.calcularPotencia(volume, temperaturaAmbiente, temperaturaDesejada);

        assertEquals(-6.0, calculaPotencia);
    }

    @Test 
    public void filtragemValorPositivo() {
        double volume = 20.0;

        double calculaFiltragem = Ex01Metodos.calcularFiltragem(volume);

        assertEquals(60.0, calculaFiltragem);
    }
}
