package semana14.exercicios;

public class ContaPrograma {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1, "Guilherme");
        Conta conta2 = new Conta(2, "Yoshida");
        
        System.out.println(conta1.correntista + " depositou 90 | Saldo da conta:" + conta1.depositar(90));
        System.out.println(conta1.correntista + " sacou 40 | Saldo da conta: " + conta1.sacar(40));
        System.out.println(conta1.correntista + " transferiu 500 para " + conta2.correntista + " | Saldo da conta: " + conta1.transferirValores(500));
    }
}
