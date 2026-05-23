package D;

public class Sms implements CanalNotificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}