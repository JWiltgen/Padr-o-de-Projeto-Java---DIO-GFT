package decorator;

public abstract class Decorator implements Componente {
    protected Componente componente;
    public Decorator(Componente componente) {
        this.componente = componente;
    }
}
