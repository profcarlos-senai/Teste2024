public class CalcIMC {

    private double altura;
    private double peso;
    private double IMC;


    public CalcIMC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getIMC() {

        return IMC = peso / (altura * altura);
    }

    public String getDescrIMC() {
        double imc = getIMC();
        if (IMC < 19) {
            return "magrelo";
        }else if(IMC < 25){
            return "se salvo pilantra";
        }else{
            return "gordo seboso";
        }
    }
    public double getMin(){
        double imc = getIMC();
        return 19*(altura*altura);
    }
    public double getMax(){
        double imc = getIMC();
        return 25*(altura*altura);
    }
    public double getAlturaSaudavel(){
        double imc = getIMC();
        return Math.sqrt(peso / 22);
    }

}