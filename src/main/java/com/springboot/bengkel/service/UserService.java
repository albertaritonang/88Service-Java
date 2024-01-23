package com.springboot.bengkel.service;

import com.springboot.bengkel.model.User;
import com.springboot.bengkel.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer user_id) {
        return userRepository.findById(user_id).get(); // Menggunakan "user_id" sebagai ID
    }

    public void deleteUser(Integer user_id) {
        userRepository.deleteById(user_id); // Menggunakan "user_id" sebagai ID
    }
}
