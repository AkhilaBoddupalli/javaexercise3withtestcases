package com.stackroute.java3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstandLastDateTest {
    FirstandLastDate obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new FirstandLastDate();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenAWeekNumberShouldReturnFirstAndLastDate() {
        //Act


        String result = obj.dateCalculate();
        //Assert
        assertEquals("","Tue/07/02/19,Mon/07/08/19",result);
    }


}