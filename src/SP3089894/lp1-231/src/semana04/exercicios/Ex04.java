package semana04.exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in); 
        String identificador;
        char primeiroDigito; 
        char segundoDigito;
        char terceiroDigito;
        char quartoDigito;
        char quintoDigito;
        char sextoDigito;
        char setimoDigito;
        
        System.out.println("Digite o seu identificador");
        identificador = sc.nextLine();

        primeiroDigito = identificador.charAt(0);
        segundoDigito = identificador.charAt(1);
        terceiroDigito = identificador.charAt(2);
        quartoDigito = identificador.charAt(3);
        quintoDigito = identificador.charAt(4);
        sextoDigito = identificador.charAt(5);
        setimoDigito = identificador.charAt(6);

        if (identificador.length() > 7 || identificador.length() < 7) {
            System.out.println("Número de caracteres insatisfatório");
        } else 

            if (primeiroDigito != 'B' || segundoDigito != 'R' || setimoDigito !='X' ) {
                System.out.println("Não cumpriu aos critérios de identificador");
            } else 

                if (terceiroDigito == '0' && quartoDigito == '0' && quintoDigito == '0' && sextoDigito == '0') {
                    System.out.println("O identificador inicia-se na contagem 0001");
                } else

                if (primeiroDigito == 'B' && segundoDigito == 'R' && setimoDigito == 'X') {
                    System.out.println("Identificador válido");
                }

        sc.close();
    }
}
