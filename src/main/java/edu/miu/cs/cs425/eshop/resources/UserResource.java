package edu.miu.cs.cs425.eshop.resources;

import edu.miu.cs.cs425.eshop.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/users"})
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "luiz@gmail.com","61992033355","1234");
        return ResponseEntity.ok().body(u);
    }
}
