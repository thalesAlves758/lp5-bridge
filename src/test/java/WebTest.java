import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WebTest {
    @Test
    void shouldSendASMSMessage() {
        MessageProvider smsProvider = new SMS();
        Web web = new Web(smsProvider);
        web.sendMessage("Test message");

        assertEquals("Mensagem enviada na Web via SMS: Test message", web.getLastMessage());
    }

    @Test
    void shouldSendAEmailMessage() {
        MessageProvider emailProvider = new Email();
        Web web = new Web(emailProvider);
        web.sendMessage("Test message");

        assertEquals("Mensagem enviada na Web via Email: Test message", web.getLastMessage());
    }
}
