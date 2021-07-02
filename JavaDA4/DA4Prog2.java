package JavaDA4;

import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	String name;
	int age;
	int salary;
	// Default constructor
	public Employee(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

public class DA4Prog2
{
	public static void main(String[] args)
	{
		System.out.println("Yogeswari Sahu 18BCE0928 30-04-2021");
		//Taking Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name =sc.nextLine();
		System.out.println("Enter your age:");
		int age=sc.nextInt(); 
		System.out.println("Enter your salary:");
		int salary=sc.nextInt(); 
		Employee object = new Employee(name, age, salary);
		String filename = "file.txt";
		// Serialization
		try
		{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		Employee object1 = null;
		// Deserialization
		try
		{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object1 = (Employee)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("Name = " + object1.name);
			System.out.println("Age = " + object1.age);
			System.out.println("Salary = " + object1.salary);
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
