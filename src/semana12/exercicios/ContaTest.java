package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContaTest {
    
    @Test
    public void saca() {
        Conta conta = new Conta(1, 22000, "Cristiane");

        double saca = conta.sacar(22);

        assertEquals(21978, saca);
    }

    @Test
    public void deposita() {
        Conta conta = new Conta(1, 22000, "Cristiane");

        double deposita = conta.depositar(22);

        assertEquals(22022, deposita);
    }

    @Test 
    public void tranfereValor() {
        Conta conta = new Conta(1, 22000, "Cristiane");
        Conta conta2 = new Conta (2, 23000, "Yoshida");

        double transfere = conta.transferirValores(conta2, -20);

        assertEquals(23020, transfere);
    }
}
