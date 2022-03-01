package com.ofs.grade11.chap1234;

public class Prac72 {
    public static void main (String [] args){
        int totalnoofspaces = 10;
        double num = 1;
        for (int i = 0; i<10; i++){
            num = num * 3.732;
            num = (int)(num * 100);
            num = (double) num / 100;
            String str = "" + num;
            int x = str.indexOf(".");
            x = totalnoofspaces - x;
            String output = LeadingSpaces(str, x) ;
            IBIO.output(output);
            }
    }
    public static String LeadingSpaces(String s, int spaces){
        for(int i = 0; i<spaces; i++){
            s = " " + s;
        }
        return s;
    }
}
