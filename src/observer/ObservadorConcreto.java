package observer;

public class ObservadorConcreto implements Observer {
    private String nome;

    public ObservadorConcreto(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
