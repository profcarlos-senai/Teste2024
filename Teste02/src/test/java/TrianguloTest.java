import model.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Coleção de testes da classe model.Triangulo
 */
public class TrianguloTest {

    @Test
    /**
     * Testa se o construtor funciona
     */
    void CriaTriangulo(){
        Triangulo trilegal = new Triangulo(2.0, 3.0, 4.0);
        // testa se o objeto foi criado (não é null)
        assertNotNull(trilegal);
    }

    @Test
    /**
     * Testa se os atributos foram gravados
     */
    void TestaAtributos(){
        Triangulo tobi = new Triangulo(1.0,2.0,3.0);
        assertEquals(1.0, tobi.getA());
        assertEquals(2.0, tobi.getB());
        assertEquals(3.0, tobi.getC());
    }

    /**
     * Crie o teste testaIsTriangulo
     * Use Assertions.assertTrue(xuxu.isTriangulo());
     * return (a<b+c && b<a+c && c<a+b); <=== isTriangulo é só isso aqui ó
     * e crie esse método
     * use 3,4,5 pra criar o triangulo
     */
    @Test
    void testaIsTriangulo(){
        var xuxu = new Triangulo(2,3,4); // triangulo de verdade
        assertTrue(xuxu.isTriangulo(), "2,3,4 Deveria ser um triângulo!");
    }

    /**
     * testaIsNotTriangulo
     * use assertFalse() com isTriangulo()
     * crie com os valores 1,1,10
     */
    @Test
    void testaIsNotTriangulo(){
        var xuxu = new Triangulo(1,1,10); // triangulo falso
        assertFalse( xuxu.isTriangulo(), "1,1,10 Não deveria ser um triângulo!" );

    }

    @Test
    /**
     * Testa o perímetro
     */
    void testaPerimetro(){
        var xuxu = new Triangulo(3.0,4.0,5.0); // triangulo falso
        assertEquals(12.0, xuxu.getPerimetro(), "Perímetro deverial ser 12");
    }

    @Test
    /**
     * Testa a área
     */
    void testaArea(){
        var tri = new Triangulo(2,3,4);
        assertEquals(2.90474, tri.getArea(), 0.001);
    }


}
