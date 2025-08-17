package decorator;

public class DecoratorConcreto extends Decorator {
    public DecoratorConcreto(Componente componente) {
        super(componente);
    }
    public String operacao() {
        return componente.operacao() + "+Decorado";
    }
}
