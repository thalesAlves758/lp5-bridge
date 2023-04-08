public class Email implements MessageProvider {
    public String sendMessage(String content) {
        return "Email: " + content;
    }
}
