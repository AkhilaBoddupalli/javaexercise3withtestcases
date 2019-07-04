package com.stackroute.java3;

public class Removevowel
{
    public String removeVowelFromStrings(String array[])
    {

        for (int i = 0; i < array.length; i++)
        {
            String str = array[i];


            for (int j = 0; j < str.length(); j++)
            {
                char a = str.charAt(j); //if vowel is present replaces with null
                if (str.charAt(j) == 'a') {
                    str = str.replace("a", "");
                } else if (str.charAt(j) == 'e') {
                   str= str.replace("e", "");
                } else if (str.charAt(j) == 'i') {
                   str= str.replace("i", "");
                } else if (str.charAt(j) == 'o') {
                    str=str.replace("o", "");
                } else if (str.charAt(j) == 'u') {
                   str= str.replace("u", "");
                }
            }
                    return str;



        }




        return null;
    }
}
