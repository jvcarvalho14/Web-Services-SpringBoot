package com.jvcarvalho.webservices.Controllers;

import com.jvcarvalho.webservices.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Joao", "joao@gmail.com", "84059354", "123");
        return ResponseEntity.ok().body(u);
    }
}
