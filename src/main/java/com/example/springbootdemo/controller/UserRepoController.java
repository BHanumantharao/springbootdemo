package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import com.example.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */
@RestController
@RequestMapping("/api/repo/v2")
public class UserRepoController {
    private Logger logger = LoggerFactory.getLogger(UserRepoController.class);

    @Autowired
    UserService userService;

    @GetMapping(value = "/allUser")
    public ResponseEntity<User> getUserlList() {
        logger.info("### -> Load All User List.");
        List<User> respUserList = userService.getUsers();
        return new ResponseEntity(respUserList, HttpStatus.OK);
    }

    @GetMapping(value = "/users/{userId}")
    public ResponseEntity<User> getUser(@PathVariable int userId) {
        logger.info("### -> Get User by Id.");
        User user = userService.getUser(userId);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping(value = "/user/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        logger.info("### -> Create User.");
        userService.createUser(user);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @PutMapping(value = "/user/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        logger.info("### -> Update User.");
        userService.updateUser(user);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @DeleteMapping(value = "/user/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable int userId) {
        logger.info("### -> Deactivate User");
        userService.deleteUser(userId);
        return new ResponseEntity("", HttpStatus.OK);
    }
}
