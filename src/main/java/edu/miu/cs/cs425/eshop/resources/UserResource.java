package edu.miu.cs.cs425.eshop.resources;

import edu.miu.cs.cs425.eshop.model.User;
import edu.miu.cs.cs425.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/users"})
public class UserResource {
    @Autowired
    private UserService userService;
    @GetMapping(value = {"/list"})
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userService.findAllUsers();

        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{userId}")
    public ResponseEntity<User> findUserById(@PathVariable Long userId){
        return ResponseEntity.ok().body(userService.findUserById(userId));
    }
}
