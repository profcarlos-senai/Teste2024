### Handout: Resumo de JUnit 5

#### **O que é o JUnit 5?**
JUnit 5 é a mais recente versão do framework de teste unitário mais utilizado na linguagem Java. Ele permite que desenvolvedores escrevam e executem testes automatizados para garantir que o código funcione conforme esperado. JUnit 5 é dividido em três módulos principais:

- **JUnit Platform:** A base que permite a execução de testes no JUnit.
- **JUnit Jupiter:** O módulo que traz as novas funcionalidades e anotações.
- **JUnit Vintage:** Suporte para rodar testes escritos com versões anteriores do JUnit (JUnit 3 e 4).

#### **Principais Anotações**
- `@Test`: Marca um método como um caso de teste.
- `@BeforeEach`: Executa um método antes de cada teste.
- `@AfterEach`: Executa um método após cada teste.
- `@BeforeAll`: Executa um método uma vez antes de todos os testes da classe.
- `@AfterAll`: Executa um método uma vez após todos os testes da classe.
- `@Disabled`: Desabilita um teste ou uma classe de testes.
- `@Tag`: Adiciona uma tag a um teste para organização e filtragem.
- `@RepeatedTest`: Executa o mesmo teste várias vezes.
- `@ParameterizedTest`: Executa o mesmo teste várias vezes com diferentes argumentos.

#### **Assertivas**
As assertivas são usadas para verificar se os resultados esperados correspondem aos resultados reais:

- `Assertions.assertEquals(expected, actual)`: Verifica se dois valores são iguais.
- `Assertions.assertTrue(condition)`: Verifica se uma condição é verdadeira.
- `Assertions.assertFalse(condition)`: Verifica se uma condição é falsa.
- `Assertions.assertThrows(exception.class, executable)`: Verifica se uma exceção é lançada.
- `Assertions.assertAll()`: Agrupa várias assertivas que serão executadas todas de uma vez.

#### **Testando Exceções**
Para verificar se um método lança uma exceção esperada, utiliza-se a assertiva `assertThrows`:

```java
@Test
void shouldThrowException() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        methodThatShouldThrow();
    });
    assertEquals("Expected message", exception.getMessage());
}
```

#### **Testes Parametrizados**
Os testes parametrizados permitem que você execute o mesmo teste várias vezes com diferentes conjuntos de dados:

```java
@ParameterizedTest
@ValueSource(strings = {"racecar", "radar", "level"})
void testPalindrome(String candidate) {
    assertTrue(isPalindrome(candidate));
}
```

#### **Executando Testes com Maven**
Para rodar seus testes com Maven, adicione as dependências do JUnit 5 ao seu `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

E para rodar os testes:

```bash
mvn test
```

#### **Boas Práticas**
- **Nomeie seus testes de forma clara** para descrever o que eles estão testando.
- **Escreva testes pequenos e específicos**, focados em uma única responsabilidade.
- **Use testes parametrizados** para evitar duplicação de código.
- **Mantenha os testes rápidos** para que possam ser executados frequentemente.

#### **Referências**
- [Documentação Oficial do JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Repositório GitHub JUnit 5](https://github.com/junit-team/junit5)
