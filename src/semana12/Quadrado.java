package semana12;

public class Quadrado {
    public double lado;

    //método construtor (mais indicado)
    public Quadrado(double lado ) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
    
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
