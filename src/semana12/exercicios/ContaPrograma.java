package semana12.exercicios;

public class ContaPrograma {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1, "Yuji");
        Conta conta2 = new Conta(2, "Yoshi");
        
        System.out.println(conta1.depositar(90));
        System.out.println(conta1.sacar(40));
        System.out.println(conta1.transferirValores(conta2, 500));

        System.out.println(conta2.depositar(100));
        System.out.println(conta2.sacar(400));
        System.out.println(conta2.transferirValores(conta1, 1000));

    }
}