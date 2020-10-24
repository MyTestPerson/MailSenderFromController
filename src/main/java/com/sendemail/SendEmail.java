package com.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(){

        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo("mymail@gmail.com");
        msg.setFrom("mymail@gmail.com");
        msg.setSubject("Привет. Это моё первое тестовое сообщене");
        msg.setText("Привет. Это тело моего первого сообщения");

        javaMailSender.send(msg);
    }
}
