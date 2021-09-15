package com.twitter.entity;

import lombok.Data;

@Data
public class User {
    private long id;
    private String username;
    private String password;
    private long followerCount;
    private long followeeCount;
}
