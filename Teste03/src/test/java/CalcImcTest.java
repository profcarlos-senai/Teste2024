import model.CalcImc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalcImcTest {
@Test
void TestaSeAClasseNaoENula(){
    CalcImc eosguri = new CalcImc(1.75,70);
    assertNotNull(eosguri);
    }
@Test
void testaSeoIMCeCorreto(){
    CalcImc seraqueeosguri = new CalcImc(1.75,70);
    assertEquals(22.86, seraqueeosguri.GetIMC(), 0.01);
}
@Test
    void testaseOMinTatop(){
    CalcImc sopodesereles = new CalcImc(1.75,70);
    assertEquals(19, sopodesereles.getMin(), 0.01);
}
    @Test
    void testaseOMaxTatop(){
    CalcImc osguridoenai = new CalcImc(1.75,70);
        assertEquals(25, osguridoenai.getMax(), 0.01);
    }
    @Test
    void testClassificacaoIMC() {

        CalcImc coringada = new CalcImc(1.75, 40);
        assertEquals("PALITO", coringada.getDescrIMC(coringada.GetIMC()));


        CalcImc eosd = new CalcImc(1.75, 70);
        assertEquals("show de bola", eosd.getDescrIMC(eosd.GetIMC()));


        CalcImc quemteperguntouturndownforwhattutututututu = new CalcImc(1.75, 150);
        assertEquals("TROPA DO GORDAO", quemteperguntouturndownforwhattutututututu.getDescrIMC(quemteperguntouturndownforwhattutututututu.GetIMC()) );
    }
}

