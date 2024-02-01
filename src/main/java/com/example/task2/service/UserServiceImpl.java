package com.example.task2.service;

import com.example.task2.entity.User;
import com.example.task2.payload.CardDTO;
import com.example.task2.payload.CardTransactionDTO;
import com.example.task2.payload.UserDTO;
import com.example.task2.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> userList = userRepository.findAll();

        if (userList != null){
            return userList
                    .stream()
                    .map(this::userDTOMapper)
                    .collect(Collectors.toList());
        }

        return new ArrayList<>();
    }

    @Override
    public ResponseEntity<UserDTO> getOne(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()){
            User user = optionalUser.get();
            UserDTO userDTO = userDTOMapper(user);
            return ResponseEntity.ok(userDTO);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    /**
     * Maps User to UserDTO
     * @param user
     * @return UserDTO
     */
    private UserDTO userDTOMapper(User user){
        return new UserDTO(
                user.getId(),
                user.getFio(),
                user.getEmail(),
                user.getPhone(),
                user.getStatus(),
                user.getDob(),
                user.getDt(),
                user.getCardList()
                        .stream()
                        .map(card -> new CardDTO(
                                card.getId(),
                                card.getCardName(),
                                card.getCardType(),
                                card.getCardNumber(),
                                card.getCardExpire(),
                                card.getBalance(),
                                card.getStatus(),
                                card.getDt(),
                                card.getCardTransactionList()
                                        .stream()
                                        .map(cardTransaction -> new CardTransactionDTO(
                                                cardTransaction.getId(),
                                                cardTransaction.getType(),
                                                cardTransaction.getAmount(),
                                                cardTransaction.getOldBalance(),
                                                cardTransaction.getNewBalance(),
                                                cardTransaction.getDt()
                                        ))
                                        .collect(Collectors.toList())
                        ))
                        .collect(Collectors.toList())
        );
    }
}
