package facade;

public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
    }

    public void operacaoFacil() {
        subsystemA.acaoA1();
        subsystemA.acaoA2();
        subsystemB.acaoB1();
        subsystemB.acaoB2();
    }
}

class SubsystemA {
    public void acaoA1() {
        System.out.println("Ação 1 do Subsistema A");
    }
    public void acaoA2() {
        System.out.println("Ação 2 do Subsistema A");
    }
}

class SubsystemB {
    public void acaoB1() {
        System.out.println("Ação 1 do Subsistema B");
    }
    public void acaoB2() {
        System.out.println("Ação 2 do Subsistema B");
    }
}
