package D;

public class Main {
    public static void main(String[] args) {

        CanalNotificacao zapnotificacao = new Zap();

        Sistema sistema = new Sistema(zapnotificacao);

        sistema.notificar("Seu pedido saiu para entrega(esse foi pelo zap)!");

//        CanalNotificacao emailnotificacao = new Email();
//
//        Sistema sistema1 = new Sistema(emailnotificacao);
//
//        sistema1.notificar("Seu pedido saiu para entrega(esse foi pelo email)!");
//
//        CanalNotificacao smsnotificacao = new Sms();
//
//        Sistema sistema2 = new Sistema(smsnotificacao);
//
//        sistema2.notificar("Seu pedido saiu para entrega(esse foi pelo sms)!");
    }
}