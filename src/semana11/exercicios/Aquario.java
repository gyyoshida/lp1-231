package semana11.exercicios;

public class Aquario {
    public double comprimento;
    public double largura;
    public double altura;

    public double calcularVolume() {
        return (comprimento * altura * largura)/1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro() {
        return calcularVolume() * 3;
    }
}
