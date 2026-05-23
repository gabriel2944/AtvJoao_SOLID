package S;

// Classe responsável apenas por exibir informações
public class PrintPedido {

    public void exibir(Pedido pedido) {
        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}