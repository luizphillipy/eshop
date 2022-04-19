package edu.miu.cs.cs425.eshop.service;

import edu.miu.cs.cs425.eshop.model.User;
import edu.miu.cs.cs425.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public void createNewUser (User user){
        userRepository.save(user);
    }
    public User findUserById(Long userId){
       return userRepository.findById(userId).orElse(null);
    }
}
