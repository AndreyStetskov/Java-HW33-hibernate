package com.crazyemperor.homework33hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User {

    @Id
    @Column(name = "UserID")
    public int ID;

    @Column(name = "Nickname")
    public String nickname;

    @Column(name = "First name")
    public String firstName;

    @Column(name = "Last name")
    public String lastName;

    @Column(name = "Age")
    public int age;

    @Column(name = "Sex")
    public Sex sex;

    @Column(name = "Address")
    public String address;

    @Column(name = "City")
    public String city;

    @Column(name = "Post index")
    public String postIndex;

    @Column(name = "Country")
    public String Country;

    @Column(name = "Point")
    private int point;

    @Column(name = "Is blocked")
    private boolean isBlocked;

}
