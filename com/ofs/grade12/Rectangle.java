package com.ofs.grade12;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width){
        super(name);
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    public double getWidth() {
        return width;
    }
    public double getPerimeter(){
        double perimeter = 1000*(length + length + width + width);
        int a = (int)perimeter;
        double b = (double)a/1000;
        return b;
    }

    public double getArea(){
        double area = 1000*length*width;
        int a = (int)area;
        double b = (double)a/1000;
        return b;
    }


    public void setWidth(double width) {
        this.width = Math.abs(width);
    }
    @Override
    public String toString() {
        return super.toString()+ "\tLength: " + this.length + "\tWidth: " + this.width +"\tArea: " + this.getArea() + "\tPerimeter: " + this.getPerimeter();
    }
    public double compareTo(Rectangle r){
        return this.getArea() - r.getArea();
    }
    public boolean equals(Rectangle two){
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }
}
