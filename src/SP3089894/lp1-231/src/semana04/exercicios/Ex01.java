package semana04.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println ("Digite um número inteiro");
        short numeroInformado = sc.nextShort();

        int antecessor = numeroInformado - 1;
        int sucessor = numeroInformado + 1;

        System.out.println ("Os números que antecede e sucede o número informado (" + numeroInformado + ") são, respectivamente: " + antecessor + " e " + sucessor);

        sc.close();
    }
}
