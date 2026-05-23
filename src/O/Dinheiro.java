package O;

public class Dinheiro implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via dinheiro: R$ " + valor);
    }
}