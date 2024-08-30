package model;

/**
 * Representa um triângulo
 */
public class Triangulo {
    private final double a;
    private final double b;
    private final double c;

    /**
     * Cria um triangulo
     * @param a um lado do triângulo
     * @param b outro lado do triângulo
     * @param c outro outro lado do triângulo (tem três)
     */
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public boolean isTriangulo() {
        return (getA() < getB() + getC() &&
                getB() < getA() + getC() &&
                getC() < getA() + getB() );
    }

    public double getPerimetro(){
        return getA()+getB()+getC();
    }

    public double getArea(){
        // Calcula o semiperímetro
        double s = (a + b + c) / 2;

        // Calcula a área usando a Fórmula de Herão
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
