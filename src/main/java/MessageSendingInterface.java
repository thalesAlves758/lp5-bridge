public abstract class MessageSendingInterface {
    protected MessageProvider messageProvider;
    protected String lastSentMessage;

    public MessageSendingInterface(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void sendMessage(String text) {
        this.lastSentMessage = this.messageProvider.sendMessage(text);
    }

    public abstract String getLastMessage();
}
