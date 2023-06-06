package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        //quadrado.lado = 5.6;
        quadrado.setLado(-5.6);

        System.out.println(quadrado.getLado());

        double area = quadrado.calcularArea();
        System.out.println(area);

        double perimetro = quadrado.calcularPerimetro();
        System.out.println(perimetro);

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());

        Circulo c1 = new Circulo(10.0);

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
    }
}
