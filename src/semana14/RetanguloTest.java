package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RetanguloTest {
    
    @Test
    public void recebeBase() {
        Retangulo retangulo = new Retangulo(1, 1);

        retangulo.setBase(5);

        assertEquals(5, retangulo.getBase());
    }

    @Test
    public void recebeAltura() {
        Retangulo retangulo = new Retangulo(1, 1);

        retangulo.setAltura(5);

        assertEquals(5, retangulo.getAltura());
    }

    
}
