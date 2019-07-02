package com.stackroute.java3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ExceptionsTest {
    Exceptions obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Exceptions();
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
    public void givenValuesTheMethodChecksForExceptions() {
        try
        {
            int arr[] = new int[-6];


            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }

        try {
            int ar[] = {1, 2, 3, 4, 5};
            for (int i = 0; i <= ar.length; i++) {
                System.out.println(ar[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try
        {
            String str = "abc";

            if ("def".equals(str))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }



}