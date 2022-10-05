package com.ofs.grade12;

public class Circle extends Shape {
    private double radius;
    private double PI;

    public Circle(String name, double radius){
        super(name);
        this.radius = Math.abs(radius);
        //this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
    public double getPerimeter(){ 
        double perimeter = 1000*Math.PI*radius*2;
        int a = (int)perimeter;
        double b = (double)a/1000;
        return b;
    }
    public double getArea(){
        double area = 1000*Math.PI*radius*radius;
        int a = (int)area;
        double b = (double)a/1000;
        return b;

    }
    @Override
    public String toString() {
        return super.toString()+ "\tRadius: " + this.radius +"\tArea: " + this.getArea() + "\tPerimeter: " + this.getPerimeter();
    }
    public double compareTo(Circle c){
        return this.getArea() - c.getArea();
    }
    public boolean equals(Circle two){
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }

}
