package semana06.exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do aquário");
        double comprimeto = sc.nextDouble();

        System.out.println("Digite o altura do aquário");
        double altura = sc.nextDouble();

        System.out.println("Digite o largura do aquário");
        double largura = sc.nextDouble();

        double calculaVolume = Ex01Metodos.calcularVolume(comprimeto, altura, largura);

        System.out.println("___________________________________\n");
        System.out.println("O volume do aquário é " + calculaVolume);
        System.out.println("___________________________________\n");

            System.out.println("Digite o volume calculado");
            float volume = sc.nextFloat();

            System.out.println("Digite a temperatura ambiente");
            float temperaturaAmbiente = sc.nextFloat();

            System.out.println("Digite a temperatura desejada");
            float temperaturaDesejada = sc.nextFloat();

            double calculaPotencia = Ex01Metodos.calcularPotencia(volume, temperaturaAmbiente, temperaturaDesejada);

            System.out.println("_______________________________________________________________________________________\n");
            System.out.println("A potência do termostato necessária para manter a temperatura adequada será: " + calculaPotencia + "W");
            System.out.println("_______________________________________________________________________________________\n");
              
            double calculaFiltragem = Ex01Metodos.calcularFiltragem(volume);

                System.out.println("______________________________________________________________\n");
                System.out.println("A quantidade de filtragem deve ser no mínimo: " + calculaFiltragem + "L/h");
                System.out.println("______________________________________________________________\n");

        sc.close();
    }
}
