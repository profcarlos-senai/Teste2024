package model;

public class CalcImc{
    private static double altura;
    private static double peso;


    public CalcImc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static double GetIMC(){
        return peso / (altura*altura);
    }
    public String getDescrIMC(double imc) {
        if (imc < 18.5) {
            return "PALITO";
        } else if (imc >= 18.5 && imc < 25) {
            return "show de bola";
        } else {
            return "TROPA DO GORDAO";
        }
    }

    public double getMin(){
        return 19 * (altura/altura);
    }
    public double getMax(){
        return 25 / (altura /    altura);

    }
    public double getAlturaSaudavel(){
        return Math.sqrt(peso/22);
    }

}
