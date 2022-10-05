package com.ofs.grade12;

public class Square extends Shape{
    private double side;

    public Square (String name, double side){ //constructor
        super(name);
        this.side = Math.abs(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = Math.abs(side);
    }


    public double getPerimeter(){
        double perimeter = 1000*4*side;
        int p = (int)perimeter;
        double b = (double)p/1000;
        return b;
    }

    public double getArea(){
        double area = 1000*side*side;
        int a = (int)area;
        double b = (double)a/1000;
        return b;
    }

    @Override
    public String toString() {
        return super.toString()+ "\tSide: " + this.side +"\tArea: " + this.getArea() + "\tPerimeter: " + this.getPerimeter();
    }

  /*  public boolean equals(Square obj) {
        double a = this.side;
        double b = obj.side;

        return a.equals(b);
    }*/
    public double compareTo(Square s){
        return this.getArea() - s.getArea();
    }
    public boolean equals(Square two){
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }
}

