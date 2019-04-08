package pl.kurs;

public class Walec implements FiguraPrzestrzenna {

    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double obliczPolePowierzchni() {
        double obwod = 2 * r *Math.PI;
        double polePolePodstawy = obliczPolePodstawy();
        return 2 * polePolePodstawy + (obwod *h);
    }

    @Override
    public double obliczObjetosc() {
        return obliczPolePodstawy() * h;
    }

    private double obliczPolePodstawy() {
        return Math.PI*Math.pow(r, 2);
    }


}
