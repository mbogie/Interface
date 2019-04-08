package pl.kurs;

public class OstroslupCzworokatny implements FiguraPrzestrzenna {

    private double a;
    private double b;
    private double wysokoscScianyA;
    private double wysokoscScianyB;
    private double wysokoscOstroslupa;

    public OstroslupCzworokatny(double a, double b, double wysokoscScianyA, double wysokoscScianyB, double wysokoscOstroslupa) {
        this.a = a;
        this.b = b;
        this.wysokoscScianyA = wysokoscScianyA;
        this.wysokoscScianyB = wysokoscScianyB;
        this.wysokoscOstroslupa = wysokoscOstroslupa;
    }

    private double obliczPolePowierzchniBocznej() {
        return a * wysokoscScianyA + b * wysokoscScianyB;
    }

    @Override
    public double obliczPolePowierzchni() {
        return obliczPolePowierzchniBocznej() + a * b;
    }

    @Override
    public double obliczObjetosc() {
        return a * b * wysokoscOstroslupa / 3;
    }

    @Override
    public double obliczSumeDlugosciKrawedzi() {
        double dlugoscKrawedzi = Math.sqrt(wysokoscScianyA * wysokoscScianyA + 0.5 * 0.5 + a * a);
        return 2 * a + 2 * b + 4 * dlugoscKrawedzi;
    }
}
