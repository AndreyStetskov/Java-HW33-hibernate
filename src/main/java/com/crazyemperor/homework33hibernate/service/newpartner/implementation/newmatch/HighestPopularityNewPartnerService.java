package com.crazyemperor.homework33hibernate.service.newpartner.implementation.newmatch;

import com.crazyemperor.homework33hibernate.entity.User;
import com.crazyemperor.homework33hibernate.service.database.UserDataBaseService;
import com.crazyemperor.homework33hibernate.service.newpartner.NewPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class HighestPopularityNewPartnerService implements NewPartnerService {

    private final UserDataBaseService userDataBaseService;

    @Autowired
    public HighestPopularityNewPartnerService(UserDataBaseService userDataBaseService) {
        this.userDataBaseService = userDataBaseService;
    }

    @Override
    public User getNewMatch() {
        List<User> users = userDataBaseService.getUser();

        User highestPointer = null;

        int maxPoint = 0;

        for (User user : users) {
            if (user.getPoint() > maxPoint) {
                maxPoint = user.getPoint();
                highestPointer = user;
            }
        }

        return highestPointer;
    }
}
