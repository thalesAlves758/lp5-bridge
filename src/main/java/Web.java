public class Web extends MessageSendingInterface {
    public Web(MessageProvider messageProvider) {
        super(messageProvider);
    }

    public String getLastMessage() {
        return "Mensagem enviada na Web via " + super.lastSentMessage;
    }
}
