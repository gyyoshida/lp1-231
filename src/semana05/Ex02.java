package semana05;
import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        final double MINIMO_IMC_IDEAL = 18.5;
        final double MAXIMO_IMC_IDEAL = 24.9;

        System.out.println("Digite o seu peso em quilos");
        float peso = sc.nextFloat();

        System.out.println("Digite a sua altura em metros");
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < MINIMO_IMC_IDEAL) {
            double baixoPeso = peso - (MINIMO_IMC_IDEAL * (altura * altura));
            System.out.println("Você está abaixo do peso normal (" + peso + "), você precisa ganhar " + baixoPeso);
        } else

            if (imc >= MINIMO_IMC_IDEAL && imc < MAXIMO_IMC_IDEAL) {
                System.out.println("Você está com o peso normal, seu imc (" + imc + ") está entre 18.5 e 24.9");
            } else 

                if (imc >= 25 && imc < 29.9) {
                    double excessoPeso = peso - (MAXIMO_IMC_IDEAL * (altura * altura));
                    System.out.println("Você está com excesso de peso (" + peso + "), você precisa perder " + excessoPeso);
                } else 

                    if (imc >= 30 && imc < 34.9) {
                        double excessoPeso = peso - (MAXIMO_IMC_IDEAL * (altura * altura));
                        System.out.println("Você está com obesidade classe 1 (" + peso + "), você precisa perder " + excessoPeso);
                    } else 

                        if (imc >= 35 && imc < 39.9) {
                            double excessoPeso = peso - (MAXIMO_IMC_IDEAL * (altura * altura));
                            System.out.println("Você está com obesidade classe 2 (" + peso + "), você precisa perder " + excessoPeso);
                        } else 

                            if (imc >= 40) {
                                double excessoPeso = peso - (MAXIMO_IMC_IDEAL * (altura * altura));
                                System.out.println("Você está com obesidade classe 3 (" + peso + "), você precisa perder " + excessoPeso);
                            }

        sc.close();
    }
}
