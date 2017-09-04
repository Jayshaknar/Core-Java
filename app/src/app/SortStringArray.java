package app;

import java.util.*;

public class SortStringArray
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String S = "rajive shonia rahul sanjay indira";
        String W[] = S.split(" ");
        Arrays.sort(W, new StringLengthComparator());
        for(String str: W)
        System.out.print(str+" " ); //print Your Expected Result.
    }
}
 class StringLengthComparator implements Comparator<String>{ //Custom Comparator class according to your need

    @Override
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();// compare length of Strings
        }
 }
