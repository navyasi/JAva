package com.ofs.club;

public class Circle {
    char name;
    int radius;

    public Circle(char n, int r){
        name = n;
        radius = r;
    }

    public double getArea()
    {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = Math.PI * 2 * radius;
        return perimeter;
    }
}
