package com.ofs.chap1234;

public class Prac14 {
    public static void main(String[] args){
        int number = 0;
        int x = 0;
        IBIO.output(x);
        for(int i = 0; i<100; i++){
            x = x + 1;
            number = number + x;
            IBIO.output(number);
        }
    }
}
