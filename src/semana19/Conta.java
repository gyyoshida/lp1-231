package semana19;

import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = LocalDate.now();
        this.saldo = 0;
        this.tarifa = tarifa;
        this.correntista = correntista;
        correntista.addConta(this);
    }

    public void sacar(double valor) {
        if (valor <= saldo)
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract double calcularTarifa();
}