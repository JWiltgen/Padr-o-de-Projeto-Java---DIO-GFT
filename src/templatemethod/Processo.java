package templatemethod;

public abstract class Processo {
    public final void executar() {
        passo1();
        passo2();
        passoOpcional();
    }
    protected abstract void passo1();
    protected abstract void passo2();
    protected void passoOpcional() {}
}
