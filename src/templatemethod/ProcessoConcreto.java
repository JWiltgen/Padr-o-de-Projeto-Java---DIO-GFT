package templatemethod;

public class ProcessoConcreto extends Processo {
    protected void passo1() {
        System.out.println("Passo 1 executado");
    }
    protected void passo2() {
        System.out.println("Passo 2 executado");
    }
    protected void passoOpcional() {
        System.out.println("Passo opcional executado");
    }
}
