package org.ifelse;
	import java.util.Scanner;

	public class Age {
		public static void main(String[] args) {
			Scanner Age1 =new Scanner(System.in);
			System.out.println("enter your name :");
			System.out.println("enter your age: ");
			String name =Age1.next();
			int age = Age1.nextInt();
			
			if(age>=18) {
				System.out.println(name);
				System.out.println("you're eligible for vote");
			}
			else{
				System.out.println("you're not eligible for vote");
			}
			
		}

}