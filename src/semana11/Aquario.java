package semana11;

public class Aquario {
    public double comprimento;
    public double largura;
    public double altura;
    public double temperaturaDesejada;
    public double temperaturaAmbiente;

    public double calcularVolume() {
        return (comprimento * altura * largura)/1000;
    }

    public double calcularPotenciaDoTermostato() {
        return calcularVolume() * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro() {
        return calcularVolume() * 3;
    }
}
