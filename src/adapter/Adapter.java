package adapter;

public class Adapter implements Alvo {
    private Adaptado adaptado;
    public Adapter(Adaptado adaptado) {
        this.adaptado = adaptado;
    }
    public void requisicao() {
        adaptado.metodoEspecifico();
    }
}
