package strategy;

public class Soma implements Strategy {
    public int executar(int a, int b) {
        return a + b;
    }
}
