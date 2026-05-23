package D;

public class Email implements CanalNotificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}