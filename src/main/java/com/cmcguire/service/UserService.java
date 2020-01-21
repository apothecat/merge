package com.cmcguire.service;

import com.cmcguire.entities.User;
import com.cmcguire.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll()
    {
        return (List<User>) this.userRepository.findAll();
    }

    public void save(User user) {
        this.userRepository.save(user);
    }
}









