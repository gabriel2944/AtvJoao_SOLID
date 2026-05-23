package O;

public class Cartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via cartão: R$ " + valor);
    }
}