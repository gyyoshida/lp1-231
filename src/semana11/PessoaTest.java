package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    public void calculaImc() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 160;
        pessoa.peso = 60;

        double calculaImc = pessoa.calcularImc();

        assertEquals(23.4, calculaImc);
    }
}
