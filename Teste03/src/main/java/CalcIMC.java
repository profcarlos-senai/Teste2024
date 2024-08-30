public class CalcIMC {
    private double altura;
    private double peso;

    public CalcIMC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getIMC() {
        return peso / (altura * altura);
    }

    public String getDescrIMC() {
        double imc = getIMC();
        if (imc < 19) {
            return "Vareta";
        } else if (imc >= 19 && imc <= 25) {
            return "Bem De Boa";
        } else {
            return "GORDO GORDO GORDO GORDO PERIGO";
        }
    }

    public double getMin() {
        return 19 * (altura * altura);
    }

    public double getMax() {
        return 25 * (altura * altura);
    }

    public double getAlturaSaudavel() {
        return Math.sqrt(peso / 22.0);
    }
}
