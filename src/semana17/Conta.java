package semana17;

import java.sql.Date;

public class Conta {
    protected int numero;
    protected LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    protected Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
    }

    public void sacar(double valor) {
        if (valor)
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double calcularTarifa() {
        return tarifa;
    }
    
}