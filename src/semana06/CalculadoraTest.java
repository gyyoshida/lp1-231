package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
        @Test
        public void somaDoisNumerosPositivos() {
            // AAA
            // Arrange
            double n1 = 10.0;
            double n2 = 2.0;

            // Act
            double soma = Calculadora.somar(n1, n2);

            // Assert
            assertEquals(12.0, soma);
        }

        @Test
        public void somaUmNumeroPositivoEUmNegativo() {
            double n1 = 10.0;
            double n2 = -2.0;

            double soma = Calculadora.somar(n1, n2);

            assertEquals(8.0, soma);

        }

        @Test
        public void somaDoisNumerosNegativos() {
            double n1 = -10.0;
            double n2 = -2.0;

            double soma = Calculadora.somar(n1, n2);

            assertEquals(-12.0, soma);
        }

            @Test
            public void subtraiDoisNumerosPositivos() {
                double n1 = 10.0;
                double n2 = 2.0;

                double subtrai = Calculadora.subtrair(n1, n2);

                assertEquals(8.0, subtrai);
            }

            @Test
            public void subtraiUmNumeroPositivoEUmNegativo() {
                double n1 = 10.0;
                double n2 = -2.0;

                double subtrai = Calculadora.subtrair(n1, n2);

                assertEquals(12.0, subtrai);
            }

            @Test
            public void subtraiDoisNumerosNegativos() {
                double n1 = -10.0;
                double n2 = -2.0;

                double subtrai = Calculadora.subtrair(n1, n2);

                assertEquals(-8.0, subtrai);
            }

                @Test
                public void multiplicaDoisNumerosPositivos() {
                    double n1 = 10.0;
                    double n2 = 2.0;

                    double multiplica = Calculadora.multiplicar(n1, n2);

                    assertEquals(20.0, multiplica);
                }

                @Test
                public void multiplicaUmNumeroPositivoEUmNegativo() {
                    double n1 = 10.0;
                    double n2 = -2.0;

                    double multiplica = Calculadora.multiplicar(n1, n2);

                    assertEquals(-20.0, multiplica);
                }

                @Test
                public void multiplicaDoisNumerosNegativos() {
                    double n1 = -10.0;
                    double n2 = -2.0;

                    double multiplica = Calculadora.multiplicar(n1, n2);

                    assertEquals(20.0, multiplica);
                }

                    @Test
                    public void divideDoisNumerosPositivos() {
                        double n1 = 10.0;
                        double n2 = 2.0;

                        double divide = Calculadora.dividir(n1, n2);

                        assertEquals(5.0, divide);
                    }

                    @Test
                    public void divideUmNumeroPositivoEUmNegativo() {
                        double n1 = 10.0;
                        double n2 = -2.0;

                        double divide = Calculadora.dividir(n1, n2);

                        assertEquals(-5.0, divide);
                    }

                    @Test
                    public void divideDoisNumerosNegativos() {
                        double n1 = -10.0;
                        double n2 = -2.0;

                        double divide = Calculadora.dividir(n1, n2);

                        assertEquals(5.0, divide);
                    }
}   
