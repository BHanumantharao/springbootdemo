package com.example.springbootdemo.service.repoimpl;

import com.example.springbootdemo.exception.ChannelNotFoundException;
import com.example.springbootdemo.model.Channel;
import com.example.springbootdemo.model.User;
import com.example.springbootdemo.repository.UserRepository;
import com.example.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Hanumantharao Bitragunta
 */
@Service
public class UserServiceRepoImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceRepoImpl.class);

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int Id) {
        // java8
        Optional<User> user = userRepository.findById(Id);
        if(!user.isPresent())
            throw new ChannelNotFoundException("id: "+Id);

        return user.get();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int Id) {
        userRepository.deleteById(Id);
    }
}
