package com.example.testapp.controller;


import com.example.testapp.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageHtmlController {

    @GetMapping("/")
    public String greeting(Model model) {
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute String message, Model model) {
        Message message1 = new Message();
        message1.setFirstName(message);
        model.addAttribute("greeting", message);
        return "result";
    }
}
