package com.ofs.classwork;

public class Q2Test {
    public static void main(String []args){
        IBIO.output("Navya Singhal");
       int base;
       int exponent;

       String str = "";
       do {
           double answer = 1;
           int notprintanswer = 1;
           do {
               base = IBIO.inputInt("Enter the base: ");
               if (base == 0) {
                   System.exit(1);
               }
               if (base >= 11) {
                   IBIO.out("Enter number <= 10.");
                   base = IBIO.inputInt("Enter the base: ");
               }
               exponent = IBIO.inputInt("Enter the exponent: ");
               if (exponent >= 11) {
                   IBIO.out("Enter number <= 10.");
                   exponent = IBIO.inputInt("Enter the exponent: ");
               }
           } while (base >= 11 || exponent >= 11);
           if (exponent >= 1) {
               for (int i = 0; i < exponent; i++) {
                   answer = answer * base;
               }
               IBIO.output(base + " to the power of " + exponent + " = " + answer);
           } else {
               exponent = exponent * -1;
               for (int i = 0; i < exponent; i++) {
                   notprintanswer = notprintanswer * base;
               }
               for (int i = 0; i < exponent; i++) {
                   answer = answer * 1 / base;
               }
               //exponent = exponent * -1;
               IBIO.output(base + " to the power of " + exponent + " = ");
               IBIO.output("  1");
               IBIO.output("-----" + " = ");     //+ "1/" + notprintanswer + " = " + answer);
               IBIO.output(" " + base + "^" + exponent);
               if (notprintanswer < 10)
               {
                   IBIO.out(" ");
               }
               if (notprintanswer < 100)
               {
                   IBIO.out(" ");
               }
               if (notprintanswer < 1000)
               {
                   IBIO.out(" ");
               }
               IBIO.output("1");
               IBIO.output("-----" + " = " + answer);
               if (answer < 10)
               {
                   IBIO.out(" ");
               }
               if (answer < 100)
               {
                   IBIO.out(" ");
               }
               if (answer < 1000)
               {
                   IBIO.out(" ");
               }
               IBIO.output(notprintanswer);
           }
       } while(base != 0);
    }
}
