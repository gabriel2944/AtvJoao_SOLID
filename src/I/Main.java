package I;

public class Main {
    public static void main(String[] args) {

        GerenciaPedido sistemaPedido = new SistemaPedido();
        sistemaPedido.gerenciarPedido();

        GerenciaEntrega sistemaEntrega = new SistemaEntrega();
        sistemaEntrega.gerenciarEntrega();

        Relatorio sistemaRelatorio = new SistemaRelatorio();
        sistemaRelatorio.gerarRelatorio();

        Notificacao sistemaNotificacao = new SistemaNotificacao();
        sistemaNotificacao.enviarNotificacao();
    }
}
