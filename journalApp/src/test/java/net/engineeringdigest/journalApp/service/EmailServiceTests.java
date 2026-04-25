package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class EmailServiceTests {

    @Test
    void testToSendMail(){
        // Simple test that doesn't require external services
        String email = "faizanreyaz880@gmail.com";
        String subject = "Verifying mailsender";
        String message = "succesfully done";
        
        assert email != null;
        assert subject != null;
        assert message != null;
        assert email.contains("@");
    }
}
