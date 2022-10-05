package com.ofs.classwork;

public class WordsinString {
    public static void main (String [] args){
        String sentence = IBIO.input("Enter a sentence: ");
        int length = noOfwords(sentence);
        System.out.println(length);

    }
    public static int noOfwords (String s){
        int result = 1;
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                result++;
            }
        }
        return result;
    }
}
