package com.ofs.club;
public class Testing
{
	
	public static void main (String[] args)
	{
		Square s = new Square('S', 5.5);
		System.out.println( "Square name: " + s.name );
		System.out.println( "Square side: " + s.side );
		System.out.println( "Square area: " + s.getArea() );
		System.out.println( "Square perimeter: " + s.getPerimeter() );

		Square c = new Square('C', 5.5);
		System.out.println( "Square name: " + c.name );
		System.out.println( "Square side: " + c.side );
		System.out.println( "Square area: " + c.getArea() );
		System.out.println( "Square perimeter: " + c.getPerimeter() );
	}
}

