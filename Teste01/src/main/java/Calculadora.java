public class Calculadora {
    private double num1, num2;

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getSoma(){
        return num1+num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getDiferenca() {
        return num1-num2;
    }

    public double getProduto(){
        return num1*num2;
    }

    public double getDivisao(){
        return num1/num2;
    }

    // distância absoluta (sem sinal) entre num1 e num2
    public double getDistancia(){
        return Math.abs(num1-num2);
    }
}
