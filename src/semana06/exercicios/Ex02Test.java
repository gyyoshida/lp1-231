package semana06.exercicios;

public class Ex02Test {
    
    @Test 
    public void IMCValoresPositivos() {
        float peso = 55.0;
        float altura = 1.65;

        double calculaIMC = Ex02Metodos.calcularIMC(peso, altura);

        assertEquals(20.2020206451416, calculaIMC);
    }

    @Test 
    public void baixoPesoValoresPositivos() {
        float peso = 45.0;
        float altura = 1.65;

        double calculaBaixoPeso = Ex02Metodos.calcularBaixoPeso(peso, altura);

        assertEquals(5.366247177124023, calculaBaixoPeso);
    }

    @Test 
    public void excessoPesoValoresPositivos() {
        float peso = 70.0;
        float altura = 1.65;

        double calculaExcessoPeso = Ex02Metodos.calcularExcessoPeso(peso, altura);

        assertequals(2.2097537994384737, calculaExcessoPeso);
    }
}
