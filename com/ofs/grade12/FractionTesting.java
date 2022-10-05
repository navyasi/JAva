package com.ofs.grade12;

public class FractionTesting {
    public static void main(String[] args) {
        while(true) {
            Fraction a = new Fraction(3, 4); //create a fraction
            Fraction b = new Fraction(3, 4);
            Fraction c = new Fraction(3, 4);
           // b.enter();
            System.out.println("sum = " + c); //using  SOPL because IBIO expecting String
            c = a.add(b);
            Fraction d = new Fraction(3, 4);
            //d.enter();
            double x = d.toDecimal();
            System.out.println(d + " change to decimal = " + x);
            try {
                a.enter();
                break;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }



        }
    }
}
