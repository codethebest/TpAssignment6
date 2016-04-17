package com.example.leo.tpassignment6;

import com.example.leo.tpassignment6.factories.EventAddressFactoryTest;
import com.example.leo.tpassignment6.factories.EventBasicInformationFactoryTest;
import com.example.leo.tpassignment6.factories.EventContactFactoryTest;
import com.example.leo.tpassignment6.factories.EventFactoryTest;
import com.example.leo.tpassignment6.factories.GenderFactoryTest;
import com.example.leo.tpassignment6.factories.PersonAddressFactoryTest;
import com.example.leo.tpassignment6.factories.PersonBasicInformationFactoryTest;
import com.example.leo.tpassignment6.factories.PersonContactFactoryTest;
import com.example.leo.tpassignment6.factories.UserRegistrationFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Leo on 4/18/2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EventAddressFactoryTest.class,
        EventBasicInformationFactoryTest.class,
        EventContactFactoryTest.class,
        PersonAddressFactoryTest.class,
        GenderFactoryTest.class,
        PersonBasicInformationFactoryTest.class,
        PersonContactFactoryTest.class,
        PersonBasicInformationFactoryTest.class,
        UserRegistrationFactoryTest.class,
        EventFactoryTest.class})

public class AppUnitTestAllSuit {}
