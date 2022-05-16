package stacks;// Lab29bst.java
// This is the student version of the Lab29b assignment.


import java.util.ArrayList;


public class Lab29bst
{
	public static void main (String args[])
	{
		System.out.println("Lab29b 80/100 Point Version\n");
		MyStack students = new MyStack();
		String student;
	
		System.out.println("Testing the <push> method");
		students.push("Luke Watts");	
		students.push("Brian Sims");
		students.push("Mike Lewis");
		students.push("Jessie Lin");		
		System.out.println();
		
		MyStack students2 = new MyStack(students);  // remove comments for 100 point version
		
				
		System.out.println("Testing the <peek> method");
		student = (String) students.peek();
		System.out.println(student + " is at the top of the stack");
		System.out.println();

		System.out.println("Testing the <isEmpty> and <pop> methods");
		while (!students.isEmpty())
		{ 	 
			student = (String) students.pop();
			System.out.println("Popping " + student + " from the stack");
		}
		

		System.out.println("Testing the copy constructor");
		while (!students2.isEmpty())
		{ 	 
			student = (String) students2.pop();
			System.out.println("Popping " + student + " from the stack");
		}
		System.out.println();

	}		
   

}


class MyStack
{
	String [] test;
	int index;
	int b;
	public MyStack()
	{
		test = new String[20];
		index = 0;
		b=1;
	}
	public MyStack(MyStack a)
	{
		test = new String[20];
		index = 0;
		b=a.b;
		for (int x = 0; x < 20; x++)
		{
			test[x] = a.test[x];


		}
	}
	public int getSize()
	{
		return b;
	}
	public String[] getArray()
	{
		return test;
	}
	public boolean isEmpty()
	{
		return b == 0;

	}
	public void push(String x)
	{
		b++;
		test[b-1]=x;
	}
	public String pop()
	{
		b--;
		return test[b];
	}
	public String peek()
	{
		return test[b-1];
	}

}
		
		
	




