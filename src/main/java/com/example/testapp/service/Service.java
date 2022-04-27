package com.example.testapp.service;

import com.example.testapp.domain.Message;
import com.example.testapp.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private MessageRepo messageRepo;

    public void dataSave(Message message) {
        messageRepo.save(message);
    }
}
