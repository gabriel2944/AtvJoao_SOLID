package D;

public class Zap implements CanalNotificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}