import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcIMCTest {

    private CalcIMC calc;


    @Test
    void testaCriacaoObjeto(){
        calc = new CalcIMC(1.70,60);
        assertNotNull(calc);


        assertEquals(1.70, calc.getAltura());
        assertEquals(60, calc.getPeso());
    }
    @Test
    void testaCalcIMC(){
        calc = new CalcIMC(1.70,60);
        assertEquals(20.76, calc.getIMC(),0.01);
    }

    @Test
    void testaDescriMagro(){
        calc = new CalcIMC(1.70,10);
        assertEquals("magrelo",calc.getDescrIMC());
    }

    @Test
    void testaDescriNormal(){
        calc = new CalcIMC(1.70,60);
        assertEquals("normal",calc.getDescrIMC());
    }

    @Test
    void testaDescriThais(){
        calc = new CalcIMC(1.70,180);
        assertEquals("thais carla",calc.getDescrIMC());
    }

    @Test
    void testaMinMax(){
        calc = new CalcIMC(1.70,60);
        assertEquals(54.91, calc.getMin(),0.01);

        assertEquals(72.25, calc.getMax(),0.01);
    }

    @Test
    void testaAlturaSaldavel(){
        calc = new CalcIMC(1.70,60);
        assertEquals(1.65, calc.getAlturaSaudavel(),0.01);
    }
}
