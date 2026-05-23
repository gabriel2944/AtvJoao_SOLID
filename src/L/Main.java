package L;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Pizza("Pizza Camarao com Nutella grelhada", 64340.0);
        Produto p2 = new Hamburguer("X-exterminio RIP", 9999999.0);
        Produto p3 = new Bebida("Refrigerante", 4.0);

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}