package com.ofs.grade11.classwork;

public class Q2Mock {
    public static void main (String [] args){
        IBIO.output("Navya Singhal");
        int n;
        do {
            long termone = 0;
            long termtwo = 1;
            long nexterm;
            double sum = 0;
            double average = 0;
            n = IBIO.inputInt("Calculate up to term (n)?");

            do {
                if (n < 0) {
                    IBIO.output("Error- enter a positive number.");
                    n = IBIO.inputInt("Calculate up to term (n)? ");
                }
            } while (n < 0);

            if (n == 0){
                System.exit(1);
            }

            if (n <= 20) {
                IBIO.out("0");
                for (int i = 0; i < n; i++) {
                    nexterm = termone + termtwo;
                    termone = termtwo;
                    termtwo = nexterm;
                    IBIO.out("; " + termone);
                    sum = sum + termone;
                    average = sum / n;
                }
                IBIO.output("\n Average = " + average);
            } else {
                for (int i = 0; i < n; i++) {
                    nexterm = termone + termtwo;
                    termone = termtwo;
                    termtwo = nexterm;
                    sum = sum + termone;
                    average = sum / n;
                }
                IBIO.output("Term " + n + " = " + termone);
                int noOfDigits = 0;
                while (termone > 0){
                    noOfDigits = noOfDigits + 1;
                    termone = termone /10;

                }

                IBIO.output("Average = " + average);
                IBIO.output(noOfDigits);
            }
        } while(n != 0);


    }
}

