package com.jwtauthentication.jwt_authenctication.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwtauthentication.jwt_authenctication.model.User;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Adnan Rashid", "adnan@dev.pk"));
        store.add(new User(UUID.randomUUID().toString(), "Irfan Rashid", "irfan@dev.pk"));
        store.add(new User(UUID.randomUUID().toString(), "Nauman Rashid", "nauman@dev.pk"));
        store.add(new User(UUID.randomUUID().toString(), "khalid Rashid", "khalid@dev.pk"));
    }

    public List<User> getUsers() {
        return this.store;
    }

}
