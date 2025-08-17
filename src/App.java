
import command.Command;
import command.ControleRemoto;
import command.DesligarLuzCommand;
import command.LigarLuzCommand;
import command.Luz;
import facade.Facade;
import singleton.Singleton;
import strategy.Calculadora;
import strategy.Soma;
import strategy.Subtracao;
import templatemethod.Processo;
import templatemethod.ProcessoConcreto;


public class App {
    public static void main(String[] args) {
        System.out.println("Exemplo de Padrões de Projeto");

        // Usando Facade
        Facade facade = new Facade();
        facade.operacaoFacil();

        // Usando Singleton
        Singleton singleton = Singleton.getInstancia();
        singleton.mostrarMensagem();
        // Usando Strategy
        Calculadora calc = new Calculadora();
        calc.setStrategy(new Soma());
        System.out.println("Soma: " + calc.calcular(5, 3));
        calc.setStrategy(new Subtracao());
        System.out.println("Subtração: " + calc.calcular(5, 3));

        // Usando Command
        Luz luz = new Luz();
        Command ligar = new LigarLuzCommand(luz);
        Command desligar = new DesligarLuzCommand(luz);
        ControleRemoto controle = new ControleRemoto();
        controle.setCommand(ligar);
        controle.pressionarBotao();
        controle.setCommand(desligar);
        controle.pressionarBotao();

        // Usando Template Method
        Processo processo = new ProcessoConcreto();
        processo.executar();
    }
}
