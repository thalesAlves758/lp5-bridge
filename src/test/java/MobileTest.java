import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MobileTest {
    @Test
    void shouldSendASMSMessage() {
        MessageProvider smsProvider = new SMS();
        Mobile mobile = new Mobile(smsProvider);
        mobile.sendMessage("Test message");

        assertEquals("Mensagem enviada no mobile via SMS: Test message", mobile.getLastMessage());
    }
}
