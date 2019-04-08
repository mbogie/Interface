package pl.kurs;

public interface FiguraPrzestrzenna {

    double obliczPolePowierzchni();
    double obliczObjetosc();
    default double obliczSumeDlugosciKrawedzi(){
        throw new IllegalStateException();
    }


}
