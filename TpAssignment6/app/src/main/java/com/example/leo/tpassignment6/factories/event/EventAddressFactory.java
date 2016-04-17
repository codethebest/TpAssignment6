package com.example.leo.tpassignment6.factories.event;

import com.example.leo.tpassignment6.domain.event.EventAddress;

/**
 * Created by Leo on 4/18/2016.
 */
public class EventAddressFactory {
    public static EventAddress getEventAddress(String street , String sub,String country ,String city)
    {
        return new EventAddress.Builder()
                .street(street)
                .sub(sub)
                .country(country)
                .city(city)
                .build();
    }
}
