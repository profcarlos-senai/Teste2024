import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestaCalcIMC {

    @Test
    void pegaIMC(){
        CalcIMC imc = new CalcIMC(2.0, 64);
        assertNotNull(imc);
    }

    @Test
    void testaAtributo() {
        CalcIMC imc = new CalcIMC(1.80,64);
        Assertions.assertEquals(19.753, imc.getIMC(), 0.001);//testa o calculo do imc
    }

    @Test
    void testaMinMax(){
        CalcIMC imc = new CalcIMC(1.80,64);
        Assertions.assertEquals(61.56, imc.getMin());//testa minimo
        Assertions.assertEquals(81, imc.getMax());//testa maximo
    }

    @Test
    void classifica1(){
        CalcIMC imc = new CalcIMC(1.80,90);
        Assertions.assertEquals("fofinho", imc.getDescrIMC());//testa a clissificacao mais alta
    }
    @Test
    void classifica2(){
        CalcIMC imc = new CalcIMC(1.80,75);
        Assertions.assertEquals("normal", imc.getDescrIMC());//testa a class. normal
    }
    @Test
    void classifica3(){
        CalcIMC imc = new CalcIMC(1.80,60);//testa a class. magra
        Assertions.assertEquals("magrelo", imc.getDescrIMC());
    }
}
