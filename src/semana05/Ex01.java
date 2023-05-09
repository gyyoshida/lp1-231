package semana05;
import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do aquário");
        double comprimento = sc.nextDouble();

        System.out.println("Digite o altura do aquário");
        double altura = sc.nextDouble();

        System.out.println("Digite o largura do aquário");
        double largura = sc.nextDouble();

        double volume = (comprimento * altura * largura)/1000;

        System.out.println("___________________________________\n");
        System.out.println("O volume do aquário é " + volume);
        System.out.println("___________________________________\n");

            System.out.println("Digite a temperatura ambiente");
            float temperaturaAmbiente = sc.nextFloat();

            System.out.println("Digite a temperatura desejada");
            float temperaturaDesejada = sc.nextFloat();

            double potencia = volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente);

            System.out.println("_______________________________________________________________________________________\n");
            System.out.println("A potência do termostato necessária para manter a temperatura adequada será: " + potencia + "W");
            System.out.println("_______________________________________________________________________________________\n");
              
            double filtragem = volume * 3;

                System.out.println("______________________________________________________________\n");
                System.out.println("A quantidade de filtragem deve ser no mínimo: " + filtragem + "L/h");
                System.out.println("______________________________________________________________\n");

        sc.close();
    }
}