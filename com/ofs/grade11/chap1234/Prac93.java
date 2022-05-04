package com.ofs.grade11.chap1234;

public class Prac93 {
    public static void main(String[] args) {
        int [] num = new int [100]; // create array
        int MAXSIDES = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = random(i);
        }
        for(int k = 1; k<6; k++) {
            for (int i = 0; i < 100; i++) {
                num[i] = k;
                if (num[i] == k){
                    IBIO.out(k);
                }
            }
            IBIO.output("");
        }
    }
    public static int random (int y){
        int xx = (int) ((Math.random()*6) + 1);
        return xx;

    }
}
