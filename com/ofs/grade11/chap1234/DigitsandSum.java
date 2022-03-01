package com.ofs.grade11.chap1234;

public class DigitsandSum {
    public static void main(String[] args){
        String str = "";
        int n = 215493;
        int sumofdigits = 0;
        int noOfdigits = 0;
        String numbers = "";
        int r = 0; //394512
        boolean isItLastDigit = true;
        String reverse = ""; //3945
        while (n>0){
            int digit = n%10; //finding digit
            sumofdigits = sumofdigits + digit;
            n = n/10; //for number of digits
            noOfdigits = noOfdigits + 1;
            reverse = reverse + digit; // reverse order

            numbers = digit + numbers;
            if(noOfdigits %3 ==0)
                numbers = "," + numbers;

            if (isItLastDigit){ //to prevent + before or after the output
                str = str + digit;
                isItLastDigit = false;
            }
            else{
                str = digit + " + " + str;
            }
            IBIO.output(str);
        }
        str = str + " = " + sumofdigits;
        IBIO.output(str);
        IBIO.output(reverse);
        IBIO.output(numbers);
    }
}
