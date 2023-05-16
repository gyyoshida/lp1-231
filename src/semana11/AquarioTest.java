package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void calculaVolume() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;
        aquario.altura = 40.0;

        double calculaVolume = aquario.calcularVolume();

        assertEquals(200, calculaVolume);
    }

    @Test
    public void calculaPotenciaDoTermostatoParaAquecer() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;
        aquario.altura = 40.0;
        aquario.temperaturaDesejada = 24;
        aquario.temperaturaAmbiente = 22.0;

        double calculaPotencia = aquario.calcularPotenciaDoTermostato();

        assertEquals(20, calculaPotencia);
    }
    
    @Test
    public void calculaPotenciaDoTermostatoParaEsfriar() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;
        aquario.altura = 40.0;
        aquario.temperaturaDesejada = 23;
        aquario.temperaturaAmbiente = 26.0;

        double calculaPotencia = aquario.calcularPotenciaDoTermostato();

        assertEquals(-30, calculaPotencia);
    }

    @Test
    public void calculaQuantidadeLitrosFiltro() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.0;
        aquario.largura = 50.0;
        aquario.altura = 40.0;

        double calculaFiltragem = aquario.calcularQuantidadeLitrosFiltro();

        assertEquals(600, calculaFiltragem);
    }
}
