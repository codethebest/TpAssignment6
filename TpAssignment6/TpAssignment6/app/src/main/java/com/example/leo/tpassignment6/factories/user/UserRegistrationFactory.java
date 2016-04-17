package com.example.leo.tpassignment6.factories.user;

import com.example.leo.tpassignment6.domain.user.UserRegistration;

/**
 * Created by Leo on 4/18/2016.
 */
public class UserRegistrationFactory {
    public static UserRegistration getUserRegistration(String username,String password , String name,String gender)
    {
        return new UserRegistration.Builder()
                .username(username)
                .newPassword(password)
                .gender(gender)
                .name(name)
                .build();
    }
}
