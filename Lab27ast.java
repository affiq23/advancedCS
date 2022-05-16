package oopRedefine;// Lab27ast.java
// This is the student version of the Lab 27 assignment.


import java.util.*;


    
public class Lab27ast {
	public static void main(String args[]) {
		System.out.println("\nLAB 27a 80 POINT VERSION\n");

		Triangle t1 = getTriangle();
		Triangle t2 = getTriangle();
		Rectangle r1 = getRectangle();
		Rectangle r2 = getRectangle();


		System.out.println();

		System.out.println("Triangle 1 sides: " + t1);
		System.out.println("Triangle 2 sides: " + t2);
		System.out.println("Rectangle 1 sides: " + r1);
		System.out.println("Rectangle 2 sides: " + r2);
		System.out.println();
		System.out.println("Equality test:    " + t1.equals(t2));
		System.out.println("Compare To test:  " + t1.compareTo(t2));
		System.out.println();
		System.out.println("Equality test:    " + r1.equals(r2));
		System.out.println("Compare To test:  " + r1.compareTo(r2));
		System.out.println();

	}

	public static Triangle getTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER SIDE 1 HERE ->> ");
		int s1 = scan.nextInt();
		System.out.println("ENTER SIDE 2 HERE ->> ");
		int s2 = scan.nextInt();
		System.out.println("ENTER SIDE 3 HERE ->> ");
		int s3 = scan.nextInt();
		Triangle t1 = new Triangle(s1, s2, s3);
		System.out.println();
		return t1;


	}

	public static Rectangle getRectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER SIDE 1 HERE ->> ");
		int s1 = scan.nextInt();
		System.out.println("ENTER SIDE 2 HERE ->> ");
		int s2 = scan.nextInt();
		System.out.println("ENTER SIDE 3 HERE ->> ");
		int s3 = scan.nextInt();
		System.out.println("ENTER SIDE 4 HERE ->> ");
		int s4 = scan.nextInt();
		Rectangle r1 = new Rectangle(s1, s2, s3, s4);
		System.out.println();
		return r1;


	}

	public static class Triangle {

		private int ab;
		private int bc;
		private int ac;

		private int getPerimeter()
		// returns the sum of the length of the sides
		{
			int total = ab + bc + ac;
			return total;
		}

		public Triangle(int s1, int s2, int s3)
		// constructor, which initializes the object's private data fields
		{
			ab = s1;
			bc = s2;
			ac = s3;

		}

		public String toString()
		// returns a string in the format [ab,bc,ca], where ab, bc and ca are their int values
		{
			String val = "[" + ab + ", " + bc + ", " + ac + "]";
			return val;
		}

		public boolean equals(Triangle rhs)
		// returns true if both objects have equal perimeters and false otherwise
		{
			int t2Per = rhs.getPerimeter();
			boolean check = false;

			if (getPerimeter() == t2Per) {
				check = true;
			}

			return check;
		}

		public int compareTo(Object rhs)
		// return the difference between this and rhs perimeter values
		{
			Triangle t2 = (Triangle) rhs;
			int t2per = t2.getPerimeter();
			int t1Per = getPerimeter();
			int diff = t1Per - t2per;
			return diff;


		}


	}


	public static class Rectangle {

		private int ab;
		private int bc;
		private int ac;
		private int d;

		private int getPerimeter()
		// returns the sum of the length of the sides
		{
			int total = ab + bc + ac + d;
			return total;
		}

		public Rectangle(int s1, int s2, int s3, int s4)
		// constructor, which initializes the object's private data fields
		{
			ab = s1;
			bc = s2;
			ac = s3;

		}

		public String toString()
		// returns a string in the format [ab,bc,ca], where ab, bc and ca are their int values
		{
			String val = "[" + ab + ", " + bc + ", " + ac + ", " + d + "]";
			return val;
		}

		public boolean equals(Rectangle rhs)
		// returns true if both objects have equal perimeters and false otherwise
		{
			int t2Per = rhs.getPerimeter();
			boolean check = false;

			if (getPerimeter() == t2Per) {
				check = true;
			}

			return check;
		}

		public int compareTo(Object rhs)
		// return the difference between this and rhs perimeter values
		{
			Rectangle t2 = (Rectangle) rhs;
			int t2per = t2.getPerimeter();
			int t1Per = getPerimeter();
			int diff = t1Per - t2per;
			return diff;


		}


	}
}


