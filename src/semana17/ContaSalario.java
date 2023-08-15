package semana17;

import java.time.LocalDate;

public class ContaSalario extends Conta {
    private Empresa empresa;

    public ContaSalario(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.empresa = empresa;
    }
}