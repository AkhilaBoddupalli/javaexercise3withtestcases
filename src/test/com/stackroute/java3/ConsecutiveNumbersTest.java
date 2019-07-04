package com.stackroute.java3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new ConsecutiveNumbers();
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
    public void givenSeriesOfNumbersShouldReturnConsecutiveNumbers() {
        //Act


        String result = obj.consecutiveSeriesCheck(new int[]{3,4,5,6,7,8,9});
        //Assert
        assertEquals("","consecutive numbers",result);
    }
    public void givenDecreasingSeriesOfNumbersShouldReturnConsecutiveNumbers() {
        //Act


        String result = obj.consecutiveSeriesCheck(new int[]{9,8,7,6,5,4,3});
        //Assert
        assertEquals("","consecutive numbers",result);
    }
    public void givenSeriesOfNumbersShouldReturnNotConsecutiveNumbers() {
        //Act


        String result = obj.consecutiveSeriesCheck(new int[]{9,8,7,6,9,4,3});
        //Assert
        assertEquals("","not consecutive numbers",result);
    }
    public void givenSeriesOfNegativeNumbersShouldReturnConsecutiveNumbers() {
        //Act


        String result = obj.consecutiveSeriesCheck(new int[]{-9,-8,-7,-6,-5,-4,-3});
        //Assert
        assertEquals("","not consecutive numbers",result);
    }





}