package cz.dispring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public EmailService() {
        System.out.println("EmailService created");
    }

    public void sendEmail(String to, String body) {
        System.out.println("To: " + to + " Body: " + body);
    }
}
