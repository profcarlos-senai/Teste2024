### **Exercício**

Crie uma classe `CalcIMC()`, que tenha um construtor que
receba `altura` e `peso` (double), uma função `getIMC()`
que retorne o imc, uma função `getDescrIMC()`, que retorne
'magrelo','normal' ou 'fofinho' conforme o valor do IMC,
uma função `getMin()` que retorne o menor peso saudável para
essa altura (imc 19), uma função `getMax()`, que retorne o maior
peso saudável para essa altura (imc 25) e `getAlturaSaudavel()`,
que retorne a altura recomendável para esse peso (imc 22)

```
IMC = PESO / (ALTURA*ALTURA)
MIN = 19*(ALTURA*ALTURA)
MAX = 25*(ALTURA*ALTURA)
ALTURA RECOMENDÁVEL = Math.sqrt(peso/22)
```

### O que testar

- Se consegue criar a classe (se não é nulo)
- Se o cálculo do IMC está correto (se é igual)
- Se o min e max e altura estão corretos (se é igual)
- Se classifica corretamente (pelo menos três assertivas se é igual)