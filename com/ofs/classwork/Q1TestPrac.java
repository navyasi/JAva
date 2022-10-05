package com.ofs.classwork;

public class Q1TestPrac {
    public static void main(String[] args){
        IBIO.output("Navya Singhal");
        int number = 0;
        long factorial = 1;
        String msg = "";
        int digits = 0;
        long other = 0;
        long finalvalue = 1000000000000000000L;



        for (int y=1; y<21; y++){
            number = IBIO.inputInt("Enter an integer between 1 and 20:");
            if(number < 1 || number > 20) {
                IBIO.output("Error-number out of range");
                main(null);
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
           // other = factorial;
           // for (; other != 0; other /= 10, ++digits){
            //}
            for (int i = 1; i<=finalvalue; i = i*10){
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
            //other = factorial;
            //for (; other != 0; other /= 10, ++digits){
           // }
            for (long i = 1; i<=finalvalue; i = i*10){
                if (factorial/i>0)
                    digits = digits + 1;
                else
                    break;
            }
            IBIO.output(number + "! = " + factorial + " digits: " + digits);
        }

    }
}
