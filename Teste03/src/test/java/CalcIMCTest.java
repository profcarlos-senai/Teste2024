import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalcIMCTest {

    @Test
    public void testCalculaIMC() {
        CalcIMC cal = new CalcIMC(2.00, 100);
        Assertions.assertEquals(1.0,cal.getIMC());
    }
    @Test
    public void getDescrIMC() {
        CalcIMC cal = new CalcIMC(2.00, 1000);
        assertEquals("magrelo", cal.getDescrIMC());
    }
    @Test
    public void getMin(){
        CalcIMC cal = new CalcIMC(2.00, 10);
        Assertions.assertEquals(1,cal.getMin());
    }
    @Test
    public void getMax(){
        CalcIMC cal = new CalcIMC(2.00, 10);
        Assertions.assertEquals(1,cal.getMax());
    }
    @Test
    public void getAltura() {
        CalcIMC cal = new CalcIMC(1.80, 100);
        Assertions.assertEquals(1, cal.getAlturaSaudavel());
    }

}
