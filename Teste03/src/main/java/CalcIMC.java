/**
 * Representa um cálculo de IMC de um indivíduo
 */
public class CalcIMC {
    private double altura, peso, imc;

    /**
     * Cria um objeto da classe CalcIMC
     * @param altura a altura do cabra
     * @param peso o peso do cabra
     */
    public CalcIMC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * Descreve o IMC
     * @return "magrelo" se < 19, "fofinho" se > 25 e "normal" pro resto
     */
    public String getDescrIMC(){
        if(getIMC()<19) return "magrelo";
        if(getIMC()<=25) return "normal";
        return "fofinho";
    }

    /**
     * Calcula o IMC
     * @return peso/(altura^2)
     */
    public double getIMC() {
        return peso/(altura*altura);
    }

    /**
     * retorna o menor peso saudável para essa altura
     */
    double getMin(){
        return 19*(altura*altura);
    }

    /**
     * retorna o maior peso saudável para essa altura
     */
    double getMax(){
        return 25*(altura*altura);
    }

    /**
     * Que altura vc precisa ter para ter um IMC de 22
     * e manter o peso atual
     */
    double getAlturaSaudavel(){
        return Math.sqrt(peso/22);
    }
}
