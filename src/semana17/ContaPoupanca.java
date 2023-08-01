package semana17;

public class ContaPoupanca extends Conta {
    private Date aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.aniversario = aniversario;
    }
}