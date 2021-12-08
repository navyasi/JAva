package com.ofs.grade11.chap1234;

public class TestQuickly {
    public static void main(String[] args){
        String termonestr = "6,914,789";
        int termone = 6914789;

        String s = "5";
        s = "49" + s;
        s = s + "," + s;
        IBIO.output(s);

        int noOfDigits = 0;
        while (termone > 0){
            noOfDigits = noOfDigits + 1;
            int digit = termone % 10;
            IBIO.output(digit);
            termone = termone /10;

        }
        IBIO.output(noOfDigits);



    }
}
