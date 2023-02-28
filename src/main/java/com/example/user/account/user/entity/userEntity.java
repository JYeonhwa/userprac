package com.example.user.account.user.entity;

public class userEntity {

    private Long id;
    private String email;
    private String password;
    private String nickname;

    public Long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getNickname() {
        return nickname;
    }
    public void setId() {
        this.id = id;
    }
    public void setEmail() {
        this.email = email;
    }
    public void setNickname() {
        this.nickname = nickname;
    }
    public void setPassword() {
        this.password = password;
    }
}
