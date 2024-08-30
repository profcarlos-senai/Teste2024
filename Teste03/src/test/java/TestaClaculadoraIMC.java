import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestaClaculadoraIMC {
    @Test
    void testNull() {
        CalcIMC nulo = new CalcIMC(3, 4);
        Assertions.assertNotNull(nulo);
    }


    @Test
    void pegaImc() {
        CalcIMC imc = new CalcIMC(3, 1);
        Assertions.assertEquals(0.11, imc.getIMC(), 0.01);
    }


    @Test
    void calMinMax() {
        CalcIMC imc = new CalcIMC(3, 1);
        Assertions.assertEquals(225, imc.getMax(), 0.01);
        Assertions.assertEquals(171, imc.getMin(), 0.01);

    }

    @Test
    void DescricaoMagrelo() {
        CalcIMC imc = new CalcIMC(3, 1);
        Assertions.assertEquals("magrelo", imc.getDescrIMC());
    }

    @Test
    void DescricaoNormal() {
        CalcIMC imc = new CalcIMC(2, 80);
        Assertions.assertEquals("normal", imc.getDescrIMC());
    }


    @Test
    void DescricaoFofinho() {
        CalcIMC imc = new CalcIMC(2, 800);
        Assertions.assertEquals("fofinho", imc.getDescrIMC());
    }

}

