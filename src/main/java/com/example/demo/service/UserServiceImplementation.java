package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.exceptions.UserIdNotFoundException;
import com.example.demo.request.CreateUserRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImplementation implements UserService {
    List<User> users = new ArrayList<>();


    @Override
    public User createUser(CreateUserRequest request) {
        String idUser = UUID.randomUUID().toString();
        User user = new User(request.getNume(), request.getPrenume(), request.getVarsta(), idUser);
        users.add(user);
        return user;
    }



    @Override
    public User getUserById(String id) {
        var userCurent = users.stream().filter(user -> user.getIdUser().equals(id)).findFirst();
        if(userCurent.isPresent()) {
            return userCurent.get();
        } else {
            throw new UserIdNotFoundException();
        }
    }

    @Override
    public List<User> getUseri() {
        return users;
    }
}
