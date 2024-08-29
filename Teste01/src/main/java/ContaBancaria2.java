import java.math.BigDecimal;

public class ContaBancaria2 {
    private BigDecimal saldo; // valores em reais não deve usar float nem double

    public ContaBancaria2(){
        saldo = BigDecimal.ZERO.setScale(5); // milésimos de centavo
    }

    /**
     * Deposita um valor na conta
     * @param valor o valor a ser depositado
     * @throws IllegalArgumentException caso o valor seja negativo
     */
    public void depositar(BigDecimal valor){
        if(valor.compareTo(BigDecimal.ZERO) < 0){ //
            throw new IllegalArgumentException("Depósito com saldo negativo");
            // TODO: testar deposito negativo
        }
        saldo.add(valor); // TODO: testar depósito
    }

    public void sacar(BigDecimal valor){
        if(valor.compareTo(BigDecimal.ZERO) <0){
            throw new IllegalArgumentException("Depósito com saldo negativo");
            // TODO: testar saque nulo
        }
        if(saldo.compareTo(valor) < 0){
            throw new RuntimeException("Tentativa de saque abaixo do limite");
            // TODO: testar saque abaixo limite
        }
        saldo.subtract(valor); // TODO: testar saque
    }

    public BigDecimal getSaldo() {
        return saldo;
    }


}
