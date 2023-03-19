package semana04.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println ("Digite o primeiro número");
        float primeiroNumero = sc.nextFloat();

        System.out.println ("Digite o segundo número");
        float segundoNumero = sc.nextFloat();

        System.out.println ("Digite o terceiro número");
        float terceiroNumero = sc.nextFloat();

        float media = 0.0f;

        media = (primeiroNumero + segundoNumero + terceiroNumero)/3;
        
        System.out.println ("A média aritmética dos números informados é" + media);

        sc.close();
    }
}
