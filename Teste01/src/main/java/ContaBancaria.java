public class ContaBancaria {
    private double saldo; // valores em reais não deve usar float nem double

    public ContaBancaria(){
        saldo = 0; // TODO: testar se a conta inicializa com saldo zero
    }

    public void depositar(double valor){
        if(valor < 0){ // fixme
            throw new IllegalArgumentException("Depósito com saldo negativo");
            // TODO: testar deposito negativo
        }
        saldo += valor; // TODO: testar depósito
    }

    public void sacar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Depósito com saldo negativo");
            // TODO: testar saque negativo
        }
        if(saldo < valor){
            throw new RuntimeException("Tentativa de saque abaixo do limite");
            // TODO: testar saque abaixo limite
        }
        saldo -= valor; // TODO: testar saque
    }

    public double getSaldo() {
        return saldo;
    }


}
