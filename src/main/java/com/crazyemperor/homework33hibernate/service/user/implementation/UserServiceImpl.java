package com.crazyemperor.homework33hibernate.service.user.implementation;

import com.crazyemperor.homework33hibernate.entity.User;
import com.crazyemperor.homework33hibernate.service.database.UserDataBaseService;
import com.crazyemperor.homework33hibernate.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDataBaseService userDataBaseService;

    @Autowired
    public UserServiceImpl(UserDataBaseService userDataBaseService) {
        this.userDataBaseService = userDataBaseService;
    }

    @Override
    public User add(User user) {
        user.setID(2);
        user.setNickname("IslandTrading");
        user.setFirstName("Helen");
        user.setLastName("Bennett");
        user.setCountry("Belgium");

        return user;
    }

    @Override
    public void delete() {

    }
}
