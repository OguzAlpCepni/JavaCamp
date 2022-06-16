package RealLifeProjectAbstractClass;

public class Main {

    public static void main(String[] args) {
        GameCalculator gameCalculator = new WomanCalculator();  // burada new GameCalculator() dersen override etmen lazım çirkin görüntü
        gameCalculator.Hesapla();
        gameCalculator.GameOver();
    }
}
