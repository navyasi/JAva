package com.ofs.grade11.classwork;

public class PasswordGuess {
    public static void main (String []args){
        String password = "zed";
        char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i<password.length(); i++){
            for (char x : letters){// looping through array elements
                if (password.charAt(i) == x )
                    IBIO.out(x);
            }


        }
    }
}
