package com.crazyemperor.homework33hibernate.service.database.implementation;

import com.crazyemperor.homework33hibernate.entity.User;
import com.crazyemperor.homework33hibernate.repository.UserRepository;
import com.crazyemperor.homework33hibernate.service.database.UserDataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseServiceImpl implements UserDataBaseService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    public User add(User user) {
        return userRepository.save(user);
    }

    public User delete() {
        return userRepository.deleteByNicknameOrLastName("Maison Dewey");
    }
}
