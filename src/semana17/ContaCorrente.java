package semana17;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.limite = limite;
    }
}