package semana06.exercicios;

public class Ex02Metodos {

    public static double calcularIMC (float peso, float altura) {
        return peso / (altura * altura);
    }

    public static double calcularBaixoPeso (float peso, float altura) {
        final double MINIMO_IMC_IDEAL = 18.5;
        return peso - (MINIMO_IMC_IDEAL * (altura * altura));
    }

    public static double calcularExcessoPeso (float peso, float altura) {
        final double MAXIMO_IMC_IDEAL = 24.9;
        return peso - (MAXIMO_IMC_IDEAL * (altura * altura));
    }
}
