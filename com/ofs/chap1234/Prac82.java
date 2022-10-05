package com.ofs.chap1234;

public class Prac82 {
    public static void main(String args[])
    {
        String prev = "";
        String aa2 = "";
        for (int i = 1; i < 200; i++) {
            for(int j=1;j<200;j++) {
                for(int k=1;k<200;k++) {
                    for(int m = 1; m<200; m++) {
                        if (good(i, j) && good(j, k) && good(i, k) && good(m, i) && good(m, j) && good(m, k)) {
                            /*prev = aa2;
                            aa2 = ascenStr(i, j, k);
                            if (prev.equals(aa2)) //eliminate duplicates by comparing previous value with current value
                                IBIO.output(aa2);*/
                            IBIO.output(i + " " + j + " " + k + " " + m);
                        }
                    }
                }
            }
        }
    }
    static boolean good(int a, int b) {
        int x=a*b+1;
        int y = (int) (Math.sqrt(x)+.5);
        return ( y * y == x );
    }
//need to do repetition for 4 numbers edit later
    /*static String ascenStr(int a, int b, int c){  // put in ascending order to make all duplicates have same order
        String s ="";
        if (a<b && a<c){
            if (b<c){
                s = a + " " + b + " "+ c;
            }
            else{
                s = a + " " + c + " "+ b;
            }
        }
        else if (b<a && b<c){
            if (a<c){
                s = b + " " + a + " "+ c;
            }
            else{
                s = b + " " + c + " "+ a;
            }
        }
        else if (c<a && c<b){
            if (a<b){
                s = c + " " + a + " "+ b;
            }
            else{
                s = c + " " + b + " "+ a;
            }
        }
        return s;
    }*/
}
