package com.ofs.grade11.chap1234;

public class Prac83 {
    public static void main(String args[])
    {
        String prev = "";
        String aa2 = "";
        for (int i = 1; i < 100; i++) {
            for(int j=1;j<100;j++) {
                for(int k=1;k<100;k++) {
                    if (good(i,j) == k){
                        IBIO.output(i + " " + j + " " + k);
                    }

                    /*if ( good(i,j) && good(j,k) && good(i,k) ) {
                        prev = aa2;
                        aa2 = ascenStr(i, j, k);
                        if (prev.equals(aa2)) //eliminate duplicates by comparing previous value with current value
                            IBIO.output(aa2);
                    }*/
                }
            }
        }
    }
    static double good(int a, int b) {
        int x= (a*a) + (b*b);
        double y =  (Math.sqrt(x));
        return y;
    }

    static String ascenStr(int a, int b, int c){  // put in ascending order to make all duplicates have same order
        String s ="";
        if (a<b){
                s = a + " " + b + " "+ c;
            }
        else{
                s = b + " " + a + " "+ c;
            }
        return s;
    }

}
