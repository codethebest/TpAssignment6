package com.example.leo.tpassignment6.factories.event;

import com.example.leo.tpassignment6.domain.event.EventContact;

/**
 * Created by Leo on 4/18/2016.
 */
public class EventContactFactory {
    public static EventContact getEventContact (int phone ,String email, String website)
    {
        return new EventContact.Builder()
                .email(email)
                .phone(phone)
                .website(website)
                .build();
    }
}
