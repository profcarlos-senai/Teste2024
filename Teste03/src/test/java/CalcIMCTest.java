import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    private CalcIMC calcIMC;

    @BeforeEach
    public void setUp() {
        calcIMC = new CalcIMC(1.75, 70);
    }

    @Test
    public void testCriacaoClasse() {
        assertNotNull(calcIMC);
    }

    @Test
    public void testCalculoIMC() {
        double expectedIMC = 70 / (1.75 * 1.75);
        assertEquals(expectedIMC, calcIMC.getIMC(), 0.01);
    }

    @Test
    public void testCalculoMin() {
        double expectedMin = 19 * (1.75 * 1.75);
        assertEquals(expectedMin, calcIMC.getMin(), 0.01);
    }

    @Test
    public void testCalculoMax() {
        double expectedMax = 25 * (1.75 * 1.75);
        assertEquals(expectedMax, calcIMC.getMax(), 0.01);
    }

    @Test
    public void testCalculoAlturaSaudavel() {
        double expectedAlturaSaudavel = Math.sqrt(70 / 22.0);
        assertEquals(expectedAlturaSaudavel, calcIMC.getAlturaSaudavel(), 0.01);
    }


    @Test
    public void testClassificacaoIMC() {
        CalcIMC calcMagrelo = new CalcIMC(1.75, 50);
        assertEquals("magrelo", calcMagrelo.getDescrIMC());

        CalcIMC calcNormal = new CalcIMC(1.75, 70);
        assertEquals("normal", calcNormal.getDescrIMC());

        CalcIMC calcFofinho = new CalcIMC(1.75, 90);
        assertEquals("fofinho", calcFofinho.getDescrIMC());
    }
}
