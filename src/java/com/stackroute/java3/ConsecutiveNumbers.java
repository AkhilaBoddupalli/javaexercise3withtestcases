package com.stackroute.java3;

public class ConsecutiveNumbers {
    public String consecutiveSeriesCheck(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {
            if((array[i+1]-array[i]==1)||(array[i]-array[i+1]==1)) //if the difference of current and previous nubers is one then they are consecutive
            {
                return "consecutive numbers";
            }
            else
            {
                return "not consecutive numbers";
            }
        }
        return null;
    }
}
