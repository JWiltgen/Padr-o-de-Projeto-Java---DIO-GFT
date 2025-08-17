package observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeito {
    private List<Observer> observers = new ArrayList<>();

    public void adicionar(Observer o) {
        observers.add(o);
    }

    public void notificar(String mensagem) {
        for (Observer o : observers) {
            o.atualizar(mensagem);
        }
    }
}
