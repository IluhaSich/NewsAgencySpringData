package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_account")
public class User extends BaseEntity{
    private String nickname;
    private String registrationDate;

    public User(String nickname, String registrationDate) {
        this.nickname = nickname;
        this.registrationDate = registrationDate;
    }

    protected User() {
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    @Column(name = "registration_date")
    public String getRegistrationDate() {
        return registrationDate;
    }
}
