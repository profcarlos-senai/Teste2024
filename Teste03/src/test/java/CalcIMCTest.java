import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcIMCTest {
    private CalcIMC calcImc;

    @Test
    void testCriacaoObjeto(){
        calcImc = new CalcIMC(1.0,2.0);
        assertNotNull(calcImc);
        assertEquals(1, calcImc.getPeso());
        assertEquals(2, calcImc.getAltura());
    }

    @Test
    void testgetIMC(){
        calcImc = new CalcIMC(1.0,2.0);
        calcImc.calculaIMC();
        assertEquals(0.25, calcImc.getImc());
    }

    @Test
    void testgetMin(){
        calcImc = new CalcIMC(1.0,2.0);
        assertEquals(76, calcImc.getMin());
    }

    @Test
    void testgetMax(){
        calcImc = new CalcIMC(1.0,2.0);
        assertEquals(100, calcImc.getMax());
    }

    @Test
    public void testCalculoIMC() {
        calcImc = new CalcIMC(60.0, 1.8);
        calcImc.calculaIMC();
        assertEquals("magrelo", calcImc.getDescrIMC());

        calcImc = new CalcIMC(80.0, 1.8);
        calcImc.calculaIMC();
        assertEquals("normal", calcImc.getDescrIMC());

        calcImc = new CalcIMC(100, 1);
        calcImc.calculaIMC();
        assertEquals("gordo", calcImc.getDescrIMC());
    }

    @Test
    void testAlRecomendavel(){
        calcImc = new CalcIMC(60.0, 1.8);
        calcImc.calculaIMC();
        double alRecomendavel = Math.sqrt(calcImc.getPeso() / calcImc.getImc());
        assertEquals(alRecomendavel, calcImc.getAlRecomendavel());
    }

}
