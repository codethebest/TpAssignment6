package com.example.leo.tpassignment6.factories;

import com.example.leo.tpassignment6.domain.event.EventAddress;
import com.example.leo.tpassignment6.domain.event.EventContact;
import com.example.leo.tpassignment6.factories.event.EventAddressFactory;
import com.example.leo.tpassignment6.factories.event.EventContactFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Leo on 4/18/2016.
 */
public class EventAddressFactoryTest {

    @Test
    public void testEveentAddress()throws Exception
    {
         EventAddress eventAddress= EventAddressFactory.getEventAddress("long Street","Town","SA","Cape Town");
        Assert.assertEquals("long Street", eventAddress.getStreet());
    }

    @Test
    public void testUpdate ()throws Exception
    {
        EventAddress eventAddress= EventAddressFactory.getEventAddress("long Street", "Town", "SA", "Cape Town");
        EventAddress eventAddress1 = new EventAddress.Builder()
                .copy(eventAddress)
                .sub("Town")
                .build();
        Assert.assertEquals("Town",eventAddress.getSub());
    }
}
