public class Mobile extends MessageSendingInterface {
    public Mobile(MessageProvider messageProvider) {
        super(messageProvider);
    }

    public String getLastMessage() {
        return "Mensagem enviada no mobile via " + super.lastSentMessage;
    }
}
