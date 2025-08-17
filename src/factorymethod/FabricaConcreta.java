package factorymethod;

public class FabricaConcreta extends Fabrica {
    public Produto criarProduto() {
        return new ProdutoConcreto();
    }
}
