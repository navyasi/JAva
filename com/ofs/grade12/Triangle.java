package com.ofs.grade12;

public class Triangle extends Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double base, double height, double side1, double side2, double side3){
        super(name);
        this.base = Math.abs(base);
        this.height = Math.abs(height);
        this.side1 = Math.abs(side1);
        this.side2 = Math.abs(side2);
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = Math.abs(base);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = Math.abs(side1);
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = Math.abs(side2);
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = Math.abs(side3);
    }

    public double getPerimeter(){
        double perimeter = 1000*(side1 + side2 + side3);
        int a = (int)perimeter;
        double b = (double)a/1000;
        return b;
    }

    public double getArea(){
        double area = 1000*base*height*0.5;
        int a = (int)area;
        double b = (double)a/1000;
        return b;
    }
    @Override
    public String toString() {
        return super.toString()+ "\tBase: " + this.base + "\tHeight: " + this.height + "\tSide 1: " + this.side1 + "\tSide 2: " + this.side2 + "\tSide 3: " + this.side3 + "\tArea: " + this.getArea() + "\tPerimeter: " + this.getPerimeter();
    }
    public double compareTo(Triangle t){
        return this.getArea() - t.getArea();
    }
    public boolean equals(Triangle two){
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }
}
