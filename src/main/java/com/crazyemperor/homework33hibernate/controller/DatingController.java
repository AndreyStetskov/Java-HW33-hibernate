package com.crazyemperor.homework33hibernate.controller;

import com.crazyemperor.homework33hibernate.entity.User;
import com.crazyemperor.homework33hibernate.service.newpartner.NewPartnerService;
import com.crazyemperor.homework33hibernate.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatingController {

    private NewPartnerService newPartnerService;

    private UserService userService;


    @Autowired
    public DatingController(NewPartnerService newPartnerService, UserService userService) {
        this.newPartnerService = newPartnerService;
        this.userService = userService;
    }


    @GetMapping(value = "/new-match")
    public User newMatch() {
        return newPartnerService.getNewMatch();
    }

    @GetMapping(value = "/new-user")
    public User add(User user) {
        return userService.add(user);
    }

    @DeleteMapping(value = "/user_delete")
    public void deleteUser() {
        userService.delete();
    }
}
