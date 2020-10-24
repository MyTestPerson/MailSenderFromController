package com.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailController {

    @Autowired
    SendEmail sendEmail;

    @GetMapping("/send")
    public String mail () {
        sendEmail.sendMail();
        return "/mail";
    }

    @GetMapping("/")
    public String home () {
        return "/home";
    }

}
