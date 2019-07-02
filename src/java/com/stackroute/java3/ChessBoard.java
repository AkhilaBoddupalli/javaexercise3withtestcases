package com.stackroute.java3;

public class ChessBoard
{
    public String chessBoardFormat()
    {
        int array[][]=new int[8][8];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(i+j%2==0)
                {
                    return "WW|";
                }
                else
                {
                    return "BB|";
                }
            }
            System.out.println();
        }
        return null;

    }
}
