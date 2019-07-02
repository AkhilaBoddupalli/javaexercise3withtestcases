package com.stackroute.java3;

public class StudentMarks {
    public boolean checkStudentGrades(int numOfStudents,int stuGrades[])
    {
        for(int i=0;i<stuGrades.length;i++)
        {
            if(stuGrades[i]>=0 || stuGrades[i]<=100)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
