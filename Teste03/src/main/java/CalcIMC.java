public class CalcIMC {
    private double peso;
    private double altura;
    private double imc;
    private String descrIMC;
    private double min;
    private double max;
    private double alRecomendavel;

    public CalcIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void calculaIMC(){
        setImc(getPeso()/(getAltura()*getAltura()));
        if (getImc() <= 19){
            setDescrIMC("magrelo");
        } else if (getImc() <= 25) {
            setDescrIMC("normal");
        }else{
            setDescrIMC("gordo");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getDescrIMC() {
        return descrIMC;
    }

    public void setDescrIMC(String descrIMC) {
        this.descrIMC = descrIMC;
    }

    public double getMin() {
        return 19*(getAltura()*getAltura());
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return 25*(getAltura()*getAltura());
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getAlRecomendavel() {
        return Math.sqrt(getPeso()/getImc());
    }

    public void setAlRecomendavel(double alRecomendavel) {
        this.alRecomendavel = alRecomendavel;
    }
}
