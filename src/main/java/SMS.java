public class SMS implements MessageProvider {
    public String sendMessage(String content) {
        return "SMS: " + content;
    }
}
