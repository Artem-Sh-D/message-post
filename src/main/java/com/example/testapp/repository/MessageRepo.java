package com.example.testapp.repository;

import com.example.testapp.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message,Long> {
}
