package semana17;

import java.sql.Date;
import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private Date aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, Date aniversario) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.aniversario = aniversario;
    }
}