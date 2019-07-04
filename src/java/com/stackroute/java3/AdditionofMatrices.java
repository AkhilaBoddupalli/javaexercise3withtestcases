package com.stackroute.java3;

import java.util.Scanner;

public class AdditionofMatrices
{
    public static void main(String args[])
    {
        int m, n, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n  = in.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (i = 0; i < m; i++)
            for (j= 0; j < n; j++)
                a[i][j] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (i= 0 ; i < m ; i++)
            for (j= 0 ; j < n ; j++)
                b[i][j] = in.nextInt();

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                sum[i][j] = a[i][j] + b[i][j];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");

        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
                System.out.print(sum[i][j]+"\t"); //display matrix on the console

            System.out.println();
        }
    }
}


