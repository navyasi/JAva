package com.ofs.chap1234;

public class Prac92 {
    public static void main(String[] args) {
        int [] num = new int [100]; // create array
        for (int i = 0; i < 100; i++) {
            num[i] = random(i);
        }
        for (int i = 0; i < 100; i++) {
            IBIO.output(num[i]);
        }
    }
    public static int random (double y){
        int xx = (int) ((Math.random()*6) + 1);
        return xx;

    }
}
