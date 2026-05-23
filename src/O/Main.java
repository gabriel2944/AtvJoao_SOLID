package O;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento = new Pix();
        pagamento.pagar(100.0);

        Pagamento pagamento1 = new Cartao();
        pagamento1.pagar(100.0);
    }
}