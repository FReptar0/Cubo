import java.lang.Math;

public class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return 6 * (Math.pow(getLado(), 2));
    }

    public double volumen() {
        return Math.pow(lado, 3);
    }
}
