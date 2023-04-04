package semana06.exercicios;

public class Ex01Metodos {
    public static double calcularVolume (double comprimento, double altura, double largura) {
        return (comprimento * altura * largura)/1000;
    }

    public static double calcularPotencia (double volume, double temperaturaAmbiente, double temperaturaDesejada) {
        return  volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }

    public static double calcularFiltragem (double volume) {
        return volume * 3;
    }
}