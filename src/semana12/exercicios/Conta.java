package semana12.exercicios;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;

    public Conta(int codigo, double saldo, String correntista) {
        this.codigo = codigo;
        this.saldo = 0.0;
        this.correntista = correntista;
    }

    public double sacar(double valorSacado) {
        return saldo -= valorSacado;
    }

    public double depositar(double valorDepositado) {
        return saldo += valorDepositado;
    }

    public double transferirValores(Conta conta2, double valorTransferido) {
        if (saldo >= valorTransferido) {
            saldo -= valorTransferido;
            conta2.depositar(valorTransferido);

            return saldo;

        } else {
            saldo += valorTransferido;
            conta2.sacar(valorTransferido);
            
            return saldo;
            }
    }


}
