import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calc;

    @Test
    void testaCriacaoObjeto(){
        calc = new Calculadora(1,2);
        // testa se o construtor funcionou
        assertNotNull(calc);
        // testa se os atributos receberam os valores certos
        assertEquals(1, calc.getNum1());
        assertEquals(2, calc.getNum2());
    }

    @Test
    void seraQueSoma(){
        calc = new Calculadora(1,2);
        // testa se está somando certo
        assertEquals(3.0, calc.getSoma());
        // será que depois de mudar continua somando?
        calc.setNum1(2);
        assertEquals(4.0, calc.getSoma());
        calc.setNum2(3);
        assertEquals(5.0, calc.getSoma());
    }

    @Test
    void seraQueSubtrai(){
        calc = new Calculadora(3,2);
        assertEquals(1.0, calc.getDiferenca());
    }

    @Test
    void seraQueMultiplica(){
        calc = new Calculadora(3,2);
        assertEquals(6.0, calc.getProduto());
    }

    @Test
    void multPorZero(){
        calc = new Calculadora(0,2);
        double retornado = calc.getProduto();
        assertTrue(retornado == 0);
    }

    @Test
    void testaDistancia(){
        calc = new Calculadora(0,37);
        double resultado = calc.getDistancia();
        assertEquals(37, resultado);
    }


    @Test
    void seraQueDivide(){
        calc = new Calculadora(3,2);
        assertEquals(1.5, calc.getDivisao());
    }

}
