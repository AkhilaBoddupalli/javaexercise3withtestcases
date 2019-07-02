package com.stackroute.java3;

public class ExceptionConstructor extends Exception{
    public ExceptionConstructor(String message)
    {
        // Call constructor of parent Exception
        super(message);
    }
    public static void main(String[] args)
    {
       try
       {
           throw new ExceptionConstructor("Exception in main");

       }
       catch(Exception e)
        {
            System.out.println("Caught the exception");

            // Print the message from MyException object
            System.out.println(e.getMessage());
        }
       finally
       {
           System.out.println("Finally block");
       }
    }
}
