package semana10;

public class Circulo {
    public double raio;

    // Math.pow para potenciação
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
