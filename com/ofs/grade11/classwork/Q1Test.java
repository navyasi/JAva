package com.ofs.grade11.chap1234;

public class Q1Test {
    public static void main(String[] args){
        IBIO.output("Navya Singhal");
        int number = 0;
        long factorial = 1;
        String msg = "";
        int digits = 0;
        long maximumvalue = 1000000000000000000L;

        for (int y=1; y<=20; y++){
            number = IBIO.inputInt("Enter an integer between 1 and 20:");
            if(number < 1 || number > 20) {
                IBIO.output("Error-number out of range");
            }
            else
                break;
        }

        if (number <= 10){
            for (int i = number; i >= 1; i--){
                factorial = factorial * i;

                if (i == number){
                    msg = " " + i;
                }else{
                    msg = msg + " x " + i;
                }
            }
            for (int i = 1; i<=maximumvalue; i = i*10){
                if (factorial/i>0)
                    digits = digits + 1;
                else
                    break;
            }
            IBIO.output(number + "! = "+  msg + " = " + factorial + " digits: " + digits);
        }

        else {
            for (int i = 1; i <= number; i++){
                factorial = factorial * i;
            }
            for (long i = 1; i<=maximumvalue; i = i*10){
                if (factorial/i>0)
                    digits = digits + 1;
                else
                    break;
            }
            IBIO.output(number + "! = " + factorial + " digits: " + digits);
        }

    }
}
