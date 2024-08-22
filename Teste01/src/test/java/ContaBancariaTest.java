import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {
    ContaBancaria conta; // todos os testes vão usar esse cara

    @BeforeEach // roda sempre de novo antes de CADA teste
    void preparaConta(){
        conta = new ContaBancaria(); // garante que cada teste ganha uma conta diferente
    }

    // testa se explode mesmo quando faz deposito negativo
    @Test
    void depositoNegativo(){
        assertThrows(IllegalArgumentException.class, () -> conta.depositar(-1));
    }

    // outro jeito de testar se explode um exceção
    @Test
    void saqueNegativo(){
        try{
            conta.sacar(-10); // DEVIA dar erro
            fail("Saque negativo não falhou");
        } catch (IllegalArgumentException e){
            assertNotNull(e);
        }

    }

    // testa se NÃO explode quando faz depósito positivo
    @Test
    void depositoPositivo(){
        assertDoesNotThrow(() -> conta.depositar(1));
    }

    // escreva um teste que garanta que a conta recém criada tenha um saldo zerado

    // escreva um teste que deposite um valor e verifique se o saldo aumentou exato igual aquele valor

    // escreva um teste que saque um valor e verifique se o saldo diminiu exato igual aquele valor

    // escreva um teste que deposite um valor e saque o mesmo valor e teste se o saldo não mudou
}
