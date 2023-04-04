package semana06.exercicios;
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

        double calculaIMC = Ex02Metodos.calcularIMC(peso, altura);

        if (calculaIMC < MINIMO_IMC_IDEAL) {
            double calculaBaixoPeso = Ex02Metodos.calcularBaixoPeso(peso, altura);
            System.out.println("Você está abaixo do peso normal (" + peso + "Kg), você precisa ganhar " + -calculaBaixoPeso + "Kg");
        } else

            if (calculaIMC >= MINIMO_IMC_IDEAL && calculaIMC < MAXIMO_IMC_IDEAL) {
                System.out.println("Você está com o peso normal, seu imc (" + calculaIMC + ") está entre 18.5 e 24.9");
            } else 

                if (calculaIMC >= 25 && calculaIMC < 29.9) {
                    double calculaExcessoPeso = Ex02Metodos.calcularExcessoPeso(peso, altura);
                    System.out.println("Você está com excesso de peso (" + peso + "Kg), você precisa perder " + calculaExcessoPeso + "Kg");
                } else 

                    if (calculaIMC >= 30 && calculaIMC < 34.9) {
                        double calculaExcessoPeso = Ex02Metodos.calcularExcessoPeso(peso, altura);
                        System.out.println("Você está com obesidade classe 1 (" + peso + "Kg), você precisa perder " + calculaExcessoPeso + "Kg");
                    } else 

                        if (calculaIMC >= 35 && calculaIMC < 39.9) {
                            double calculaExcessoPeso = Ex02Metodos.calcularExcessoPeso(peso, altura);
                            System.out.println("Você está com obesidade classe 2 (" + peso + "Kg), você precisa perder " + calculaExcessoPeso + "Kg");
                        } else 

                            if (calculaIMC >= 40) {
                                double calculaExcessoPeso = Ex02Metodos.calcularExcessoPeso(peso, altura);
                                System.out.println("Você está com obesidade classe 3 (" + peso + "Kg), você precisa perder " + calculaExcessoPeso + "Kg");
                            }

        sc.close();
    }
}
