package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    public void calculaImc() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.60;
        pessoa.peso = 60;

        double calculaImc = pessoa.calcularImc();

        assertEquals(23.437499999999996, calculaImc);
    }
    
    @Test 
    public void exibeFaixa() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.60;
        pessoa.peso = 60;

        String exibeFaixa = pessoa.getFaixa();

        assertEquals("PESO NORMAL", exibeFaixa);
    }

    @Test 
    public void exibeSituacao() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.60;
        pessoa.peso = 60;

        String exibeSituacao = pessoa.getSituacao();

        assertEquals("NORMAL", exibeSituacao);
    }
}
