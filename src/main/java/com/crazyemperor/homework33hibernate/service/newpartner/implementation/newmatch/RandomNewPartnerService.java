package com.crazyemperor.homework33hibernate.service.newpartner.implementation.newmatch;

import com.crazyemperor.homework33hibernate.entity.User;
import com.crazyemperor.homework33hibernate.service.database.UserDataBaseService;
import com.crazyemperor.homework33hibernate.service.newpartner.NewPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RandomNewPartnerService implements NewPartnerService {

    private final UserDataBaseService userDataBaseService;

    @Autowired
    public RandomNewPartnerService(UserDataBaseService userDataBaseService) {
        this.userDataBaseService = userDataBaseService;
    }

    @Override
    public User getNewMatch() {
        Random random = new Random();

        List<User> users = userDataBaseService.getUser();

        int i = random.nextInt(users.size());

        return users.get(i);
    }
}
