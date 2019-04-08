package pl.kurs;

public class Prostopadloscian implements FiguraPrzestrzenna {
    private double a;
    private double b;
    private double h;

    public Prostopadloscian(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczSumeDlugosciKrawedzi() {
        return 4 * (a + b + h);
    }

    @Override
    public double obliczPolePowierzchni() {
        return (2 * polePodstawy()) + (2 * a * h) + (2 * b * h);

    }

    @Override
    public double obliczObjetosc() {
        return polePodstawy() * h;
    }

    private double polePodstawy() {
        return a * b;
    }
}
