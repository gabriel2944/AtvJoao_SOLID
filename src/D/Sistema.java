package D;

public class Sistema {

    private CanalNotificacao canal;

    public Sistema(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void notificar(String mensagem) {
        canal.enviarMensagem(mensagem);
    }
}