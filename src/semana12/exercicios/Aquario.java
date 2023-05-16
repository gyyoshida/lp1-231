package semana12.exercicios;

public class Aquario {
    public double comprimento;
    public double largura;
    public double altura;

    public Aquario (double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public Aquario (double valor) {
        this.comprimento = valor;
        this.largura = valor;
        this.altura = valor;
    }

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
