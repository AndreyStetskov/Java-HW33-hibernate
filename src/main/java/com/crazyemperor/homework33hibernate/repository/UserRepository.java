package com.crazyemperor.homework33hibernate.repository;

import com.crazyemperor.homework33hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User deleteByNicknameOrLastName(String name);

}
