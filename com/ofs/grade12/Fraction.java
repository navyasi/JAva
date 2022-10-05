package com.ofs.grade12;
import java.util.Scanner;
public class Fraction {
   private int num;        //fields or data for the fraction
    private int den;
    Fraction(int a, int b) { //constructor that creates a fraction
        num = a;
        den = b;
        this.simplify();
    }

    public void enter() throws Exception{
        String strFraction = IBIO.input("Enter fraction in a/b format: ");
        strFraction = strFraction.replace("/", " "); //changing slash to space
        Scanner parse = new Scanner(strFraction); //to parse fraction
        num = parse.nextInt();
        den = parse.nextInt();
        if (den==0){
            throw new Exception("Denominator can't be less than or equal to 0!");
        }
        this.simplify();
    }

    public Fraction add(Fraction second){
        int sumNum = this.num * second.den + second.num * this.den;
        int sumDen = this.den * second.den;
        Fraction sumFraction = new Fraction(sumNum,sumDen);
        return sumFraction;
    }

    private static int gcd(int n, int m){
        int gcd;
        if (n==m){
            gcd = n;
        }
        else{
            while (n!=m){
                if(n<m){
                    m=n-m;
                }
                else{
                    n = n-m;
                }
            }
        }
        return n;
    }
    private void simplify(){
        int gcd = gcd(this.num, this.den);
        this.num = this.num/gcd;
        this.den = this.den/gcd;

    }

    public double toDecimal(){
        return (double)this.num/(double)this.den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

}
