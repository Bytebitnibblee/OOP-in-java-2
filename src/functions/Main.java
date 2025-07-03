package functions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Student s1= new Student(223, "Deep"); // creating an object
//		
//		System.out.println("roll no:"+s1.rollno);
//		System.out.println("String:"+s1.name);
//	}
		
		Scanner sc =new Scanner(System.in);
			System.out.println("enter your name :");
		String name=sc.nextLine();
		
		System.out.println("enter your rollno:");
		int roll=sc.nextInt();
		System.out.println();
		
	Student s=new Student();
		s.setValue(roll,name);
		
		System.out.println("Roll: "+s.rollno);
		System.out.println("name:"+s.name);
	}
}
		
	
	

