package semana04.exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final double DESCONTO_CINCO = 0.95;
        final double DESCONTO_DEZ = 0.90;
        final double DESCONTO_QUINZE = 0.85;

        System.out.println("Digite o valor da sua compra");
        double valorCompra = sc.nextDouble();

            if (valorCompra < 10) {
                System.out.println("O valor final da sua compra é " + valorCompra);
            } else 
                
                if (valorCompra >= 10 && valorCompra < 100) {
                    double descontoCinco = valorCompra * DESCONTO_CINCO;
                    System.out.println("O valor final da sua compra é " + descontoCinco);
                } else 

                    if (100 <= valorCompra && valorCompra < 500) {
                        double descontoDez = valorCompra * DESCONTO_DEZ;
                        System.out.println("O valor final da sua compra é " + descontoDez);
                    } else {

                        if (valorCompra >= 500);
                            double descontoQuinze = valorCompra * DESCONTO_QUINZE;
                            System.out.println("O valor final da sua compra é " + descontoQuinze);
                        }

        sc.close();
    }
}