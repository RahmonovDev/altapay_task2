package com.example.task2.service;

import com.example.task2.payload.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    List<UserDTO> getAll();

    ResponseEntity<UserDTO> getOne(Long id);
}
