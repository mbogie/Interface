package pl.kurs;

public class Kodowanie {

    public static void main(String[] args) {

    FiguraPrzestrzenna[] figury = new FiguraPrzestrzenna[3];
    figury[0] = new Walec(3, 5);
    figury[1] = new Prostopadloscian(3, 5, 7);
    figury[2] = new OstroslupCzworokatny(2, 4, 6, 8,10);

    Double sumaKrawedzi = null;
    for(FiguraPrzestrzenna figura : figury){
        System.out.println(figura.getClass().getSimpleName());
        System.out.println("Objetosc: "+figura.obliczObjetosc());
        System.out.println("Pole powierzchni: "+figura.obliczPolePowierzchni());
        try {
            sumaKrawedzi = figura.obliczSumeDlugosciKrawedzi();
        }catch (IllegalStateException ex){
            ex.getMessage();
        }
        System.out.println("Suma krawędzi: "+sumaKrawedzi);
        System.out.println("-----");
    }
    }
}
