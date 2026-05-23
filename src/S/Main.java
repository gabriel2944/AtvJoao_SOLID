package S;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, "Gabriel", 50.0);

        PedidoRepository repository = new PedidoRepository();
        PrintPedido printer = new PrintPedido();

        repository.salvar(pedido);
        printer.exibir(pedido);
    }
}
