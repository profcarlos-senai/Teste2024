import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcIMCTest {
    @Test
    /**
     * testa se criou o objeto
     */
    void testaObjeto(){
        var imc = new CalcIMC(2,90);
        // se for nulo deu caquinha
        assertNotNull(imc);
    }

    @ParameterizedTest
    @CsvSource({
            ""
    })
    /** testa se está retornando valores corretos
     *
     */
    void testaIMC(){
        double altura = 1.45;
        double peso = 50;

        while(altura <= 2.0){
            double result = peso/(altura*altura);
            var imc = new CalcIMC(altura, peso);
            assertEquals(result, imc.getIMC(), 0.0001);

            altura += .1;
            peso += 10;
        }
    }
}
