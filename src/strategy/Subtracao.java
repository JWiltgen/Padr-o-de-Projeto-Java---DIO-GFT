package strategy;

public class Subtracao implements Strategy {
    public int executar(int a, int b) {
        return a - b;
    }
}
