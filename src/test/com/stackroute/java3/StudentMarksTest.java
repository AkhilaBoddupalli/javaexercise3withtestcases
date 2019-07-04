package com.stackroute.java3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new StudentMarks();
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
    public void givenNumberOfStudentsandGradesShouldReturnTrue() {
        //Act


        boolean result = obj.checkStudentGrades(2,new int[]{20,30});
        //Assert
        assertEquals("",true,result);
    }
    public void givenNumberOfStudentsandGradesShouldReturnFalse() {
        //Act


        boolean result = obj.checkStudentGrades(2,new int[]{20,101});
        //Assert
        assertEquals("",false,result);
    }
    public void givenNumberOfStudentsandGradesShouldReturnNothing() {
        //Act


        boolean result = obj.checkStudentGrades(0,new int[]{});
        //Assert
        assertEquals("","",result);
    }
    public void givenNumberOfStudentsandNegativeGradesShouldReturnNothing() {
        //Act


        boolean result = obj.checkStudentGrades(0,new int[]{-20,-30});
        //Assert
        assertEquals("","",result);
    }


}