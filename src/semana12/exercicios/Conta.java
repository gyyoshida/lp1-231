package semana12.exercicios;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;

    public Conta(int codigo, String correntista) {
        this.codigo = codigo;
        this.saldo = 0.0;
        this.correntista = correntista;
    }

    public double sacar(double valorSacado) {
        return this.saldo -= valorSacado;
    }

    public double depositar(double valorDepositado) {
        return this.saldo += valorDepositado;
    }

    public double transferirValores(Conta conta2, double valorTransferido) {
        if (this.saldo >= valorTransferido) {
            this.saldo -= valorTransferido;
            conta2.depositar(valorTransferido);

            return saldo;
        } else  {
                
                this.saldo += valorTransferido;
                conta2.sacar(valorTransferido);

                return saldo;
                }
    }
}
