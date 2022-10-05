package com.ofs.chap1234;

public class Prac62 {
    public static void main (String [] args){
        int lines = IBIO.inputInt("How many stars lines? "); // printing triangle with stars
        String staroutput = "";
        for(int i = 0; i < lines; i++){
            String s = stars2(i+1);
            IBIO.output(s);

        }
        for(int i = lines-1; i > 0; i--){
            String s = stars2(i);
            IBIO.output(s);
        }
    }
    public static String stars2(int x){
        String s = "";
        for (int i = 0; i<x; i++){
            s = s + "*";
        }
        return s;
    }
}
